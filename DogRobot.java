
public class DogRobot extends Robot{
	public DogRobot(String name) {
		super(name);
		moveBehavior = new CrawlBehavior();
		talkBehavior = new BarkBehavior();
	}
	@Override
	public String toString() {
		return (super.toString() + " is a happy dog robot");
	}
}
