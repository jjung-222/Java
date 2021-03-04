package teamproject01;

import java.util.Scanner;

public class teampj2 {
	public static void main(String[] args) {

        boolean run = true; //아래 while문을 돌릴건데 계속 반복시키기 위해 초기값을 true로 잡아주었음.
        int num = 0;//게시글 번호, 0부터 시작.
        String[][] boardArray = new String[100][5]; //교수님이 주어주신 게시판 배열
        /*         
         {
			{“1”, “제목1”, “내용1”, “글쓴이1”, “0”},
			{“2, “제목2, “내용2, “글쓴이2, “2},
			{“3, “제목3, “내용3, “글쓴이3, “0”},
			…
		}

         */
        String title; //제목 입력받을 변수
        String content; //내용 입력받을 변수
        String name; //글쓴이 입력받을 변수
        int viewCnt = 0; //조회수 초기값만 설정하고 자동증가하게 만들기
        Scanner scan = new Scanner(System.in); //문자열 받기 위해서
        //Scanner는 java.util 패키지에 포함. 사용하기 위해서는 import를 통해 외부클래스를 호출

        while (run) { //무한 반복시키기 위해 while(boolean타입) 사용
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println("|1. 목록 | 2. 생성(Create) | 3. 읽기(Read) | 4. 수정(Update) | 5.삭제(Delete) | 6.종료");
            System.out.println("----------------------------------------------------------------------------------");
            System.out.print("메뉴 선택> ");
            //항상 불러오는 선택바
            
            
            int selectNo = Integer.parseInt(scan.nextLine()); 
            //switch문에 사용할 정수형 변수를 선언해 그 안에 입력받은 값을 정수형으로 변환해 저장한다
            
            switch (selectNo) { //번호를 선택하여 그 번호를 실행하게 switch문 사용
                case 1://목록_1번을 누르면 실행될 코드들
                	//번호           제목                    내용                    글쓴이      조회수
                	System.out.println("1. 목록");
                	System.out.println("-------------------------------------------------------------------");
                    System.out.println("|1. 번호 \t | 2. 제목 \t | 3. 내용 \t | 4. 글쓴이 \t | 5. 조회수  ");
                    System.out.println("-------------------------------------------------------------------");
                    //목록 형식을 위에 출력시켜 달라고 요구
                    
              
                    String[][] tempArr = new String[100][5]; //배열 내림차순 정렬을 위한 임시 배열

                    for (int i=num-1; i>=0; i--){//원래 게시글 배열을 검사하면서 게시글 번호에 맞게 임시 배열에 정리 
                        if(boardArray[i][0] != null){
                            int chkNum = Integer.parseInt(boardArray[i][0]);//현재 게시글이 가지고있는 글번호
                            tempArr[chkNum] = boardArray[i];
                        }
                    }

                    for (int i=num-1; i>=0; i--){//정렬된 배열 출력
                        if(tempArr[i][0] != null){
                            System.out.print("no."+(Integer.parseInt(tempArr[i][0])+1)+"\t" +" 제목  : "+ tempArr[i][1]+"\t"+" 내용  : "+
                                    tempArr[i][2]+"\t"+"  글쓴이 : "+ tempArr[i][3]+"\t"+"  조회수 : "+tempArr[i][4]);
                            System.out.println("");
                        }
                    }


                    
                    break; //switch문을 나감. 하지만 밖에 while문이 true로 참이라 다시 선택바 출력
                    
                case 2://생성
                    System.out.println("2. 생성(Create)");

                    System.out.print("제목 >");
                    title = scan.nextLine(); //입력받은 값을 title이라는 변수에 넣어라

                    System.out.print("내용 >");
                    content = scan.nextLine(); //입력받은 값을 content라는 변수에 넣어라

                    System.out.print("이름 >");
                    name = scan.nextLine(); //입력받은 값을 name이라는 변수에 넣어라

                    String[] temp = new String[5]; //입력받은 값을 하나로 묶기 위해 새로운 String타입의 변수 temp를 선언
                    //안에는 총 5개의 카테고리가 들어가니 [5]사용
                    //타입 배열이름[배열길이];
                    
                    temp[0] = Integer.toString(num); //이 인스턴스의 숫자 값을 해당하는 문자열 표현으로 변환, 그리고 temp[0]에 저장
                    temp[1] = title; //title이라는 변수에 저장한 값을 temp[1]에 저장해라
                    temp[2] = content; //title이라는 변수에 저장한 값을 temp[2]에 저장해라
                    temp[3] = name; //title이라는 변수에 저장한 값을 temp[3]에 저장해라
                    temp[4] = Integer.toString(viewCnt); //이 인스턴스의 숫자 값을 해당하는 문자열 표현으로 변환, 그리고 temp[4]에 저장
                    
                    int addNum = 0;//현재 비어있는 배열값중 가장 작은값 체크

                    for(int i=0; i<boardArray.length; i++) {//저장된 배열 값중 비어있는 방 검사
                        if(boardArray[i][0] == null) {
                            addNum = i;
                            break;
                        }
                    }
                    
                    boardArray[addNum] = temp;//비어있는 가장 작은방에 게시글 추가 

         
                    num++; //다음실행시 (num+1)값을 num에 저장, num=(num+1)

            
                 	System.out.println("1. 목록");
                	System.out.println("-------------------------------------------------------------------");
                    System.out.println("|1. 번호 \t | 2. 제목 \t | 3. 내용 \t | 4. 글쓴이 \t | 5. 조회수  ");
                    System.out.println("-------------------------------------------------------------------");
                    
                    tempArr = new String[100][5]; //배열 내림차순 정렬을 위한 임시 배열
                    for (int i=num-1; i>=0; i--){//원래 게시글 배열을 검사하면서 게시글 번호에 맞게 임시 배열에 정리 
                        if(boardArray[i][0] != null){
                            int chkNum = Integer.parseInt(boardArray[i][0]);//현재 게시글이 가지고있는 글번호
                            tempArr[chkNum] = boardArray[i];
                        }
                    }

                    for (int i=num-1; i>=0; i--){//정렬된 배열 출력
                        if(tempArr[i][0] != null){
                            System.out.print("no."+(Integer.parseInt(tempArr[i][0])+1)+"\t" +" 제목  : "+ tempArr[i][1]+"\t"+" 내용  : "+
                                    tempArr[i][2]+"\t"+"  글쓴이 : "+ tempArr[i][3]+"\t"+"  조회수 : "+tempArr[i][4]);
                            System.out.println("");
                        }
                    }
                    
                    System.out.println("1. 목록 (정렬전)");
                	System.out.println("-------------------------------------------------------------------");
                    System.out.println("|1. 번호 \t | 2. 제목 \t | 3. 내용 \t | 4. 글쓴이 \t | 5. 조회수  ");
                    System.out.println("-------------------------------------------------------------------");
                    for (int i=num-1; i>=0; i--){ //boardArray[행][열]
                        //행의 개수만큼 출력하도록 (num-1 ~ 0) = 우리는 0부터 번호가 시작되니까. 또한 내림차순으로 출력하기 위해
                        	
                        	if(boardArray[i][0] != null) {                    		
                            System.out.print("no."+(Integer.parseInt(boardArray[i][0])+1)+"\t" +" 제목  : "+ boardArray[i][1]+"\t"+" 내용  : "+
                                        boardArray[i][2]+"\t"+"  글쓴이 : "+ boardArray[i][3]+"\t"+"  조회수 : "+boardArray[i][4]);
                            System.out.println("");
                        	}
                       
                        }
                 	
                    break;

                case 3: //읽기(Read)
                    System.out.println("3. 읽기(Read)");
                    System.out.print("찾을 번호 >");
                    //게시글 읽기 후 조회수 증가
                    
                    int findNum = Integer.parseInt(scan.nextLine()); //찾아야할 번호을 변수 findNum으로 만들고 입력받은 값 정수형으로 받아 저장
                    
                  //게시글 읽기 후 조회수 증가
                    viewCnt = Integer.parseInt(boardArray[findNum-1][4]); //boardArray[찾는번호][4 = 조회수값] ->문자열값이여서 int로 변환
                    viewCnt ++; //그값에 ++해주기
                    boardArray[findNum-1][4] = Integer.toString(viewCnt); //다시 string값으로 변환해서 넣어주기
                    
                    for (int i=num-1; i>=0; i--){ //boardArray[행][열]
                        //행의 개수만큼 출력하도록 (num-1 ~ 0) = 우리는 0부터 번호가 시작되니까. 또한 내림차순으로 출력하기 위해
                        	if(boardArray[i][0] != null) {                    		
                            System.out.print("no."+(Integer.parseInt(boardArray[i][0])+1)+"\t" +" 제목  : "+ boardArray[i][1]+"\t"+" 내용  : "+
                                        boardArray[i][2]+"\t"+"  글쓴이 : "+ boardArray[i][3]+"\t"+"  조회수 : "+boardArray[i][4]);
                            System.out.println("");
                        	}
                       
                        }

                    //번호 = 행의 번호 일테니 바로 출력 boardArray[findNum][i] i는 편의를 위해 지정
                     
                    break;
                    
                case 4: // 수정(Update)
                    System.out.println("수정(Update)");
                    System.out.print("수정 할 번호 >");
                    
                    int findNum1 = Integer.parseInt(scan.nextLine());
                    
                    System.out.print("수정전 제목: ");
                    System.out.println(boardArray[findNum1-1][1]);
                    System.out.print("수정할 제목 >");
                    title = scan.nextLine();
                    
                    System.out.print("수정전 내용: ");
                    System.out.println(boardArray[findNum1-1][2]);
                    System.out.print("내용 >");
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
                    
                    for (int i=num-1; i>=0; i--){ //boardArray[행][열]
                        //행의 개수만큼 출력하도록 (num-1 ~ 0) = 우리는 0부터 번호가 시작되니까. 또한 내림차순으로 출력하기 위해
                        	if(boardArray[i][0] != null) {                    		
                            System.out.print("no."+(Integer.parseInt(boardArray[i][0])+1)+"\t" +" 제목  : "+ boardArray[i][1]+"\t"+" 내용  : "+
                                        boardArray[i][2]+"\t"+"  글쓴이 : "+ boardArray[i][3]+"\t"+"  조회수 : "+boardArray[i][4]);
                            System.out.println("");
                        	}
                       
                        }
                    break;
                    
                case 5: // 삭제
                    System.out.println("삭제(Delete)");
                    System.out.print("삭제 할 번호 >");
                    
                    int delNum = Integer.parseInt(scan.nextLine());
                    String[] deltemp = new String[5]; //새로 배열을 선언하면 참조형이라 초기값이 null
                    boardArray[delNum-1] = deltemp; 
                    
                    for (int i=num-1; i>=0; i--){ //boardArray[행][열]
                        //행의 개수만큼 출력하도록 (num-1 ~ 0) = 우리는 0부터 번호가 시작되니까. 또한 내림차순으로 출력하기 위해
                        	if(boardArray[i][0] != null) {                    		
                            System.out.print("no."+(Integer.parseInt(boardArray[i][0])+1)+"\t" +" 제목  : "+ boardArray[i][1]+"\t"+" 내용  : "+
                                        boardArray[i][2]+"\t"+"  글쓴이 : "+ boardArray[i][3]+"\t"+"  조회수 : "+boardArray[i][4]);
                            System.out.println("");
                        	}
                       
                        }
                    
                    break;
                    
                case 6: // 종료(Delete)
                    System.out.println("프로그램 종료");
                    run = false;
                    break;
            }
        }

	}
}