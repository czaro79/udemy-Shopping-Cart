import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Cart;
import models.Item;
import models.Store;

public class Main {
    static Store store = new Store();
    static Cart cart = new Cart();

    public static void main(String[] args) {

        try {
            loadItems("products.txt");
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {

            System.out.println("\n\t******************************JAVA GROCERS******************************\n");

            System.out.println(store);

        }

    }

    /**
     * Name: manageItems Inside the function: • 1. Starts a new instance of Scanner;
     * • 2. Creates an infinite loop: • The user can choose to a) add or b) remove
     * c) checkout. • case a: asks for the aisle and item number. Then, adds item to
     * cart. • case b: asks for the name. Then, removes item from cart. • case c:
     * prints the receipt and closes Scanner. • Prints the updated shopping cart.
     */

    /**
     * Name: loadItems
     * 
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     *                               Inside the function: 1. loads items from
     *                               <fileName>.txt. • while loop runs through every
     *                               line in <fileName> • scan.nextLine() picks up
     *                               the entire line. • splits each String using the
     *                               ";" separator. • splits both fields in each
     *                               String using the "=" separator. • Parse each
     *                               price into a Double. 2. adds all items to the
     *                               store object's items field.
     */
    public static void loadItems(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scan = new Scanner(fis);

        for (int i = 0; scan.hasNextLine(); i++) {
            String[] productsStrings = scan.nextLine().split(";");

            for (int j = 0; j < productsStrings.length; j++) {
                String[] fields = productsStrings[j].split("=");
                store.setItem(i, j, new Item(fields[0], Double.parseDouble(fields[1])));
            }

        }
        scan.close();
    }
}
