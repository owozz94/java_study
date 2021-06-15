package challange08;

//2번 문제
public class ControllableTest2 {

	public static void main(String[] args) {
		String who = "나는";

		class TV implements Controllable {
			public void power(boolean onOff) {

				System.out.println(who + " TV 전원을 켠다.");
				System.out.println(who + " TV 전원을 끈다.");
			}
		}
		Controllable tv = new TV();
		tv.power(true);
		tv.repair();
		Controllable.reset();
	}
}
