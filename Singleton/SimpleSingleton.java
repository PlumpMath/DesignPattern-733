//initialize the single object when JVM loads class

public class SimpleSingleton {
	private static SimpleSingleton uniqueInstance = new SimpleSingleton();
	
	private SimpleSingleton() {}
	
	public static SimpleSingleton getInstance() {
		return uniqueInstance;
	}
}