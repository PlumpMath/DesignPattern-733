public class DinerMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem...
		addItem...
		...
	}
	
	public void addItem(String name, String description, boolean vegetarian,
		double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if(numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}	
	}
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
}