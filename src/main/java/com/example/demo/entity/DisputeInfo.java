package com.example.demo.entity;

public class DisputeInfo {
    private int id;
    private String summary;
    private String adminAccount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    @Override
    public String toString() {
        return "DisputeInfo{" +
                "id=" + id +
                ", summary='" + summary + '\'' +
                ", adminAccount='" + adminAccount + '\'' +
                '}';
    }
}
