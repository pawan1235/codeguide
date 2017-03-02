package codeguide;

//TODO rename all constants and method to "easy to read name" follow the Rule of naming.
public class exercise2 {

	private String x = "Student's name";
	private String z = "Cityzen's ID";
	private final String l = "Thai";

	public exercise2(String x, String z) {
		this.x = x;
		this.z = z;
	}

	public static void main(String[] args) {
		exercise2 l = new exercise2("x", "z");
		System.out.println(l.aa());
		System.out.println(l.ab());
	}

	public String aa() {
		return "I'm running";
	}

	public String ab() {
		return "I'll say OOP2 is very fun";
	}

}
