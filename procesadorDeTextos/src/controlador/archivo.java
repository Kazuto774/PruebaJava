/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Ángel Ramírez
 */
public class archivo {
    private File ruta;
    private ArrayList<String> texto;
    public archivo (File r) throws FileNotFoundException, IOException {
        this.ruta=r;
    }
    public void leer() throws FileNotFoundException, IOException{
        String renglon=" ";
        texto=new ArrayList<String>();
        BufferedReader bufer=new BufferedReader(new FileReader(this.ruta));
        while((renglon=bufer.readLine()) !=null ){
                texto.add(renglon);
        }
        bufer.close();
    }
    public void escribir(String texto) throws IOException{
        BufferedWriter bufer=new BufferedWriter(new FileWriter(this.ruta));
        bufer.write(texto);
        bufer.close();
    }
    public String getTextoConNL() throws IOException{
        String x=" ";
        this. leer();
        for (int i = 0; i < texto.size(); i++) {
            x+=i+1+"\t"+texto.get(i)+"\n";
        }
        return x;
        }
    /*public String buscarPublic(){
        
    }*/
    }

