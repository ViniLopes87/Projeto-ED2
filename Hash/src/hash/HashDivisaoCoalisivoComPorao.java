package hash;

public class HashDivisaoCoalisivoComPorao implements HashSimplified {

	final int TAMANHO = 97;
	Local[] espaco = new Local[TAMANHO];
	int counter = 0;

	private int hash(int value) {
		return value % (TAMANHO - 10);
	}

	@Override
	public int size() {
		return counter;
	}

	@Override
	public boolean isEmpty() {
		return counter == 0;
	}

	@Override
	public boolean containsKey(int key) {
		int index = hash(key);
		int element = espaco[index].getKey();
		return element == key;
	}
	
	

	@Override
	public void put(int key) {
		Local lc = new Local(key);
		int index = hash(key);
		if (espaco[index] != null) {
			for (int TAM = espaco.length-1; TAM >= 0; TAM--) {
				if (espaco[TAM] == null) {
					espaco[TAM] = lc;
					espaco[index].setIndex(TAM);
				}
			}
		}
		espaco[index] = lc;
		counter++;
	}

}
