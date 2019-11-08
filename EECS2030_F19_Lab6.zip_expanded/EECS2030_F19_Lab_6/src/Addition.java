public class Addition extends Expression{


	Addition(int left, int right){
		super(left, right);
	}
	
	public int evaluate() {
		value = left + right;
	}
	

}