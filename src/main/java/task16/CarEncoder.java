package task16;

import java.io.*;

public class CarEncoder {
    // Метод для шифрования одного символа
    private char encryptChar(char c) {
        if (Character.isLetter(c)) {
            if (c == 'z') return 'a';
            if (c == 'я') return 'а';
            if (c == 'Z') return 'A';
            if (c == 'Я') return 'А';
            return (char)(c + 1);
        } else if (Character.isDigit(c)) {
            if (c == '9') return '0';
            return (char)(c + 1);
        }
        return c; // пробелы, знаки препинания не меняем
    }

    // Метод для шифрования строки
    private String encryptString(String input) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : input.toCharArray()) {
            encrypted.append(encryptChar(c));
        }
        return encrypted.toString();
    }

    // Метод для сохранения зашифрованных данных с использованием Writer
    public void encodeAndSave(Car car, String filename) {
        try (Writer writer = new FileWriter(filename)) {
            // Формируем строку для сохранения
            String data = car.getLicensePlate() + ";" + car.getBrand();

            // Шифруем данные
            String encryptedData = encryptString(data);

            // Записываем в файл
            writer.write(encryptedData);

            System.out.println("Данные зашифрованы и сохранены в файл: " + filename);
            System.out.println("Зашифрованные данные: " + encryptedData);

        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }

   /* // Альтернативная версия с OutputStream (байтовый поток)
    public void encodeAndSaveWithStream(Car car, String filename) {
        try (OutputStream outputStream = new FileOutputStream(filename)) {
            String data = car.getLicensePlate() + ";" + car.getBrand();
            String encryptedData = encryptString(data);

            // Преобразуем строку в байты и записываем
            byte[] bytes = encryptedData.getBytes();
            outputStream.write(bytes);

            System.out.println("Данные сохранены с использованием OutputStream");

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }*/
}
