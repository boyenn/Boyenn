package com.client;

import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.interf.test.Constant;
import com.interf.test.TestRemote;

public class TestClient {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NotBoundException, IOException{
		Registry registry = LocateRegistry.getRegistry("84.193.161.2", Constant.RMI_PORT);
		TestRemote remote = (TestRemote)registry.lookup(Constant.RMI_ID);
		System.out.println(remote.isLoginValid("ak"));
		System.out.println(remote.isLoginValid("test"));
		br.readLine();
	
		
		
	}
}
