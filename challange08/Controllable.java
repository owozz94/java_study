package challange08;

interface Controllable {

	default void repair() {
		System.out.println("서비스센터에서 수리해야 한다.");

	}

	static void reset() {
		System.out.println("내가 초기화할 수 있다.");
	}

	abstract void power(boolean onOff);
}
