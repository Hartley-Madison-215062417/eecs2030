public class Subtraction extends Expression {
	
	
	Subtraction(int left, int right){
		super(left, right);
	}
	
	public int evaluate() {
		value = left - right;
	}
	
	
}