package challange07;

//1��
public class CountableTest {

	public static void main(String[] args) {
		Countable[] count = { new Bird("���ٱ�"), new Bird("������"), new Tree("�������"), new Tree("�㳪��") };

		for (Countable e : count)
			e.count();

	}

}
