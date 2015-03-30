package DAO;

import java.io.*;
import java.util.Vector;

import entity.CMember;

public class CMemberDAO {
	
	//Data Access Object: Read or write data from persistent storage
	Vector<CMember> vt=new Vector<CMember>();
	CMember tempmember=new CMember();
	
	public CMember read(CMember member) throws IOException{
		String temp;
		String UserID;
		String password;
		
		File file=new File("gwamok.txt");
		FileReader reader=new FileReader(file);
		BufferedReader breader=new BufferedReader(reader);
		
		while( (temp=breader.readLine()) != null){
			UserID=temp.split(" ")[0];
			password=temp.split(" ")[1];
			
			vt.add(new CMember(UserID,password));
		}
		
		for(int i=0;i<vt.size();i++){
			tempmember=(CMember)vt.get(i);
			if(member.getUserID().equals(tempmember.getUserID()) && member.getPassword().equals(tempmember.getPassword()) ){
				System.out.println(tempmember.getUserID()+"´Ô ·Î±×ÀÎ µÇ¼Ì½À´Ï´Ù.");
				return tempmember;
			}
		}
		return tempmember;
	}
	
	public void write(CMember member) throws IOException{
		File file=new File("gwamok.txt");
		FileWriter writer=new FileWriter(file,true);
		BufferedWriter bwriter=new BufferedWriter(writer);
		
		bwriter.write(member.getUserID()+" "+member.getPassword());
		bwriter.newLine();
		bwriter.close();
	}
}
