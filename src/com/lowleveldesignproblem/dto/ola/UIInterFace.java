package com.lowleveldesignproblem.dto.ola;

import com.lowleveldesignproblem.dto.ola.Rider;

import java.util.List;

public class UIInterFace {
    int availableDrivers;
    List<Rider> riderList;

    public int getAvailableDrivers() {
        return availableDrivers;
    }

    public void setAvailableDrivers(int availableDrivers) {
        this.availableDrivers = availableDrivers;
    }

    public List<Rider> getRiderList() {
        return riderList;
    }

    public void setRiderList(List<Rider> riderList) {
        this.riderList = riderList;
    }

    public int getDrivers() {
        return availableDrivers;
    }

    public void setDrivers(int drivers) {
        this.availableDrivers = drivers;
    }


    public void createRide(int riderId, int rideId, int origin, int destination, int numberOfRiders) {
        if (availableDrivers == 0) {
            System.out.println("Can't Initiate Ride because No driver is available");
            return;
        }

        for (Rider rider : riderList) {
            if (rider.getId() == riderId) {
                rider.createRide(rideId, origin, destination, numberOfRiders);
                availableDrivers--;
                break;
            }
        }
    }

    public void updateRide(int riderId, int rideId, int origin, int destination, int numberOfRiders) {
        if (availableDrivers == 0) {
            System.out.println("Can't Initiate Ride because No driver is available");
            return;
        }

        for (Rider rider : riderList) {
            if (rider.getId() == riderId) {
                rider.updateRide(rideId, origin, destination, numberOfRiders);
                break;
            }
        }
    }

    public void withDrawRide(int riderId, int rideId) {
        for (Rider rider : riderList) {
            if (rider.getId() == riderId) {
                rider.withDrawRide(rideId);
                availableDrivers++;
                break;
            }
        }
    }

    public int closeRide(int riderId, int rideId) {
        for (Rider rider : riderList) {
            if (rider.getId() == riderId) {
                availableDrivers++;
                return rider.closeRide(rideId);
            }
        }
        return 0;
    }

}
