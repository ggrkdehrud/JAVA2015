package DAO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import entity.CGangjwa;
import entity.CMember;

public class CGangjwaDAO {
	public CGangjwa read(){ return null; }
	public void write(CGangjwa gangjwa){
		System.out.println("과목ID : "+gangjwa.getID());
		System.out.println("과목명 : "+gangjwa.getName());
		
		// serialization
		
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("gangjwa"));
			out.writeObject(gangjwa);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
