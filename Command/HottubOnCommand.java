public class HottubOnCommand implements Command {
	Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	
	public void execute() {...}
	
	public void undo() {...}
}