/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeDesingPattern;

import com.itextpdf.text.Document;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPTable;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

import java.util.Iterator;



/**
 *
 * @author mustafa
 */
public class SinavYoklamaListeleri {

    public void SinavYoklamaOlustur(String Jderslik,String Jgözetmen){
        
     

        try {
           String path = "Content\\Facade\\OgrenciListesi.xls";
           String path2 = "Content\\Facade\\YoklamaListesi.pdf";
                FileInputStream fi = new FileInputStream(new File(path));
                
                HSSFWorkbook workbook = new HSSFWorkbook(fi); 
                
                HSSFSheet sheet = workbook.getSheetAt(0); 
                
                Iterator<Row> rowIterator = sheet.iterator();
                
                Document document = new Document();
                
                PdfWriter.getInstance(document, new FileOutputStream(path2));
                document.open();
                
                PdfPTable my_table = new PdfPTable(3);
                
                PdfPCell table_cell;
                
                document.add(new Paragraph("Derslik: "+Jderslik+" "+"Sinav Gözetmeni: "+Jgözetmen));
                
            document.add(new Paragraph("-------------------------------------------------------------------------------------------------------------------------------"));
                while(rowIterator.hasNext()) {
                    
                        Row row = rowIterator.next(); 
                        Iterator<Cell> cellIterator = row.cellIterator();
                                while(cellIterator.hasNext()) {
                                        Cell cell = cellIterator.next(); 
                                        CellType type = cell.getCellType();
                   
                                        if(type==CellType.STRING){
                                                
                                                 table_cell=new PdfPCell(new Phrase(cell.getStringCellValue()));
                                                 
                                                 my_table.addCell(table_cell);
                                                 
                                             
                                        }
                                      
                                        
                                }
                }
                
                document.add(my_table);   
                System.out.println("Sinav Yoklama Listesi Oluşturuldu.");
                document.close();                

                document.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
  

}

