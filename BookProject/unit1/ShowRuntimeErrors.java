package unit1;

public class ShowRuntimeErrors {
	public static void main(String[] args) {
		System.out.println(1/0);
	}
}

//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at unit1.ShowRuntimeErrors.main(ShowRuntimeErrors.java:5)
