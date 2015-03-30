package entity;

import java.io.Serializable;

//value object
//�����͸� �����ϱ� ���� Ŭ����(���� �ϴ����� ����).
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

//������ ���ְ� ��� set,get ���θ� ó���Ѵ�.

