package com.landon.chess.exceptions;

public class IllegalMovementException extends Exception {
    private static final long serialVersionUID = 1L;
    // TODO: implement appropriate exceptions

    private String msg = null;

    public IllegalMovementException() {
        super();
    }

    public IllegalMovementException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public IllegalMovementException(Throwable cause) {
        super(cause);
    }

    public IllegalMovementException(String msg, Throwable cause) {
        super(msg, cause);
        this.msg = msg;
    }

    @Override
    public String toString() {
        return msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}
