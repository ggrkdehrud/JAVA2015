package 己利贸府;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import DAO.CGangjwaDAO;
import DAO.CGwamokDAO;
import DAO.CMemberDAO;
import DAO.DAO;
import view.CGangjwaView;
import view.CGwmaokView;
import view.CLoginView;
import control.CGangjwaControl;
import control.CGwmaokControl;
import control.CLoginControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CGyosu;
import entity.CMember;

public class CMain {
	
	public static Scanner scan=new Scanner(System.in);
	
	public static void main(String args[]) throws IOException{
		//荐历历绢绢历军军绢沥历军军军绢沥历军军军军绢沥历军绢历绢
		//肺弊牢
		CLoginView loginView=new CLoginView();
		CMember member=loginView.login();
		
		CLoginControl loginControl=new CLoginControl();
		member = loginControl.login(member); //UserID客 password甫 啊瘤绊乐促.
		
		DAO memberDAO = new DAO();
		memberDAO.write(member,"member");
		member=(CMember)memberDAO.read("member");
		member.showMember();
		
		//苞格俺汲
		CGwmaokView gwamokView=new CGwmaokView();
		CGwamok gwamok=gwamokView.getGwamok();
		
		CGwmaokControl gwamokControl=new CGwmaokControl();
		gwamok=gwamokControl.getGwamok(gwamok);
		
		DAO gwamokDAO=new DAO();
		gwamokDAO.write(gwamok,"gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		
		//碍谅俺汲
		CGangjwaView gangjwaView=new CGangjwaView();
		CGangjwa gangjwa=gangjwaView.getGangjwa();
		
		CGangjwaControl gangjwaControl=new CGangjwaControl();
		gangjwa=gangjwaControl.getGangjwa(gangjwa);
		
		DAO gangjwaDAO=new DAO();
		gangjwaDAO.write(gangjwa,"gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
	}
}