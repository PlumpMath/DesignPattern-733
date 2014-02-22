import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare() {}
	
	void bake() {}
	
	void cut() {}
	
	void box() {}
	
	public String getName() {
		return name;
	}
	
	public String toString() {}
}