package kr.co.util;

import java.util.Scanner;

public class CollectionStack implements Collection {

	@Override
	public int[] add(int[] numbers) {
		Scanner sc = new Scanner(System.in);
		System.out.print("추가할 숫자 입력 : ");
		int addNum = sc.nextInt();
		int len = numbers.length;
		int[] copyNumbers = new int[len + 1];
		
		copyNumbers[0] = addNum;
		
		for(int i = 1; i < len + 1; i++) {
			copyNumbers[i] = numbers[i - 1];
		}
		
		return copyNumbers;
	}

	@Override
	public int[] remove(int[] numbers) {
		int len = numbers.length;
		int[] copyNumbers = new int[len - 1];
		
		for(int i = 1; i < len; i++) {
			copyNumbers[i - 1] = numbers[i];
		}
		
		return copyNumbers;
	}
	//스택
	
}
