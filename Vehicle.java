package JavaDemo2;

public class Vehicle {
	int id;
	int model;
	/**
	 * @param id
	 * @param model
	 */
	public Vehicle(int model) {
		super();
		this.model = model;
		System.out.println(model);
	}
	/**
	 * @param id
	 */
	public Vehicle(int id,int model) {
		this(model);//10
		this.id = id;
		System.out.println(model);
		System.out.println(id);
	}
public static void main(String args[]) {
	Vehicle v1= new Vehicle(10,100);
}
}
