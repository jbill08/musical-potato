import java.util.Scanner; 

public class UnitConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int mainChoice;

        do {
            System.out.println("===UNIT CONVERTER===");
            System.out.println("1. Temperature converter");
            System.out.println("2. Weight(mass) converter");
            System.out.println("0. exit");
            System.out.println("Choose an option"); 
            mainChoice = scanner.nextInt(); // read user input

            switch (mainChoice) {
                case 1:
                    temperatureConverter(scanner);
                    break;
                case 2:
                    weightConverter(scanner);
                    break;
                case 0:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (mainChoice != 0); // end of do-while loop

        scanner.close(); 
    }

    //--------------------------TEMPERATURE CONVERTER--------------------------//
    private static void temperatureConverter(Scanner scanner) {
        System.out.println("\n--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("0. Back to main menu");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt(); // read user input

        if (choice == 0) return; // go back to main menu

        System.out.print("Enter temperature: ");
        double input = scanner.nextDouble(); // read temperature input
        double result;

        switch (choice) {
            case 1: 
                result = (input * 9/5) + 32; // Celsius to Fahrenheit
                System.out.println("Result: " + result + " °F");
                break;
            case 2:
                result = (input - 32) * 5/9;
                System.out.println("Result: " + result + " °C");
                break;
            case 3:
                result = input + 273.15; // Celsius to Kelvin
                System.out.println("Result: " + result + " K");
                break;
            default:
                System.out.println("Invalid option. Try again.");
        }
        System.out.println(); // print a new line for better readability
    }


    //--------------------------WEIGHT (MASS) CONVERTER--------------------------//
    private static void weightConverter(Scanner scanner) {
        System.out.println("\n--- Weight (Mass) Converter ---");
        System.out.println("1. Kilograms to Pounds");
        System.out.println("2. Pounds to Kilograms");
        System.out.println("3. Grams to Kilograms");
        System.out.println("Back to main menu");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt(); // read user input

        if (choice == 0) return; // go back to main menu

        System.out.print("Enter the weight: ");
        double input = scanner.nextDouble(); // read weight input
        double result;

        // Conversion logic
        switch (choice) {
            case 1: 
                result = input * 2.20462; // Kilograms to Pounds
                System.out.println("Result: " + result + " lbs");
                break;
            case 2: 
                result = input / 2.20462; // Pounds to Kilograms
                System.out.println("Result: " + result + " kg");
                break;
            case 3:
                result = input / 1000; // Grams to Kilograms
                System.out.println("Result: " + result + " kg");
                break;
            default: 
                System.out.println("Invalid option. Try again.");
        }
        System.out.println(); // print a new line for better readability
    }
} 