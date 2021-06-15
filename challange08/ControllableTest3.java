package challange08;

//3번 문제 무명클래스
public class ControllableTest3 {

	public static void main(String[] args) {
		String who = "나는";
		Controllable tv = new Controllable() {
			public void power(boolean onOff) {
				System.out.println(who + " TV 전원을 켠다.");
				System.out.println(who + " TV 전원을 끈다.");
			}
		};

		tv.power(true);
		tv.repair();
		Controllable.reset();
	}
}
