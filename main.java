import java.util.*;

public class main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        HashMap<String, Product> dienThoai = new HashMap<String, Product>();

        do {
            Product phone = new Product();
            System.out.println("Nhap SP");
            phone.nhap(input);
            dienThoai.put(phone.ID, phone);
            System.out.print("Press 1 to continue or 0 to exit: ");
            n = input.nextInt();
            input.nextLine();
        } while (n == 1);


        Set<String> key = new HashSet<String>();
        key = dienThoai.keySet();
        for (String ma_sp: key) {
            System.out.println(ma_sp + " - " + dienThoai.get(ma_sp).name + " - " + dienThoai.get(ma_sp).year + " - " + dienThoai.get(ma_sp).make + " - " + dienThoai.get(ma_sp).price);
        }


        int switchValue;
        boolean exit=false;
        Menu.showMenu();

      while(true){
          switchValue= input.nextInt();

          switch (switchValue){

              case 1:
                  Scanner sc = new Scanner(System.in);
                  System.out.print("Nhap ma SP: ");
                  String ma_sp=sc.nextLine();
                  if(dienThoai.containsKey(ma_sp) == false){
                      System.out.println("Khong ton tai sp co ma so vua nhap");
                  } else {
                      System.out.println("Chon thong tin muon cap nhat:");
                      System.out.println("1. Name");
                      System.out.println("2. Nam phat hanh");
                      System.out.println("3. Hang phat hanh");
                      System.out.println("4. Gia san pham");
                      int check = input.nextInt();
                      switch (check){
                          case 1:
                              Scanner myID = new Scanner(System.in);
                              System.out.print("Nhap ten san pham: ");
                              dienThoai.get(ma_sp).ID = myID.nextLine();
                              System.out.println("Updated");
                              break;
                          case 2:
                              Scanner myYear = new Scanner(System.in);
                              System.out.print("Nhap nam phat hanh: ");
                              dienThoai.get(ma_sp).year = myYear.nextLine();
                              System.out.println("Updated");
                              break;
                          case 3:
                              Scanner myMake = new Scanner(System.in);
                              System.out.println("Nhap nha phat hanh: ");
                              dienThoai.get(ma_sp).make = myMake.nextLine();
                              System.out.println("Updated");
                              break;
                          case 4:
                              Scanner myPrice = new Scanner(System.in);
                              System.out.println("Nhap gia san pham: ");
                              dienThoai.get(ma_sp).price = myPrice.nextLine();
                              System.out.println("Updated");
                              break;
                          default:
                              System.out.println("Error");
                              break;
                      }

                      System.out.print("Nhap ma sp muon xoa: ");
                      ma_sp = input.nextLine();
                      if (dienThoai.containsKey(ma_sp) == false){
                          System.out.println("Khong ton tai sp muon xoa");
                      } else {
                          dienThoai.remove(ma_sp);
                          System.out.println("Da xoa");
                      }
                  }
                  break;
              case 2:
                  System.out.println(" We've not finished yet");
                  break;
              case 3:
                  System.out.println(" I'll do it later");
                  break;
              case 4:
                  break;
              case 5:
                  System.out.println(" Exit.");
                  exit=true;
                  break;

          }
          if (exit){
              break;
          }
          Menu.showMenu();
      }

    }
}
