package self_study_book1.array1;

import java.util.Scanner;

//일정금액을거슬러줄때,  
//10원 50원 100원 250원 500원이 있다고 가정하고 거스름돈의 개수를 최소한으로 하는 방법을 찾아보자.

public class ChangeMin {
//개수를 최소화 할려면, 금액이 큰 것이 우선적으로 거슬러져야함.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();

		//거스름돈 배열
		//인덱스 0번부터 10원의 갯수라 하자.
		int[] arr = {500,250,100,50,10};
		int[] count = new int[5];
		
		int i=0;
		
		while(money!=0) {
			if(money<0) {
				count[i]--;
				money +=arr[i++];				
			}else {
				count[i]++;
				money -= arr[i];
			}
		}
		for(i=0; i<5; i++) {
			System.out.println(arr[i] + ", " + count[i]);
			
		}
		
	}
}


