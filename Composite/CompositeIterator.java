import java.util.*;

public class CompositeIterator implements Iterator {
	Stack<Iterator> stack = new Stack<Iterator>();
	
	public CompositeIterator(Iterator iterator) {
		stack.push(iterator);
	}
	
	public MenuComponent next() {
		if(hasNext()) {
			Iterator iterator = stack.peek();
			MenuComponent component = iterator.next();
			if(component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}
	
	public boolean hasNext() {
		if(stack.isEmpty()) {
			return false;
		} else {
			Iterator iterator = stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}
}