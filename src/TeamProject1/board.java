package TeamProject1;

import java.util.Scanner;


public class board {

	public static void main(String[] args) {
		
		String[][] boardArray = new String[100][5];
		String[] ReplaceArray = new String[100];
		String boardContent = "";
		String showBoard = ""; //create
		String boardNum = ""; // input ��ȣ
		String updatecontent = "";
		
		String input = "";
		
		int index = 1;
		int size = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("1. ��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5. ����(Delete) | 6. ���� ");
			System.out.println("----------------------------------------------------------------------------------");
			input = scanner.nextLine();
			String title = "";
			String content = "";
			String writer = "";
			
			if(input.equals("1")) {
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println("\t��ȣ\t����\t����\t�۾���\t��ȸ\t");
				System.out.println("-----------------------------------------------------------------------------");
				for(int i=index; i>0; i--) {
					if(ReplaceArray[i]!=null) {
					for(int j=0; j<5; j++) {
						
						boardContent += " \t " + boardArray[Integer.parseInt(ReplaceArray[i])][j]; 
						
					}
					System.out.println(boardContent);
					boardContent = "";
				  }
				}
				
			}else if(input.equals("2")) {
				System.out.print("���� : ");
				title = scanner.nextLine();
				System.out.print("���� : ");
				content = scanner.nextLine();
				System.out.print("�۾��� : ");
				writer = scanner.nextLine();
				
				for(int i=0; i<index; i++) {
					if(boardArray[i][0] == null) {
							boardArray[i][0]= String.valueOf(index);
							System.out.println("boardArray[" + i +"][0] : " + boardArray[i][0]);
							ReplaceArray[Integer.parseInt(boardArray[i][0])] = String.valueOf(i);
							System.out.println("Replace[" + boardArray[i][0] +"] = " + ReplaceArray[Integer.parseInt(boardArray[i][0])]);
							boardArray[i][1]= title;
							boardArray[i][2]= content;
							boardArray[i][3]= writer;
							boardArray[i][4]= String.valueOf(0);
							ReplaceArray[index] = String.valueOf(i);
							index++;
							break;
					}
				}
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println("\t��ȣ\t����\t����\t�۾���\t��ȸ\t");
				System.out.println("-----------------------------------------------------------------------------");
				for(int i=index; i>0; i--) {
					if(ReplaceArray[i]!=null) {
					for(int j=0; j<5; j++) {
						
						boardContent += " \t " + boardArray[Integer.parseInt(ReplaceArray[i])][j]; 
						
					}
					System.out.println(boardContent);
					boardContent = "";
				  }
				}
				
			}else if(input.equals("3")) {
				boardNum = "";
				System.out.print("��ȣ : ");
				boardNum = scanner.nextLine();
				System.out.println("����  : " + boardArray[Integer.parseInt(boardNum)-1][1]);
				System.out.println("����  : " + boardArray[Integer.parseInt(boardNum)-1][2]);
				System.out.println("�۾��� : " + boardArray[Integer.parseInt(boardNum)-1][3]);
				int count = Integer.parseInt(boardArray[Integer.parseInt(boardNum)-1][4]) + 1;
				boardArray[Integer.parseInt(boardNum)-1][4] = String.valueOf(count);
				System.out.println("��ȸ�� : " +boardArray[Integer.parseInt(boardNum)-1][4] );
				
			}else if(input.equals("4")) {
				int num = 0;
				System.out.print("��ȣ : ");
				boardNum = scanner.nextLine();
				for(int i=0; i<index; i++) {
					if(boardNum.equals(boardArray[i][0])) {
						num = i;
						System.out.println("��������  : " + boardArray[num][1]);
						System.out.print("��������  : ");
						updatecontent =scanner.nextLine();
						if(!updatecontent.equals("")) {
							boardArray[num][1] = updatecontent;
							updatecontent = "";
						}else {
							System.out.println();
						}
						System.out.println("��������  : " + boardArray[num][2]);
						System.out.print("��������  : ");
						updatecontent =scanner.nextLine();
						if(!updatecontent.equals("")) {
							boardArray[num][2] = updatecontent;
							updatecontent = "";
						}else {
							System.out.println();
						}
						
						System.out.println("-----------------------------------------------------------------------------");
						System.out.println("\t��ȣ\t����\t����\t�۾���\t��ȸ\t");
						System.out.println("-----------------------------------------------------------------------------");
						for(int l=index; l>0; l--) {
							if(ReplaceArray[l]!=null) {
							for(int j=0; j<5; j++) {
								
								boardContent += " \t " + boardArray[Integer.parseInt(ReplaceArray[l])][j]; 
								
							}
							System.out.println(boardContent);
							boardContent = "";
						  }
						}
						break;
					}
				}

			}else if(input.equals("5")) {
				System.out.print("��ȣ : ");
				boardNum = scanner.nextLine();
				int k = Integer.parseInt(boardNum);
				
					System.out.println("what : " + Integer.parseInt(boardArray[k-1][0]));
					ReplaceArray[Integer.parseInt(boardArray[k-1][0])] = null;
					boardArray[k-1][0] = null;
				
				
				System.out.println("-----------------------------------------------------------------------------");
				System.out.println("\t��ȣ\t����\t����\t�۾���\t��ȸ\t");
				System.out.println("-----------------------------------------------------------------------------");
				for(int i=index; i>0; i--) {
					if(ReplaceArray[i]!=null) {
					for(int j=0; j<5; j++) {
						
						boardContent += " \t " + boardArray[Integer.parseInt(ReplaceArray[i])][j]; 
						
					}
					System.out.println(boardContent);
					boardContent = "";
				  }
				}
			}else if(input.equals("6")) {
				for(int i=0; i<7; i++) {
					System.out.println("�Խ��� ��ȣ : " + boardArray[i][0]);
				}
				break;
			}
			
		}
	}

}
