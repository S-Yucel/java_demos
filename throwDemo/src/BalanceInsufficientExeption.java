public class BalanceInsufficientExeption extends Exception {
    String message;
    public BalanceInsufficientExeption(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
}
