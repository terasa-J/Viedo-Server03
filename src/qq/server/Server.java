package qq.server;

import java.io.IOException;
import java.net.*;

import qq.common.User;

import java.io.*;
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server s=new Server();
	}
	public Server(){
		try {
			ServerSocket ss=new ServerSocket(1212);
			System.out.println("������....");
			Socket s=ss.accept();
			ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			User user=(User)ois.readObject();
			System.out.println("�û�����   "+user.getName()+"  ���룺    "+user.getPassword());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
