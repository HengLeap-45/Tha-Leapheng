import java.util.Scanner;

public class note {
    public static void main (String[] args) {
        Scanner ac = new Scanner (System.in);
         int id;
         String name;
         int age;
        double score;
        
        System.out.println ("Student id : ");
        id = ac.nextInt ();
        System.out.println ("Student name :");
        name = ac.next ();
        System.out.println ("Student age : ");
        age = ac.nextInt ();
        System.out.println ("Student score : ");
        score = ac.nextDouble ();
        System.out.println ("Total score ");
        if(score >= 90) {
            System.out.println ("Student score is very good");
        } else if(score >= 80) {
            System.out.println ("Student score is good");
        } else if(score >= 70) {
            System.out.println ("Student score  is better");
        } else if(score >= 60) {
            System.out.println ("Student score is not bad ");
        } else if(score >= 50) {
            System.out.println ("Student score is bad");
        } else if(score >= 40) {
            System.out.println ("Student score is very bad");
        }

    }

    static class student {
        int id;
        String name;
        int age;
        double score;

        void Student (int id, String name, int age, double score) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.score = score;

        }

        void display () {
            System.out.println ("id : " + this.id + "| name : " + this.id + "|age " + this.age + " |score " + this.score);

        }

        String grade () {
            if(this.score >= (double) 90.0f) {
                return "A";
            } else if(this.score >= (double) 80.0f) {
                return "B";
            } else if(this.score >= (double) 70.0f) {
                return "C";
            } else if(this.score >= (double) 60.0f) {
                return "D";
            } else if(this.score >= (double) 50.0f) {
                return "E";

            } else if(this.score >= (double) 40.0f) {
                return "F";
            }
            return "";
        }
    }
}
