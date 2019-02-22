package com.parkinglot.MultiLevelParkingLot.entity;

import javax.persistence.*;

@Entity
@Table(name="PARKING_SLOT")
public class Slot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SLOT_NUMBER")
    long slotNumber;
    @Column(name = "FLOOR_NO")
    int floorNo;
    @Column(name = "OCCUPIED")
    boolean isOccupied;
    @Column(name = "SPOT_TYPE")
    ParkingSpotType spotType;

    Vehicle vehicle;


    public Slot(ParkingSpotType type) {
        this.spotType = type;
    }

    public Slot(ParkingSpotType type,long slotNumber) {
        this.spotType = type;
        isOccupied = false;
        this.slotNumber = slotNumber;
    }
    Slot(long slotNumber) {
        isOccupied = false;
        this.slotNumber = slotNumber;
    }

    boolean isOccupied() {
        return isOccupied;
    }

    long getSlotNumber() {
        return slotNumber;
    }

    void park() {
        isOccupied = true;
    }

    void unPark() {
        isOccupied = false;
    }

    @Override
    public boolean equals(Object o) {
        return (((Slot) o).slotNumber == this.slotNumber);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + (int)this.slotNumber;
        return hash;
    }

//    public boolean assignVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//        free = false;
//        return free;
//    }
//
//    public boolean removeVehicle() {
//        this.vehicle = null;
//        free = true;
//        return free;
//    }
}

