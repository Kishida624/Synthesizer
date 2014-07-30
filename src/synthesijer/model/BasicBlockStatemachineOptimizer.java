package synthesijer.model;

import java.util.ArrayList;

import synthesijer.ast.Method;
import synthesijer.ast.Module;
import synthesijer.ast.SynthesijerMethodVisitor;
import synthesijer.ast.SynthesijerModuleVisitor;

public class BasicBlockStatemachineOptimizer implements SynthesijerModuleVisitor, SynthesijerMethodVisitor{

	private final Module module;
	
	private static final boolean BB_DEBUG = false; 
	
	public BasicBlockStatemachineOptimizer(Module m) {
		this.module  = m;
	}
	
	@Override
	public void visitMethod(Method o) {
		if(BB_DEBUG) System.out.println("== " + o.getName());
		GenBasicStatemachineBlockVisitor v = new GenBasicStatemachineBlockVisitor();
		o.getStateMachine().accept(v);
		if(BB_DEBUG){
			for(BasicBlock bb: v.getBasicBlockList()){
				System.out.println("--------------");
				bb.printAll();
				System.out.println(" entry=" + bb.getEntryState());
				System.out.println(" exit=" + bb.getExitState());
			}
		}
		
		for(BasicBlock bb: v.getBasicBlockList()){
			if(bb.getSize() == 0) continue;
			DataFlowGraph dfg = bb.getDataFlowGraph();
			State pred = null;
			State state = null;
			while((state = schedule(dfg)) != null){

				if(pred != null){
					pred.clearTransition();
					pred.addTransition(state);
				}
				pred = state;
			}
			if(pred != null){
				Transition[] t = bb.getExitState().getTransitions();
				pred.clearTransition();
				pred.setTransition(t);
			}
		}
	}

	@Override
	public void visitModule(Module o) {
		for(Method m: o.getMethods()){
			m.accept(this);
		}
	}

	public void optimize(){
		module.accept(this);
	}
	
	public State schedule(DataFlowGraph dfg){
		if(BB_DEBUG) System.out.println("-- schedule");
		ArrayList<DataFlowNode> fire = new ArrayList<>();
		ArrayList<DataFlowNode> rest = new ArrayList<>();
		for(DataFlowNode node: dfg.getNodes()){
			if(node.isScheduled() == false){
				if(node.isReady()){
					fire.add(node);
				}else{
					rest.add(node);
				}
			}
		}
		State s = null;
		for(DataFlowNode n: fire){
			if(BB_DEBUG) System.out.println(n.state + ":" + n.stmt);
			n.setScheduled();
			if(s == null){
				s = n.state;
			}else{
				if(n.stmt != null) n.stmt.setState(s);
			}
		}
		if(fire.size() == 0 && rest.size() > 0){
			if(BB_DEBUG) System.out.println("// last");
			for(DataFlowNode n: rest){
				if(BB_DEBUG) System.out.println(n.state + ":" + n.stmt);
				n.setScheduled();
				if(s == null){
					s = n.state;
				}else{
					n.stmt.setState(s);
				}
			}
		}
		if(BB_DEBUG) System.out.println("--");
		return s;
	}

}
