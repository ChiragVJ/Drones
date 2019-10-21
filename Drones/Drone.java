package Drones;

public class Drone {
	private int xPos, yPos, droneId, dirX, dirY;
	private static int droneCount;

	Drone(int x, int y) {
		xPos = x;
		yPos = y;
		droneId = droneCount++;
		dirX = 1;
		dirY = 1;
	}

	public String toString() {
		return "Drone " + droneId + " is at " + xPos + "," + yPos;

	}

	public static void main(String[] args) {
		Drone d = new Drone(5, 3); // create drone
		System.out.println(d.toString()); // print where is
		Drone e = new Drone(6,4);
		System.out.println(e.toString());
		
	}
	public boolean isHere (int sx, int sy) {
		if ((xPos == sx) && (yPos == sy)) {
			return true;
		}
		else return false;
		
	}
	

}