import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]+",");
        }
        System.out.println();

        //2
        int[] numbers1 = {5, 12, 3, 8, 20, 1, 15};
        int maxElement = numbers1[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers1.length; i++) {
            if (numbers1[i] > maxElement) {
                maxElement = numbers1[i];
                maxIndex = i;
            }
        }

        System.out.println(maxElement);
        System.out.println(maxIndex);

        //3
        int[] numbers3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int evenCount = 0;

        for (int number : numbers3) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("Количество четных элементов: " + evenCount);

        //4
        int[][] matrix = new int[3][3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        //5
        int[][] visitors = new int[7][4];
        Random random1 = new Random();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                visitors[i][j] = random1.nextInt(50); // Случайное количество посетителей (до 49)
            }
        }
        int[] dailyLoad = new int[7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                dailyLoad[i] += visitors[i][j];
            }
        }
        int maxLoadDay = 0;
        int minLoadDay = 0;
        for (int i = 1; i < 7; i++) {
            if (dailyLoad[i] > dailyLoad[maxLoadDay]) {
                maxLoadDay = i;
            }
            if (dailyLoad[i] < dailyLoad[minLoadDay]) {
                minLoadDay = i;
            }
        }
        System.out.println("День с максимальной загруженностью: День " + (maxLoadDay + 1) + "=" + dailyLoad[maxLoadDay] );
        System.out.println("День с минимальной загруженностью: День " + (minLoadDay + 1) + "=" + dailyLoad[minLoadDay]);
        System.out.println("\nМассив посещений");
        for (int i = 0; i < 7; i++) {
            System.out.print("День " + (i + 1) + ": ");
            for (int j = 0; j < 4; j++) {
                System.out.print(visitors[i][j] + " ");
            }
            System.out.println("(Всего: " + dailyLoad[i] + ")");
        }

        //6
        Scanner scanner = new Scanner(System.in);
        System.out.print("размер квадратного массива : ");
        int N = scanner.nextInt();
        scanner.close();

        int[][] matrix2 = new int[N][N];
        Random random2 = new Random();


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix2[i][j] = random2.nextInt(10); // Случайные числа от 0 до 9
            }
        }

        // Вычисление сумм диагоналей
        int mainDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < N; i++) {
            mainDiagonalSum += matrix2[i][i]; // Главная диагональ
            secondaryDiagonalSum += matrix2[i][N - 1 - i]; // Побочная диагональ
        }

        System.out.println("Сумма горизонт диагонали: " + mainDiagonalSum);
        System.out.println("Сумма верт диагонали: " + secondaryDiagonalSum);
    }
}