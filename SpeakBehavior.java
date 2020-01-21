
public class SpeakBehavior implements TalkBehavior {

	public String talk() {
		String[] and = {"Hello", "How are you?", "Good day"};
		int random = (int)(Math.random() * 3);
		return and[random];
	}

}
