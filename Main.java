import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        FourOperation FourOperation = new FourOperation();

        //gets first number from the user
        System.out.print("First Number: ");
        int number1 = reader.nextInt();

        //gets second number from the user
        System.out.print("Second Number: ");
        int number2 = reader.nextInt();

        //Which operation does user want to do?
        System.out.println("Choose one operation: Write For Addition 'A' ," +
                "For Substraction 'S', " +
                "For Divide 'D', " +
                "For Multiplication 'M'");
        char operation = reader.next().charAt(0);


        switch (operation) {

            //Addition
            case 'A':
                System.out.println(FourOperation.Addition(number1, number2));
                break;

            //Subtraction
            case 'S':
                System.out.println(FourOperation.Subtraction(number1, number2));
                break;

            //Division
            case 'D':
                System.out.println(FourOperation.Division(number1, number2));
                break;

            //Multiplication
            case 'M':
                System.out.println(FourOperation.Multiplication(number1, number2));
                break;
        }

    }

}

