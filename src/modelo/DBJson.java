/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.google.gson.Gson;
import java.io.*;

/**
 *
 * @author jhona
 */
public class DBJson implements IDB{

    public DBJson() {
    }

    @Override
    public boolean guardar(Empleado empleado) {
        boolean escritura = false;
        Gson gson = new Gson();//Objeto con el cual se implementara la API Gson
        
         /*Mediante el método toJson(), se convierten los valores del objeto 
        Person a formato de texto JSON, lo  cual se concatena en la cadena de 
        caracteres json junto a las llaves que abren y cierran el arreglo del 
        archivo */

        
        String json = gson.toJson(empleado)+"\n]";
        
        
        
         /* El siguiente fragmento de código muestra la escritura sobre 
        un fichero desde Java, visto en cursos anteriores como técnicas de 
        programación, se escribirá lo concatenado en la cadena de caracteres 
        json en un archivo llamado e2.json*/
        
        BufferedWriter bw = null;
        FileWriter fw = null;
        BufferedReader br = null;
        FileReader fr = null;
        try {
            File file = new File("archivoEmpleados.json");
            // Si el archivo no existe, se crea
            if (!file.exists()) {
                file.createNewFile();
            }
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null){
                if(!line.equals("]")){
                    if(!line.equals("[") && !line.endsWith(",")){
                        line += ",";
                    }
                    bw.write(line);
                    bw.newLine();
                }else{
                    bw.write(json);
                    break;
                }
            }
            System.out.println("información agregada!");
            escritura = true;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                    bw.close();
                if (fw != null)
                    fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        System.out.println("\n"+"Escritura sobre archivoEmpleados.json"+"\n"+json);
        return escritura;
    }

    @Override
    public boolean actualizar(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado consultar(String identificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
