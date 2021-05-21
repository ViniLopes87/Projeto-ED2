package algoritimos;

public class SelectionSort implements Sort{
	//JOÃO VITOR ÂNGELO PEREIRA, LUCAS MÜLLER CORREIA E VINICIUS LOPES DA SILVA
	@Override
	public int[] sort(int[] nos) {
		for (int i = 0; i < nos.length; i++) {
            int menorvalor = i;
            for (int j = i + 1; j < nos.length; j++) {
                if (nos[j] < nos[menorvalor]) {
                    menorvalor = j;
                }
            }

            int temp = nos[menorvalor];
            nos[menorvalor] = nos[i];
            nos[i] = temp;
        }
		return nos;
	}

}
