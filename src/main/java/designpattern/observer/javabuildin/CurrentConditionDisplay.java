package designpattern.observer.javabuildin;

import designpattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	private Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;//记下主题
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity(); 
			this.pressure = weatherData.getPressure();
			display();
		}
		
	}

	@Override
	public void display() {
		System.out.println("Current Condition: " + temperature + "F degrees and " + humidity + "% humidity" + " and pressure is " + pressure);
	}

}
