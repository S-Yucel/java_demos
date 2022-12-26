public class CustomerManager  {
    private final BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Customer added");
        this.logger.log("Log message");
    }


}
