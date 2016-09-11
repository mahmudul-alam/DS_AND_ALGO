package java8;

interface Executable {
	public void execute();
}

interface ExecutableWithParam {
	public void executeWithParam(int a);
}

interface ExecutableWithReturn  {
	public int executeWithReturn();
}

class Runner {

	// method that expects an interface and run the method defined in the
	// interface
	// Caller method of this method has to pass the implementation of this
	// method as an
	// anonymous class
	public void run(Executable executable) {
		executable.execute();
	}

	public void run(ExecutableWithParam executableWithParam) {
		executableWithParam.executeWithParam(7);
	}
	
	public void run(ExecutableWithReturn executableWithReturn) {
		executableWithReturn.executeWithReturn();
	}
}

public class Lamdas {
	public static void main(String args[]) {

		// this is before Lamda expression
		new Runner().run(new Executable() {
			@Override
			public void execute() {
				System.out.println("Executing code block in old style");
			}
		});

		// this is lamda expression
		System.out.println("================================");

		Runner runner = new Runner();
		runner.run(() -> System.out.println("Executing code block in Lamda style"));

		runner.run(a -> {
			System.out.println("Executing code block in Lamda style and passing param");
			System.out.println("And the param value is " + a);
		});

	}
}
