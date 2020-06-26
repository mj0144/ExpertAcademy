package self_study_book1.array1;

public class Snail {
	public static void main(String[] args) {
		int arr[][] = { { 9, 20, 2, 18, 11 }, { 19, 1, 25, 3, 21 }, { 8, 24, 10, 1, 7 }, { 15, 4, 16, 5, 6 },
				{ 12, 13, 22, 23, 14 } };

		// 2차원 배열 정렬
		// 기준값만 달팽이로 순회
		// 최솟값을 찾을 때는 달팽이 필요없.
		int i, j = 0;

		for (i = 0; i < arr.length; i++) {
			int minIndX = i; // 기준값.
			int minIndY = j;
			
			for (j = i; j < arr.length; j++) {

				if (arr[minIndX][minIndY] > arr[i][j]) {

				}
			}

		}

	}
}
