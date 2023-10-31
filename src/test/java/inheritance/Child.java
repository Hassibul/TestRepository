package inheritance;

public class Child implements Father1_I, Mom2_I {
	public static void main(String[] args) {
		Child.car();
		Child obj = new Child();
		obj.getHome();
		obj.getMoney();

	}

	static void car() {
		String carName = "BMW";
		System.out.println("this car name comming from child" + carName);
	}

	@Override
	public void getMoney() {
		System.out.println("Money");

	}

	@Override
	public void getHome() {
		System.out.println("Home");

	}
}
