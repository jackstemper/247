
public class HumanRobot extends Robot{
	public HumanRobot(String name) {
		super(name);
		moveBehavior = new WalkBehavior();
		talkBehavior = new SpeakBehavior();
	}
	@Override
	public String toString() {
		return (super.name + " is a typical human robot");
	}
}
