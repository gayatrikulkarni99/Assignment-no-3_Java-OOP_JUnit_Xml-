public class HospitalEmployee {
	
	protected String name;
	protected int number;
	
	public HospitalEmployee(String name, int number)
	{
		this.name=name;
		this.number=number;
	}
	
	public String getName() {
		    return name;
		  }
	
	public void setName(String name) {
		    this.name = name;
		  }
	
	public int getNum() {
	    return number;
	  }

	public void setNum(int num) {
	    this.number = num;
	  }
	
	public void work()
	{
	System.out.println (name + " works for the hospital.");
	}
	
	@Override
	public String toString() {
		return this.name+ ' ' + this.number;
	}
	
}