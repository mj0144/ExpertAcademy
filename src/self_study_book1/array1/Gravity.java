package self_study_book1.array1;

import java.util.Scanner;

public class Gravity {

	public static int[][] array;
	
	public static void main(String[] args) {
		array = new int[8][9];
		int count=0;
		int[] counting = new int[8];
		Scanner sc = new Scanner(System.in);
		
		
		//값 넣기.
		//막대이면 1, 빈공간이면 0
		for(int i=0;i<8;i++) {
			for(int j=0; j<9; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		

		//0의 갯수에 따라서 낙차갯수가 정해짐.
		for(int i=0;i<8;i++) {
			if(array[i][0] == 1) {
				for(int j=1;j<9;j++) {
					if(array[i][j]==0) {
						counting[i] = ++count;
					}
				}
			}
			count =0;
		}
		
		
		int max = 0;
		for(int e : counting) {
			if(e>max) {
				max =e;
			}
		}
		
	System.out.println("가장 낙차수가큰 값 : " + max);
		
		
		
		
		
		
		
	}
}
