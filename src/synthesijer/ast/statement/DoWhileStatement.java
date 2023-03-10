package synthesijer.ast.statement;

import synthesijer.ast.Expr;
import synthesijer.ast.Scope;
import synthesijer.ast.Statement;
import synthesijer.ast.SynthesijerAstVisitor;
import synthesijer.model.State;
import synthesijer.model.Statemachine;

public class DoWhileStatement extends Statement{
	
	private Expr condition;
	private BlockStatement body;
	
	public DoWhileStatement(Scope scope){
		super(scope);
	}
	
	public void setCondition(Expr expr){
		this.condition = expr;
	}
	
	public Expr getCondition(){
		return condition;
	}
	
	public void setBody(BlockStatement body){
		this.body = body;
	}
	
	public Statement getBody(){
		return body;
	}

	public State genStateMachine(Statemachine m, State dest, State terminal, State loopout, State loopCont){
		State s = m.newState("do_while_cond");
		State d = body.genStateMachine(m, s, terminal, dest, s);
		s.addTransition(d, condition, true);
		s.addTransition(dest, condition, false); // exit from this loop
		return s;
	}

	public void accept(SynthesijerAstVisitor v){
		v.visitDoWhileStatement(this);
	}

}
