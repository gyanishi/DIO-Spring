package dio.singleton;

public class Singleton {
	private static Singleton inst = new Singleton();
	private Singleton() {
		super ();
	}
	public static Singleton getInstancia () {
		return inst;
	}
}
