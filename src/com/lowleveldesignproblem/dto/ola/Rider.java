package com.lowleveldesignproblem.dto.ola;

import com.lowleveldesignproblem.enums.ola.RideStatus;

import java.util.ArrayList;
import java.util.List;

public class Rider extends Person {

    int id;
    List<Ride> rides;

    public List<Ride> getRides() {
        return rides;
    }

    public void setRides(List<Ride> rides) {
        this.rides = rides;
    }

    public List<Ride> getCompletedRides() {
        return rides;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void createRide(int id, int origin, int destination, int numberOfRiders) {

        if (origin >= destination) {
            System.out.println("Can't create ride because origin is greater than  destination");
            return;
        }

        if (numberOfRiders <= 0) {
            System.out.println("there should be at least one rider ");
            return;
        }
        Ride currentRide = new Ride();
        currentRide.setId(id);
        currentRide.setOrigin(origin);
        currentRide.setRideStatus(RideStatus.CREATED);
        currentRide.setDestination(destination);
        currentRide.setNumberOfRiders(numberOfRiders);
        rides.add(currentRide);
    }

    public void updateRide(int id, int origin, int destination, int numberOfRiders) {

        for (Ride currentRide : rides) {
            if (currentRide.getId() == id) {
                if (currentRide.getRideStatus() == RideStatus.CLOSED) {
                    System.out.println("Can't Update the closed rides");
                    return;
                }
                if (currentRide.getRideStatus() == RideStatus.WITHDRAWN) {
                    System.out.println("Can't Update the withdraw rides");
                    return;
                }
                currentRide.setDestination(destination);
                currentRide.setOrigin(origin);
                currentRide.setNumberOfRiders(numberOfRiders);
                break;
            }
        }

    }

    public void withDrawRide(int id) {
        for (Ride currentRide : rides) {
            if (currentRide.getId() == id) {
                if (currentRide.getRideStatus() == RideStatus.CLOSED) {
                    System.out.println("Can't withdraw the closed rides");
                    return;
                }
                currentRide.setRideStatus(RideStatus.WITHDRAWN);
                return;
            }
        }

        System.out.println("Id is not present in the rides");

    }

    public int closeRide(int id) {
        for (Ride currentRide : rides) {
            if (currentRide.getId() == id) {
                if (currentRide.getRideStatus() != RideStatus.CREATED) {
                    System.out.println("Can't close the closed or withdrawn rides");
                    return 0;
                }
                currentRide.setRideStatus(RideStatus.CLOSED);
                return currentRide.calculateFare(getClosedRides().size() > 10);
            }
        }

        System.out.println("Id is not present in the rides");
        return 0;
    }


    public List<Ride> getClosedRides() {
        List<Ride> completedRides = new ArrayList<>();
        for (Ride ride : rides) {
            if (ride.getRideStatus() == RideStatus.CLOSED) {
                completedRides.add(ride);
            }
        }
        return completedRides;
    }

    public List<Ride> getWithDrawnRides() {
        List<Ride> withDrawnRides = new ArrayList<>();
        for (Ride ride : rides) {
            if (ride.getRideStatus() == RideStatus.WITHDRAWN) {
                withDrawnRides.add(ride);
            }
        }
        return withDrawnRides;
    }


}
