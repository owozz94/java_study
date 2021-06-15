package challange07;

class Bird implements Countable {
	String name;

	public Bird() {
	}

	public Bird(String name) {
		this.name = name;
	}

	public void count() {

		System.out.println(name + "가 2마리 있다.");

	}

	void fly() {
		System.out.println("2마리" + name + "날아간다.");

	}

}
