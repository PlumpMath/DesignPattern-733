public interface QuackObservale {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}