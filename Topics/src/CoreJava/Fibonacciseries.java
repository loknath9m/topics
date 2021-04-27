package CoreJava;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3;
		int count=5;
		for(int i=1;i<count;i++) {
			n3=n1+n2;
			System.out.println(n3+" ");
			n1=n2;
			n2=n3;
		}

	}

}
