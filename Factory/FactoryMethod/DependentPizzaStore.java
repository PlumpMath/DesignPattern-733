public class DependentPizzaStore {
	public Pizza createPizza(String style, String type) {
		Pizza pizza = null;
		if(style.equals("NY")) {
			if(type.equals("cheese")) pizza = new NYStyleCheesePizza();
			else if(type.equals("veggie")) pizza = new NYStyleVeggiePizza();
			else if(type.equals("clam")) pizza = new NYStyleClamPizza();
			else if(type.equals("pepperoni")) pizza = new NYStylePepperoniPizza();
			else return null;
		} else if(style.equals("Chicago")) {
		
		} else {
		
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}