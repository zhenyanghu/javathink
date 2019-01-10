package enumdemo.inter;

public interface DefaultFactory {

	static Defaultable create(Supplier<Defaultable> supplier) {
		return supplier.get();
	}
}

interface Supplier<T> {
	Defaultable get();
}
