package bankApplication;

public class InSufficientFundException extends Exception{

    public InSufficientFundException(){
        System.out.println("Insufficient amount requested");
    }

    public InSufficientFundException(String message){
        System.out.println(message);
    }

}
