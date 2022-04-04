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
    ConversorJSONtoEmpleado conversor;

    public DBJson() {
        conversor = new ConversorJSONtoEmpleado();
    }

    @Override
    public boolean guardar(Empleado empleado) {
        boolean escritura = false;        
        ArrayList<Empleado> empleados = obtenerEmpleados();
        Gson gson = new Gson();//Objeto con el cual se implementara la API Gson                        
        String json="["+gson.toJson(empleado);
        if(empleados.isEmpty()){
            json += "]";
        }else{
            json += ",\n";
            for (int i = 0; i < empleados.size(); i++) {
                if(i != empleados.size() - 1){
                    json += gson.toJson(empleados.get(i)) + ",\n";
                }else{
                    json += gson.toJson(empleados.get(i)) + "]";
                }
            }
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivoEmpleados.json"))) {
            bw.write(json);
            escritura = true;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }   
        
        return escritura;
    }

    @Override
    public boolean actualizar(String identificacionAntigua, Empleado empleado) {
        Gson gson = new Gson();
        ArrayList<Empleado> empleados = obtenerEmpleados();
        
        for (int i = 0; i < empleados.size(); i++) {
            if(identificacionAntigua.equals(empleados.get(i).id)){
                empleados.remove(i);
                
                String json="["+gson.toJson(empleado);
                if(empleados.isEmpty()){
                    json += "]";
                }else{
                    json += ",\n";
                    for (int j = 0; j < empleados.size(); j++) {
                        if(j != empleados.size() - 1){
                            json += gson.toJson(empleados.get(j)) + ",\n";
                        }else{
                            json += gson.toJson(empleados.get(j)) + "]";
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
                return true;
            }
        }
        return false;
    }

    @Override
    public Empleado consultar(String identificacion) {
        try (BufferedReader br = new BufferedReader(new FileReader("archivoEmpleados.json"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(identificacion)) {
                    return conversor.convertirEmpleado(line);
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    public ArrayList<Empleado> obtenerEmpleados(){
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("archivoEmpleados.json"))){
            String line;
            while ((line = br.readLine()) != null) {
                empleados.add(conversor.convertirEmpleado(line));
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
                
        return empleados;
    }
}
