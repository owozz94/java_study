package challange08;

//3�� ���� ���ٽ�
public class ControllableTest4 {

	public static void main(String[] args) {
		String who = "����";
		
		Controllable tv = new Controllable() {
			public void power(boolean onOff) {
				System.out.println(who + " TV ������ �Ҵ�.");
				System.out.println(who + " TV ������ ����.");
			}
		};

		tv.power(true);
		tv.repair();
		Controllable.reset();
	}
}
