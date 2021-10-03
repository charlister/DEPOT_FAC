package fr.dictionary.concretdata;

import fr.dictionary.abstractdata.AbstractDictionary;

public class OrderedDictionary extends AbstractDictionary{
	
	public OrderedDictionary() {
		super();
	}

	public int indexOf(Object key) {
		for(int i = 0 ; i<size ; i++) 
			if(keys[i] == key)
				return i;

		return -1;
	}

	public int newIndexOf(Object key) {
		int index = size;
		Object[] new_values = new Object[size+1];
		Object[] new_keys = new Object[size+1];
		for(int i = 0; i < size; i++) {
			new_values[i] = values[i];
			new_keys[i] = keys[i];
		}
		values = new_values;
		keys = new_keys;
		size++;
		return index;
	}
}

/* 6.
 * Une affectation polymorphe est l'attribution à une variable de type T, une valeur d'une sous-classe. 
 * L'inverse est aussi possible (en recourant au downcast)
 * 
 * */