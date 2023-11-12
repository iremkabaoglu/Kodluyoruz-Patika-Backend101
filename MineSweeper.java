package KodluyoruzBackend;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
        private int rowSize;
        private int colSize;
        private int[][] MayınTarlası;
        private boolean[][] revealed;
        private int KalanHücre;

        public MineSweeper(int rowSize, int colSize) {
            this.rowSize = rowSize;
            this.colSize = colSize;
            this.MayınTarlası = new int[rowSize][colSize];
            this.revealed = new boolean[rowSize][colSize];
            this.KalanHücre = rowSize * colSize;
            initializeMineField();
            printMineField();
        }

        private void initializeMineField() {
            int totalMines = rowSize * colSize / 4;
            Random rand = new Random();

            for (int i = 0; i < totalMines; i++) {
                int randRow = rand.nextInt(rowSize);
                int randCol = rand.nextInt(colSize);

                while (MayınTarlası[randRow][randCol] == -1) {
                    randRow = rand.nextInt(rowSize);
                    randCol = rand.nextInt(colSize);
                }

                MayınTarlası[randRow][randCol] = -1; // -1 mayını temsil eder
            }
        }

        private void printMineField() {
            for (int i = 0; i < rowSize; i++) {
                for (int j = 0; j < colSize; j++) {
                    if (revealed[i][j]) {
                        System.out.print(MayınTarlası[i][j] == -1 ? "* " : MayınTarlası[i][j] + " ");
                    } else {
                        System.out.print(". ");
                    }
                }
                System.out.println();
            }
        }

        private boolean isValidMove(int row, int col) {
            return row >= 0 && row < rowSize && col >= 0 && col < colSize && !revealed[row][col];
        }

        private void revealCell(int row, int col) {
            revealed[row][col] = true;
            KalanHücre--;

            if (MayınTarlası[row][col] == 0) {
                for (int i = row - 1; i <= row + 1; i++) {
                    for (int j = col - 1; j <= col + 1; j++) {
                        if (isValidMove(i, j)) {
                            revealCell(i, j);
                        }
                    }
                }
            }
        }

        public void play() {
            Scanner scanner = new Scanner(System.in);

            while (KalanHücre > 0) {
                System.out.print("Satır ve sütun girin (örnek: 1 2): ");
                int selectedRow = scanner.nextInt();
                int selectedCol = scanner.nextInt();

                if (!isValidMove(selectedRow, selectedCol)) {
                    System.out.println("Geçersiz hamle. Lütfen tekrar deneyin.");
                    continue;
                }

                if (MayınTarlası[selectedRow][selectedCol] == -1) {
                    System.out.println("Oyunu kaybettiniz! Mayına bastınız.");
                    revealed[selectedRow][selectedCol] = true;
                    printMineField();
                    break;
                } else {
                    revealCell(selectedRow, selectedCol);
                    printMineField();
                }
            }

            if (KalanHücre == 0) {
                System.out.println("Tebrikler! Oyunu kazandınız. Tüm hücreleri açtınız.");
            }

            scanner.close();
        }

    }
