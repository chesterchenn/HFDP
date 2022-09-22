package chapterb.a;

public class WeatherStation {
  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

    weatherData.setMeMeasurements(80, 65, 30.4f);
    weatherData.setMeMeasurements(82, 70, 29.2f);
    weatherData.setMeMeasurements(78, 90, 29.2f);
  }
}
