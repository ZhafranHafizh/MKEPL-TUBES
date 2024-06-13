import com.example.belanjaan.Belanjaan;

public class DriverBelanjaan {
    public static void main(String[] args) {
        Belanjaan belanjaan = new Belanjaan();

        try {
            belanjaan.tambahItem("Sabun", 10000, "Kebutuhan Rumah Tangga");
            belanjaan.tambahItem("Shampo", 20000, "Kebutuhan Rumah Tangga");
            belanjaan.tambahItem("Sabun", 5000, "Kebutuhan Rumah Tangga");
            belanjaan.tambahItem("Buku", 15000, "Alat Tulis");
            belanjaan.tambahItem("Pensil", 5000, "Alat Tulis");

            belanjaan.tampilkanItem();
            System.out.println("");

            belanjaan.tambahDiskon("Shampo", 5000);
            belanjaan.tambahDiskon("Buku", 3000);
            belanjaan.tampilkanDiskon();

            belanjaan.tampilkanTotalDenganDiskon();
            System.out.println("");

            if (belanjaan.hitungTotal() > 50000) {
                belanjaan.hapusItem("Sabun");
            }

            belanjaan.tampilkanItem();
            System.out.println("");

            belanjaan.tampilkanTotalDenganDiskon();
            System.out.println("");

            // Menambahkan loop untuk meningkatkan kompleksitas
            for (int i = 0; i < 3; i++) {
                belanjaan.tambahItem("Item" + i, 1000 * (i + 1), "Kategori" + i);
            }

            belanjaan.tampilkanItem();
            System.out.println("");

            belanjaan.reset();
            belanjaan.tampilkanItem();
        } catch (Exception e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}
