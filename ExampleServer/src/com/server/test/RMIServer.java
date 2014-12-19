package com.server.test;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.interf.test.Constant;

public class RMIServer {
	public static void main(String[] args) throws RemoteException, AlreadyBoundException{
		System.setProperty("java.rmi.server.hostname", "84.193.161.2"); 

		RemoteImpl impl = new RemoteImpl();
		Registry registry = LocateRegistry.createRegistry(Constant.RMI_PORT);
		registry.bind(Constant.RMI_ID, impl);
		System.out.println("Server Started");
	};
}
