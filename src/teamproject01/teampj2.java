package teamproject01;

import java.util.Scanner;

public class teampj2 {
	public static void main(String[] args) {

        boolean run = true; //�Ʒ� while���� �����ǵ� ��� �ݺ���Ű�� ���� �ʱⰪ�� true�� ����־���.
        int num = 0;//�Խñ� ��ȣ, 0���� ����.
        String[][] boardArray = new String[100][5]; //�������� �־��ֽ� �Խ��� �迭
        /*         
         {
			{��1��, ������1��, ������1��, ���۾���1��, ��0��},
			{��2, ������2, ������2, ���۾���2, ��2},
			{��3, ������3, ������3, ���۾���3, ��0��},
			��
		}

         */
        String title; //���� �Է¹��� ����
        String content; //���� �Է¹��� ����
        String name; //�۾��� �Է¹��� ����
        int viewCnt = 0; //��ȸ�� �ʱⰪ�� �����ϰ� �ڵ������ϰ� �����
        Scanner scan = new Scanner(System.in); //���ڿ� �ޱ� ���ؼ�
        //Scanner�� java.util ��Ű���� ����. ����ϱ� ���ؼ��� import�� ���� �ܺ�Ŭ������ ȣ��

        while (run) { //���� �ݺ���Ű�� ���� while(booleanŸ��) ���
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("|1. ��� | 2. ����(Create) | 3. �б�(Read) | 4. ����(Update) | 5.����(Delete) | 6.����");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.print("�޴� ����> ");
            //�׻� �ҷ����� ���ù�
            
            
            int selectNo = Integer.parseInt(scan.nextLine()); 
            //switch���� ����� ������ ������ ������ �� �ȿ� �Է¹��� ���� ���������� ��ȯ�� �����Ѵ�
            
            switch (selectNo) { //��ȣ�� �����Ͽ� �� ��ȣ�� �����ϰ� switch�� ���
                case 1://���_1���� ������ ����� �ڵ��
                	//��ȣ           ����                    ����                    �۾���      ��ȸ��
                	System.out.println("1. ���");
                	System.out.println("-------------------------------------------------------------------");
                    System.out.println("|1. ��ȣ \t | 2. ���� \t | 3. ���� \t | 4. �۾��� \t | 5. ��ȸ��  ");
                    System.out.println("-------------------------------------------------------------------");
                    //��� ������ ���� ��½��� �޶�� �䱸
                    
              
                    String[][] tempArr = new String[100][5]; //�迭 �������� ������ ���� �ӽ� �迭

                    for (int i=num-1; i>=0; i--){//���� �Խñ� �迭�� �˻��ϸ鼭 �Խñ� ��ȣ�� �°� �ӽ� �迭�� ���� 
                        if(boardArray[i][0] != null){
                            int chkNum = Integer.parseInt(boardArray[i][0]);//���� �Խñ��� �������ִ� �۹�ȣ
                            tempArr[chkNum] = boardArray[i];
                        }
                    }

                    for (int i=num-1; i>=0; i--){//���ĵ� �迭 ���
                        if(tempArr[i][0] != null){
                            System.out.print("no."+(Integer.parseInt(tempArr[i][0])+1)+"\t" +" ����  : "+ tempArr[i][1]+"\t"+" ����  : "+
                                    tempArr[i][2]+"\t"+"  �۾��� : "+ tempArr[i][3]+"\t"+"  ��ȸ�� : "+tempArr[i][4]);
                            System.out.println("");
                        }
                    }


                    
                    break; //switch���� ����. ������ �ۿ� while���� true�� ���̶� �ٽ� ���ù� ���
                    
                case 2://����
                    System.out.println("2. ����(Create)");

                    System.out.print("���� >");
                    title = scan.nextLine(); //�Է¹��� ���� title�̶�� ������ �־��

                    System.out.print("���� >");
                    content = scan.nextLine(); //�Է¹��� ���� content��� ������ �־��

                    System.out.print("�̸� >");
                    name = scan.nextLine(); //�Է¹��� ���� name�̶�� ������ �־��

                    String[] temp = new String[5]; //�Է¹��� ���� �ϳ��� ���� ���� ���ο� StringŸ���� ���� temp�� ����
                    //�ȿ��� �� 5���� ī�װ��� ���� [5]���
                    //Ÿ�� �迭�̸�[�迭����];
                    
                    temp[0] = Integer.toString(num); //�� �ν��Ͻ��� ���� ���� �ش��ϴ� ���ڿ� ǥ������ ��ȯ, �׸��� temp[0]�� ����
                    temp[1] = title; //title�̶�� ������ ������ ���� temp[1]�� �����ض�
                    temp[2] = content; //title�̶�� ������ ������ ���� temp[2]�� �����ض�
                    temp[3] = name; //title�̶�� ������ ������ ���� temp[3]�� �����ض�
                    temp[4] = Integer.toString(viewCnt); //�� �ν��Ͻ��� ���� ���� �ش��ϴ� ���ڿ� ǥ������ ��ȯ, �׸��� temp[4]�� ����
                    
                    int addNum = 0;//���� ����ִ� �迭���� ���� ������ üũ

                    for(int i=0; i<boardArray.length; i++) {//����� �迭 ���� ����ִ� �� �˻�
                        if(boardArray[i][0] == null) {
                            addNum = i;
                            break;
                        }
                    }
                    
                    boardArray[addNum] = temp;//����ִ� ���� �����濡 �Խñ� �߰� 

         
                    num++; //��������� (num+1)���� num�� ����, num=(num+1)

            
                 	System.out.println("1. ���");
                	System.out.println("-------------------------------------------------------------------");
                    System.out.println("|1. ��ȣ \t | 2. ���� \t | 3. ���� \t | 4. �۾��� \t | 5. ��ȸ��  ");
                    System.out.println("-------------------------------------------------------------------");
                    
                    tempArr = new String[100][5]; //�迭 �������� ������ ���� �ӽ� �迭
                    for (int i=num-1; i>=0; i--){//���� �Խñ� �迭�� �˻��ϸ鼭 �Խñ� ��ȣ�� �°� �ӽ� �迭�� ���� 
                        if(boardArray[i][0] != null){
                            int chkNum = Integer.parseInt(boardArray[i][0]);//���� �Խñ��� �������ִ� �۹�ȣ
                            tempArr[chkNum] = boardArray[i];
                        }
                    }

                    for (int i=num-1; i>=0; i--){//���ĵ� �迭 ���
                        if(tempArr[i][0] != null){
                            System.out.print("no."+(Integer.parseInt(tempArr[i][0])+1)+"\t" +" ����  : "+ tempArr[i][1]+"\t"+" ����  : "+
                                    tempArr[i][2]+"\t"+"  �۾��� : "+ tempArr[i][3]+"\t"+"  ��ȸ�� : "+tempArr[i][4]);
                            System.out.println("");
                        }
                    }
                    
                    System.out.println("1. ��� (������)");
                	System.out.println("-------------------------------------------------------------------");
                    System.out.println("|1. ��ȣ \t | 2. ���� \t | 3. ���� \t | 4. �۾��� \t | 5. ��ȸ��  ");
                    System.out.println("-------------------------------------------------------------------");
                    for (int i=num-1; i>=0; i--){ //boardArray[��][��]
                        //���� ������ŭ ����ϵ��� (num-1 ~ 0) = �츮�� 0���� ��ȣ�� ���۵Ǵϱ�. ���� ������������ ����ϱ� ����
                        	
                        	if(boardArray[i][0] != null) {                    		
                            System.out.print("no."+(Integer.parseInt(boardArray[i][0])+1)+"\t" +" ����  : "+ boardArray[i][1]+"\t"+" ����  : "+
                                        boardArray[i][2]+"\t"+"  �۾��� : "+ boardArray[i][3]+"\t"+"  ��ȸ�� : "+boardArray[i][4]);
                            System.out.println("");
                        	}
                       
                        }
                 	
                    break;

                case 3: //�б�(Read)
                    System.out.println("3. �б�(Read)");
                    System.out.print("ã�� ��ȣ >");
                    //�Խñ� �б� �� ��ȸ�� ����
                    
                    int findNum = Integer.parseInt(scan.nextLine()); //ã�ƾ��� ��ȣ�� ���� findNum���� ����� �Է¹��� �� ���������� �޾� ����
                    
                  //�Խñ� �б� �� ��ȸ�� ����
                    viewCnt = Integer.parseInt(boardArray[findNum-1][4]); //boardArray[ã�¹�ȣ][4 = ��ȸ����] ->���ڿ����̿��� int�� ��ȯ
                    viewCnt ++; //�װ��� ++���ֱ�
                    boardArray[findNum-1][4] = Integer.toString(viewCnt); //�ٽ� string������ ��ȯ�ؼ� �־��ֱ�
                    
                    for (int i=num-1; i>=0; i--){ //boardArray[��][��]
                        //���� ������ŭ ����ϵ��� (num-1 ~ 0) = �츮�� 0���� ��ȣ�� ���۵Ǵϱ�. ���� ������������ ����ϱ� ����
                        	if(boardArray[i][0] != null) {                    		
                            System.out.print("no."+(Integer.parseInt(boardArray[i][0])+1)+"\t" +" ����  : "+ boardArray[i][1]+"\t"+" ����  : "+
                                        boardArray[i][2]+"\t"+"  �۾��� : "+ boardArray[i][3]+"\t"+"  ��ȸ�� : "+boardArray[i][4]);
                            System.out.println("");
                        	}
                       
                        }

                    //��ȣ = ���� ��ȣ ���״� �ٷ� ��� boardArray[findNum][i] i�� ���Ǹ� ���� ����
                     
                    break;
                    
                case 4: // ����(Update)
                    System.out.println("����(Update)");
                    System.out.print("���� �� ��ȣ >");
                    
                    int findNum1 = Integer.parseInt(scan.nextLine());
                    
                    System.out.print("������ ����: ");
                    System.out.println(boardArray[findNum1-1][1]);
                    System.out.print("������ ���� >");
                    title = scan.nextLine();
                    
                    System.out.print("������ ����: ");
                    System.out.println(boardArray[findNum1-1][2]);
                    System.out.print("���� >");
                    content = scan.nextLine();

                    String[] newtemp = new String[5];
                    
                    newtemp[0] = Integer.toString(findNum1);
                    if(!title.equals("")) {
                    	newtemp[1] = title;
                    	System.out.println(newtemp[1]);
                    	boardArray[findNum1-1][1] = newtemp[1];
                    	}
                    if(!content.equals("")) {
	                    newtemp[2] = content;
	                    boardArray[findNum1-1][2] = newtemp[2];
	                    }
                   
                    newtemp[4] = Integer.toString(viewCnt);           
                    
                    for (int i=num-1; i>=0; i--){ //boardArray[��][��]
                        //���� ������ŭ ����ϵ��� (num-1 ~ 0) = �츮�� 0���� ��ȣ�� ���۵Ǵϱ�. ���� ������������ ����ϱ� ����
                        	if(boardArray[i][0] != null) {                    		
                            System.out.print("no."+(Integer.parseInt(boardArray[i][0])+1)+"\t" +" ����  : "+ boardArray[i][1]+"\t"+" ����  : "+
                                        boardArray[i][2]+"\t"+"  �۾��� : "+ boardArray[i][3]+"\t"+"  ��ȸ�� : "+boardArray[i][4]);
                            System.out.println("");
                        	}
                       
                        }
                    break;
                    
                case 5: // ����
                    System.out.println("����(Delete)");
                    System.out.print("���� �� ��ȣ >");
                    
                    int delNum = Integer.parseInt(scan.nextLine());
                    String[] deltemp = new String[5]; //���� �迭�� �����ϸ� �������̶� �ʱⰪ�� null
                    boardArray[delNum-1] = deltemp; 
                    
                    for (int i=num-1; i>=0; i--){ //boardArray[��][��]
                        //���� ������ŭ ����ϵ��� (num-1 ~ 0) = �츮�� 0���� ��ȣ�� ���۵Ǵϱ�. ���� ������������ ����ϱ� ����
                        	if(boardArray[i][0] != null) {                    		
                            System.out.print("no."+(Integer.parseInt(boardArray[i][0])+1)+"\t" +" ����  : "+ boardArray[i][1]+"\t"+" ����  : "+
                                        boardArray[i][2]+"\t"+"  �۾��� : "+ boardArray[i][3]+"\t"+"  ��ȸ�� : "+boardArray[i][4]);
                            System.out.println("");
                        	}
                       
                        }
                    
                    break;
                    
                case 6: // ����(Delete)
                    System.out.println("���α׷� ����");
                    run = false;
                    break;
            }
        }

	}
}