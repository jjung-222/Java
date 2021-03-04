package ch08.exam02;

public class Television implements RemoteControl {
	private int volume; //현재 볼륨의 상태 저장. 아래 조건문으로 한정된 소리만 가능	
	
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다");
	}
	public void setVolume(int volume) {
		if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		
		if(volume<RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		
		System.out.println("TV 볼륨을 " + this.volume + "로 조정합니다.");
	}
}
