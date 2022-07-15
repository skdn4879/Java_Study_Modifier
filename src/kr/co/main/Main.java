package kr.co.main;

import java.util.Scanner;

import kr.co.util.CollectionQueue;
import kr.co.util.CollectionSet;
import kr.co.util.CollectionStack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isContinue = true;
		
		//1. kr.co.util.CollectionStack클래스 생성
		//add - 새로운 숫자 추가(무조건 0번 인덱스에 추가), 입력받은 숫자를 추가
		//remove - 0번 인덱스 삭제
		
		CollectionStack stack = new CollectionStack();
		
		//2. kr.co.util.CollectionQueue클래스 생성
		//add - 새로운 숫자 추가(무조건 0번 인덱스에 추가), 입력받은 숫자를 추가
		//remove - 마지막 인덱스 삭제
		
		CollectionQueue queue = new CollectionQueue();
		
		//3. kr.co.util.CollectionSet클래스 생성
		//add - 새로운 숫자 추가(무조건 마지막에 추가), 입력받은 숫자를 추가, 단 중복되지 않는 숫자만 추가
		//remove - 삭제할 숫자를 입력받아서 일치하는 숫자를 삭제
		
		CollectionSet set = new CollectionSet();
		
		int[] numbers = init();
		
		while(isContinue) {
			System.out.print("1.스택  2.큐  3.집합  4.배열보기  5.종료 : ");
			int selectTool = sc.nextInt();
			int select = 0;
			
			if(selectTool == 1) {
				
				select = selection();
				
				if(select == 1) {
					numbers = stack.add(numbers);
				} else if(select == 2) {
					numbers = stack.remove(numbers);
				} else {
					System.out.println("잘못된 입력");
				}
				
			} else if(selectTool == 2) {
				
				select = selection();
				
				if(select == 1) {
					numbers = queue.add(numbers);
				} else if(select == 2) {
					numbers = queue.remove(numbers);
				} else {
					System.out.println("잘못된 입력");
				}
				
			} else if(selectTool == 3) {
				
				select = selection();
				
				if(select == 1) {
					numbers = set.add(numbers);
				} else if(select == 2) {
					numbers = set.remove(numbers);
				} else {
					System.out.println("잘못된 입력");
				}
				
			} else if(selectTool == 4) {
				for(int number : numbers) {
					System.out.println(number);
				}
			} else if(selectTool == 5) {
				isContinue = !isContinue;
				System.out.println("프로그램 종료");
			} else {
				System.out.println("잘못된 입력");
			}
		}
		
	}
	
	public static int[] init() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 입력 : ");
		int len = sc.nextInt();
		int[] numbers = new int[len];
		
		for(int i = 0; i < len; i++) {
			System.out.print(i + "번째 숫자 입력 : ");
			numbers[i] = sc.nextInt();
		}
		
		return numbers;
	}
	
	public static int selection() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1.추가  2.삭제 : ");
		int select = sc.nextInt();
		
		return select;
	}

}
