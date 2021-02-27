public class FungsiMengembalikanNilai {
    
    static int volumeKubus(int sisi){
        int volume = sisi * sisi * sisi ;
        return volume;
    }
    public static void main(String[] args){
        // memangggil/eksekusi fungsi 
    System.out.println("volume Kubus dengan panjang sisi 12 adalah " + volumeKubus(12));    
    }
}
