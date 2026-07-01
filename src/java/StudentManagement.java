import java.util.Scanner;
class StudentManagement {
    
    public static void main ( String []args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int Id = 0;
        String Name = "";
        double score = 0;
        do {
            System.out.println("=====Welcome to Student Management System=====");
            System.out.println("1.add Student ");
            System.out.println("2.view Student ");
            System.out.println("3.Check Student ");
            System.out.println("4.Delete Student");
            System.out.println("5.Exit");
            
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("\n Add student");
                //input Name
                System.out.println("Enter Student Name: ");
                Name = sc.nextLine();
                //input id
                System.out.println("Enter Student Id");
                Id = sc.nextInt();
                //input Score
                System.out.println("Enter Student Score");
                score = sc.nextDouble();
                // Show Student information
                System.out.println("\n====Student information====");
                System.out.println("Name :" + Name);
                System.out.println("Student Id :" + Id);
                System.out.println("Student Score :" + score);
                System.out.println("Student add Successfully");
                if (score >= 50) {
                    System.out.println("Student Cus university get pass ");
                } else {
                    System.out.println("Student Cus university Failed");
                }
            }
            //option 2
            else if (choice == 2) {
                System.out.println("\n====System check Grade==== ");
                System.out.println("Enter score");
                score = sc.nextDouble();
                //Grade system
            } else if (score >= 90) {
                System.out.println("Grade A");
                
            } else if (score >= 80) {
                System.out.println("Grade B");
            } else if (score >= 70) {
                System.out.println("Grade C");
            } else if (score >= 60) {
                System.out.println("Grade D");
            } else if (score >= 50) {
                System.out.println("Grade E");
            } else {
                System.out.println("Grade F");
            }
        //option 3
        if (choice == 3) {
            System.out.println("\n thank you for using System Cus student");
            
        }
        // wrong input
        else {
            System.out.println("\n invalid choice");
        }
        
    }while (choice != 5);;
        sc.close();
    }
}

