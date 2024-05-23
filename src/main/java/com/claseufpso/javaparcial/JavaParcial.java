
package com.claseufpso.javaparcial;

import java.io.File;
import java.io.IOException;


public class JavaParcial {

    public static void main(String[] args) throws IOException {
        File file = new File("./archivo.txt");
        try{
            
            if(file.exists()){
                 System.out.println("Ya existe");       
            }
            else{
                 file.createNewFile();
            }

        }
        catch(IOException e){
            System.out.println("No existe");
        }
       
    }
}
