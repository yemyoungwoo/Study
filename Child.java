package test2;

public class Child extends Parent {
	
	public Child() {}
	
	public void subtract() {
		int z = x - y;
		System.out.printf("%d - %d = %d\n",x ,y ,z);
	}
	public static void main(String[] args) {
		
//		Parent t = new Parent();
//		System.out.println("parents add");
//		t.add();

		Child c = new Child();
		System.out.println("child add");
		c.add();
		c.subtract();
	}
}
