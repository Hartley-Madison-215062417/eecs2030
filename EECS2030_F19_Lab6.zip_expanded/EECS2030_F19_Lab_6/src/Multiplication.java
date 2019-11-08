public class Multiplication extends Expression {
	
	Multiplication(int left, int right){
		super(left, right);
	}
	
	public int evaluate() {
		value = left * right;
	}
	
	
	
}