package day37exceptionsEnums;

public class IllegalAgeException extends RuntimeException {

    public IllegalAgeException(){
        super();
    }
    public IllegalAgeException(String message){
        super(message);
    }
}
