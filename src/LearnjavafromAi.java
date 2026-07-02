import java.util.Scanner;

public class LearnjavafromAi {
    public static void main(String[] args) {
        // that's all of java important please to keep try and testing code find
        // solution and understood
    }

    // OOP: Class
    static class Student {
        int id;
        String name;
        int age;
        double score;

        // Constructor
        Student(int id, String name, int age, double score) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.score = score;
        }

        // Method
        void display() {
            System.out.println("ID: " + id + " | Name: " + name +
                    " | Age: " + age + " | Score: " + score);
        }

        // Method with return
        String grade() {
            if (score >= 90)
                return "A";
            else if (score >= 75)
                return "B";
            else if (score >= 50)
                return "C";
            else
                return "F";
        }
    }

    public class Main {

        static Student[] students = new Student[100]; // Array
        static int count = 0;

        // Method: Add student
        static void addStudent(Scanner sc) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Score: ");
            double score = sc.nextDouble();
            sc.nextLine();

            students[count] = new Student(id, name, age, score);
            count++;

            System.out.println(" Student added!");
        }

        // Method: Show all students
        static void showStudents() {
            if (count == 0) {
                System.out.println("No students.");
            } else {
                for (int i = 0; i < count; i++) {
                    students[i].display();
                    System.out.println("Grade: " + students[i].grade());
                }
            }
        }

        // Method: Search student
        static void searchStudent(Scanner sc) {
            System.out.print("Enter ID to search: ");
            int id = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < count; i++) {
                if (students[i].id == id) {
                    students[i].display();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        }

        // Method: Delete student
        static void deleteStudent(Scanner sc) {
            System.out.print("Enter ID to delete: ");
            int id = sc.nextInt();

            boolean found = false;

            for (int i = 0; i < count; i++) {
                if (students[i].id == id) {

                    // Shift array
                    for (int j = i; j < count - 1; j++) {
                        students[j] = students[j + 1];
                    }

                    count--;
                    found = true;
                    System.out.println("🗑 Student deleted.");
                    break;
                }
            }

            if (!found) {
                System.out.println("Student not found.");
            }
        }

        // Method: Calculate average
        static void averageScore() {
            if (count == 0) {
                System.out.println("No data.");
                return;
            }

            double sum = 0;

            for (int i = 0; i < count; i++) {
                sum += students[i].score;
            }

            double avg = sum / count;
            System.out.println("Average score: " + avg);
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int choice;

            do {
                // Menu
                System.out.println("\n==== MENU ====");
                System.out.println("1. Add Student");
                System.out.println("2. Show Students");
                System.out.println("3. Search Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Average Score");
                System.out.println("6. Exit");
                System.out.print("Choose: ");

                choice = sc.nextInt();

                // Condition
                switch (choice) {
                    case 1:
                        addStudent(sc);
                        break;
                    case 2:
                        showStudents();
                        break;
                    case 3:
                        searchStudent(sc);
                        break;
                    case 4:
                        deleteStudent(sc);
                        break;
                    case 5:
                        averageScore();
                        break;
                    case 6:
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }

            } while (choice != 6); // Loop

        }
    }
}
