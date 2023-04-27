
public class OddNumberException extends ArithmeticException {
	private int num;
	
	public OddNumberException () {
		super("Odd number input");
	}
	
	public OddNumberException (String mesg, int num) {
		super(mesg);
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	

}
