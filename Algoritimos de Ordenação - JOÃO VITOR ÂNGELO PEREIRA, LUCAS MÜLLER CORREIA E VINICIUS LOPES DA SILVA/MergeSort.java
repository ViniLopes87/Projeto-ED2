package algoritimos;

public class MergeSort implements Sort {
	//JOÃO VITOR ÂNGELO PEREIRA, LUCAS MÜLLER CORREIA E VINICIUS LOPES DA SILVA
	@Override
	public int[] sort(int[] nos) {
		if (nos.length <= 1) {

			return nos;
		}
		int meio = nos.length / 2;
		int[] dir = nos.length % 2 == 0 ? new int[meio] : new int[meio + 1];
		int[] esq = new int[meio];

		int[] aux = new int[nos.length];

		for (int i = 0; i < meio; i++) {
			esq[i] = nos[i];
		}

		int auxI = 0;
		for (int i = meio; i < nos.length; i++) {
			dir[auxI] = nos[i];
			auxI++;
		}

		esq = sort(esq);
		dir = sort(dir);

		aux = mergesort(esq, dir);

		return aux;
	}

	static int[] mergesort(int[] esq, int[] dir) {
		int[] aux = new int[esq.length + dir.length];

		int valorDir = 0, valorEsq = 0, valorAux = 0;

		while (valorEsq < esq.length || valorDir < dir.length) {
			if (valorEsq < esq.length && valorDir < dir.length) {
				if (esq[valorEsq] <= dir[valorDir]) {
					aux[valorAux] = esq[valorEsq];
					valorAux++;
					valorEsq++;
				} else {
					aux[valorAux] = dir[valorDir];
					valorAux++;
					valorDir++;
				}
			} else if (valorEsq < esq.length) {
				aux[valorAux] = esq[valorEsq];
				valorAux++;
				valorEsq++;
			} else if (valorDir < dir.length) {
				aux[valorAux] = dir[valorDir];
				valorAux++;
				valorDir++;
			}
		}
		return aux;
	}

}
