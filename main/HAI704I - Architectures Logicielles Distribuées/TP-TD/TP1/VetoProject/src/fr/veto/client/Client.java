package fr.veto.client;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import fr.veto.service.IAnimal;

public class Client {

	public static void main(String[] args) {
		String host = (args.length < 1) ? null : args[0];
		try {
			Registry registry = LocateRegistry.getRegistry(host);
			IAnimal stub = (IAnimal) registry.lookup("Animal");
			String response = stub.getNom();
			System.out.println("response: " + response);
			stub.printNom();
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}
}
