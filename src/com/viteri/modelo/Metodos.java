/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.viteri.modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.table.TableModel;

/**
 *
 * @author USER
 */
public class Metodos {
    
     static String ruta = System.getProperties().getProperty("user.dir")+"//";

    public static TableModel EscribeTxt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String[] LeerTxt(String ruta_archivo){
        String numeros[] = new String[3];
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null; 
      try {
         archivo = new File (ruta+"//"+ruta_archivo);
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         // Lectura del fichero
         String linea;
         int n = 0;
         while((linea=br.readLine())!=null){
            System.out.println(linea);
            numeros[0]=linea;
            n++;
         }          
      }
      
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      return numeros;
    }
    
      public static void EscribeTxt(String ruta_archivo, StringBuffer numeros)
    {
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(ruta+ruta_archivo);
            pw = new PrintWriter(fichero);            
            pw.println(numeros+"\n");
 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {           
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    
}
