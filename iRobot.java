
public class iRobot extends Robot{
	public iRobot(String name) {
		super(name);
		moveBehavior = new RunBehavior();
		talkBehavior = new SpeakBehavior();
	}
	@Override
	public String toString() {
		return (super.name + " is a scary iRobot!!!");
	}
}
