package extra3;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionRecursivo {

	public static void main(String[] args) {
		SelectionRecursivo s = new SelectionRecursivo();
		Scanner ler = new Scanner(System.in);

		String[] array = ler.nextLine().split(" ");

		s.selectionSort(array, 0);
	}

	private void selectionSort(String[] array, int indice) {
		if (array.length - 1 > indice) {
			selection(array, indice);
			selectionSort(array, indice + 1);
		}

	}

	private void selection(String[] array, int indice) {
		int menor = indice;
		int i = indice;
		String aux;
		
		for (i = indice + 1; i < array.length; i++) {
			if (Integer.parseInt(array[i]) < Integer.parseInt(array[menor])) {
				menor = i;
			}
		}
		aux = array[indice];
		array[indice] = array[menor];
		array[menor] = aux;
		
		System.out.println(Arrays.toString(array));
		
	}

}
