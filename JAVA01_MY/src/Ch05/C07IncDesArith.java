package Ch05;

public class C07IncDesArith {

	public static void main(String[] args) {
		
		int a=5, b=6, c=10, d;
		boolean e;
		
//		d=++a*b--;
//		//d=6*6=36,a==6 b==5
//		 System.out.printf("a = %d, b = %d, d = %d\n", a, b, d);
		
		d=a++ + ++c - b--;
//		//5 + 11 - 6 =10=d, a=6, b=5, c=11
//		System.out.printf("a = %d, b = %d, c = %d, d = %d\n", a, b, c, d);
		
		a=1;
		b=0;
		e=(a++>0)||((b*d/c)>0);
		//e=(1>0)or(0*10/11)>0);
		//a=2, b=0, c=11, d=10, e=true;
		System.out.printf("a = %d, b = %d, c = %d, d = %d ,e = %b\n", a, b, c, d , e);

	}

}
