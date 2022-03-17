
public class Herb extends Plant{
	private boolean isMedicinal;
	private String season;
	
	Herb(){
		
	}
	
	Herb(String name,String color,boolean isMedicinal, String season){
		super(name,color);
		this.isMedicinal = isMedicinal;
		this.season = season;
		
	}

	public boolean isMedicinal() {
		return isMedicinal;
	}

	public String getSeason() {
		return season;
	}

	public void setMedicinal(boolean isMedicinal) {
		this.isMedicinal = isMedicinal;
	}

	public void setSeason(String season) {
		this.season = season;
	}
	
	@Override
	public String toString() {
		return "Herb [Name = "+this.getName()+", Color = "+this.getColor()+", isMedicinal = "+this.isMedicinal+", season = "+this.season+"]";
	}

}
