public class Doctor extends HospitalEmployee {
	
	protected String specialty;
	
	public Doctor(String name, int number, String specialty)
	{
		super(name,number);
		this.specialty=specialty;
	}
	
	public String getSpec() {
		    return specialty;
		  }
	
	public void setSpec(String spec) {
		    this.specialty = spec;
		    }
	
	@Override
	public String toString() {
		return this.name+ ' ' + this.number+' '+this.specialty;
		}
	
	@Override
	public void work()
	{
		System.out.println (name + " works for the hospital. " + name + " is a(n) "+specialty+ " doctor.");
	}	
}