package extra3;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		MergeSort m = new MergeSort();
		Scanner ler = new Scanner(System.in);
		String[] array = ler.nextLine().split(" ");

		m.mergeSort(array, 0, array.length - 1);
	}

	private void mergeSort(String[] array, int i, int j) {
		System.out.println(imprimeArray(array, i, j));
		int meio = (i + j) / 2;
		if (i < j) {

			mergeSort(array, i, meio);
			mergeSort(array, meio + 1, j);
			merge(array, i, meio, j);
		}

	}

	private String imprimeArray(String[] array, int comeco, int fim) {
		String[] arrayAux = new String[fim - comeco + 1];
		int k = 0;

		for (int i = comeco; i <= fim; i++) {
			arrayAux[k] = array[i];
			k = k + 1;
		}
		return Arrays.toString(arrayAux);
	}

	private void merge(String[] array, int inicio, int meio, int fim) {
		String[] aux = new String[array.length];
		
		
		for (int k = 0; k < aux.length; k++) {
			aux[k] = array[k];
		}

		int i = inicio;
		int j = meio + 1;
		int k = inicio;
		
		while (i <= meio && j <= fim) {
			if (Integer.parseInt(aux[i]) >= Integer.parseInt(aux[j])) {
				array[k] = aux[j];
				j = j + 1;
			}
			
			else{
				array[k] = aux[i];
				i = i + 1;
			}
			
			k = k + 1;
		}
		
		while (i <= meio) {
			array[k] = aux[i];
			k = k + 1;
			i = i + 1;
		}
		
		while (j <= fim) {
			array[k] = aux[j];
			k = k + 1;
			j = j + 1;
		}
		
		System.out.println(imprimeArray(array, inicio, fim));
	}

}
