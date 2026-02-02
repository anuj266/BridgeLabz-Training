package review;
interface first{
	void show();
}
interface Second{
	void display();
}
class Child implements first , Second{
	public void show() {
		System.out.println("Hello Party");
	}
	public void display() {
		System.out.println("Bye Party");
	}
}
public class MultipleInheritance {
	public static void main(String[] args) {
		Child child = new Child();
		child.show();
		child.display();
	}
}
