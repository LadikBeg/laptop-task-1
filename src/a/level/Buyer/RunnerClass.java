package a.level.Buyer;

import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) {
        BuyerClass laptop1 = new BuyerClass("Asus ROG Strix Scar II", 2150.77, 17.3, "Intel Core i7-8750H", 6, 16, 256, 1000);
        BuyerClass laptop2 = new BuyerClass("Apple MacBook Air 13", 1505.52, 13.3, "Intel Core i5", 2, 8, 128, 0);
        BuyerClass laptop3 = new BuyerClass("Asus ProArt StudioBook Pro X", 6237.31, 17.00, "Intel Core i7-9750H", 6, 32, 512, 0);
        BuyerClass laptop4 = new BuyerClass("Acer Predator Triton 700", 2709.98, 15.6, "Intel Core i7-7700HQ", 4, 16, 512, 0);


        Scanner scan = new Scanner(System.in);
        String b = "buyer";
        String b1 = "Buyer";


        System.out.println("Program started.");
        System.out.println("What is your name?");
        System.out.print("Enter your name - ");
        String Name = scan.nextLine();
        System.out.println("Welcome , " + Name + " !");
        System.out.println("Are you a buyer or manufacturer, " + Name + " ?");
        System.out.print("Who are you - ");
        String BuyerOrManuf = scan.nextLine();
        if (BuyerOrManuf.equals(b) || BuyerOrManuf.equals(b1)) {
            System.out.println("Which laptop do you want to see?  ");
            System.out.println("1. " + laptop1.getLaptopName() + " | " + laptop1.getPrice() + " USD");
            System.out.println("2. " + laptop2.getLaptopName() + " | " + laptop2.getPrice() + " USD");
            System.out.println("3. " + laptop3.getLaptopName() + " | " + laptop3.getPrice() + " USD");
            System.out.println("4. " + laptop4.getLaptopName() + " | " + laptop4.getPrice() + " USD");
            System.out.print("Which laptop - ");
            int NumberNotebook = scan.nextInt();
            if (NumberNotebook == 1) {
                System.out.println(laptop1.getLaptopName());
                System.out.println("Price: " + laptop1.getPrice() + " USD");
                System.out.println("Screen size: " + laptop1.getScreenSize());
                System.out.println("Processor type: " + laptop1.getProcessorType());
                System.out.println("The number of processor cores: " + laptop1.getTheNumberOfProcessorCores());
                System.out.println("RAM size: " + laptop1.getRAMSize());
                System.out.println("SSD capacity: " + laptop1.getSSDCapacity());
                System.out.println("HDD capacity: " + laptop1.getHDDCapacity());
            } else if (NumberNotebook == 2) {
                System.out.println(laptop2.getLaptopName());
                System.out.println("Price: " + laptop2.getPrice() + " USD");
                System.out.println("Screen size: " + laptop2.getScreenSize());
                System.out.println("Processor type: " + laptop2.getProcessorType());
                System.out.println("The number of processor cores: " + laptop2.getTheNumberOfProcessorCores());
                System.out.println("RAM size: " + laptop2.getRAMSize());
                System.out.println("SSD capacity: " + laptop2.getSSDCapacity());
                System.out.println("HDD capacity: " + laptop2.getHDDCapacity());
            } else if (NumberNotebook == 3) {
                System.out.println(laptop3.getLaptopName());
                System.out.println("Price: " + laptop3.getPrice() + " USD");
                System.out.println("Screen size: " + laptop3.getScreenSize());
                System.out.println("Processor type: " + laptop3.getProcessorType());
                System.out.println("The number of processor cores: " + laptop3.getTheNumberOfProcessorCores());
                System.out.println("RAM size: " + laptop3.getRAMSize());
                System.out.println("SSD capacity: " + laptop3.getSSDCapacity());
                System.out.println("HDD capacity: " + laptop3.getHDDCapacity());
            } else if (NumberNotebook == 4) {
                System.out.println(laptop4.getLaptopName());
                System.out.println("Price: " + laptop4.getPrice() + " USD");
                System.out.println("Screen size: " + laptop4.getScreenSize());
                System.out.println("Processor type: " + laptop4.getProcessorType());
                System.out.println("The number of processor cores: " + laptop4.getTheNumberOfProcessorCores());
                System.out.println("RAM size: " + laptop4.getRAMSize());
                System.out.println("SSD capacity: " + laptop4.getSSDCapacity());
                System.out.println("HDD capacity: " + laptop4.getHDDCapacity());
            }

        }


    }
}
