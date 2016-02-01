import synthesijer.lib.*;

public class Test007{

    private final INPUT1 in = new INPUT1();
    private final OUTPUT1 out = new OUTPUT1();
    private final INPUT16 in16 = new INPUT16();
    private final OUTPUT16 out16 = new OUTPUT16();
    private final INPUT32 in32 = new INPUT32();
    private final OUTPUT32 out32 = new OUTPUT32();
	
    public void run(){
		out.flag = in.flag;
		out16.value = in16.value;
		out32.value = in32.value;
    }

	public boolean test(boolean t1, int t2, int t3){
		run();
		if(t1 != out.flag) return false;
		if(t2 != out16.value) return false;
		if(t3 != out32.value) return false;
		return true;
	}

	@synthesijer.rt.unsynthesizable
	public static void main(String... args){
		Test007 o = new Test007();
		o.in.flag = true;
		o.in16.value = 100;
		o.in32.value = 200;
		System.out.println(o.test(true, 100, 200));
	}
    
}
