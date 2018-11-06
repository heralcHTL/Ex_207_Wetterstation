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

    public WeatherStation(String place, int sealevel, double temperature, int humidity) throws Exception {
        this.place = place;
        this.sealevel = sealevel;
        this.setTemperature(temperature);
        this.setHumidity(humidity);
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

    public double getTemperature() {            // -35 +45

        return temperature;
    }

    public void setTemperature(double temperature) throws Exception {
        if (temperature < -35 || temperature > 45)
        {
            throw new Exception("Invalid value for Temperature");
        }
        this.temperature = temperature;
    }

    public int getHumidity() {                   // 0% 100%

        return humidity;
    }

    public void setHumidity(int humidity) throws Exception {
        if (humidity < 0 || humidity > 100)
        {
            throw new Exception("Invalid value for Humidity");
        }
        this.humidity = humidity;
    }

}
