package hash;

import java.util.LinkedList;

public class HashDivisaoEncadeamentoSeparado implements HashSimplified {
	final int TAMANHO = 97;
	LinkedList<Integer>[] espaco = new LinkedList[TAMANHO];
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
		int element = espaco[index].getFirst();
		return element == key;
	}

	@Override
	public void put(int key) {
		int index = hash(key);
		if (espaco[index] != null) {
			espaco[index].add(key);
		} else {
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(key);
			espaco[index] = list;
			counter++;
		}

	}

}
