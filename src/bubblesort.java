
public class bubblesort {
	
	public static void main(String[] args) {
		int[] array = {1, 4, 2, 2};	
		printArray(array);
		bubbleSort(array);
		printArray(array);
	}
	
	public static void bubbleSort(int[] array) {
		boolean done = false;
        while (!done) {
            done = true;

            for (int i = 0; i < array.length-1; i++) {
                int valA = array[i];
                int valB = array[i+1];
                if(valA > valB) {
                    done = false;
                    swap(array, i, i+1);
                }
            }
        }
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i<array.length; i++) {
			System.out.println(i + ") " + array[i]);
		}
	}
}
