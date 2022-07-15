package kr.co.util;

import java.util.Scanner;

public class CollectionSet implements Collection {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public int[] add(int[] numbers) {
		System.out.print("추가할 숫자 입력 : ");
		int addNum = sc.nextInt();
		int len = numbers.length;
		int[] copyNumbers = new int[len + 1];
		boolean isNotSameValue = true;
		
		for(int i = 0; i < len; i++) {
			copyNumbers[i] = numbers[i];
		}
		
		for(int number : numbers) {
			if(number == addNum) {
				isNotSameValue = !isNotSameValue;
				break;
			}
		}
		
		if(isNotSameValue) {
			copyNumbers[len] = addNum;
			return copyNumbers;
		} else {
			System.out.println("중복되는 숫자가 있습니다.");
			return numbers;
		}
		
	}

	@Override
	public int[] remove(int[] numbers) {
		System.out.print("삭제할 숫자 입력 : ");
		int removeNum = sc.nextInt();
		int len = numbers.length;
		int[] copyNumbers = new int[len - 1];
		boolean isSameValue = false;
		int targetIndex = 0;
		
		for(int i = 0; i < len; i++) {
			if(numbers[i] == removeNum) {
				isSameValue = !isSameValue;
				targetIndex = i;
				break;
			}
		}
		
		if(isSameValue) {
			for(int i = 0; i < targetIndex; i++) {
				copyNumbers[i] = numbers[i];
			}
			for(int i = targetIndex + 1; i < len; i++) {
				copyNumbers[i - 1] = numbers[i];
			}
			
			return copyNumbers;
		} else {
			System.out.println("일치하는 숫자가 없습니다.");
			return numbers;
		}
		
	}
	//집합
}
