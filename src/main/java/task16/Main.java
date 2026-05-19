package task16;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа шифрования данных\n");

        // 1. Ввод данных об автомобиле
        System.out.print("Введите госномер автомобиля: ");
        String licensePlate = scanner.nextLine();

        System.out.print("Введите марку автомобиля: ");
        String brand = scanner.nextLine();

        // 2. Создание объекта автомобиля
        Car car = new Car(licensePlate, brand);
        System.out.println("\nСоздан автомобиль:");
        System.out.println(car);

        // 3. Шифрование и сохранение
        CarEncoder encoder = new CarEncoder();
        encoder.encodeAndSave(car, "car_data_encrypted.txt");

        // Демонстрация альтернативного метода
        // encoder.encodeAndSaveWithStream(car, "car_data_stream.dat");

        // 4. Дешифрование и вывод
        System.out.println("\n Дешифрование данных ");
        CarDecoder decoder = new CarDecoder();
        decoder.decodeAndDisplay("car_data_encrypted.txt");

        // 5. Дополнительная демонстрация работы с разными потоками
       // demonstrateStreams();

        scanner.close();
    }
/*
    // Демонстрация разницы между Reader/Writer и InputStream/OutputStream
    private static void demonstrateStreams() {
        System.out.println("\n=== ДЕМОНСТРАЦИЯ РАЗНЫХ ТИПОВ ПОТОКОВ ===");

        Car demoCar = new Car("О777ОО", "Lada");
        CarEncoder encoder = new CarEncoder();
        CarDecoder decoder = new CarDecoder();

        System.out.println("1. Использование Reader/Writer (символьные потоки):");
        encoder.encodeAndSave(demoCar, "text_file.txt");
        decoder.decodeAndDisplay("text_file.txt");

        System.out.println("\n2. Использование InputStream/OutputStream (байтовые потоки):");
        encoder.encodeAndSaveWithStream(demoCar, "binary_file.dat");
        Car decodedCar = decoder.decodeWithStream("binary_file.dat");
        if (decodedCar != null) {
            System.out.println(decodedCar);
        }
    }*/

}
