package test.silsub1;

import java.util.Scanner;

import silsub1.MyNote;

public class TestMyNote {
	private static Scanner sc = new Scanner(System.in);
	
	public TestMyNote() {}
	
	public static void menu() {
		MyNote m = new MyNote();
		int number = 0;
		
		do {
			System.out.println("******  MyNote  ******");
			System.out.println("1. 노트 새로 만들기"
								+ "\n2. 노트 열기"
								+ "\n3. 노트 열어서 수정하기"
								+ "\n4. 끝내기");
			System.out.print("메뉴 번호 선택 : ");
			number = sc.nextInt();
			
			switch(number) {
			case 1 : m.fileSave(); break;
			case 2 : m.fileOpen(); break;
			case 3 : m.fileEdit(); break;
			case 4 : System.out.println("프로그램을 종료합니다.");
					return;
				default : System.out.println("번호를 다시 입력하세요.");
			}
			
			
		} while(true);
	}

	public static void main(String[] args) {
		// MyNote Test
		menu();

	}

}
