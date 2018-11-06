/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bl;

/**
 *
 * @author Alex
 */
public class WeatherStation {
    private String place;
    private int sealevel;
    private double temperature;
    private int humidity;

    public WeatherStation(String place, int sealevel, double temperature, int humidity) {
        this.place = place;
        this.sealevel = sealevel;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSealevel() {
        return sealevel;
    }

    public void setSealevel(int sealevel) {
        this.sealevel = sealevel;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    
}
