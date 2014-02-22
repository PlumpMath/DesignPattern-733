public class HottubOffCommand implements Command {
	Hottub hottub;
	
	public HottubOffCommand(Hottub hottub) {
		this.huttub = hottub;
	}
	
	public void execute() {
		hottub.setTemperature(98);
		hottub.off();
	}
	
	public void undo() {
		hottub.on();
	}
}