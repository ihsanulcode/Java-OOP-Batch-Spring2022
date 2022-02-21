
public class Remote {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.powerButton();
		//tv.info();
		
		tv.setChannel(25);
		tv.setVolume(60);
		//tv.info();
		
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelDown();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.powerButton();
		//tv.info();
		
		tv.channelUp();
		

	}

}
