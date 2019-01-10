package designpattern.observer.javabuildin;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(30.2f, 40.0f, 101.03f);
		weatherData.setMeasurements(31.2f, 43.0f, 103.03f);
		weatherData.setMeasurements(30.2f, 45.0f, 102.03f);
	}
}
