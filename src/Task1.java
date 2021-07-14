import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы (целое положительное число): ");
        if (scanner.hasNextInt()) {
            int n1 = scanner.nextInt();
            if (n1 >= 0) {
                System.out.print("Введите количество столбцов матрицы (целое положительное число): ");
                if (scanner.hasNextInt()) {
                    int n2 = scanner.nextInt();
                    if (n2 >= 0) {
                        int[][] mass = new int[n1][n2];
                        for (int i = 0; i < mass.length; i++) {
                            for (int j = 0; j < mass[i].length; j++) {
                                mass[i][j] = random.nextInt(10);

                            }
                        }

                        for (int i = 0; i < mass.length; i++) {
                            for (int j = 0; j < mass[i].length; j++) {
                                System.out.print(mass[i][j] + "  ");
                            }
                            System.out.println();
                        }

                        if (n1 == n2) {
                            int sum = 0;
                            for (int i = 0; i < mass.length; i++) {
                                for (int j = 0; j < mass[i].length; j++) {
                                    if (i == j && mass[i][j] % 2 == 0) {
                                        sum += mass[i][j];
                                    }
                                }
                            }
                            System.out.println("Сумма чётных элементов матрицы равна: " + sum);
                        } else {
                            System.out.println("Матрица не является квадратной.");
                        }
                    } else {
                        System.out.println("Вы ввели отрицательное число.");
                    }
                } else {
                    System.out.println("Вы ввели не целое положительное число.");
                }
            } else {
                System.out.println("Вы ввели отрицательное число.");
            }
        } else {
            System.out.println("Вы ввели не целое положительное число.");
        }
    }
}