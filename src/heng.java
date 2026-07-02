import java.util.Scanner;
public class heng {                        
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================= Enter your number and your name ===================");
        int id;
        String name;
        double price;
        double amount;
        double Total  ;
        System.out.print("Enter your Id = "  );
        id = sc.nextInt();
        System.out.print("Enter your name = ");
        name =sc.next();
        System.out.print("Enter your price = " );
        price = sc.nextDouble();
        System.out.print("Enter your amount = " );
        amount = sc.nextDouble();
        Total = price * amount;
        System.out.println("Your Total is " + Total);
        System.out.println("========= Report product==========");
        System.out.println("id    ========================:  Number");
        System.out.println("name  ========================:  Name");
        System.out.println("price ========================:  Price");
        System.out.println("amount========================:  Amount");
        System.out.println("total ========================:  Total");
        System.out.println("----------------------------------------------");
        System.out.println("-----------------------------------------------");
        System.out.println("id"+"\t"+"name"+"\t"+"price"+"\t"+"amount"+"\t"+"total" );
        System.out.println(id + "\t" + name +"\t" + price + "\t" + amount + "\t"+ Total + "\t" );
        System.out.println("======================FINISH==============");
        // cont java code
        int time = 20 ;
        String Result = ( time < 15)?"Hello world ": " Hello guy";
            System.out.println(Result);





    }
}
