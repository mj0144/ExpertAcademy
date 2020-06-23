package self_study_book1.array1;

//0,4,1,3,1,2,4,1을 오름차순으로 정렬.
//카운팅정렬
public class CountingSort {

	// 1. 가장큰 값을 찾자.
	public static void main(String[] args) {
		int[] arr = { 0, 4, 1, 3, 1, 2, 4, 1 };
		int max = 0;
		for (int e : arr) {
			if (max < e)
				max = e;
		}

		int[] count = new int[max + 1];

		// 요소를 카운팅하여 count에 넣기
		// arr의 요소가 count의 인덱스니깐.
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]] += 1;
		}

		// 누적값 구하기.
		for (int i = 1; i < count.length; i++) {
			count[i] += count[i - 1];
		}

		// arr과 같은 임시 배열을 만들고
		int[] temp = new int[arr.length];

		// arr배열의 마지막인덱스부터 탐색.
		// arr배열의 요소값이 count배열의 인덱스가 되고, 해당 인덱스의 (요소-1)이 temp의 인덱스가 되며, arr배열의 요소가 값으로
		// 들어옴.
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[count[arr[i]] - 1] = arr[i];
			count[arr[i]] = count[arr[i]] - 1;
		}

		for (int e : temp) {
			System.out.print(e + ", ");
		}
	}
}
