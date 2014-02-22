import java.util.ArrayList;

public class PancakeHouseMenu implements Menu {
	ArrayList<MenuItem> menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem...
		addItem...
		....
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
	
	public String toString() {
		return "Objectville Pancake House Menu";
	}
}