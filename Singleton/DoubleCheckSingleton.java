//Java 5 or later, high performance synchronized

public class DoubleCheckSingleton {
	private volatile static DoubleCheckSingleton uniqueInstance;
	
	private DoubleCheckSingleton() {}
	
	public static DoubleCheckSingleton getInstance() {
		if(uniqueInstance == null) {
			synchronized(DoubleCheckSingleton.class) {
				if(uniqueInstance == null) uniqueInstance = new DoubleCheckSingleton();
			}
		}
		return uniqueInstance;
	}
}