package entity;

import java.io.Serializable;
import java.util.Scanner;
import java.util.Vector;

public class CGangjwa extends CEntity {

	private static final long serialVersionUID = 1L;
	
	private int ID;
	private int suganginwon;
	private String name;
	private Vector<String> times;
	private int gyosuID;
	private int gwamokID;
		
	public int getID() {return ID;}
	public void setID(int iD) {ID = iD;}
	public int getSuganginwon() {return suganginwon;}
	public void setSuganginwon(int suganginwon) {this.suganginwon = suganginwon;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public Vector<String> getTimes() {return times;}
	public void setTimes(Vector<String> times) {this.times = times;}
	public int getGyosuID() {return gyosuID;}
	public void setGyosuID(int gyosuID) {this.gyosuID = gyosuID;}
	public int getGwamokID() {return gwamokID;}
	public void setGwamokID(int gwamokID) {this.gwamokID = gwamokID;}
	@Override
	public void read(Scanner scan) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void write() {
		// TODO Auto-generated method stub
		
	}	
}
