package enumdemo;

public enum EnumDemo2 {

	FIRST {
		@Override
		public String getInfo() {
			return "FIRST TIME";
		}
	},
	SECOND {
		@Override
		public String getInfo() {
			return "SECOND TIME";
		}
	};
	/**
	 * 定义抽象方法
	 * @return
	 */
	public abstract String getInfo();
	
	//无法通过编译,毕竟EnumDemo3.FIRST是个实例对象
//	 public void text(EnumDemo3.FIRST instance){ }
	
	//测试
	public static void main(String[] args) {
		System.out.println(EnumDemo2.FIRST.getInfo());
		System.out.println(EnumDemo2.SECOND.getInfo());
	}
}

/**
输出结果:
	FIRST TIME
	SECOND TIME
 */
