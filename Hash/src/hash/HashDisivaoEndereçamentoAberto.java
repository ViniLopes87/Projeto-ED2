package hash;

public class HashDisivaoEndereçamentoAberto implements HashSimplified {

	final int TAMANHO = 97;
	Integer[] espaco = new Integer[TAMANHO];
	int counter = 0;

	private int hash(int value) {
		return value % TAMANHO;
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

	private int colisao(int index) {
		int i = index;
		while (espaco[i] != null) {
			i++;
		}
		return i;
	}

	@Override
	public void put(int key) {
		int index = hash(key), indexvalido;
		indexvalido = colisao(index);
		espaco[indexvalido] = key;
		counter++;
	}


}
