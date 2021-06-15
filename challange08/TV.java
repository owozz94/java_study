package challange08;

public class TV implements Controllable {
	String who;

	public TV(String who) {
		this.who = who;

	}

	@Override
	public void power(boolean onOff) {
		System.out.println(who + " TV 전원을 켠다.");
		System.out.println(who + " TV 전원을 끈다.");

//		if (onOff == true) {
//			System.out.println("길동이는 TV 전원을 켠다.");
//		} else {
//			System.out.println("길동이는 TV 전원을 끈다.");
//		}

	}
}
