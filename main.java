import java.util.*;

public class main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        HashMap<String, Product> hashMap = new HashMap<String, Product>();
// nhập sản phẩm
        do {
            Product phone = new Product();
            System.out.println("Nhap SP");
            phone.nhap(input);
            hashMap.put(phone.ID, phone);
            System.out.print("Press 1 to continue or 0 to exit: ");
            n = input.nextInt();
            input.nextLine();
        } while (n == 1);

// hiển thị sản phẩm
        Set<String> key = new HashSet<String>();
        key = hashMap.keySet();
        for (String maSP: key) {
            System.out.println(maSP + " - " + hashMap.get(maSP).name + " - " + hashMap.get(maSP).year + " - " + hashMap.get(maSP).make);
        }


       int switchValue;
        boolean exit=false;
        Menu.showMenu();

      while(true){
          switchValue= input.nextInt();

          switch (switchValue){
              case 0:// cập nhật sản phẩm
                  System.out.print("Nhap ma SP: ");
                  String ma_sp = input.nextLine();
                  if(hashMap.containsKey(ma_sp) == false){
                      System.out.println("Khong ton tai sp co ma so vua nhap");
                  } else {
                      System.out.println("Chon thong tin muon cap nhat:");
                      System.out.println("1. Name");
                      System.out.println("2. Nam phat hanh");
                      System.out.println("3. Hang phat hanh");
                      int check = input.nextInt();
                      switch (check){
                          case 1:
                              System.out.print("Nhap ID: ");
                              hashMap.get(ma_sp).ID = input.nextLine();
                              System.out.println("Updated");
                              break;
                          case 2:
                              System.out.print("Nhap nam phat hanh: ");
                              hashMap.get(ma_sp).year = input.nextLine();
                              System.out.println("Updated");
                              break;
                          case 3:
                              System.out.println("Nhap nha phat hanh: ");
                              hashMap.get(ma_sp).make = input.nextLine();
                              System.out.println("Updated");
                              break;
                          default:
                              System.out.println("Error");
                              break;
                      }
//            xóa sản phẩm
                      System.out.print("Nhap ma sp muon xoa: ");
                      ma_sp = input.nextLine();
                      if (hashMap.containsKey(ma_sp) == false){
                          System.out.println("Khong ton tai sp muon xoa");
                      } else {
                          hashMap.remove(ma_sp);
                          System.out.println("Da xoa");
                      }
                  }break;

              case 1:
                  System.out.println(" We've not finished yet");
                  break;
              case 2:
                  System.out.println(" I'll do it later");
                  break;
              case 3:
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
