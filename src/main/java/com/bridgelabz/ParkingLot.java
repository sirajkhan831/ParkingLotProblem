package com.bridgelabz;

/**
 * @author -> Siraj
 * @version -> 0.1
 * @since -> 10/11/2021
 */
public class ParkingLot {

    /**
     * This program manages parking spaces for vehicles.
     */
    private Vehicle vehicle;

    /**
     *
     * @param vehicle -> Required to park the given vehicle.
     * @return -> Returns boolean by checking if the given vehicle is already parked.
     */
    public boolean park(Vehicle vehicle) {
        if (this.vehicle != null) {
            return false;
        }
        this.vehicle = vehicle;
        return true;
    }

    /**
     *
     * @param vehicle -> Required to un-park the given vehicle.
     * @return -> Returns boolean by checking if the given vehicle exists.
     */
    public boolean unPark(Vehicle vehicle) {
        if (vehicle == null) {
            return false;
        }
        if (this.vehicle.equals(vehicle)) {
            this.vehicle = null;
            return true;
        }
        return false;
    }
}
