package ch12.exam01;

public class Example {
	public static void main(String[] args) {
		
		System.out.println("���� ������ ����");
		
		//��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		Thread thread1 = new Thread(new NetworkTask()); //()�ȿ� runnable�� ����� ��ü
		thread1.start();
		
		//���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new Thread(new MusicTask());
		thread2.start();
		
		//ä�� �۾��� �ϴ� ������ ������ ����
				Thread thread3 = new Thread(new Runnable() { //�͸� ���� ��ü
					@Override
					public void run() {
						while(true) {
						System.out.println("ä�� �۾��� �մϴ�");
						try {
							Thread.sleep(1000); // 1��
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} 
						}
					}
					
				});
				thread3.start();
		
		while(true) {
			System.out.println("���� �۾��� �մϴ�");
			try {
				Thread.sleep(1000); // 1��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		
		
		
	}
}
