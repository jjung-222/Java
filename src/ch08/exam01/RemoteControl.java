package ch08.exam01;

public interface RemoteControl {
	//���
	String COMPANY = "�Ｚ"; //public static final�� �����Ǿ�����
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	
	//�޼ҵ�(��ü ��� ����)
	void turnOn(); //public abstract
	void turnOff();
	void setVolume(int volume);
}
