import java.util.Random;
import java.util.Scanner;

public class Task5 {
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
                        int[][] tmatr = new int[n2][n1];
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
                        System.out.println();

                        for (int i = 0; i < tmatr.length; i++) {
                            for (int j = 0; j < tmatr[i].length; j++) {
                                tmatr[i][j] = mass[j][i];
                            }
                        }

                        for (int i = 0; i < tmatr.length; i++) {
                            for (int j = 0; j < tmatr[i].length; j++) {
                                System.out.print(tmatr[i][j] + "  ");
                            }
                            System.out.println();
                        }
                        System.out.println();
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