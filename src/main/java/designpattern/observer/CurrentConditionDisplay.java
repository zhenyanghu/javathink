package designpattern.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

	//保存着三个值时为了显示display,当然，如果不仅仅只是显示需要用到这三个值呢，所以，还是保存下来更好
	private float temperature;
	
	private float humidity;
	
	private float pressure;
	
	private WeatherData weatherDate;
	
	public CurrentConditionDisplay(Subject weatherData) {
		this.setWeatherDate(weatherDate);//保存weather，以后后面需要取消(移除观察者)
		weatherData.registerObserver(this);//注册
	}
	
	@Override
	public void display() {
		System.out.println("Current Condition: " + temperature + "F degrees and " + humidity + "% humidity" + " and pressure is " + pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		//display加上三个参数就不用保存上面的三个值了;
		display();
	}

	public WeatherData getWeatherDate() {
		return weatherDate;
	}

	public void setWeatherDate(WeatherData weatherDate) {
		this.weatherDate = weatherDate;
	}

}
