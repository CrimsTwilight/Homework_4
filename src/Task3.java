import java.util.Random;
import java.util.Scanner;

public class Task3 {
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

                        int mult1 = 1;
                        int mult2 = 1;
                        for (int i = 0; i < mass.length; i++) {
                            for (int j = 0; j < mass[i].length; j++) {
                                if (n1 == n2) {
                                    if (i == j) {
                                        mult1 *= mass[i][j];
                                    }
                                    if (i + j == n1 - 1) {
                                        mult2 *= mass[i][j];
                                    }
                                } else {
                                    System.out.println("Матрица не является квадратной.");
                                }
                            }
                        }
                        System.out.println("Произведение элементов главной матрицы равно: " + mult1);
                        System.out.println("Произведение элементов побочной матрицы равно: " + mult2);
                        if (mult1 > mult2) {
                            System.out.println("Произведение элементов главной диагонали больше " +
                                    "произведения элементов побочной.");
                        } else {
                            System.out.println("Произведение элементов побочной диагонали больше " +
                                    "произведения элементов главной.");
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