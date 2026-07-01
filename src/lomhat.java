import java.util.Scanner;

public class lomhat {
    public static void main(String[]args){
       System.out.println("==============Enter your score================ :");
        int score=new Scanner(System.in).nextInt();
        if(score>100){
            System.out.println("your grade is greater than 100 ");
        }
        if(score>=90&&score<=100 ){
            System.out.println("your grade is A \n" );
        }
          else if(score>80){
            System.out.println("your grade is B\n");
        }
         else if(score>70){
            System.out.println("your grade is C\n");
        }
         else  if(score>60){
            System.out.println("your grade is D\n");
        }
        else if(score>50){
            System.out.println("your grade is f\n");
             }
        else{
            System.out.println("your grand is not variable \n");
        }


       /*int weather = 0;  //1 = raining, 2 = sunny, 3 = cloudy;

        if (weather == 1) {
            System.out.println("Bring an umbrella.");
        } else if (weather == 2) {
            System.out.println("Wear sunglasses.");
        } else  if (weather == 3) {
            System.out.println("Just go outside normally.");
        } else {
            System.out.println("it's raining");
        }*/

      //  score 1to 100
        // ot lers 100 and ot krorm 0
         //   ber ke pjol 1 to 100
        //pel ke vei khos score jg oy jenh Enter your score rhot





    }

}

