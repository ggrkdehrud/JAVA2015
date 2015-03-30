package entity;

import java.io.Serializable;

//value object
//데이터를 저장하기 위한 클래스(별로 하는일은 없다).
//Entity class or Value class
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
}

//생성자 없애고 모두 set,get 으로만 처리한다.

