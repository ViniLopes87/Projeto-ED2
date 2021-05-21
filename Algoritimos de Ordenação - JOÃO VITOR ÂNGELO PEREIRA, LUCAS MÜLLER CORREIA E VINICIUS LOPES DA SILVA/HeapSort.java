package algoritimos;

public class HeapSort implements Sort {
	//JOÃO VITOR ÂNGELO PEREIRA, LUCAS MÜLLER CORREIA E VINICIUS LOPES DA SILVA
	@Override
	public int[] sort(int[] nos) {
		buildMaxHeap(nos);
        int n = nos.length;

        for (int i = nos.length - 1; i > 0; i--) {
            swap(nos, i, 0);
            maxHeapify(nos, 0, --n);
        }
		return nos;
	}
	
	private static void buildMaxHeap(int[] nos) {
        for (int i = nos.length / 2 - 1; i >= 0; i--) {
            maxHeapify(nos, i, nos.length);
        }

    }
	
	private static void maxHeapify(int[] nos, int pos, int tam) {

        int max = 2 * pos + 1, dir = max + 1;
        if (max < tam) {

            if (dir < tam && nos[max] < nos[dir]) {
                max = dir;
            }

            if (nos[max] > nos[pos]) {
                swap(nos, max, pos);
                maxHeapify(nos, max, tam);
            }
        }
    }
	
	public static void swap(int[] nos, int j, int aposJ) {
        int aux = nos[j];
        nos[j] = nos[aposJ];
        nos[aposJ] = aux;
    }

}
