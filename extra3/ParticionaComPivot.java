package extra3;

import java.util.Arrays;
import java.util.Scanner;

public class ParticionaComPivot {

	public static void main(String[] args) {
		ParticionaComPivot p = new ParticionaComPivot();
		Scanner ler = new Scanner(System.in);
		String[] array = ler.nextLine().split(" ");
		
		p.particiona(array);
		System.out.println(Arrays.toString(array));
	}
	
	private void particiona(String[] array) {
		int indicePivot = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i].equals(array[indicePivot])) {
				troca(array, indicePivot + 1, i);
			}
			else if (Integer.parseInt(array[i]) <= Integer.parseInt(array[indicePivot])) {
				troca(array, indicePivot, i);
				indicePivot = indicePivot +1;
			}			
		}
	}

	private void troca(String[] array, int indicePivot, int i) {
		String aux;
		while (indicePivot < i) {
			aux = array[i-1];
			array[i-1] = array[i];
			array[i] = aux;
			i = i -1;
		}
	}
}
