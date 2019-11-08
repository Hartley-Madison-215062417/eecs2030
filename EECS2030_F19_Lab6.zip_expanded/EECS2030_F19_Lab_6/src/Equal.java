public class Equal extends Expression {
	
	Equal(int left, int right) {
		super(left, right);
	}
	
	public int evaluate() {
		value = (left == right);
	}
	
}