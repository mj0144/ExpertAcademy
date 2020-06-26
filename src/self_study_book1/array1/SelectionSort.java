package self_study_book1.array1;

public class SelectionSort {

	// selectionSort
	public static void main(String[] args) {
		int arr[] = { 6, 23, 7, 4, 8, 5, 22, 1 };

		int idx = 0;
		int minidx=0;
		int temp=0;

		for (int j = 0; j < arr.length; j++) {
			int minIdx = j; //기준값 인덱스.
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[minIdx] > arr[i]) { 
					minIdx = i; //기준값인덱스보다 작은 인덱스가 minIdx가 됨.
				}
			}
			temp = arr[j]; //j값과 minIdx값이 원래 같았는데, 위에서 minIdx가 바뀌게 되면 이게 수행될 수 있.
			arr[j] = arr[minIdx];
			arr[minIdx] = temp;

		}

		for (int e : arr) {
			System.out.println("arr : " + e);
		}

	}

}
