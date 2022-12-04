package by.it.academy.hometask.connectionpool.connectionpool;



public class ConnectionPollException extends Exception{
    private static final long serialVersionUID = 1L;

    public ConnectionPollException(String message, Exception e) {
        super(message, e);
    }
}
