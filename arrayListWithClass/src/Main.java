import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        Customer batikan = new Customer(1,"Batıkan Uğur","Tizer");
        customers.add(batikan);
        customers.add(new Customer(2,"Ayşegül","Tizer"));
        customers.add(new Customer(3,"Özlem","Tizer"));

        //customers.remove(new Customer(1,"Batıkan Uğur","Tizer"));
        //Silmez new ile yenisini ekledi
        customers.remove(batikan);
        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }

    }
}
