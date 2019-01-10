package thinkinjava.chapter09.exercise11;

/**
 * 适配器模式：接受你拥有的接口，产生你需要的接口
 * @author Rocky
 *
 */
public class StringAdapter implements Processor {

	/**
	 * 组合，代理
	 */
	ChangeString changeString;
	public StringAdapter(ChangeString changeString) {
		this.changeString = changeString;
	}
	
	@Override
	public String name() {
		return changeString.name();
	}

	@Override
	public Object process(Object input) {
		return changeString.chang((String)input);
	}

}
