import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan jumlah Politeknik: ");
        int jumlahPoltek = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jumlahPoltek; i++) {
            System.out.println("\n=== Politeknik ke-" + i + " ===");
            System.out.print("Masukkan nama Politeknik: ");
            String namaPoltek = sc.nextLine();

             String b1="", b2="", b3="", b4="", b5="";
             String t1="", t2="", t3="", t4="", t5="";
             String ba1="", ba2="", ba3="", ba4="", ba5="";
             String v1="", v2="", v3="", v4="", v5="";

            for (int j = 1; j <= 4; j++) {
                String cabor = "";
                if (j == 1) {
                    cabor = "Badminton";
                    System.out.println("\nMasukkan nama 5 atlet cabor " + cabor + ":");
                    System.out.print("Atlet 1: "); b1 = sc.nextLine();
                    System.out.print("Atlet 2: "); b2 = sc.nextLine();
                    System.out.print("Atlet 3: "); b3 = sc.nextLine();
                    System.out.print("Atlet 4: "); b4 = sc.nextLine();
                    System.out.print("Atlet 5: "); b5 = sc.nextLine();
                } else if (j == 2) {
                    cabor = "Tenis Meja";
                    System.out.println("\nMasukkan nama 5 atlet cabor " + cabor + ":");
                    System.out.print("Atlet 1: "); t1 = sc.nextLine();
                    System.out.print("Atlet 2: "); t2 = sc.nextLine();
                    System.out.print("Atlet 3: "); t3 = sc.nextLine();
                    System.out.print("Atlet 4: "); t4 = sc.nextLine();
                    System.out.print("Atlet 5: "); t5 = sc.nextLine();
                } else if (j == 3) {
                    cabor = "Basket";
                    System.out.println("\nMasukkan nama 5 atlet cabor " + cabor + ":");
                    System.out.print("Atlet 1: "); ba1 = sc.nextLine();
                    System.out.print("Atlet 2: "); ba2 = sc.nextLine();
                    System.out.print("Atlet 3: "); ba3 = sc.nextLine();
                    System.out.print("Atlet 4: "); ba4 = sc.nextLine();
                    System.out.print("Atlet 5: "); ba5 = sc.nextLine();
                } else if (j == 4) {
                    cabor = "Bola Voly";
                    System.out.println("\nMasukkan nama 5 atlet cabor " + cabor + ":");
                    System.out.print("Atlet 1: "); v1 = sc.nextLine();
                    System.out.print("Atlet 2: "); v2 = sc.nextLine();
                    System.out.print("Atlet 3: "); v3 = sc.nextLine();
                    System.out.print("Atlet 4: "); v4 = sc.nextLine();
                    System.out.print("Atlet 5: "); v5 = sc.nextLine();
                }
            }

            System.out.println("==== Data Politeknik: " + namaPoltek +  " ==== ");

            System.out.println("\nCabang Olahraga Badminton");
            System.out.println("1. " + b1);
            System.out.println("2. " + b2);
            System.out.println("3. " + b3);
            System.out.println("4. " + b4);
            System.out.println("5. " + b5);

            System.out.println("\nCabang Olahraga Tenis Meja");
            System.out.println("1. " + t1);
            System.out.println("2. " + t2);
            System.out.println("3. " + t3);
            System.out.println("4. " + t4);
            System.out.println("5. " + t5);

            System.out.println("\nCabang Olahraga Basket");
            System.out.println("1. " + ba1);
            System.out.println("2. " + ba2);
            System.out.println("3. " + ba3);
            System.out.println("4. " + ba4);
            System.out.println("5. " + ba5);

            System.out.println("\nCabang Olahraga Bola Voly");
            System.out.println("1. " + v1);
            System.out.println("2. " + v2);
            System.out.println("3. " + v3);
            System.out.println("4. " + v4);
            System.out.println("5. " + v5);
        }

        System.out.println("\nInput semua data selesai!");
    }
}
