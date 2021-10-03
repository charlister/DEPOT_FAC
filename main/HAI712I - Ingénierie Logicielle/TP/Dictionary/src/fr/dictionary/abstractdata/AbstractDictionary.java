package fr.dictionary.abstractdata;

public abstract class AbstractDictionary implements IDictionary {
	protected Object[] keys;
	protected Object[] values;
	protected int size;

	public AbstractDictionary() {
		this.size = 0;
		keys = null;
		values = null;
	}

	//	rend la valeur associ�e � key dans le receveur.
	public Object get(Object key) {
		int index = indexOf(key);
		if(index == -1) {
			System.err.println("undefined key : "+key);
			return null;
		}
		else 
			return values[index];
	}
  
	// entre un nouveau couple cl�-valeur dans le receveur, rend le receveur
	public IDictionary put(Object key, Object value) {
		int index = 0;
		if(indexOf(key) == -1) {
			index = newIndexOf(key);
			keys[index] = key;
			values[index] = value;
		}
		else {
			System.err.println("la cl� figure d�j� dans le dictionnaire");
		}
		return this;
	}

	// rend vrai si le receveur est vide, faux sinon
	public boolean isEmpty() {
		return size == 0 ;
	}

	// rend vrai si la cl� est connue dans le receveur, faux sinon.
	public boolean containsKey(Object key) {
		int index = indexOf(key);
		return index != -1;
	}

	// rend le nombre d'�l�ments (donc le nombre de couples cl�-valeur) contenus dans le receveur.
	public int size() {
		return this.size;
	}
	
	// rend l'index auquel est rang� le nom key dans le dictionnaire receveur, si key n'est pas dans le receveur, rend -1.
	protected abstract int indexOf(Object key);
	
	/* 
	 * Cette m�thode est appel�e uniquement si key N'EST PAS dans le dictionnaire. Cette m�thode pr�pare 
	 * l'insertion et rend l'index auquel la nouvelle cl�, et la valeur correspondante, pourront �tre ins�r�es ; 
	 * elle n'effectue ces insertions.
	*/
	protected abstract int newIndexOf(Object key);
}
