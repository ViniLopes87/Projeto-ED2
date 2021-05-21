package algoritimos;

public class BubbleSort implements Sort {
	//JOÃO VITOR ÂNGELO PEREIRA, LUCAS MÜLLER CORREIA E VINICIUS LOPES DA SILVA

	@Override
	public int[] sort(int[] nos) {
		for (int i = nos.length; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				if (nos[j - 1] > nos[j]) {
					int aux = nos[j];
					nos[j] = nos[j - 1];
					nos[j - 1] = aux;
				}
			}
		}
		return nos;
	}

}
