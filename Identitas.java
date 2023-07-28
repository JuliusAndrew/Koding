class ATM{
    void tarikUang(){
        
    }
}
public class Identitas{
    //atribut
    String nama;
    String nik;
    String alamat;
    String agama;
    String nohp;
    //kue
    void print(){
        System.out.println(" Nama : "+ nama + " Nik : "+ nik + " Alamat : "+ alamat + " Agama : "+ agama + " No Hp : "+ nohp);
    }

    //method
    void save(){

    }

    public static void main(String[] args){
        //cetakan
        Identitas andrew = new Identitas();
        andrew.nama = " Andrew\n";
        andrew.nik = "3515151609010024\n";
        andrew.alamat = "Sidoarjo\n";
        andrew.agama = "Kristen\n";
        andrew.nohp = "083847237503\n";
        andrew.print();
        //System.out.println("Hello Kamu");
    }
}
