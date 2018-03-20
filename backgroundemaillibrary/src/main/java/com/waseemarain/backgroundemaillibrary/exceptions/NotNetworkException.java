package com.waseemarain.backgroundemaillibrary.exceptions;

/**
 * Created by Waseem Arain on 3/20/18.
 */
public class NotNetworkException extends RuntimeException {


    public NotNetworkException() {
        super("NotNetworkException, you need internet connection to send the email");
    }

    public NotNetworkException(String detailMessage) {
        super(detailMessage);
    }
}
