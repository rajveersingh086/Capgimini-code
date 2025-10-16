
package capgimini;
import java.util.*;
public class tyres {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of dealerships
        int n = sc.nextInt();

        // Loop through each dealership
        for (int i = 0; i < n; i++) {
            int cars = sc.nextInt();
            int bikes = sc.nextInt();

            int totalTyres = (cars * 4) + (bikes * 2);
            System.out.println(totalTyres);
        }
    }
}