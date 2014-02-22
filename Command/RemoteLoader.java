public class RemoteLoader {
	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
		
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);
		
		Command[] partyOn = {lightOn, stereoOn, tvOn, huttubOn};
		Command[] partyOff = {lightOff, stereoOff, tvOff, huttubOff};
		
		MarcoCommand partyOnMarco = new MacroCommand(partyOn);
		MarcoCommand partyOffMarco = new MacroCommand(partyOff);
		
		remoteControl.setCommand(0, partyOnMarco, partyOffMarco);
		
		System.out.println(remoteControl);
		System.out.println("--- Pushing Marco On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Marco Off---");
		remoteControl.offButtonWasPushed(0);
	}
}