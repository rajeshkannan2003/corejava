package Firstpackage;

public class Stringtask {
	
	public static String Method2 (String name) {
		System.out.println("Hloo" +  name);
		return name;
	}
	
	public void Method1 () {
		Stringtask.Method2("  RAJESH  ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringtask str= new Stringtask();
		str.Method1();

	}

}
