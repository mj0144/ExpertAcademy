package self_study_book1.array1;

public class Snail {
	
	static int arr[][] = { { 9, 20, 2, 18, 11 }, { 19, 1, 25, 3, 21 }, { 8, 24, 10, 1, 7 }, { 15, 4, 16, 5, 6 },
			{ 12, 13, 22, 23, 14 } };
	static int sorted_arr[][] = new int[5][5]; // 정렬되는 arr을 담을 배열. 굳이 swap할 필요없이 최솟값 찾아서 여기 순서대로 담기위해.

	public static void main(String[] args) {
		

		/*
		 * 2차원 배열 정렬 기준값만 달팽이로 순회 최솟값을 찾을 때는 달팽이 필요없음.
		 */

		int x =0; //조건에 맞는 가공된 인덱스. (값이 들어가 실제 인덱스)
		int y=0; 
		int newX=0; //가공되기전의 인덱스.
		int newY=0;
		int dx[] = { 0, 1, 0, -1 }; // x값 방향 처리
		int dy[] = { 1, 0, -1, 0 }; // y값 방향 처리
		int min = 0;
		int indx = 0; //방향처리 인덱스.
		
		
		for (int i = 0; i < 25; i++) {
			// 1. 최솟값 구하기 -> 달팽이 필요없음!			
			min = arrMin();
			
			x=newX;
			y=newY;
			//System.out.println("x, y : " + x + y);
			sorted_arr[x][y] = min;
			
			
			newX = x + dx[indx]; //방향 이동
			newY = y + dy[indx]; //방향 이동.
			//System.out.println("newX, newy : " + newX+ newY);
			
			//경계선
			if(newX<0 | newY<0 | newX>4 || newY>4 || sorted_arr[newX][newY]!=0) { //newX,newY가 마이너스 값일때 뒤에 배열 조건까지가면 안됨.
				indx = (indx+1)%4; //indx의 인덱스는 3이 넘어가서는 안됨.
				newX = x + dx[indx];
				newY = y + dy[indx];				
			}			
		}
		

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(sorted_arr[i][j] + ", ");
			}
			System.out.println();
		}
			

	}

	// 최솟값 구할 메서드
	public static int arrMin() {

		int min = arr[0][0];
		int minX = 0;
		int minY =0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
					minX = i;
					minY = j;
				}
			}
		}

		arr[minX][minY] = 99; //최솟값을 찾기위해 arr배열 변경. (같은 최솟값이 계속 나오면 안되니깐.)
		return min;

	}

}
