
public class TV {
	//data fields
	private int channel;
	private int volume;
	private boolean on = false;
	
	//no-argument cons
	TV(){
		this.channel = 1;
		this.volume = 20;
	}
	
	//method
	public void setChannel(int channel) {
		if(on) this.channel = channel;
		//else System.out.println("No Signal!");
	}
	
	public void setVolume(int volume) {
		if(on) this.volume = volume;
		//else System.out.println("No Signal!");
	}
	
	public void channelUp() {
		if(on) this.channel++;
		//else System.out.println("No Signal!");
	}
	
	public void channelDown() {
		if(on) this.channel--;
		//else System.out.println("No Signal!");
	}
	
	public void volumeUp() {
		if(on) this.volume++;
		//else System.out.println("No Signal!");
	}
	
	public void volumeDown() {
		if(on) this.volume--;
		//else System.out.println("No Signal!");
	}
	
	public void powerButton() {
		if(on==true) {
			this.on = false;
		}else {
			this.on = true;
		}
	}
	
	public void info() {
		if(on==false) {
			System.out.println("TV is off!");
		}else {
			System.out.println("Current Channel: "+this.channel);
			System.out.println("Current Volume: "+this.volume);
		}
	}
	
	

}
