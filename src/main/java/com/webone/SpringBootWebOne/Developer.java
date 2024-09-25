package com.webone.SpringBootWebOne;

public class Developer {
    // creating attributes sent in Home Controller instead of taking values from Query parameters
    int devId;
    String devName;

    public int getdevId(int devId) {
        return devId;
    }

    public void setdevId(int devId) {
        this.devId = devId;
    }

    public String getName(String devName) {
        return devName;
    }

    public void setdevName(String devName) {
        this.devName=devName;
    }

    @Override
    public String toString() {
        return "Developer Id :" + " " +  devId + " " + '\n' + "Developer Name :" + " " + devName;
    }
}
