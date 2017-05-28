package extra3;

import java.util.Arrays;
import java.util.Scanner;

public class InsereOrdenadoUltimo {

	public static void main(String[] args) {
		InsereOrdenadoUltimo i = new InsereOrdenadoUltimo();
		Scanner ler = new Scanner(System.in);
		String[] array = ler.nextLine().split(" ");
		
		i.ordena(array);
		System.out.println(Arrays.toString(array));
	}

	private void ordena(String[] array) {
		int i = array.length -1;
		String aux;
		
		while((i-1 >= 0) && (Integer.parseInt(array[i]) < Integer.parseInt(array[i-1]))) {
			aux = array[i-1];
			array[i-1] = array[i];
			array[i] = aux;
			i = i -1;
		}
	}
}
