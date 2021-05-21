package algoritimos;

public class ShellSort implements Sort {
	//JO�O VITOR �NGELO PEREIRA, LUCAS M�LLER CORREIA E VINICIUS LOPES DA SILVA
	@Override
	public int[] sort(int[] nos) {
		int n = nos.length;
		for (int gap = n / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < n; i += 1) {
				int temp = nos[i];
				int j;
				for (j = i; j >= gap && nos[j - gap] > temp; j -= gap)
					nos[j] = nos[j - gap];
				nos[j] = temp;
			}
		}
		return nos;

	}

}
