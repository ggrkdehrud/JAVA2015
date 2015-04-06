package DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import entity.CGangjwa;

public class ObjectDAO implements IDAO{
	public Object read(String fileName){
		Object object=null;
		try {
			ObjectInputStream in;
			in = new ObjectInputStream(new FileInputStream(fileName));
			object=in.readObject();
			in.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return object;	
	}
	
	public void write(Object object, String fileName){
		// serialization
		
		try {
			ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(object);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object read(Class clazz, String fileName) {
		// TODO Auto-generated method stub
		return null;
	}
}
