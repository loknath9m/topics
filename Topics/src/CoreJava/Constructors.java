package CoreJava;

public class Constructors {
	String a;
	public Constructors() {
		System.out.println("cons with java");
		
	}
	public Constructors(int a) {
		a=a;
		System.out.println(+a);
	}
//	public Constructors(int a, int b) {
//		i=a*b;
//		System.out.println(+i);
//	}
//	public Constructors(int a, int b,int c) {
//		i=a+c;
//		System.out.println(+i);
//	}
	
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Constructors c= new Constructors(50,50,85);
		Constructors c= new Constructors("lok");

	}

}
