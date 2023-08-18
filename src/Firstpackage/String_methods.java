package Firstpackage;

public class String_methods {
	
	String name1 = "Rajesh kannan";
	String name2 = "Harish";
	
	public void stringconcept() {
		System.out.println(name1  +  name2 );
		int len = name1.length();
		int le = name2.length();
		System.out.println(le);
		System.out.println(len);
		System.out.println(name2.trim());
		System.out.println(name2.replace("Harish","Raj"));
		System.out.println(name1.replace("Rajesh" , "RAJU"));
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1.charAt(8));
		System.out.println(name1.indexOf('n'));
		System.out.println(name1.lastIndexOf('k'));
		System.out.println(name1.substring(3));
		System.out.println(name1.substring(3,10));
		System.out.println(name1.contains("nan"));
		System.out.println(name1.startsWith("Raj"));
		System.out.println(name1.endsWith("kannan"));
		System.out.println(name1.toUpperCase());
		System.out.println(name1.toLowerCase());
		System.out.println(name1.isEmpty());
		System.out.println(name1.isBlank());
		String[] namearray = name1.split("sathish");
		for(String val:namearray) {
			System.out.println(val);
		}
		
		char[] c=name1.toCharArray();
		for (char val:c) {
			System.out.println(val);
		}
		System.out.println(name1.concat(name2));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String_methods string = new String_methods();
		string.stringconcept();
		

	}

}
