package exception;

public class TransactionNotFoundException extends Exception{
	public TransactionNotFoundException() {}
	public TransactionNotFoundException(String msg) { 
		super(msg);  //
	}

}
