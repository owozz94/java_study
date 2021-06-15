package challange07;

class Tree implements Countable {
	String name;

	public Tree() {

	}

	public Tree(String name) {
		this.name = name;
	}

	public void count() {
		System.out.println(name + "가 5그루가 있다.");
	}

	void ripen() {
		System.out.println(name + "열매가 잘 익었다.");

	}
}
