package ex7;

public class MyTv {
	
	private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevchannel; // 이전 채널을 저장할 변수 생성
	
	final int max_volume = 100;
	final int min_volume = 0;
	final int max_channel = 100;
	final int min_channel = 1;

	
	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel > max_channel || channel < min_channel)
			return; // 유효성 검사
		
		prevchannel = this.channel; // 현재채널을 prevchannel에 저장
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(channel > max_volume || channel < min_volume)
			return;
		
		
		this.volume = volume;
	}
	
	public void gotoprevchannel () { // 이전 채널을 호출하는 메서드
		setChannel(prevchannel);
	}

	public static void main(String[] args) {
	
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("ch:" + t.getChannel());
		t.setVolume(20);
		System.out.println("vol:" + t.getVolume());
		t.setChannel(20);
		System.out.println("ch:" + t.getChannel());
		t.gotoprevchannel();
		System.out.println("ch:" + t.getChannel());
	}



}
