package designpattern.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

	//记录观察者
	private ArrayList<Observer> observers;
	
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void registerObserver(Observer o) {
		//注册观察者时，加入到ArrayList中
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		//取消注册时，从ArrayList中移除
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	//WeatherDate的其他方法
}
