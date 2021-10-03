package fr.veto.server;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import fr.veto.service.AnimalImpl;

public class Server {

	public static void main(String[] args) throws AlreadyBoundException {
		try {
			AnimalImpl obj = new AnimalImpl("bull dog");
			
			Registry registry = LocateRegistry.createRegistry(1099);
			if(registry == null) {
				System.err.println("registry not created");
			}
			else {
				registry.bind("Animal", obj);
				System.out.println("server ready");
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
