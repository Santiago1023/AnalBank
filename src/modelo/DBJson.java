/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.google.gson.Gson;
import java.io.*;
import java.util.ArrayList;

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
        
        Empleado[] empleados = obtenerEmpleados();
        Gson gson = new Gson();//Objeto con el cual se implementara la API Gson
                        
        String json="["+gson.toJson(empleado);
        if(empleados == null){
            json += "]";
        }else{
            json += ",\n";
            for (int i = 0; i < empleados.length; i++) {
                if(i != empleados.length - 1){
                    json += gson.toJson(empleados[i]) + ",\n";
                }else{
                    json += gson.toJson(empleados[i]) + "]";
                }
            }
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivoEmpleados.json"))) {
            bw.write(json);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }   
        
        return escritura;
    }

    @Override
    public boolean actualizar(Empleado empleado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empleado consultar(String identificacion) {
        Gson gson = new Gson();//Objeto con el cual se implementara la API Gson
        
        Empleado[] empleados = obtenerEmpleados();
        if(empleados != null){
            for(Empleado empleado: empleados){
                if(empleado.id.equals(identificacion)){
                    return empleado;
                }
            }
        }
        return null;
    }
    
    public Empleado[] obtenerEmpleados(){
        Gson gson = new Gson();//Objeto con el cual se implementara la API Gson
        String json = ""; 
        
        try (BufferedReader br = new BufferedReader(new FileReader("archivoEmpleados.json"))){
            String line;
            while ((line = br.readLine()) != null) {
                json += line;
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        Empleado[] empleados = gson.fromJson(json, Empleado[].class);
        
        return empleados;
    }
}
