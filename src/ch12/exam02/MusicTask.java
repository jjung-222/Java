package ch12.exam02;

public class MusicTask extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("������ ���� �մϴ�.");
			try {
				Thread.sleep(1000); // 1��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
