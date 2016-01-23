package synthesijer.scheduler;

import synthesijer.ast.Type;

public class VariableRefOperand extends VariableOperand{
	
	private final VariableOperand ref;
	
	private final Operand ptr;
	
	public VariableRefOperand(String name, Type type, VariableOperand ref, Operand ptr, boolean memberFlag){
		super(name, type, memberFlag);
		this.ref = ref;
		this.ptr = ptr;
	}

	public VariableOperand getRef(){
		return ref;
	}
	
	public Operand getPtr(){
		return ptr;
	}
	
}
