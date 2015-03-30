package 성적처리;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import DAO.CGangjwaDAO;
import DAO.CGwamokDAO;
import DAO.CMemberDAO;
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
		
		//로그인
		CLoginView loginView=new CLoginView();
		CMember member=loginView.login();
		
		CLoginControl loginControl=new CLoginControl();
		member = loginControl.login(member); //UserID와 password를 가지고있다.
		
		CMemberDAO memberDAO = new CMemberDAO();
		memberDAO.write(member);
		member=memberDAO.read(member);
		member.showMember();
		
		//과목개설
		CGwmaokView gwamokView=new CGwmaokView();
		CGwamok gwamok=gwamokView.getGwamok();
		
		CGwmaokControl gwamokControl=new CGwmaokControl();
		gwamok=gwamokControl.getGwamok(gwamok);
		
		CGwamokDAO gwamokDAO=new CGwamokDAO();
		gwamokDAO.write(gwamok);
		
		//강좌개설
		CGangjwaView gangjwaView=new CGangjwaView();
		CGangjwa gangjwa=gangjwaView.getGangjwa();
		
		CGangjwaControl gangjwaControl=new CGangjwaControl();
		gangjwa=gangjwaControl.getGangjwa(gangjwa);
		
		CGangjwaDAO gangjwaDAO=new CGangjwaDAO();
		gangjwaDAO.write(gangjwa);
	}
}