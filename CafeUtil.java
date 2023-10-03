import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal(){
        int drinks = 0;
        for(int i = 0; i <= 10; i++){
            drinks += i;
        }
        return drinks;
    }
    // Overloading the method
    public int getStreakGoal(int numWeeks){
        int drinks = 0;
        for(int i = 0; i <= numWeeks; i++){
            drinks += i;
        }
        return drinks;
    }

    public double getOrderTotal(double[] prices){
        double totalPrice = 0.00;
        for(int i = 0; i < prices.length; i++){
            totalPrice += prices[i];
        }
        return totalPrice;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name.");
        String username = System.console().readLine();
        String helloUser = String.format("Hello %s!", username);
        System.out.println(helloUser);
        int numOfCustomers = customers.size();
        System.out.println("There are " + numOfCustomers + " people in front of you.");
        customers.add(username);
        for(int i = 0; i < customers.size(); i++){
            System.out.println(customers.get(i));
        }
    }

}
