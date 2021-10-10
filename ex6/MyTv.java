package ex6;

public class MyTv {
	
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MiN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void turnOnOff() {

		isPowerOn = !isPowerOn; // if문 써줄 필요없이 다르다(!=) 써주면 됨
	}
	
	void volumeup() {
		if(volume < MAX_VOLUME) {
			volume++;	
		}
	}

	void volumedown() {
		if(volume > MiN_VOLUME) {
			volume--;
		}
	}
	
	void channelup() {
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}
		else { channel++; }
	}
	
	void channelDown() {
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}
		else { channel--; }
	}
	

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

		t.channelDown();
		t.volumedown();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

		
		
		t.volume = 100;
		t.channelup();
		t.volumeup();
		System.out.println("CH:" + t.channel + ", VOL:" + t.volume);

		
		
	}

}
