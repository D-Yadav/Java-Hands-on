package com.hcl.Nov19;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx1 {
public static void main(String[] args) {
	//FileInputStream fout= new FileInputStream
	try {
		FileOutputStream fout = new FileOutputStream("c:/files/d1.txt");
		DataOutputStream dout= new DataOutputStream(fout) ;
		dout.writeInt(67);
		dout.writeInt(56);
		dout.close();
		fout.close();
		System.out.println("File created");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch(IOException e){
		e.printStackTrace();
	}

	
}
}
