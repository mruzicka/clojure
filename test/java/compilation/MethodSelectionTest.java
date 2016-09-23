package compilation;

interface IMethodSelectionTest {
	String stuff(String p);
}

public interface MethodSelectionTest extends IMethodSelectionTest {
	String stuff(Object p);

	class Factory {
		public static MethodSelectionTest get() {
			return new MethodSelectionTestImplementation();
		}
	}
}

class MethodSelectionTestImplementation implements MethodSelectionTest {
	public String stuff(String p) {
		return "string stuff";
	}

	public String stuff(Object p) {
		return "object stuff";
	}
}
