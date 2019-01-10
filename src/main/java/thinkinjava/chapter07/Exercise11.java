package thinkinjava.chapter07;

public class Exercise11 {

	public static void main(String[] args) {
		SpaceShip ss = new SpaceShip("神州6号");
		ss.up(100);
	}
}

class SpaceShipControls {
	void up (int velocity) {
		System.out.println("往上飞"+velocity);
	};
	void down (int velocity) {};
	void left (int velocity) {};
	void right (int velocity) {};
	void forward (int velocity) {};
	void back (int velocity) {};
	void truboBoost() {};
}

/**
 * 利用组合完成代理
 * 
 * @author Rocky
 *
 */
class SpaceShip {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();//组合
	public SpaceShip(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
	void up(int velocity) {
		controls.up(velocity);
	}
	void down(int velocity) {
		controls.down(velocity);
	}
	void left(int velocity) {
		controls.left(velocity);
	}
	void right(int velocity) {
		controls.right(velocity);
	}
	void forward(int velocity) {
		controls.forward(velocity);
	}
	void back(int velocity) {
		controls.back(velocity);
	}
	void truboBoost() {
		controls.truboBoost();
	}
}