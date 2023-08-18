package Firstpackage;

//Arithmetic operator ;


public class Addsub {
	public void Add() {
		int e = 5 ;
		int f = 6 ;
		int g = e+f ;
		System.out.println("Addition Value of G is =" + g)	;
	}
	public void sub(int  e, int f) {
		int g = e - f ;
		System.out.println("subraction Value of G is =" + g);
		
	}
	
	public int mul () {
		int e = 30;
		int f = 40;
		int g= e * f;
		System.out.println("multiplicatin Value of G is =" + g);
		return g ;
		
	}
	public int dev(int e, int f ) {
		int g= e / f ;
		System.out.println("divesion Value of G is =" + g);
		return g ;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addsub maths = new Addsub();  // insatan station
		maths.Add();
		maths.sub (30,20);
		maths.mul();
		maths.dev(70, 07);

	}

}
