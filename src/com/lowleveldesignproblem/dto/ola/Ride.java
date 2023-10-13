package com.lowleveldesignproblem.dto.ola;

import com.lowleveldesignproblem.enums.ola.RideStatus;

public class Ride {
    static int rideFarePerKiloMeter = 20;
    int id;
    private int origin;
    private int destination;
    private int numberOfRiders;
    private RideStatus rideStatus;

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public void setNumberOfRiders(int numberOfRiders) {
        this.numberOfRiders = numberOfRiders;
    }

    public int getDestination() {
        return destination;
    }

    public int getOrigin() {
        return origin;
    }

    public int getNumberOfRiders() {
        return numberOfRiders;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    public int calculateFare(boolean isPriority) {
        if (isPriority) {
            return (int) ((destination - origin) * 0.75 * rideFarePerKiloMeter);
        }

        if (numberOfRiders > 1) {
            return (int) ((destination - origin) * 0.75 * rideFarePerKiloMeter * numberOfRiders);
        }
        return (destination - origin) * rideFarePerKiloMeter;
    }

}
