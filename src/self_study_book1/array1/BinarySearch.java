package self_study_book1.array1;

//이진탐색
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = { 4, 6, 7, 8, 9, 11, 12 };
		int searchNum = 11;

		int startIdx = arr.length / 2;

//		while (startIdx > 0) {
//			if (searchNum < arr[startIdx]) {
//				startIdx = startIdx / 2; // 기준값보다 작은 영역
//			} else if(searchNum>arr[startIdx]) {
//				startIdx = startIdx + (startIdx / 2); // 기준값보다 큰 영역
//			}else if(searchNum == arr[startIdx]) {
//				System.out.println("인덱스 : :" + startIdx);
//				break;
//			}
//		}
		while (startIdx > 0) {
			if (searchNum < arr[startIdx]) {
				
			} else if(searchNum>arr[startIdx]) {
				startIdx = startIdx + (startIdx / 2); // 기준값보다 큰 영역
			}else if(searchNum == arr[startIdx]) {
				System.out.println("인덱스 : :" + startIdx);
				break;
			}
		}
		System.out.println("찾는값 없음.");
		
		
		

	}
}
