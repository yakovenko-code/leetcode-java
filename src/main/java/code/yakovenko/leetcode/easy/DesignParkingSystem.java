package code.yakovenko.leetcode.easy;

import code.yakovenko.leetcode.utils.ParkingSystem;

public final class DesignParkingSystem {

	private final ParkingSystem parkingSystem;

	public DesignParkingSystem(int big, int medium, int small) {
		parkingSystem = new ParkingSystem(big, medium, small);
	}

	public boolean addCar(int carType) {
		return parkingSystem.addCar(carType);
	}
}
