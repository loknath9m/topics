package CoreJava;

public class ConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean operated=true;
		//if condition
		if(operated) {
			System.out.println("welcome");
		}
		
		// if else condition
		int a = 89;
		int c= 52;
		if(a<c) {
			System.out.println("number");
		}
		else {
			System.out.println("bigger");
		}
		
		// NESTED IF ELSE CONDITION
		 int x = 89;
		 int y = 192;
		 int z = 985;
		 
		 if(x==y) {
			 System.out.println("EQUAL");}
		 else if(x>=y) {
			 System.out.println("grater");}
		 else if (y>z) {
			 System.out.println("bye BYE");
		 }
		 else {
			 System.out.println("BYE");
		 }
		// while loop
		
		 int i = 0;
//		 while (i<=5) {
//		 
//		   System.out.println("value of iby:"+i);
//		   i++;
//		 }
//		 
		 do {
			 System.out.println("value of i:"+i);
			 i++;
		 }while(i<5);
		System.out.println("i final value:"+i);
		
		//DO WHILE 2
		int f=1;
		while (f>-1) {
			
		}
		 
		
		
	}

}
