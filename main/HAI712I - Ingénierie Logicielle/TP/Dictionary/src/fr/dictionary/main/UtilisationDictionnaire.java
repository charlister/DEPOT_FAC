package fr.dictionary.main;

import fr.dictionary.abstractdata.IDictionary;
import fr.dictionary.concretdata.OrderedDictionary;

public class UtilisationDictionnaire {

	public static void main(String[] args) {
		System.out.println("ORDERED DICTIONARY TEST : ");
		IDictionary dic = new OrderedDictionary();
		
		System.out.println("dic.isEmpty() ? "+dic.isEmpty());
		System.out.println("dic.get(\"Timberland\") : "+dic.get("Timberland"));
		
		dic.put("Timberland", 170);
		dic.put("AirForce", 100);
		
		System.out.println("dic.isEmpty() ? "+dic.isEmpty());
		System.out.println("dic.get(\"AirForce\") : "+dic.get("AirForce"));
		
		System.out.println("dic.containsKey(\"Adidas\") ? "+dic.containsKey("Adidas"));
		System.out.println("dic.size() : "+dic.size());
	}

}
