package synthesijer.ast.expr;

import synthesijer.ast.Expr;
import synthesijer.ast.Scope;

public class ArrayAccess extends Expr{
	
	private Expr indexed, index;
	
	public ArrayAccess(Scope scope){
		super(scope);
	}
	
	public void setIndexed(Expr expr){
		indexed = expr;
	}
	
	public void setIndex(Expr expr){
		index = expr;
	}

	public Expr getIndexed(){
		return indexed;
	}
	
	public Expr getIndex(){
		return index;
	}
		
	public void accept(SynthesijerExprVisitor v){
		v.visitArrayAccess(this);
	}

}

