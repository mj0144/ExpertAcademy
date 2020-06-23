package self_study_book1.array1;

import java.util.Scanner;

//트리플(같은 수가 3개)이 2개거나
//run(연속되는 3개의수)이 2개이거나
//트리플+run이면 Baby-Gin

//sort를 해서앞3자리, 뒷3자리로 잘라서 트리플인지 run인지 판별해보자




public class Baby_Gin_Game {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[6];
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		
		
		//sort
		int temp=0;
		for(int i=0; i<array.length-1; i++) {
			for(int j=i+1; j<array.length; j++) {
				if(array[i]>array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		

		
		int triple = 0;
		int run = 0;
		int count =1;
	
		if(array[0] == array[2]) {
			if(array[0]==array[1])
				triple++;
		}else{
			if((array[0]+2 == array[2]) && (array[0]+1==array[1])) {
				run++;
			}			
		}
		
		if(array[3] == array[5]) {
			if(array[3]==array[4])
				triple++;
		}else{
			if((array[3]+2 == array[5]) && (array[3]+1==array[4])) {
				run++;
			}			
		}
		
		
		
		
		
		
		
//		for(int i=1; i<3; i++) {			
//			if(array[0]== array[i]) {
//				if(triple==1) {
//					triple+=0;
//				}else {
//					triple++;
//				}
//			}else {
//				//triple=false;
//				triple-=1;
//				if(array[0]+count == array[i]) {
//					if(run==1) {
//						run--;
//					}else {
//						run++;
//					}
//				}else {
//					//run =false;
//					run-=1;
//				}
//			
//			}
//			count++;
//		}
//		
//		
//		
//		
//		count=0;
//		for(int i=4; i<6; i++) {
//			if(array[3]== array[i]) {
//				if(triple==2) {
//					triple+=0;
//				}else {
//					triple++;
//				}
//			}else {
//				//triple=false;
//				triple-=1;
//				if(array[3]+count == array[i]) {
//					if(run==2) {
//						run--;
//					}else {
//						run++;
//					}
//					
//				}else {
//					run-=1;
//					//run =false;
//				}
//			
//			}
//			count++;
//		}
		

		
		if((run==2 | triple==2) | (run==1 && triple==1)) {
			System.out.println("Baby_gin!!!");
		}else{
			System.out.println("nothing");
		}

		
		
		
		
		
		
	}

}
