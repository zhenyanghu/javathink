package designpattern.observer;

public interface Subject {

	/**
	 * 注册观察者
	 *  @param o 观察者对象
	 */
	void registerObserver(Observer o);
	
	/**
	 * 移除观察者
	 * @param o 观察者对象
	 */
	void removeObserver(Observer o);
	
	/**
	 * 当主题改变时,这个方法会被调用，以通知多有的观察者
	 */
	void notifyObserver();
}
