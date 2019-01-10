package designpattern.observer;

public interface Observer {

	/**
	 * 所有的观察者都必须实现update()方法， 以实现观察者接口。
	 * 当气象值改变时，主题会把这些状态当作方法的参数，传给观察者。
	 * @param temp 温度
	 * @param humidity 湿度
	 * @param pressure 气压
	 */
	void update(float temp, float humidity, float pressure);
}
