package com.example.demo.model;

/**
 * 居民住址
 */
public class AddressInfo {
    private String id;
    private String apartmentId;
    private int floor;
    private int homeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApartmentId() {
        return apartmentId;
    }

    public void setApartmentId(String apartmentId) {
        this.apartmentId = apartmentId;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getHomeId() {
        return homeId;
    }

    public void setHomeId(int homeId) {
        this.homeId = homeId;
    }

    @Override
    public String toString() {
        return "AddressInfo{" +
                "id='" + id + '\'' +
                ", apartmentId='" + apartmentId + '\'' +
                ", floor=" + floor +
                ", homeId=" + homeId +
                '}';
    }
}
