package challange08;

public class TV implements Controllable {
	String who;

	public TV(String who) {
		this.who = who;

	}

	@Override
	public void power(boolean onOff) {
		System.out.println(who + " TV ������ �Ҵ�.");
		System.out.println(who + " TV ������ ����.");

//		if (onOff == true) {
//			System.out.println("�浿�̴� TV ������ �Ҵ�.");
//		} else {
//			System.out.println("�浿�̴� TV ������ ����.");
//		}

	}
}
