import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User();

        while (true) {
            try {
                System.out.println("Enter your name: ");
                String name = scanner.nextLine();
                user.setName(name);

                System.out.println("Enter your age: ");
                int age = Integer.parseInt(scanner.nextLine());
                user.setAge(age);


                System.out.println("Name: " + user.getName());
                System.out.println("Age: " + user.getAge());

            } catch
            (IllegalNameLengthException inle) {
                System.out.println("Data entry error: " + inle.getMessage());
            } catch
            (IllegalAgeException iae) {
                System.out.println("Incorrect age:" + iae.getMessage());


            







                    }

            }
        }
    }