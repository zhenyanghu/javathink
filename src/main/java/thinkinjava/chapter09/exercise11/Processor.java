package thinkinjava.chapter09.exercise11;

/**
 * 处理器接口
 * @author Rocky
 *
 */
public interface Processor {

	String name();
	Object process(Object input);
}
