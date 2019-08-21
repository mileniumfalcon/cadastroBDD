package com.mileniumfalcom.gerenciadorprodutos.Exception;

/**
 *
 * @author Victor
 */
public class DataException extends Exception{
   

    //Construtor de exceções que permite informar uma mensagem  
    public DataException(String message) {
        super(message);
    }

    public DataException(String erro_na_fonte_de_dados, Exception e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
