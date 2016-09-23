package compilation;

interface IMethodInvocationTest {
	String stuff();
}

public interface MethodInvocationTest extends IMethodInvocationTest {
	class Factory {
		public static MethodInvocationTest get() {
			return new MethodInvocationTestImplementation();
		}
	}
}

class MethodInvocationTestImplementation implements MethodInvocationTest {
	public String stuff() {
		return "stuff";
	}
}
