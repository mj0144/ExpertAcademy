package self_study_book1.array1;

//절댓값 구하기
public class Absolute {
	public static void main(String[] args) {
		int arr[][] = {
					{9,20,2,18,11},
					{19,1,25,3,21},
					{8,24,10,1,7},
					{15,4,16,5,6},
					{12,13,22,23,14}
				};
		int dx[] = {0,0,-1,1};
		int dy[] = {-1,1,0,0};
		int sum=0;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				for(int k=0; k<4; k++) { //이건 xy변화량. 한 값에 주변 4곳을 순회.
					int x=i+dx[k]; //순회할 x값
					int y =j+dy[k]; //순회할 y값.
					if(!isRange(x, y)){
						sum += calAbs(arr[i][j],arr[x][y]); //절댓값 계산.arr[i][j] -> 가운데값. arr[testx][texty] -> 이웃값.
					}
				}
			}
		}
		System.out.println("sum ; " + sum);
	}
	
	//절댓값 계산 메서드
	private static int calAbs(int a, int b) {
		return (a-b)>0? (a-b) : -(a-b);

	}
	//x,y범위제한 메서드
	public static boolean isRange(int x, int y) {
		if(x<0 || x>=5) return true;
		if(y<0 || y>=5) return true;
		return false;
		
	}
	
}
