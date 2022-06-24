package calc;

public class CalcImp implements Calculator {

	@Override
	public int add(int a, int b) {
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mult(int a, int b) {
			return 0;
	}

	@Override
	public int div(int a, int b) {
		if (b == 0) throw new IllegalArgumentException();
		return a/b;
	}

	@Override
	public double fdiv(int a, int b) {
		return 0D;
	}

}
