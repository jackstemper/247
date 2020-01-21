
public class SimpleSpeakBehavior implements TalkBehavior {

	public String talk() {
		String[] and = {"Wall-E", "EVA!", "Pop", "Eva?", "Eee-va?"};
		int random = (int)(Math.random() * 5);
		return and[random];
	}

}
