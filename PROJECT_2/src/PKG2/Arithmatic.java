package PKG2;

public class Arithmatic {
	public int sum(int a,int b) {
		int c;
		c=a+b;
		System.out.println("sum of result"+c);
		return c;

	}
	public int sub(int x,int y) {
		int z;
		z=x-y;
		System.out.println("sub of result"+z);
		return z;
		
	}
	public void multi(int a1,int a2) {
		int a3;
		a3=a1*a2;
		System.out.println("final of result"+a3);
		
	}
	public static void main(String[] args) {
		Arithmatic obj=new Arithmatic();
		int sumResult=obj.sum(10, 2);
		int subResult=obj.sub(12, 2);
	    obj.multi(sumResult,subResult );
		
				
	}
	
	
	
}


