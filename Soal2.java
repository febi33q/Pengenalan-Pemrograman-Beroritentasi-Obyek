public class Soal2 {
    public static void main(String[] args) {
        int i = 42; // Inisialisasi nilai variabel i dengan 42
        // Menggunakan operator ternary untuk menentukan nilai string s
        // Jika i kurang dari 40, maka s berisi "life"
        // Jika i lebih besar dari 50, maka s berisi "universe"
        // Jika tidak memenuhi kedua kondisi di atas, maka s berisi "everything"
        String s = (i < 40) ? "life" : (i > 50) ? "universe" : "everything";
        System.out.println(s); // Mencetak nilai string s ke konsol
    }
}
