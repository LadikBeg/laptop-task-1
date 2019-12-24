package a.level.Laptop;

import java.util.Scanner;

public class RunnerClass {
    public static void main(String[] args) {
        BuyerClass laptop1 = new BuyerClass("Asus ROG Strix Scar II", 2150.77, 17.3, "Intel Core i7-8750H", 6, 16, 256, 1000);
        BuyerClass laptop2 = new BuyerClass("Apple MacBook Air 13", 1505.52, 13.3, "Intel Core i5", 2, 8, 128, 0);
        BuyerClass laptop3 = new BuyerClass("Asus ProArt StudioBook Pro X", 6237.31, 17.00, "Intel Core i7-9750H", 6, 32, 512, 0);
        BuyerClass laptop4 = new BuyerClass("Acer Predator Triton 700", 2709.98, 15.6, "Intel Core i7-7700HQ", 4, 16, 512, 0);


        ManufacturerClass notebook1 = new ManufacturerClass("Asus ROG Strix Scar II", "IPS", "Plastic", "English/Russian", 2.2, 4.1, "802.11ac", 26.2, 36.1, 2.61, 2.4);
        ManufacturerClass notebook2 = new ManufacturerClass("Apple MacBook Air 13", "Retina", "Aluminum", "English/Russian", 1.6, 3.6, "802.11ac", 21.24, 30.41, 1.56, 1.25);
        ManufacturerClass notebook3 = new ManufacturerClass("Asus ProArt StudioBook Pro X", "IPS", "Metal", "English/Russian", 2.6, 4.5, "802.11ac", 26.5, 38.2, 2.82, 2.5);
        ManufacturerClass notebook4 = new ManufacturerClass("Acer Predator Triton 700", "IPS", "Metal", "English/Russian", 2.8, 3.8, "802.11ac", 26.6, 39.3, 1.89, 2.45);


        Scanner scan = new Scanner(System.in);
        String b = "buyer";
        String b1 = "Buyer";
        String m = "manufacturer";
        String m1 = "Manufacturer";


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

        } else if (BuyerOrManuf.equals(m) || BuyerOrManuf.equals(m1)) {
            System.out.println("Which laptop do you want to see?  ");
            System.out.println("1. " + laptop1.getLaptopName() + " | " + laptop1.getPrice() + " USD");
            System.out.println("2. " + laptop2.getLaptopName() + " | " + laptop2.getPrice() + " USD");
            System.out.println("3. " + laptop3.getLaptopName() + " | " + laptop3.getPrice() + " USD");
            System.out.println("4. " + laptop4.getLaptopName() + " | " + laptop4.getPrice() + " USD");
            System.out.print("Which laptop - ");
            int NumberNotebook = scan.nextInt();
            if (NumberNotebook == 1) {
                System.out.println("Laptop name: " + notebook1.getLaptopName());
                System.out.println("Display type: " + notebook1.getDisplayType());
                System.out.println("Body material: " + notebook1.getBodyMaterial());
                System.out.println("Keyboard language: " + notebook1.getKeyboardLanguage());
                System.out.println("CPU base frequency: " + notebook1.getCPUBaseFrequency());
                System.out.println("CPU maximum frequency: " + notebook1.getCPUMaximumFrequency());
                System.out.println("Wi-Fi: " + notebook1.getWiFi());
                System.out.println("Length: " + notebook1.getLength());
                System.out.println("Width : " + notebook1.getWidth());
                System.out.println("Thickness: " + notebook1.getThickness());
                System.out.println("Weight: " + notebook1.getWeight());

            } else if (NumberNotebook == 2) {
                System.out.println("Laptop name: " + notebook2.getLaptopName());
                System.out.println("Display type: " + notebook2.getDisplayType());
                System.out.println("Body material: " + notebook2.getBodyMaterial());
                System.out.println("Keyboard language: " + notebook2.getKeyboardLanguage());
                System.out.println("CPU base frequency: " + notebook2.getCPUBaseFrequency());
                System.out.println("CPU maximum frequency: " + notebook2.getCPUMaximumFrequency());
                System.out.println("Wi-Fi: " + notebook2.getWiFi());
                System.out.println("Length: " + notebook2.getLength());
                System.out.println("Width : " + notebook2.getWidth());
                System.out.println("Thickness: " + notebook2.getThickness());
                System.out.println("Weight: " + notebook2.getWeight());

            }
            else if (NumberNotebook == 3){
                System.out.println("Laptop name: " + notebook3.getLaptopName());
                System.out.println("Display type: " + notebook3.getDisplayType());
                System.out.println("Body material: " + notebook3.getBodyMaterial());
                System.out.println("Keyboard language: " + notebook3.getKeyboardLanguage());
                System.out.println("CPU base frequency: " + notebook3.getCPUBaseFrequency());
                System.out.println("CPU maximum frequency: " + notebook3.getCPUMaximumFrequency());
                System.out.println("Wi-Fi: " + notebook3.getWiFi());
                System.out.println("Length: " + notebook3.getLength());
                System.out.println("Width : " + notebook3.getWidth());
                System.out.println("Thickness: " + notebook3.getThickness());
                System.out.println("Weight: " + notebook3.getWeight());
            }
            else if (NumberNotebook == 4){
                System.out.println("Laptop name: " + notebook4.getLaptopName());
                System.out.println("Display type: " + notebook4.getDisplayType());
                System.out.println("Body material: " + notebook4.getBodyMaterial());
                System.out.println("Keyboard language: " + notebook4.getKeyboardLanguage());
                System.out.println("CPU base frequency: " + notebook4.getCPUBaseFrequency());
                System.out.println("CPU maximum frequency: " + notebook4.getCPUMaximumFrequency());
                System.out.println("Wi-Fi: " + notebook4.getWiFi());
                System.out.println("Length: " + notebook4.getLength());
                System.out.println("Width : " + notebook4.getWidth());
                System.out.println("Thickness: " + notebook4.getThickness());
                System.out.println("Weight: " + notebook4.getWeight());
            }
        }


    }
}
