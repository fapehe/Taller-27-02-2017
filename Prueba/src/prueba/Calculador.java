/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Estudiantes
 */
public class Calculador {
    
    float numero1;
    float numero2;
    
    
    float sumar(){
        
        return numero1+numero2;
    }
    
    float restar(){
        
        return numero1-numero2;
    }
    
    float multiplicar(){
        
        return numero1*numero2;
    }
    
    float dividir(){
        
        float resultado;
        try{
            resultado= numero1/numero2;
        }catch(Exception e){
            
            resultado=0;
        }
        
        return resultado;
        
    }
    
    
    
    
}
