package vehicle;
import java.util.Scanner;

public class Run {
	static void error()
	{
		System.out.println("Invalid Vehicle.");
	}
	
	public static void main(String[] args) {
			System.out.println("Enter your desired vehicle:\n1. Car\n2. Bus\n3. Ship\n4. Boat\n5. Aeroplane\n6. Helicopter\n");
			Scanner input = new Scanner(System.in);
			int Option;
			Option=input.nextInt();
		
			try{
			if(Option==1)
			{
				System.out.println("Input speed: ");
				int speed=input.nextInt();
				Car C1=new Car(speed);
			}
			else if(Option==2)
			{
				System.out.println("Input speed: ");
				int speed=input.nextInt();
				Bus B1=new Bus(speed);
			}
			else if(Option==3)
			{
				System.out.println("Input speed: ");
				int speed=input.nextInt();
				Ship S1=new Ship(speed);
			}
			else if(Option==4)
			{
				System.out.println("Input speed: ");
				int speed=input.nextInt();
				Boat B1=new Boat(speed);
			}
			else if(Option==5)
			{
				System.out.println("Input speed: ");
				int speed=input.nextInt();
				Aeroplane A1=new Aeroplane(speed);
			}
			else if(Option==6)
			{
				System.out.println("Input speed: ");
				int speed=input.nextInt();
				Helicopter H1=new Helicopter(speed);
			}
			else error();
		}
			catch (Exception e)
			{
				error();
			}
		}
	}


