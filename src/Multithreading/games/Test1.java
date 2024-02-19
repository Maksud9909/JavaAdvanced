package Multithreading.games;

public class Test1 {

}

class ChessBoardPrinter extends Thread {
    private final int size;

    public ChessBoardPrinter(int size) {
        this.size = size;
    }

    public void run() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("■ "); // Белая клетка
                } else {
                    System.out.print("□ "); // Черная клетка
                }
            }
            System.out.println(); // Переход на новую строку для нового ряда
        }
    }
}

 class ChessBoardExample {
    public static void main(String[] args) {
        int boardSize = 8;

        ChessBoardPrinter blackThread = new ChessBoardPrinter(boardSize);
        ChessBoardPrinter whiteThread = new ChessBoardPrinter(boardSize);

        blackThread.start(); // Запуск потока для черных клеток
        whiteThread.start(); // Запуск потока для белых клеток
    }
}

