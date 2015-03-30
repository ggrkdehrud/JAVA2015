package view;

import entity.CGwamok;

public class CGwmaokView {
	private int ID;
	private int jakjeom;
	private String name;
	
	public CGwamok getGwamok() {
		CGwamok gwamok=new CGwamok();
		gwamok.setID(123);
		gwamok.setJakjeom(3);
		gwamok.setName("ÀÚ¹Ù");
		return gwamok;
	}
}
