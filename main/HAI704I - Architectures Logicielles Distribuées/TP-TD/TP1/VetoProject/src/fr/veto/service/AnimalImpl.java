package fr.veto.service;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AnimalImpl extends UnicastRemoteObject implements IAnimal {
	String m_nom;
	String m_nomMaitre;
	String m_espece;
	String m_race;
	
	public  AnimalImpl(String nom) throws RemoteException {
		m_nom = nom;
	}

	@Override
	public String getNom() throws RemoteException {
		return m_nom;
	}

	@Override
	public String getNomMaitre() throws RemoteException {
		return m_nomMaitre;
	}

	@Override
	public String getEspece() throws RemoteException {
		return m_espece;
	}

	@Override
	public String getRace() throws RemoteException {
		return m_race;
	}
	
	@Override
	public void printNom() throws RemoteException{
		System.out.println("nom : "+m_nom);
	}
	
	@Override
	public void printNomMaitre() throws RemoteException{
		System.out.println("nom maître : "+m_nomMaitre);
	}
	
	@Override
	public void printEspece() throws RemoteException{
		System.out.println("espèce : "+m_espece);
	}
	
	@Override
	public void printRace() throws RemoteException{
		System.out.println("race : "+m_race);
	}
}
