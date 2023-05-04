import java.util.Scanner;

public class Program1 {
    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите дробное число: ");

            if (scanner.hasNextFloat()) {
                float input = scanner.nextFloat();
                return input;
            } else {
                System.out.println("Ошибка: введенное значение не является дробным числом. Пожалуйста, попробуйте еще раз.");
                scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {



        float input = getFloatInput();
        System.out.println("Вы ввели дробное число: " + input);
    }
}
