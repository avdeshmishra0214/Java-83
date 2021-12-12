import java.util.Scanner;

public class DrawingsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape sh = null;
		
		System.out.println("1. Rectangle");
		System.out.println("2. Circle");

		System.out.print("enter which shape do you want to use: ");
		int shapeType = sc.nextInt();
		System.out.println("------------------------------------------------------------");
		
		switch (shapeType) {
		 case 1:
			sh = new Rectangle("Yellow", 15,8); 
			break;
		 case 2:
			sh = new Circle("Red", 12.5f); 
			break;
		 default:
			System.out.println("--- INVALID SHAPE SELECTED ---");
			System.exit(0);
		}// switch
		
		System.out.println("Shape Selected ---> " + sh.getClass().getName().toUpperCase());
		System.out.println("Color = " + sh.getColor());
		sh.setColor("Blue");
		
		sh.area();
	}
}
