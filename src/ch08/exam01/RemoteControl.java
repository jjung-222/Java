package ch08.exam01;

public interface RemoteControl {
	//상수
	String COMPANY = "삼성"; //public static final이 생략되어있음
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//메소드(객체 사용 설명)
	void turnOn(); //public abstract
	void turnOff();
	void setVolume(int volume);
}
