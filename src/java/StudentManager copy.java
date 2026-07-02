import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------");
    }
}

class StudentManager {
    static ArrayList<Student> students = new ArrayList<>();

    // Helper method to safely read an integer and clear the buffer
    private static int readInt(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                int val = sc.nextInt();
                sc.nextLine(); // consume newline
                return val;
            } else {
                System.out.println("Invalid input! Please enter an integer.\n");
                sc.nextLine(); // clear invalid input
            }
        }
    }

    // Helper method to safely read a double and clear the buffer
    private static double readDouble(Scanner sc, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                double val = sc.nextDouble();
                sc.nextLine(); // consume newline
                return val;
            } else {
                System.out.println("Invalid input! Please enter a valid decimal number.\n");
                sc.nextLine(); // clear invalid input
            }
        }
    }

    // Helper method to safely read a line of text
    private static String readString(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }

    public static void addStudent(Scanner sc) {
        int id = readInt(sc, "Enter ID: ");
        String name = readString(sc, "Enter Name: ");
        double grade = readDouble(sc, "Enter Grade: ");

        students.add(new Student(id, name, grade));
        System.out.println("Student added successfully!\n");
    }

    public static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    public static void searchStudent(Scanner sc) {
        int id = readInt(sc, "Enter ID to search: ");

        boolean found = false;
        for (Student s : students) {
            if (s.id == id) {
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.\n");
        }
    }

    public static void deleteStudent(Scanner sc) {
        int id = readInt(sc, "Enter ID to delete: ");

        Student toRemove = null;

        for (Student s : students) {
            if (s.id == id) {
                toRemove = s;
                break;
            }
        }

        if (toRemove != null) {
            students.remove(toRemove);
            System.out.println("Student deleted.\n");
        } else {
            System.out.println("Student not found.\n");
        }
    }

    public static void menu() {
        System.out.println("===== Student Manager =====");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            menu();
            choice = readInt(sc, "Choose option: ");

            switch (choice) {
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    deleteStudent(sc);
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.\n");
            }

        } while (choice != 5);

        sc.close();
    }
}