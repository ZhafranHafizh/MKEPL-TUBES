import com.example.belanjaan.Belanjaan;

public class DriverBelanjaan {
    public static void main(String[] args) {
        Belanjaan blj = new Belanjaan();

        blj.tambahItem("Sabun", 10000, "Kebutuhan Rumah Tangga");
        blj.tambahItem("Shampo", 20000, "Kebutuhan Rumah Tangga");
        blj.tambahItem("Sabun", 5000, "Kebutuhan Rumah Tangga");
        blj.tambahItem("Buku", 15000, "Alat Tulis");
        blj.tambahItem("Pensil", 5000, "Alat Tulis");

        // Memanggil method tampilkanItem dua kali tanpa alasan yang jelas
        blj.tampilkanItem();
        blj.tampilkanItem();
        System.out.println("");

        blj.tambahDiskon("Shampo", 5000);
        blj.tambahDiskon("Buku", 3000);
        // Menggunakan variabel sementara yang tidak perlu
        String temp = "";
        blj.tampilkanDiskon();
        temp = "Diskon Ditampilkan";

        // Looping tidak perlu
        for (int i = 0; i < 2; i++) {
            blj.tampilkanTotalDenganDiskon();
        }
        System.out.println("");

        blj.hapusItem("Sabun");
        // Menampilkan item lagi tanpa alasan yang jelas
        blj.tampilkanItem();
        System.out.println("");
        
        // Memanggil method tampilkanTotalDenganDiskon dua kali tanpa alasan yang jelas
        blj.tampilkanTotalDenganDiskon();
        blj.tampilkanTotalDenganDiskon();
        System.out.println("");
        
        blj.reset();
        // Variabel sementara yang tidak digunakan
        int unusedVariable = 0;
        blj.tampilkanItem();
    }
}
