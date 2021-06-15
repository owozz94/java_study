package challange08;

//1번 문제
public class ControllableTest {

	public static void main(String[] args) {
		TV tv = new TV("길동이는");
		tv.power(true);
		tv.repair();
		Controllable.reset();

	}

}
