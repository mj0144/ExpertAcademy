package self_study_book1.array1;

public class Union_BIt {
	public static void main(String[] args) {
		int i,j=0;
		int arr[] = {-7,-3,-2,5,8};
		int n = arr.length;
		int sum=0;
		
		boolean ret = false;
		
		for(i=1; i<(1<<(n)); i++) { //1<<n : 부분집합의 개수
			sum=0;
			for(j=0;j<n;j++) {	//원소의 수만큼 비트를 비교함
				if(i== (1<<j)) { //i의 j번째 비트가 1이면 j번째 원소 출력. //이건 좀....?
					sum += arr[j];
				}
			}
			if(sum==0) {
				ret=true;
				break;
			}
		}
		System.out.println(ret ? true : false);
	}
}
