package ch12.exam01;

public class Example {
	public static void main(String[] args) {
		
		System.out.println("메인 스레드 시작");
		
		//네트워크 작업을 하는 스레드 생성과 실행
		Thread thread1 = new Thread(new NetworkTask()); //()안에 runnable을 사용한 객체
		thread1.start();
		
		//음악 작업을 하는 스레드 생성과 실행
		Thread thread2 = new Thread(new MusicTask());
		thread2.start();
		
		//채팅 작업을 하는 스레드 생성과 실행
				Thread thread3 = new Thread(new Runnable() { //익명 구현 객체
					@Override
					public void run() {
						while(true) {
						System.out.println("채팅 작업을 합니다");
						try {
							Thread.sleep(1000); // 1초
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
						}
					}
					
				});
				thread3.start();
		
		while(true) {
			System.out.println("메인 작업을 합니다");
			try {
				Thread.sleep(1000); // 1초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
		
		
	}
}
