import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input;
        
        System.out.println("Welcome to the Metric Converter!");
        System.out.println("Please input your query. For example, '1 km = miles'.");
        System.out.println("Enter 'exit' or '-1' to exit the program.");

        while (true) {
            System.out.print("Enter conversion: ");
            input = scanner.nextLine();

            if (input.equals("exit") || input.equals("-1")) {
                break;
            }
            
            
            if (input.contains("km") && input.contains("miles")) {
                System.out.println("1 km = 0.621371 miles");
            } else if (input.contains("kg") && input.contains("lb")) {
                System.out.println("1 kg = 2.20462 lb");
            } else if (input.contains("g") && input.contains("ounces")) {
                System.out.println("1 g = 0.035274 ounces");
            } else if (input.contains("mm") && input.contains("inches")) {
                System.out.println("1 mm = 0.0393701 inches");
            } else {
                
                System.out.println("Your input cannot be processed, please input another query.");
            }
        }

        System.out.println("Thank you for using the Metric Converter. Goodbye!");
    }
}
