/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author Cristian
 */
public class NotFoundKeyException extends Exception {

    /**
     * Creates a new instance of <code>NotFoundKeyException</code> without
     * detail message.
     */
    public NotFoundKeyException() {
    }

    /**
     * Constructs an instance of <code>NotFoundKeyException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotFoundKeyException(String msg) {
        super(msg);
    }
}
