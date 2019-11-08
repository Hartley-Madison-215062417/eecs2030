public class GreaterThan extends Expression {
	
	GreaterThan(int left, int right) {
		super(left, right);
	}
	
	public int evaluate() {
		value = left > right;
	}
	
}