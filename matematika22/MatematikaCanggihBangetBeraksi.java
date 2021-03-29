//Nama : Maisa Tsara Shabirah
//NIM  : 11200930000004
//Kelas: 2A Sistem Informasi 2020

package matematika22;

public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget mcb = new MatematikaCanggihBanget();
        
        mcb.setPertambahanTiga(2, 2, 2);
            System.out.println("Total dari 2 + 2 + 2 adalah : " +mcb.getPertambahanTiga());
        mcb.setPertambahan(2, 2);
            System.out.println("Total dari 2 + 2 adalah : " +mcb.getPertambahan());
        mcb.setPerkalian(2, 2);
            System.out.println("Total dari 2 * 2 adalah : " +mcb.getPerkalian());
        mcb.setModulus(2, 3);
            System.out.println ("Total modulus adalah : " +mcb.getModulus());
    }
    
}
