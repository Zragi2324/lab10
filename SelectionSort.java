package Testing;




	public class SelectionSort {
		 private int temp;
		 public SelectionSort() {}
		/** Creates a new instance of SelectionSort */



		    /* A simple SelectionSort algorithm
		     * pre-condition:
		     * post-condition:
		     * inputs:
		     * outputs:
		     * special conditions:
		     */
		    public int[] basicSelectionSort(int[] x) {
		        for (int i = 0; i < x.length; ++i) {
		            for (int j= i+1; j < x.length; ++j) {
		                if (x[i] > x[j]) {
		                    temp = x[i];
		                    x[i] = x[j];
		                    x[j]; = temp
		                }
		            } // end of inner for loop
		        } // end of outer for loop
		        return x;
		    } // end of basicSelectionSort method


public int checkPositives(int[] array) {

		int result = 1;

		for(int i = 0; i < array.length; i++) {

			if(array[i] < 0) {
				result = 0;
				break;
			}

		}

		return result;
	}


	public int checkNegatives(int[] array) {


		int result = 1;
		for(int i = 0; i < array.length; i++) {

			if(array[i] > 0 ) {
				result = 0;
				break;
			}
		}
		return result;
	}

	public int checkMixed(int[] array) {

		int x = 0;
		int y = 0;
		int z = 0;
		int result = 0;

		for(int i = 0; i < array.length; i++) {

			if(array[i] <0) {
				x = 1;

			}
			if(array[i] > 0) {
				y = 1;

			}
			if(array[i] == 0) {
				z = 1;
			}
		}

		if((x == 1) && (y == 1) && (z == 1)) {
		result = 1;
		}
		return result;
	}

	public int checkDuplicates(int[] array) {

		int result = 0;
		for(int i = 0; i < array.length;i++) {
			for(int j = 0; j < array.length; j++) {
				if((array[i] == array[j]) && i != j) {
					result = 1;
				}
			}
		}
		return result;
	}
	}
