interface Product {
    void displayDetails();  // Method to display product details
    double calculateTotalSales(double[] sales);  // Method to calculate total sales
}
class Hardware implements Product {
    private String category;
    private String manufacturer;

    public Hardware(String category, String manufacturer) {
        this.category = category;
        this.manufacturer = manufacturer;
    }
    public void displayDetails() {
        System.out.println("Hardware Item:");
        System.out.println("Category: " + category);
        System.out.println("Manufacturer: " + manufacturer);
    }
    public double calculateTotalSales(double[] sales) {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}
class Software implements Product {
    private String type;
    private String operatingSystem;

    public Software(String type, String operatingSystem) {
        this.type = type;
        this.operatingSystem = operatingSystem;
    }
    public void displayDetails() {
        System.out.println("Software Item:");
        System.out.println("Type: " + type);
        System.out.println("Operating System: " + operatingSystem);
    }
    public double calculateTotalSales(double[] sales) {
        double totalSales = 0;
        for (double sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }
}
public class CompanyySales {
    public static void main(String[] args) {
        
        Hardware hardwareItem = new Hardware("Laptop", "Dell");
        Software softwareItem = new Software("Antivirus", "Windows 10");
        double[] hardwareSales = {15000.50, 17000.75, 16500.30};
        double[] softwareSales = {5000.99, 6000.85, 4500.50};

        hardwareItem.displayDetails();
        double totalHardwareSales = hardwareItem.calculateTotalSales(hardwareSales);
        System.out.println("Total Hardware Sales for the last 3 months: $" + totalHardwareSales);
        System.out.println();
        softwareItem.displayDetails();
        double totalSoftwareSales = softwareItem.calculateTotalSales(softwareSales);
        System.out.println("Total Software Sales for the last 3 months: $" + totalSoftwareSales);
    }
}
