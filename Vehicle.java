package vehicle;

public class Vehicle {
	int S;
	public void speed(int Speed) {
		S= Speed;
		System.out.println("Speed: "+ S +" km/h");
	}
	public void isRunning() {
		if(S==0)
			System.out.println("Status: Not Running.");
		else
			System.out.println("Status: Running.");
	}
}
