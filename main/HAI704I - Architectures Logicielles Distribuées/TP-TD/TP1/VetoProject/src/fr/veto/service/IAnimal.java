package fr.veto.service;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IAnimal extends Remote{
	String getNom() throws RemoteException;
	
	String getNomMaitre() throws RemoteException;
	
	String getEspece() throws RemoteException;
	
	String getRace() throws RemoteException;
	
	void printNom() throws RemoteException;
	
	void printNomMaitre() throws RemoteException;
	
	void printEspece() throws RemoteException;
	
	void printRace() throws RemoteException;
}
