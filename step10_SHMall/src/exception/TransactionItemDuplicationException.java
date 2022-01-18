package exception;

public class TransactionItemDuplicationException extends Exception{
	
	public TransactionItemDuplicationException() {}
	
	public TransactionItemDuplicationException(String msg) {
		super(msg); 
	}

}
