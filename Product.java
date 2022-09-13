import java.util.Scanner;

public class Product {
    public String ID, name, year, make;

    public void nhap(Scanner input){
        System.out.print("Ma SP: ");
        this.ID = input.nextLine();
        System.out.print("Ten SP: ");
        this.name = input.nextLine();
        System.out.print("Nam phat hanh: ");
        this.year = input.nextLine();
        System.out.print("Ten hang: ");
        this.make = input.nextLine();
    }
}