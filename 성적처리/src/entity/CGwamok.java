package entity;

import java.io.Serializable;

public class CGwamok implements Serializable {
	private static final long serialVersionUID = 1L;
	//attribute
	private int ID;
	private int jakjeom;
	private String name;
	
	
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public int getJakjeom() {return jakjeom;}
	public void setJakjeom(int jakjeom) {this.jakjeom = jakjeom;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	
}
