package lab;

class Emp1{
	
	private int id;
	private String name;
	
	public Emp1(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
}

public class EqualsHashcode {
	public static void main(String[] args) {
		
		Emp1 emp1=new Emp1(1, "sham");
		Emp1 emp2=new Emp1(1, "sham");
		
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
	}
}
