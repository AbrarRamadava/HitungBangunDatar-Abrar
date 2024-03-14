public class BujurSangkar extends BangunDatar {
    BujurSangkar(int s){
        super(s);
    }
    int getLuas(int l){
        int s = super.getSisi();
        return s*s;
    }
    int getKeliling(int k){
        int s = super.getSisi();
        return s*4;
    }
}
