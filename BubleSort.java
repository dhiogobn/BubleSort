package bublesort;

public class BubleSort {

	private int[] array = new int[] {2, 5, 4, 8, 7};
	
	public BubleSort() {
		super();
	}

	public void getSort() {
		for (int i =  0; i <array.length-1; i++) {
			for (int j = 0; j < array.length-1-i; j++) {
				if(array[j]> array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
	public void imprimir() {
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
}
