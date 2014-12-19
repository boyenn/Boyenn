package com.server.test;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import com.interf.test.TestRemote;



public class RemoteImpl extends UnicastRemoteObject implements TestRemote{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected RemoteImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isLoginValid(String username) throws RemoteException {
		// TODO Auto-generated method stub
		if(username.equals("test")){
			return true;
		}
		return false;
	}

}
