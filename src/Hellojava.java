import java.util.Scanner;
public class Hellojava {
    public static void main( String[]args){
        System.out.print("Hello world"+"\n");
        String name ="Jonh";
        String surname="ker";
        System.out.println("Hello \t"+name+surname);
        final int Mynum = 20;
        System.out.println("Hello"+name+surname+"="+ Mynum +"year");
        int Myage = 18;
        Myage = 20;
        System.out.println("How old are you \t"+"=\t"+name+ Myage+"year");
        String  h = "good";
        String  B = "work";
        String handB = h + B ;
        System.out.println( handB);
        int x = 1000;
        int j = 500;
        System.out.println( "The sum is "+ (x + j));
        int c = 70;
        float k = 90.4F ;
        double g = 9000.33 ;
        System.out.println("="+(c + k + g));
        System.out.println("---------------Student Data--------------");
        System.out.println("Student Name : ");
        Scanner sc = new Scanner(System.in);                                    
        final int studentage = 18;
        char student ='A';
        double studentscore = 45.5;
        String K = "leaheng";
        System.out.println("Student name is  "+ K +"\n"+student +"\n"+studentscore+"pass\t"+"\n"+studentage+"year");
        boolean javaisfun = true ;
        boolean javaisnotfun= false ;
        if (javaisfun){
            System.out.println("Yes");
        }else if (!javaisnotfun){
            System.out.println("NO");
        }






    }
}
