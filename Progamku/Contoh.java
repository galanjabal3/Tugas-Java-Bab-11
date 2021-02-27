import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Contoh {
    
    static ArrayList listSiswa = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    static void showSiswa() throws IOException{
        
        System.out.println("========= DATA ========");
        System.out.println("[1] Show All Siswa");
        System.out.println("[2] Insert Siswa");
        System.out.println("[3] Edit Data Siswa");
        System.out.println("[4] Delete Data");
        System.out.println("[5] Exit");
        System.out.print("PILIH DATA> ");
        
        int selectedSiswa = Integer.valueOf(input.readLine());
        
        switch(selectedSiswa){
            case 1:
                showAllSiswa();
                break;
            case 2:
                insertSiswa();
                break;
            case 3:
                editSiswa();
                break;
            case 4:
                deleteSiswa();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
                     
        }
        
        
    }

    static void showAllSiswa(){
        if(listSiswa.isEmpty()){
           System.out.println("Belum ada data");
        } else {
             // tampilkan semua siswa
            for(int i = 0; i < listSiswa.size(); i++){
                System.out.println(String.format("[%d] %s",i, listSiswa.get(i)));
            }
        }
    }
    
    static void insertSiswa() throws IOException{
        System.out.print("Nama Siswa: ");
        String namaSiswa = input.readLine();
        listSiswa.add(namaSiswa);
    }
    
    static void editSiswa() throws IOException{
        showAllSiswa();
        System.out.print("Pilih nomer siswa: ");
        int indexSiswa = Integer.valueOf(input.readLine());
        
        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();
        
        // ubah nama siswa
        listSiswa.set(indexSiswa, namaBaru);
    }
    
    static void deleteSiswa() throws IOException{
        showAllSiswa();
        System.out.print("Pilih nomer siswa: ");
        int indexSiswa = Integer.valueOf(input.readLine());
        // hapus siswa
        listSiswa.remove(indexSiswa);
    }
    
    public static void main(String[] args) throws IOException {
        
        do {
            showSiswa();
        } while (isRunning);
        
    }
    
}