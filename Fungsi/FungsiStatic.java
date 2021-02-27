public class FungsiStatic {
    
    // fungsi non static
    void Nama(String nama){
        System.out.println("Nama saya adalah" + nama);
    }

    // fungsi static
    static void school(String sekolah){
        System.out.println("Dan saya bersekolah di " + sekolah );
    } 

    // fungsi main
    public static void main(String[] args) {
        System.out.println("Hello guys!");
        // membuat instansiasi objek saya dari class fungiStatic
        FungsiStatic saya = new FungsiStatic();
        // pemanggialn fungsi non static
        saya.Nama("Galan Jabal Nur Al Markum");

        // pemanggilan fungsi static
        school("Smk Bina Nusantara Mranggen");
    }  
}

