package algoritimos;

public class Main {
//JOÃO VITOR ÂNGELO PEREIRA, LUCAS MÜLLER CORREIA E VINICIUS LOPES DA SILVA
	
//Main para testar os algoritmos e verificar se funcionam//
	public static void main(String[] args) {
		Sort sort = new BubbleSort();
		Sort sort2 = new HeapSort();
		Sort sort3 = new InsertionSort();
		Sort sort4 = new MergeSort();
		Sort sort5 = new QuickSort();
		Sort sort6 = new SelectionSort();
		Sort sort7 = new ShellSort();
		int test[] = { 20, 80, 10, 100, 30, 5,200, 40 }, i;

		int ordem[] = sort.sort(test);
		int ordem2[] = sort2.sort(test);
		int ordem3[] = sort3.sort(test);
		int ordem4[] = sort4.sort(test);
		int ordem5[] = sort5.sort(test);
		int ordem6[] = sort6.sort(test);
		int ordem7[] = sort7.sort(test);
		System.out.println("Ordenação por BubbleSort");
		for (i = 0; i < ordem.length; i++) {
			System.out.println(ordem[i]);
		}
		System.out.println("Ordenação por HeapSort");
		for (i = 0; i < ordem2.length; i++) {
			System.out.println(ordem2[i]);
		}
		System.out.println("Ordenação por InsertionSort");
		for (i = 0; i < ordem3.length; i++) {
			System.out.println(ordem3[i]);
		}
		System.out.println("Ordenação por MergeSort");
		for (i = 0; i < ordem4.length; i++) {
			System.out.println(ordem4[i]);
		}
		System.out.println("Ordenação por QuickSort");
		for (i = 0; i < ordem5.length; i++) {
			System.out.println(ordem5[i]);
		}
		System.out.println("Ordenação por SelectionSort");
		for (i = 0; i < ordem6.length; i++) {
			System.out.println(ordem6[i]);
		}
		System.out.println("Ordenação por ShellSort");
		for (i = 0; i < ordem7.length; i++) {
			System.out.println(ordem7[i]);
		}

	}

}
