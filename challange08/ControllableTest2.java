package challange08;

//2�� ����
public class ControllableTest2 {

	public static void main(String[] args) {
		String who = "����";

		class TV implements Controllable {
			public void power(boolean onOff) {

				System.out.println(who + " TV ������ �Ҵ�.");
				System.out.println(who + " TV ������ ����.");
			}
		}
		Controllable tv = new TV();
		tv.power(true);
		tv.repair();
		Controllable.reset();
	}
}
