package Collection;
import java.util.*;
class Product {
    String addProduct;
    String removeProduct;
    String setProduct;

    public void productAdd(String addProduct) {
        this.addProduct = addProduct;
    }

    public void productRemove(String removeProduct) {
        this.removeProduct = removeProduct;
    }

    public void productSet(String setProduct) {
        this.setProduct = setProduct;
    }
}

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Product sc = new Product();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Set Product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product Name: ");
                    String addProduct = scanner.nextLine();
                    list.add(addProduct);
                    System.out.println("Products: " + list);
                    sc.productAdd(addProduct);
                    break;
                case 2:
                    System.out.print("Remove Product: ");
                    String removeProduct = scanner.nextLine();
                    list.remove(removeProduct);+66+
                    
                    System.out.println("Products: "+ list);
                    sc.productRemove(removeProduct);
                    break;
                case 3:
                    System.out.print("Set Product: ");
                    System.out.println("Enter product name which you want to update");
                    String setProduct = scanner.nextLine();
                    System.out.println("Enter index number : ");
                    int index = scanner.nextInt();
                    list.set(index, setProduct);
                    System.out.println("Pruduct: "+ list);
                    sc.productSet(setProduct);
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice, Please choose 1, 2, 3, 4.");
            }
        } while (choice != 4);
    }
}
