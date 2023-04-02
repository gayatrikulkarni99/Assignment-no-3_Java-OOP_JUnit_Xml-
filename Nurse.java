public class Nurse extends HospitalEmployee {
	
	protected int nump;
	
	public Nurse(String name, int number, int nump)
	{
		super(name,number);
		this.nump=nump;
	}
	
	
	public int getNumP() {
	    return nump;
	  }

	public void setNumP(int nump) {
	    this.nump = nump;
	  }
	
	@Override
	public String toString() {
		return this.name+ ' ' + this.number + " has "+this.nump + " patients.";
	}
	
	@Override
	public void work()
	{
		System.out.println (name + " works for the hospital. " + name + " is a nurse with " + nump + " patients.");
	}	
}