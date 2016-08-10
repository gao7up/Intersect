package com.cangli.tech.intersect.internet;

import android.os.Build;

/**
 * Created by Alienware on 2016/8/10.
 */
public class DeviceId {
    private String DEVICE_ID;
    public DeviceId(){
        generateDeviceId();
    }

    private void generateDeviceId() {
        DEVICE_ID = new String();
        String SerialNumber = Build.SERIAL;
        DEVICE_ID = SerialNumber;
    }

    public String getDeviceId(){
        return DEVICE_ID;
    }
}
