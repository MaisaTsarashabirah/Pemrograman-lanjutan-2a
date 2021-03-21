/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

/**
 *
 * @author asus
 */
public class BankBeraksi {
   public static void main (String[] args){
       Bank BankBeraksi = new Bank();
       
       BankBeraksi.saldoAwal();
       BankBeraksi.simpanUang(500000);
       BankBeraksi.ambilUang(150000);
   } 
}
