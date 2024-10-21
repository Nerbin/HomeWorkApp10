import java.util.Random;
import java.util.Scanner;

public class WorkHomeApp10 {

    public static void printSquare(int number) {
        int square = number * number;
        System.out.println("Квадрат числа " + number + " дорівнює " + square + ".");
    }

    public static double calculateCylinderVolume(double radius, double height) {
        double volume = Math.PI * radius * radius * height;
        return volume;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static void printTextNTimes(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        printSquare(number);

        System.out.print("\nВведіть радіус циліндра: ");
        double radius = scanner.nextDouble();
        System.out.print("Введіть висоту циліндра: ");
        double height = scanner.nextDouble();
        double volume = calculateCylinderVolume(radius, height);
        System.out.printf("Об'єм циліндра з радіусом %.2f і висотою %.2f дорівнює %.2f.%n", radius, height, volume);

        System.out.print("\nВведіть розмір масиву: ");
        int arraySize = scanner.nextInt();
        System.out.print("Введіть мінімальне значення для випадкових чисел: ");
        int minValue = scanner.nextInt();
        System.out.print("Введіть максимальне значення для випадкових чисел: ");
        int maxValue = scanner.nextInt();
        int[] array = generateRandomArray(arraySize, minValue, maxValue);
        int sum = sumArray(array);
        System.out.print("Масив чисел: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("Сума всіх елементів масиву дорівнює " + sum + ".");

        scanner.nextLine();
        System.out.print("\nВведіть рядок: ");
        String text = scanner.nextLine();
        String reversedText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversedText += text.charAt(i);
        }
        System.out.println("Рядок в зворотньому порядку: " + reversedText);

        System.out.print("\nВведіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        int result = power(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + result + ".");

        System.out.print("\nВведіть ціле число n: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть текстовий рядок: ");
        String textToPrint = scanner.nextLine();
        printTextNTimes(n, textToPrint);

        scanner.close();
    }
}
