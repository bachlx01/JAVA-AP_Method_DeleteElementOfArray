import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {
        int myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner input = new Scanner(System.in);
        int choice = 0;
        System.out.println("myArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};");

        while (choice != 2) {
            System.out.println("1. Enter a number between 1 and 9 to delete");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            boolean check = false;

            switch (choice) {
                case 1:
                    System.out.print("Enter number that you want to delete: ");
                    int deleteNumber = input.nextInt();

                    for (int i = 0; i < myArray.length; i++) {
                        if (deleteNumber == myArray[i]) {
                            check = true;
                            break;
                        }
                    }
                    if (check) {
                        delElement(myArray, deleteNumber);
                        for (int element :
                                myArray) {
                            System.out.printf("%-5d", element);
                        }
                    } else {
                        System.out.println("This number is not in myArray");
                    }
                    break;
                case 2:
                    System.exit(0);
            }
            System.out.println();
        }
    }

    // Method delete an element of an array and assign this index by next index.
    public static int[] delElement(int array[], int delElement) {
        int delIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (delElement == array[i]) {
                delIndex = i;
            }
        }

        for (int i = delIndex; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;

        return array;
    }
}
