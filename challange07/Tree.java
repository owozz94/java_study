package challange07;

class Tree implements Countable {
	String name;

	public Tree() {

	}

	public Tree(String name) {
		this.name = name;
	}

	public void count() {
		System.out.println(name + "�� 5�׷簡 �ִ�.");
	}

	void ripen() {
		System.out.println(name + "���Ű� �� �;���.");

	}
}
