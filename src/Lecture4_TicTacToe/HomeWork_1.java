package Lecture4_TicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_1 {
    public static void main(String[] args) {
//        Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
//        по очереди вводят координаты клетки в которую хотят сделать ход. После
//        каждого хода, в консоли отрисовывается игровое поле с текущим состоянием.
//                Игра продолжается до победы одного из игроков или ничьи.

//        int [][] array = new int[3][3];
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array[i].length; j++) {
////                array[i][j] = i;
////            }
////        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ходит первый игрок");
//        int[][] a1 = scanner.;
//        for (int i = 0; i < array.length; i++) {
//            if()
//        }
//        System.out.println("ходит второй игрок");
//        int a2 = scanner.nextInt();
//        System.out.println("ходит третий игрок");
//        int a3 = scanner.nextInt();
//
//        System.out.println(a1);
//        System.out.println(a2);
//        System.out.println(a3);
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };
        char currentPlayer = 'X';
        boolean gameWon = false;
        Scanner scanner = new Scanner(System.in);

        while (!gameWon) {
            printBoard(board);
            System.out.println("Игрок " + currentPlayer + ", введите строку и столбец (0-2) для вашего хода:");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            // Проверка корректности ввода
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                board[row][col] = currentPlayer;
                gameWon = checkWin(board, currentPlayer);
                if (gameWon) {
                    printBoard(board);
                    System.out.println("Игрок " + currentPlayer + " выиграл!");
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X'; // Смена игрока
                }
            } else {
                System.out.println("Некорректный ход. Попробуйте снова.");
            }
        }
        scanner.close();
    }
    public static void printBoard(char[][] board) {
        System.out.println("Текущая доска:");
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
    }
    public static boolean checkWin(char[][] board, char player) {
        // Проверка строк
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        // Проверка столбцов
        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }
        // Проверка диагоналей
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
     }




}
