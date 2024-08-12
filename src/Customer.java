public class Customer {
	private int CustomerId;
	private String name;
	private String location;
	private String email;
	
	public void setCustomerId(int CustomerId){
		this.CustomerId=CustomerId;
		
		
	}
	public int getCustomerId() {
		
		return this.CustomerId;
		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	Customer()
	{
		this.CustomerId=10;
		this.name="Abc";
		this.location="Bnglre";
		this.email="abc@gmail.com";
	}
	Customer(int CustomerId,
	String name,
	String location,
	String email)
	{
		this.CustomerId=CustomerId;
		this.name=name;
		this.location=location;
		this.email=email;
	}
	
	public String toString()
	{
		return name+"\t"+location+"\t";
	}
 

}
