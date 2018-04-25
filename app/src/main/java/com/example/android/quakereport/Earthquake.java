package com.example.android.quakereport;

/**
 * Created by n.cooray on 25/04/2018.
 */

public class Earthquake {
    private double magnitude;
    private String location;
    private Long date;
    private String URL;



    public Earthquake(double magnitude, String location, Long date,String URL){
        setMagnitude(magnitude);
        setLocation(location);
        setDate(date);
        setURL(URL);
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
