package ch08.exam01;

public class Audio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Audio ÄÕ´Ï´Ù");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio ²ü´Ï´Ù");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("Audio º¼·ýÀ» "+ volume + "ÄÕ´Ï´Ù");
	}

}
