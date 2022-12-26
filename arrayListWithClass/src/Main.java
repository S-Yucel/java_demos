import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();

        Customer lucy = new Customer(3,"Lucy","Do",29);
        customers.add(lucy);

        customers.add(new Customer(1,"John","Dekker",25));
        customers.add(new Customer(2,"Jayne","Dekker",22));

        for (Customer customer:customers
             ) {
            System.out.println(customer.firstName);
        }
    }
}
