public class Surgeon extends Doctor {
	
	protected boolean isOperating;
	
	public Surgeon(String name, int number, String specialty, boolean isOperating)
	{
		super(name,number,specialty);
		this.isOperating=isOperating;
	}
	
	@Override
	public String toString() {
		return this.name+ ' ' + this.number+' '+this.specialty+ ' '+"Operating: " +this.isOperating ;
	}
	
	
	@Override
	public void work()
	{
		if(isOperating) {
			System.out.println (this.name + " works for the hospital. " + this.name + " is operating now.");
		}
		else {
			System.out.println (this.name + " works for the hospital. "+ this.name + " is not operating now." );	
		}
	}	
}