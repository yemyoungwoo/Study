package test2;

public class Parent {
	int x;
	int y;
	public Parent() {
		x = (int)(Math.random()*100);
		y = (int)(Math.random()*100);
	}
	public void subtract() {
		System.out.println("parent subtract");
		int z = x - y;
		System.out.printf("%d - %d = %d\n",x ,y ,z);
	}
	
	public void add() {
		int z = x + y;
		System.out.printf("%d + %d = %d\n", x, y, z);
	}
	public static void main(String[] args) {

		Child c = new Child();
		System.out.println("child add");
		c.add();

		
	}
}
