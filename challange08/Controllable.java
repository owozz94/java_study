package challange08;

interface Controllable {

	default void repair() {
		System.out.println("���񽺼��Ϳ��� �����ؾ� �Ѵ�.");

	}

	static void reset() {
		System.out.println("���� �ʱ�ȭ�� �� �ִ�.");
	}

	abstract void power(boolean onOff);
}
