
public class WallERobot extends Robot{
	public WallERobot(String name) {
		super(name);
		moveBehavior = new WalkBehavior();
		talkBehavior = new SimpleSpeakBehavior();
	}
	@Override
	public String toString() {
		return (super.name + " is an evironmentally friendly Wall-E Robot");
	}
}
