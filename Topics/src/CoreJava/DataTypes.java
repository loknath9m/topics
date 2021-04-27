package CoreJava;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		float c=(float) 75.859;
		double d=852.6395281;
		String b="selenium"; 
		String b1="selenium";
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(d);
		System.out.println(b.charAt(5));  // used to print required word char index.[W.T=char]
		System.out.println(b1.length()); // it is used to print the length of string.[W.T=int]
		System.out.println(b.compareTo(b1)); // it is used to compare the 2 strings of index .[W.T=int]
		System.out.println(b.compareToIgnoreCase(b1)); //it is used to compare the 2 strings of index but ignores the CASES.[W.T=int]
		System.out.println(b.concat(b1));    // used to add 2 strings (W.T= string)
		System.out.println(b.contains("z")); // used to check is given Char is present or not [W.T=boolean].
		System.out.println(b.contentEquals(b1.toLowerCase())); // used to check both string shoud be same then TRUE [W.T=boolean]
		System.out.println(b.equalsIgnoreCase(b1)); // used to check both string shoud be same then TRUE but ignores CASES.
		System.out.println(b.indexOf("m"));
		System.out.println(b.indexOf("s"));
		System.out.println(b.indexOf("n", 0));
		System.out.println(b.lastIndexOf("s"));
		System.out.println(b.matches(b1));  // it will check the both string and if matches TRUE [W.T=Boolean]
		System.out.println(b.replace("e", "d")); // replace the Char with given Char .[W.T= String]
		System.out.println(b.toLowerCase());// Converts all of the characters in this String to lower case [w.t=string]
		System.out.println(b.isBlank()); // used to check weather string is blank . [W.T=boolean]
		System.out.println(b.isEmpty()); // used to check weather string is empty . [W.T=boolean]
		System.out.println(b.trim());// used to remove space in start and end [ wt= string]
		// arrays //
		
		String[] subjects= { "PHYSICS", "CHEMISTRY","MATHS","SOCIAL"};
		for (int i=0;i<subjects.length;i++) {
		System.out.println(subjects[i]);
	}
	 
		
				

	}

}
