package hash;

public class HashPorMultiplicacao implements HashSimplified {
	final int TAMANHO = 97;
	Integer[] espaco = new Integer[TAMANHO];
	int counter = 0;

	private int hash(int key) {
		int e;
		e = key * (19 / 32);
		return e % TAMANHO;
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
		Integer element = espaco[index];
		return element == key;
	}

	@Override
	public void put(int key) {
		int index = hash(key);
		espaco[index] = key;
		counter++;
	}

}
