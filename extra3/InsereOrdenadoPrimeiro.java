package extra3;

import java.util.Arrays;
import java.util.Scanner;

public class InsereOrdenadoPrimeiro {

	public static void main(String[] args) {
		InsereOrdenadoPrimeiro s = new InsereOrdenadoPrimeiro();
		Scanner ler = new Scanner(System.in);

		String[] array = ler.nextLine().split(" ");
		s.ordena(array);
		System.out.println(Arrays.toString(array));
	}

	private void ordena(String[] array) {
		int i = 0;
		String aux;
		
		while ((i  < array.length - 1) && (Integer.parseInt(array[i]) > (Integer.parseInt(array[i +1])))) {
			aux = array[i];
			array[i] = array[i + 1];
			array[i + 1] = aux;
			i++;
			
		}
	}

}
