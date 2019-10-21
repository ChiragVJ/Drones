package Drones;

import java.util.ArrayList;
import java.util.Random;

public class DroneArena {

	ArrayList<Drone> Drones = new ArrayList<Drone>();
	private int xSize, ySize, xRand, yRand;
	private Drone b;

	public DroneArena(int x, int y) {

		xSize = x;
		ySize = y;

		Drones.add(new Drone(xRand, yRand));

	}

	public void addDrone() {
		Random randGen = new Random();
		xRand = randGen.nextInt(xSize + 1);
		yRand = randGen.nextInt(ySize + 1);
		b = new Drone(xRand, yRand);
		if (getDroneAt(xRand, yRand) == null) {
			Drones.add(b);
		} else {
			System.out.println("Drone already exists at this location");
		}
		

	}

	public String toString() {
		String info = "";

		for (Drone c : Drones)
			info += c.toString() + " in the arena of size " + xSize + "," + ySize + "\n";

		return info;

	}

	public static void main(String[] args) {
		DroneArena a = new DroneArena(20, 10); // create drone arena
		a.addDrone();
		a.addDrone();
		a.addDrone();
		a.addDrone();
		System.out.println(a.toString()); // print where is
	}

	public Drone getDroneAt(int x, int y) {
		for (Drone c : Drones) {
			if (c.isHere(x, y)) {
				return c;
			}
		}
		return null;

	}
}
