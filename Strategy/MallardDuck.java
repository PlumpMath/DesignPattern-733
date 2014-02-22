public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBahavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}