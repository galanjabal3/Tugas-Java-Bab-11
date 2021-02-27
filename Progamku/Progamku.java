public class Progamku {
    // ini variabel global
    static String nama = "Tugas Java Bab 11";
    static String version = "JAVA";

    static void help(){

        // ini variabel lokal
        String nama = "Galan Jabal Nur Al Markum";
        String umur = "15";
        
        // mengakses variabel global di dalam fungso help()
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    public static void main(String args[]){
        // panggil fungsi help()
        help();

        System.out.println("Tugas: " + nama);
        System.out.println("Tentang: " + version);
    } 
}
