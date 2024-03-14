import java.util.Scanner;
public class HitungBangunDatar {
    public static void main(String[]args){
        System.out.println("1.Persegi Panjang");
        System.out.println("2.Bujur Sangkar");
        System.out.println("Isikan Pilihan");
        Scanner sc = new Scanner(System.in);
        
        int pilihan = sc.nextInt();
        
        if (pilihan==1){
            System.out.println("Isikan Panjang :");
            int p = sc.nextInt();
            System.out.println("Isikan Lebar :");
            int l = sc.nextInt();
            PersegiPanjang pp= new PersegiPanjang(p,l);
            int luas =pp.getLuas();
            int keliling =pp.getKeliling();
            
            System.out.println("Luas Persegi:"+luas);
            System.out.println("Keliling Persegi:"+keliling);
        }
        else if(pilihan==2){
            System.out.println("Isikan Pilihan sisi :");
            int s =sc.nextInt();
            BujurSangkar bs = new BujurSangkar(s);
            int luas =bs.getLuas(s);
            int keliling =bs.getKeliling(s);
            System.out.println("Bujur Sangkar:"+luas);
            System.out.println("Bujur Sangkar:"+keliling);
        }
    }
    
}
