package klienti;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
//Klasa Klient implementon interfejsin KlientiInterface
public class Klient extends UnicastRemoteObject implements KlientInterface{
	private final JTextArea mesazhi;
	private final JTextArea online;
    private final String emri;
  
	
	public Klient(String emri,JTextArea mesazhi,JTextArea online) throws RemoteException{
	this.mesazhi=mesazhi;
	this.online=online;
    this.emri=emri;
	}
		
	@Override 
   public String getEmri()throws RemoteException{
   return emri;}
}