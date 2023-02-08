/**
 * CafeUtil
 */
import java.util.ArrayList;
public class CafeUtil {

    int getStreakGoal(){
        int weeks = 10;
        int sum = 0;
        for(int i = 1; i <= weeks; i++){
            sum += i;
        }
        return sum;
    }

    int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    double getOrderTotal(double[] prices){
        double total = 0;
        for( int i = 0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }

    void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i ++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if ( menuItems.size() != prices.size() ){
            return false;
        }
        for(int i = 0; i < menuItems.size(); i ++){
            System.out.println(i + " " + menuItems.get(i) + " -- $" + prices.get(i));
        }
        return true;
    }

    void addCustomer(ArrayList<String> customers){
        System.out.println("Por favor, ingresa tu nombre:");
        String userName = System.console().readLine();
        System.out.println( "¡Hola, "+ userName +"!");
        System.out.println("Hay " + customers.size() + " personas frente a ti");
        customers.add(userName);
    }

    void printPriceChart(String product, double price, int maxQuantity){
        System.out.println(product);
        for(int i = 1; i <= maxQuantity; i++){
            System.out.format("%d - $ %,.0f \n",i, price * i - (i - 1 )* 400);
        }
    };
}
