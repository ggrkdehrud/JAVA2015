package entity;

import java.io.Serializable;
import java.util.Scanner;


public class CMember implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//attributes
	private String userID;
	private String password;
	
	public CMember(){}
	
	public CMember(String userID,String password){
		this.userID=userID;
		this.password=password;
	}
	
	public void showMember(){
		System.out.println("ID : "+userID);
		System.out.println("Password : "+password);
	}

	public String getUserID() {
		return userID;
	}

	public String getPassword() {
		return password;
	}
	
	void read(Scanner scan){
		userID = scan.next();
		password = scan.next();
	};
	
	void write(){};
}

//생성자 없애고 모두 set,get 으로만 처리한다.

