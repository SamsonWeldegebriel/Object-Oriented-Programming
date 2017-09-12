package lesson4;

public class RecursiveBinarySearch {
	
	static int start = 0;
	static int middle = 0;
	static int end = 0;
	
	public static int binarySearch(int[] arr, int num, int start, int end) {
		
			
		if(arr[middle] == num) 
			return middle;
		middle = (start + end) / 2;
		if(start == middle)
			return -1;
		if(arr[middle] <= num)
		{
			start = middle;
			return binarySearch(arr, num, start, end);
		}
		else
		{
			end = middle;
			return binarySearch(arr, num, start, end);
		}
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 5, 7, 8, 9, 11};
		int search = 9;
		System.out.println(binarySearch(arr, search, 0, arr.length));
	}

}

/*
 * Input:   int arr[] = {1, 2, 5, 7, 8, 9, 11};
			int search = 9;
 * 
 * Output: 5
 * 
 * 
 */
