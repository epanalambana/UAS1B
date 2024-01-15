//Menggunakan While Loop untuk mengulang angka random sebanyak 200 kali menggunakan method generateRandomSpeeds.
//ArrayList untuk menampung masing-masing hasil dari random untuk kecepatan yang telah ditentukan menggunakan method storeSpeed.
//Method untuk menampilkan hasilnya menggunakan method displaySpeeds.

import java.util.ArrayList;
import java.util.Random;

public class no3UAS {
    public static void main(String[] args) {
        ArrayList<Integer> speedsInRange = new ArrayList<>();
        ArrayList<Integer> speedsBelowRange = new ArrayList<>();

        storeSpeeds(speedsInRange, speedsBelowRange);

        System.out.println("Kecepatan kendaraan antara 80 s/d 100 km/jam:");
        displaySpeeds(speedsInRange);

        System.out.println("\nKecepatan kendaraan di bawah 80 km/jam:");
        displaySpeeds(speedsBelowRange);
    }

    private static void storeSpeeds(ArrayList<Integer> speedsInRange, ArrayList<Integer> speedsBelowRange) {
        int count = 0;
        Random random = new Random();

        while (count < 200) {
            int speed = generateRandomSpeed();

            if (speed >= 80 && speed <= 100) {
                speedsInRange.add(speed);
            } else {
                speedsBelowRange.add(speed);
            }

            count++;
        }
    }

    private static int generateRandomSpeed() {
        return new Random().nextInt(121); // Generates a random speed between 0 and 120 km/jam
    }

    private static void displaySpeeds(ArrayList<Integer> speeds) {
        for (int speed : speeds) {
            System.out.println(speed + " km/jam");
        }
    }
}