import java.util.Scanner;
public class CircleApp {

	
		public static void main (String args[]) {
			
			System.out.println("Welcome to the Circle Tester");
			
			Scanner sc = new Scanner (System.in);
			String choice = "y";
			
			while (choice.equalsIgnoreCase("y")){
				System.out.println("Enter Radius: ");
				double radius = sc.nextDouble();
				Circle c = new Circle(radius);
				
				System.out.println("Circumference: " + c.getFormattedCircumference());
				System.out.println("Area :" + c.getFormattedArea());
				
				choice = sc.nextLine();
				System.out.println("Continue? (y/n): ");
				choice = sc.nextLine();
				System.out.println();
				
				if (choice.equalsIgnoreCase("n")){
					System.out.println("Goodbye. You Created " + Circle.getObjectCount () + "Circle object (s).");
					sc.close();
				}
				
			}
			
		}
	}
