package algoritimos;

public class QuickSort implements Sort {
	//JOÃO VITOR ÂNGELO PEREIRA, LUCAS MÜLLER CORREIA E VINICIUS LOPES DA SILVA
	@Override
	public  int [] sort(int nos[]) {
		return quicksort(nos,0,nos.length - 1);
	}
	public static int[] quicksort(int nos[], int ini, int fim) {
       
        int meio;

        if (ini < fim) {

            meio = part(nos, ini, fim);

            quicksort(nos, ini, meio);

            quicksort(nos, meio + 1, fim);

        }
        
        return nos;

    }

 

    public static int part(int vet[], int ini, int fim) {

        int pivo, top, i;

        pivo = vet[ini];

        top = ini;

 

        for (i = ini + 1; i <= fim; i++) {

            if (vet[i] < pivo) {

                vet[top] = vet[i];

                vet[i] = vet[top + 1];

                top++;

            }

        }

        vet[top] = pivo;

        return top;

    }
}