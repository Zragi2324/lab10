package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelectionSortTest {

	@Test 
	public void testPositiveList() {
		
		SelectionSort aot = new SelectionSort();
		
		 int[] arr = new int[5];
	        arr[0] = 8;
	        arr[1] = 9;
	        arr[2] = 7;
	        arr[3] = 10;
	        arr[4] = 2;
	        
	        int[] Sortedarr = new int[5];
	        Sortedarr[0] = 2;
	        Sortedarr[1] = 7;
	        Sortedarr[2] = 8;
	        Sortedarr[3] = 9;
	        Sortedarr[4] = 10;
		assertEquals(1, aot.checkPositives(arr));
		assertEquals(1, aot.checkPositives(Sortedarr));
	}
	
@Test 
	public void CheckNegative() {
		
	SelectionSort aot = new SelectionSort();
		
		int[]  array = {-1,-2,-3,-4,-5,-6,-7};
		assertEquals(1, aot.checkNegatives(array));
	}
	
	@Test 
public void CheckMixedTest() {
		
		SelectionSort aot = new SelectionSort();
		
		int[]  array = {-1,-2,0,4,5,-6,-7};
		assertEquals(1, aot.checkMixed(array));
	}
	@Test
public void CheckDuplicate() {
		
		SelectionSort aot = new SelectionSort();
		
		int[]  array = {-1,2,-1,4,5,-6,-7};
		assertEquals(1, aot.checkDuplicates(array));
	}
}
