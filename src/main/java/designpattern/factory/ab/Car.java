package designpattern.factory.ab;

import designpattern.factory.Moveable;

public class Car implements Moveable {

	@Override
	public void run() {
		System.out.println("开着车前进");
	}

	
}
   