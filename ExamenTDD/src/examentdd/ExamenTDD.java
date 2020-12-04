/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examentdd;

/**
 *
 * @author Fernando
 */
public class ExamenTDD {
    
    public ExamenTDD() {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    public String obtenerAccion(boolean matriculado){
        if(matriculado){
            return "yamatriculado";
        }
    return "";
    }
    public String obtenerAccion(boolean matriculado, boolean registrado){
        if(matriculado && registrado){
            return "yamatriculado";
        }else if(matriculado){
            return "yamatriculado";
        }
        
        return "";
    }
    public String obtenerAccion(boolean matriculado, boolean registrado, boolean esDocente , boolean cursoObligatorio){
        if(!matriculado){
            if(registrado && esDocente){
                if(cursoObligatorio){
                return"nodestinado";
                }else{
                    return "matricularse";
                } 
            }
           
        }
        
        return "";
    }
   
}
