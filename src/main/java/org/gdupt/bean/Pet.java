package org.gdupt.bean;

import java.util.Date;

/**
 * @author czy
 * @create 2021-06-16 10:32
 */
//宠物javabean类
public class Pet {
    private String petId;
    private String petName;
    private String doctorId;
    private String masterId;
    private String city;
    private String specific;
    private Date time;

    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSpecific() {
        return specific;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "Pet{" +
                "petId='" + petId + '\'' +
                ", petName='" + petName + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", masterId='" + masterId + '\'' +
                ", city='" + city + '\'' +
                ", specific='" + specific + '\'' +
                ", time=" + time +
                '}';
    }
}
