package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;

		int balance = 0;
		int select = 0;

		Scanner scan = new Scanner(System.in);

		while(run){
			System.out.println("---------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("---------------------");
			System.out.print("����> ");

			select = scan.nextInt();

			if(select == 1){	
				System.out.println("���ݾ�> ");
				balance += scan.nextInt();
			}else if(select == 2){
				System.out.println("��ݾ�> ");
				balance -= scan.nextInt();
			}else if(select == 3){
				System.out.println("�ܰ�> " + balance);
			}else{
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}

}
