import java.time.LocalTime;

/*
Domain object creation
 */
public class HourForecast {

    /*
    Attribute member variable additions
     */
    private double temperature;
    private int humidity;
    private String time_of_day;

    /*
    Get and set for temperature
     */
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /*
    Get and set for humidity
     */
    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    /*
    Get and set for time of day
     */
    public String getTime_of_day() {
        return time_of_day;
    }

    public void setTime_of_day(String time_of_day) {
        this.time_of_day = time_of_day;
    }
}