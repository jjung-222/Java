package ch08.exam02;

public class Audio implements RemoteControl {
	//Field
	private int volume;
	
	
	//Method
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
		if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		
		if(volume<RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		
		System.out.println("Audio º¼·ýÀ» "+ volume + "ÄÕ´Ï´Ù");
	}

}
