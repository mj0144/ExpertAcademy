package self_study_book1.array1;

import java.util.Scanner;

public class Gravity {

	public static int[][] array;
	
	public static void main(String[] args) {
		array = new int[8][9];
		int count=0;
		int[] counting = new int[8];
		Scanner sc = new Scanner(System.in);
		
		
		//�� �ֱ�.
		//�����̸� 1, ������̸� 0
		for(int i=0;i<8;i++) {
			for(int j=0; j<9; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		

		//0�� ������ ���� ���������� ������.
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
		
	System.out.println("���� ��������ū �� : " + max);
		
		
		
		
		
		
		
	}
}
