import java.util.Scanner;
public class Ratanilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i=1;
        int j=1;
        int nilaiMhs;
        double totalNilai;
        double rataNilai;

        while (i<=5) {
            totalNilai=0;
                System.out.print("Input nilai mahasiswa ke " +i);
                System.out.println();

                for (j=1; j<=5; j++) {
                System.out.print("Nilai ke-" +j + " = ");
                nilaiMhs=sc .nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.print("Rata-rata Nilai Mahasiswa ke " +i + " adalah " + rataNilai);
            System.out.println();
            i++;
        }
    }
}
