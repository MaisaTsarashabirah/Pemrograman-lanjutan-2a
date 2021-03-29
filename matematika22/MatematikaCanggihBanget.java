//Nama : Maisa Tsara Shabirah
//NIM  : 11200930000004
//Kelas: 2A Sistem Informasi 2020
package matematika22;

public class MatematikaCanggihBanget extends MatematikaCanggih{
    private int pertambahan;
    void setPertambahan(int a, int b){
        pertambahan = a+b;
    }
        int getPertambahan(){
            return pertambahan;
        }
    private int perkalian;
    void setPerkalian(int a, int b){
        perkalian = a*b;
    }
        int getPerkalian(){
            return perkalian;
        }
    private int modulus;
    void setModulus(int a, int b){
        modulus = a%b;      
    }
        int getModulus(){
            return modulus;
        }
    
}
