package com.example.demo.entity;

/**
 * 居民健康指标类
 */
public class Healthy {
    private String residentId;
    private double height;
    private double weight;
    private double vision;

    @Override
    public String toString() {
        return "Healthy{" +
                "residentId='" + residentId + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", vision=" + vision +
                '}';
    }

    public String getResidentId() {
        return residentId;
    }

    public void setResidentId(String residentId) {
        this.residentId = residentId;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVision() {
        return vision;
    }

    public void setVision(double vision) {
        this.vision = vision;
    }
}
