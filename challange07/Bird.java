package challange07;

class Bird implements Countable {
	String name;

	public Bird() {
	}

	public Bird(String name) {
		this.name = name;
	}

	public void count() {

		System.out.println(name + "�� 2���� �ִ�.");

	}

	void fly() {
		System.out.println("2����" + name + "���ư���.");

	}

}
