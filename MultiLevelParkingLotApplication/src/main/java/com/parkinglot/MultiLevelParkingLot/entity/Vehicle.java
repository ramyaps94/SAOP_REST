package com.parkinglot.MultiLevelParkingLot.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Long vehicleId;

    @Column(name = "LICENSE_NUMBER")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String vehicleLicenseNumber;

    @Column(name = "COLOR")
    private String color;

    @Column(name="NAME")
    private String name;

    @Column(name="VEHICLE_TYPE")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private VehicleType vehicleType;

    public Vehicle(){}

    public Vehicle(VehicleType type) {
        this.vehicleType = type;
    }


    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleLicenseNumber(){
        return vehicleLicenseNumber;
    }

    public void setVehicleLicenseNumber(String vehicleLicenseNumber){
        this.vehicleLicenseNumber = vehicleLicenseNumber;
    }

    public VehicleType getVehicleType(){
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType){
        this.vehicleType = vehicleType;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

