public class BangunDatar {
    private int p;
    private int s;
    private int l;
    
    //Konstruktor untuk persegi
    BangunDatar(int p, int l){
        this.p = p;
        this.l = l;
    }
    //konstruktor untuk bujur sangkar
    BangunDatar(int s){
        this.s = s;
    }
    //setter
    void setPanjangLebar(int p, int l){
        this.p = p;
        this.l = l;
    }
    void setSisi(int s){
        this.s = s;
    }
    //getter
    int getPanjang(){
        return p;
    }
    int getLebar(){
        return l;
    }
    int getSisi(){
        return s;
    }
}
