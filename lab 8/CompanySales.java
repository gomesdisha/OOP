import java.util.Scanner;
interface Product {
    void displayDetails();  // Method to display product details
    double calculateTotalSales(double[] sales);  // Method to calculate total sales
}

// Class for Hardware item
class Hardware implements Product {
    private String category;
    private String manufacturer;

    // Constructor
    public Hardware(String category, String manufacturer) {
        this.category = category;
        this.manufacturer = manufacturer;
    }

    // Implement displayDetails method
    public void displayDetails() {
        System.out.println("Hardware Item:");
        System.out.println("Category: " + category);
        System.out.println("Manufacturer: " + manufacturer);
    }

    // Implement calculateTotalSales method
    public double calculateTotalSales(double[] sales) {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}

// Class for Software item
class Software implements Product {
    private String type;
    private String operatingSystem;

    // Constructor
    public Software(String type, String operatingSystem) {
        this.type = type;
        this.operatingSystem = operatingSystem;
    }

    // Implement displayDetails method
    public void displayDetails() {
        System.out.println("Software Item:");
        System.out.println("Type: " + type);
        System.out.println("Operating System: " + operatingSystem);
    }

    // Implement calculateTotalSales method
    public double calculateTotalSales(double[] sales) {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}

// Main class to demonstrate the functionality with user input
public class CompanySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for hardware details
        System.out.println("Enter Hardware details:");
        System.out.print("Category: ");
        String hardwareCategory = scanner.nextLine();
        System.out.print("Manufacturer: ");
        String hardwareManufacturer = scanner.nextLine();
        Hardware hardwareItem = new Hardware(hardwareCategory, hardwareManufacturer);

        // User input for software details
        System.out.println("\nEnter Software details:");
        System.out.print("Type: ");
        String softwareType = scanner.nextLine();
        System.out.print("Operating System: ");
        String softwareOS = scanner.nextLine();
        Software softwareItem = new Software(softwareType, softwareOS);

        // Input sales for the last 3 months for hardware
        double[] hardwareSales = new double[3];
        System.out.println("\nEnter Hardware sales for the last 3 months:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Month " + (i + 1) + " sales: ");
            hardwareSales[i] = scanner.nextDouble();
        }

        // Input sales for the last 3 months for software
        double[] softwareSales = new double[3];
        System.out.println("\nEnter Software sales for the last 3 months:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Month " + (i + 1) + " sales: ");
            softwareSales[i] = scanner.nextDouble();
        }

        System.out.println();
        hardwareItem.displayDetails();
        double totalHardwareSales = hardwareItem.calculateTotalSales(hardwareSales);
        System.out.println("Total Hardware Sales for the last 3 months: $" + totalHardwareSales);
        System.out.println();
        softwareItem.displayDetails();
        double totalSoftwareSales = softwareItem.calculateTotalSales(softwareSales);
        System.out.println("Total Software Sales for the last 3 months: $" + totalSoftwareSales);
        scanner.close();  // Close the scanner
    }
}
