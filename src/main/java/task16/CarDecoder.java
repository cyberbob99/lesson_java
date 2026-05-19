package task16;

import java.io.*;

public class CarDecoder {


    // Метод для дешифрования одного символа
    private char decryptChar(char c) {
        if (Character.isLetter(c)) {
            if (c == 'a') return 'z';
            if (c == 'а') return 'я';
            if (c == 'A') return 'Z';
            if (c == 'А') return 'Я';
            return (char)(c - 1);
        } else if (Character.isDigit(c)) {
            if (c == '0') return '9';
            return (char)(c - 1);
        }
        return c;
    }

    // Метод для дешифрования строки
    private String decryptString(String input) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : input.toCharArray()) {
            decrypted.append(decryptChar(c));
        }
        return decrypted.toString();
    }

    // Метод для чтения и дешифрования данных с использованием Reader
    public void decodeAndDisplay(String filename) {
        try (Reader reader = new FileReader(filename)) {
            StringBuilder content = new StringBuilder();
            int character;

            // Читаем файл посимвольно
            while ((character = reader.read()) != -1) {
                content.append((char) character);
            }

            // Дешифруем прочитанные данные
            String encryptedData = content.toString();
            String decryptedData = decryptString(encryptedData);

            // Разделяем данные обратно на госномер и марку
            String[] parts = decryptedData.split(";");

            if (parts.length == 2) {
                Car car = new Car(parts[0], parts[1]);
                System.out.println("\n Расшифрованные данные");
                System.out.println(car);
            } else {
                System.err.println("Некорректный формат данных в файле");
            }

        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

   /* // Альтернативная версия с InputStream (байтовый поток)
    public Car decodeWithStream(String filename) {
        try (InputStream inputStream = new FileInputStream(filename)) {
            // Читаем все байты из файла
            byte[] bytes = inputStream.readAllBytes();

            // Преобразуем байты в строку
            String encryptedData = new String(bytes);
            String decryptedData = decryptString(encryptedData);

            String[] parts = decryptedData.split(";");

            if (parts.length == 2) {
                return new Car(parts[0], parts[1]);
            }

        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
        return null;
    }*/
}
