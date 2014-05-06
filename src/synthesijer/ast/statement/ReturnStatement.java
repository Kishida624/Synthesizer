package synthesijer.ast.statement;

import java.io.PrintWriter;

import synthesijer.ast.Expr;
import synthesijer.ast.Scope;
import synthesijer.hdl.HDLModule;
import synthesijer.hdl.HDLSignal;
import synthesijer.model.State;
import synthesijer.model.StateMachine;

public class ReturnStatement extends ExprContainStatement{
	
	private Expr expr;
	
	public ReturnStatement(Scope scope){
		super(scope);
	}
	
	public Expr getExpr(){
		return expr;
	}
	
	public void setExpr(Expr expr){
		this.expr = expr;
	}

	public void makeCallGraph(){
		if(expr != null) expr.makeCallGraph();
	}
	
	public void dumpAsXML(PrintWriter dest){
		dest.printf("<statement type=\"return\">\n");
		if(expr != null) expr.dumpAsXML(dest);
		dest.printf("</statement>\n");
	}

	private State state;
	
	public State genStateMachine(StateMachine m, State dest, State terminal, State loopout, State loopCont){
		state = m.newState("return");
		state.setBody(this);
		state.addTransition(terminal);
		return state;
	}

	@Override
	public void generateHDL(HDLModule m) {
		if(expr != null){
			HDLSignal sig = getScope().getMethod().getHDLReturnSignal();
			String methodId = getScope().getMethod().getName();
			sig.setAssignCondition(methodId, state.getBase(), state.getId(), expr.getHDLExprResult());
		}
	}

	
}
