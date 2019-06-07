/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presenter;

import Model.Model;
import Model.SinavOlusturmaModel;
import View.SinavOlusturmaView;
import java.io.BufferedReader;
import java.io.FileReader;


/**
 *
 * @author inanb
 */
public class SinavOlusturmaPresenter {
    
     String path = "Content\\Sinavlar.txt";
      String path2 = "Content\\Dersler.txt";
    private SinavOlusturmaView view;
    private SinavOlusturmaModel model;
    private Model model2;
   
    
 
    
    public SinavOlusturmaPresenter(SinavOlusturmaView view, SinavOlusturmaModel model,Model model2)
    {
        this.view = view;
        this.model = model;
        this.model2=model2;
    }
    
     public void DosyaOku(){
         
            try{
               
                 BufferedReader bf=new BufferedReader(new FileReader(path2));
                 
                 String line=bf.readLine();
                 
                 while(line != null)
                 {
                     view.updateStatusComboBox3(line);
                     line = bf.readLine();
                    
                     
                 }
                 System.out.println("Okuma İşlemi Başarılı");
                         
            }
            catch(Exception hata){
                  hata.printStackTrace();
            }
      }
}
