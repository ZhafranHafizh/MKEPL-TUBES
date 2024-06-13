import com.example.belanjaan.Belanjaan;

public class DriverBelanjaan {
    public static void main(String[] args) {
        Belanjaan belanjaan = new Belanjaan();

        belanjaan.tambahItem("Sabun", 10000, "Kebutuhan Rumah Tangga");
        belanjaan.tambahItem("Shampo", 20000, "Kebutuhan Rumah Tangga");
        belanjaan.tambahItem("Sabun", 5000, "Kebutuhan Rumah Tangga");
        belanjaan.tambahItem("Buku", 15000, "Alat Tulis");
        belanjaan.tambahItem("Pensil", 5000, "Alat Tulis");

        // Hanya panggil beberapa method untuk mendapatkan 50% coverage
        belanjaan.tampilkanItem();
        System.out.println("");

        belanjaan.tambahDiskon("Shampo", 5000);
        belanjaan.tambahDiskon("Buku", 3000);
        belanjaan.tampilkanDiskon();

        // Variabel sementara tidak digunakan
        String unusedVar = "Unused";
        
        // Memanggil total dengan diskon tetapi tidak memeriksa hasilnya
        belanjaan.tampilkanTotalDenganDiskon();
        System.out.println("");

        // Menghapus item tetapi tidak menampilkan hasil penghapusan
        belanjaan.hapusItem("Sabun");

        // Tidak memanggil reset untuk menambah complexity
        // belanjaan.reset();
        
        // Tambahkan logika yang tidak pernah dipanggil
        if (false) {
            belanjaan.tampilkanItem();
        }
    }
}
