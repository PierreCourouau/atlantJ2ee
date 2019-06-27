/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Server;

import entity.Metric;
import java.util.Date;


/**
 *
 * @author ahure
 */
public class MetricServer {
    
    private String macAddrDomain;
    
    private String macAddress;
    
    private String nameDevice;
    
    private float value;    

    public String getMacAddrDomain() {
        return macAddrDomain;
    }

    public void setMacAddrDomain(String macAddrDomain) {
        this.macAddrDomain = macAddrDomain;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public String getNameDevice() {
        return nameDevice;
    }

    public void setNameDevice(String nameDevice) {
        this.nameDevice = nameDevice;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float values) {
        this.value = values;
    }
 
    public Metric getMetricObj(){
        Metric metric = new Metric();
        metric.setValue(this.value);
        metric.setCreatedAt(new Date());
        return metric;
    }
    
}
