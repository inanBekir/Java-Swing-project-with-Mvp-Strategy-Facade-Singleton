/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter.StrategyPattern;

import View.SoruBankasiView;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author inanb
 */
public class ListeleKolaySoru implements ListeleStrategy{

   private SoruBankasiView view;

    @Override
    public void Listele(String text) {
        
       String path3 = "Content\\SoruBankasi\\TasarimDesenleriÇoktanSeçmeliKolay.txt";
        String path2 = "Content\\SoruBankasi\\TasarimDesenleriKlasikKolay.txt";
        String path = "Content\\SoruBankasi\\TasarimDesenleriDogruYanlisKolay.txt";
        
       
        
        if(text.equals("Kolay"))  {      
            try{
               
                 BufferedReader bf=new BufferedReader(new FileReader(path2));
                 BufferedReader bf2=new BufferedReader(new FileReader(path));
                  BufferedReader bf3=new BufferedReader(new FileReader(path3));
                 
                 String line=bf.readLine();
                 String line2=bf2.readLine();
                 String line3=bf3.readLine();
                 
                 System.out.println("Klasik Kolay Sorular");
                 while(line != null)
                 {
                     //view.updateStatusListeleTextField(line);
                     
                     System.out.println(line);
                     line = bf.readLine();
  
                 }
                 System.out.println("Doğru Yanlış Kolay Sorular");
                 while(line2 != null)
                 {
                     
                     System.out.println(line2);
                     line2 = bf2.readLine();
                 }
                 
                 System.out.println("Çoktan Seçmeli Kolay Sorular");
                 while(line3 != null)
                 {
                     
                     System.out.println(line3);
                     line3 = bf3.readLine();
                 }
                 System.out.println("Okuma İşlemi Başarılı");
                         
            }
            catch(Exception hata){
                  hata.printStackTrace();
            }
     }
    
    }
}
