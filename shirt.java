import java.util.Scanner;
public class Shirt {
    private String collarSize;
    private String sleeveLength;
    public static String material = "cotton";

    public Shirt(String collarSize, String sleeveLength) {
        this.collarSize = collarSize;
        this.sleeveLength = sleeveLength;
    }

    public String getCollarSize() {
        return collarSize;
    }

    public String getSleeveLength() {
        return sleeveLength;
    }
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Collar Size: ");
        String collarSize = scanner.nextLine();

        System.out.print("Enter Sleeve Length: ");
        String sleeveLength = scanner.nextLine();

        Shirt shirt = new Shirt(collarSize, sleeveLength);

        System.out.println("Collar Size: " + shirt.getCollarSize());
        System.out.println("Sleeve Length: " + shirt.getSleeveLength());
        System.out.println("Material: " + Shirt.material);
    }
}