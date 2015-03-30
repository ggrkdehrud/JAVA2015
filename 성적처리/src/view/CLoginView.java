package view;

import entity.CMember;
import 성적처리.CMain;

public class CLoginView {

	//scanf써서 userid password 집어넣고
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

//교수님버전
//scanner next는 엔터에서 끊는다.
//member.setUserID(userid);
//member.setPassword(password);
//return new CMember();