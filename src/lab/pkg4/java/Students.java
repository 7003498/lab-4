/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4.java;

/**
 *
 * @author ESTEBAN
 */
public class Students {
    
    private double notas[];
    private String nombre;
    private double def;
    private String result;
    
    
    Students(String nom,double not[],int val){
        nombre = nom;
       
        notas = not;
        
        setDef(val);
        setRes();
    }
    public void setRes(){
        if(def >= 3){
            result = "APROBO";
        }
        else{
            result = "REPROBO";
        }
    }

    public double getNotas(int i) {
        return notas[i];
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDef() {
        return def;
    }

    public void setDef(double def) {
        this.def = def;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    public void setDef(int numNotas){
        double def1 = 0;
        for (int i = 0; i < numNotas; i++) {
            def1 += notas[i];
        }
        def = def1/numNotas;
    }
}
