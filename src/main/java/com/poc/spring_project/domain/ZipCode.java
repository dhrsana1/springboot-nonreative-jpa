package com.poc.spring_project.domain;

import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="zipcode")
public class ZipCode  {

    @javax.persistence.Id
    public String zip;
    public String type;
    public String city;
    public String state;
    public String county;
    public String timezone;

 
    public String getZip() {
        return zip;
    }

    void setZip(String zip) {
        this.zip = zip;
    }

    public void setId(String zip) {
        this.zip = zip;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

}
