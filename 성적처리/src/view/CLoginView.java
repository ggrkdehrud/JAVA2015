package view;

import entity.CMember;
import ����ó��.CMain;

public class CLoginView {

	//scanf�Ἥ userid password ����ְ�
	public CMember login() {
		System.out.println("ID : ");
//		String userID=CMain.scan.nextLine();
		String userID="userID";
		System.out.println("Password : ");
//		String password=CMain.scan.nextLine();
		String password="123";
		return new CMember(userID,password);
	}
}

//�����Թ���
//scanner next�� ���Ϳ��� ���´�.
//member.setUserID(userid);
//member.setPassword(password);
//return new CMember();