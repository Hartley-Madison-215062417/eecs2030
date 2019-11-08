public class LessThan extends Expression {
	
	LessThan(int left, int right) {
		super(left, right);
	}
	
	public int evaluate() {
		value = left < right;
	}
	
}