public class BangunRuang {
    
    public static void main(String[] args) {
       int r = 7;
       int t = 15;
       int phi = 22/7;
       int volume = volumeTabung(phi,r,t);

       System.out.println(volume);
    }

    // membuat fungsi volumeTabung()
    static int volumeTabung(int r,int t,int phi){
        return phi * r * r * t;
    }
}

