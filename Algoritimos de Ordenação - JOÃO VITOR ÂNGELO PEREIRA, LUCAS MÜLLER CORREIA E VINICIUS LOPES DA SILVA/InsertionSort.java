package algoritimos;

public class InsertionSort implements Sort{
	//JOÃO VITOR ÂNGELO PEREIRA, LUCAS MÜLLER CORREIA E VINICIUS LOPES DA SILVA
	@Override
	public int[] sort(int[] nos) {
	        for (int i = 0; i < nos.length; i++) {
	            int atual = nos[i];
	            int j = i - 1;
	            while (j >= 0 && nos[j] >= atual) {
	                nos[j + 1] = nos[j];
	                j--;
	            }
	            nos[j + 1] = atual;;
	        }
	        return nos;
	}

}
