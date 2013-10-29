
public class Fan {

	int slow = 1; 
	int medium = 2;
	int fast =  3;
	private int speed = slow;
	
	private boolean on = false;

	
	private double radius =  5;
	String color  = "blue";
	
	public Fan() {
		// TODO Auto-generated constructor stub
	}
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString()
	{
		
		return "speed " + speed + "\n"
		  + "color " + color + "\n"
	      + "radius " + radius + "\n"
	      + ((on) ? "fan is on" : " fan is off");
		
	}
	
}
