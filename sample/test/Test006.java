public class Test006{
	
	private boolean check(int c){
		return (c == 10+20+40+50+70+80+100+110) ? true : false;
	}

	public boolean test(){
		boolean success = false;
		int a = 10;
		int b = 20;
		int c = 0;
		int d = 40;
		int e = 50;
		int f = 0;
		int g = 70;
		int h = 80;
		int i = 0;
		int j = 100;
		int k = 110;
		int l = 0;
		c = a + b;
		f = d + e;
		i = g + h;
		l = j + k;
		c = c + f;
		l = l + i;
		c = c + l;
		if(c == 10+20+40+50+70+80+100+110) success = true;
		boolean success2 = check(c);
		return success2;
	}

	@synthesijer.rt.unsynthesizable
	public static void main(String... args){
		Test006 o = new Test006();
		System.out.println(o.test());
	}
	
}
