package Lecture4_TicTacToe;

import java.util.Scanner;

public class HomeWork_TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] board = new char[9]; // Игровое поле (9 клеток)
        char currentPlayer = 'X'; // Первый игрок - X
        // Инициализация игрового поля
        for (int i = 0; i < 9; i++) {
            board[i] = '-';
        }
        for (int turn = 0; turn < 9; turn++) {
            System.out.println("Игрок " + currentPlayer + ", введите номер клетки (0-8):");
            int cell = scanner.nextInt();
            // Проверка на корректность ввода
            if (cell < 0 || cell > 8 || board[cell] != '-') {
                System.out.println("Некорректный ход. Попробуйте снова");
                turn--; // Повторяем ход
                continue;
            }
            // Запись хода
            board[cell] = currentPlayer;
            // Отображение текущего состояния игрового поля
            System.out.println("Текущее состояние игрового поля:");
            for (int i = 0; i < 3; i++) {
                System.out.println(board[i * 3] + " " + board[i * 3 + 1] + " " + board[i * 3 + 2]);
            }
            // Проверка на победу
            if (checkWin(board, currentPlayer)) {
                System.out.println("Игрок " + currentPlayer + " выиграл");
                return; // Завершить игру
            }
            // Смена игрока
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        System.out.println("Игра окончена");
        scanner.close();
    }

    private static boolean checkWin(char[] board, char player) {
        // Проверка всех возможных выигрышных комбинаций
        return (board[0] == player && board[1] == player && board[2] == player) ||
                (board[3] == player && board[4] == player && board[5] == player) ||
                (board[6] == player && board[7] == player && board[8] == player) ||
                (board[0] == player && board[3] == player && board[6] == player) ||
                (board[1] == player && board[4] == player && board[7] == player) ||
                (board[2] == player && board[5] == player && board[8] == player) ||
                (board[0] == player && board[4] == player && board[8] == player) ||
                (board[2] == player && board[4] == player && board[6] == player);
    }
}
