
public class Flower extends Plant{
	private boolean hasSmell;
	private boolean hasThorn;
	
	Flower(){
		
	}
	
	Flower(String name,String color,boolean hasSmell, boolean hasThorn){
		super(name,color);
		this.hasSmell = hasSmell;
		this.hasThorn = hasThorn;
	}

	public boolean isHasSmell() {
		return hasSmell;
	}

	public boolean isHasThorn() {
		return hasThorn;
	}

	public void setHasSmell(boolean hasSmell) {
		this.hasSmell = hasSmell;
	}

	public void setHasThorn(boolean hasThorn) {
		this.hasThorn = hasThorn;
	}
	
	@Override
	public String toString() {
		return "Flower [Name = "+this.getName()+", Color = "+this.getColor()+", hasSmell = "+this.hasSmell+", hasThorn = "+this.hasThorn+"]";
	}

}
