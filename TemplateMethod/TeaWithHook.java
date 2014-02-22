public class TeaWithHook extends CaffeineBeverageWithHook {
	public void brew() {
		System.out.println("Steeping the tea");
	}
	
	public void addCondiments() {
		System.out.println("Adding Lemon");
	}
	
	public boolean customerWantsCondiments() {
		...
	}
	
	private String getUserInput() {
		...
	}
}