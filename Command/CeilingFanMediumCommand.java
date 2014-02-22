public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		...
	}
	
	public void undo() {
		...
	}
}