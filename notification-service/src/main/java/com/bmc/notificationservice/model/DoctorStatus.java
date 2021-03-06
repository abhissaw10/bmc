package com.bmc.notificationservice.model;

public enum DoctorStatus {
    APPROVED("Active"),
    PENDING("Pending"),
    REJECTED("Rejected");

    public final String value;

    private DoctorStatus(String value){
        this.value=value;
    }

}
