package 성적처리;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


import DAO.IDAO;
import DAO.ObjectDAO;
import view.CGangjwaView;
import view.CGwmaokView;
import view.CLoginView;
import view.CSugangView;
import control.CGangjwaControl;
import control.CGwmaokControl;
import control.CLoginControl;
import control.CSugangControl;
import entity.CGangjwa;
import entity.CGwamok;
import entity.CGyosu;
import entity.CMember;
import entity.CSugang;

public class CMain {
	
	public static Scanner scan=new Scanner(System.in);
	
	public static void main(String args[]) throws IOException{
		//로그인
		CLoginView loginView=new CLoginView();
		CMember member=loginView.login();
		
		CLoginControl loginControl=new CLoginControl();
		member = loginControl.login(member); //UserID와 password를 가지고있다.
		
		IDAO memberDAO = new ObjectDAO();
//		memberDAO.write(member,"member");
//		member=(CMember)memberDAO.read(member.getClass(),"member");
		member.showMember();
		/*
		//과목개설
		CGwmaokView gwamokView=new CGwmaokView();
		CGwamok gwamok=gwamokView.getGwamok();
		
		CGwmaokControl gwamokControl=new CGwmaokControl();
		gwamok=gwamokControl.getGwamok(gwamok);
		
		IDAO gwamokDAO=new ObjectDAO();
		gwamokDAO.write(gwamok,"gwamok");
		gwamok = (CGwamok) gwamokDAO.read("gwamok");
		
		//강좌개설
		CGangjwaView gangjwaView=new CGangjwaView();
		CGangjwa gangjwa=gangjwaView.getGangjwa();
		
		CGangjwaControl gangjwaControl=new CGangjwaControl();
		gangjwa=gangjwaControl.getGangjwa(gangjwa);
		
		IDAO gangjwaDAO=new ObjectDAO();
		gangjwaDAO.write(gangjwa,"gangjwa");
		gangjwa = (CGangjwa) gangjwaDAO.read("gangjwa");
		
		//수강신청
		CSugangView sugangView=new CSugangView();
		CSugang sugang=sugangView.getSugang(member,gangjwa);
		
		CSugangControl sugangControl=new CSugangControl();
		sugang=sugangControl.getSugang(sugang);
		
		CSugangDAO sugangDAO=new CSugangDAO();
		sugangDAO.write(sugang);
		*/
	}
}