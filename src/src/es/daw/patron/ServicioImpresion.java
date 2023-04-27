/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src.es.daw.patron;

/**
 *
 * @author alumnot
 */
public class ServicioImpresion {

        
        ServicioEnvio servEnvio;
        ServicioPDF servPDF;
        

    public ServicioImpresion() {
        servEnvio = new ServicioEnvioLog();
        servPDF = new ServicioPDF();
    }
        
    public ServicioImpresion(ServicioPDF servPDF, ServicioEnvio servEnvio){
        this.servEnvio = servEnvio;
        this.servPDF = servPDF;
    }
    
    public void imprimir(){
        servEnvio.enviar();
        servPDF.imprimir();
    }
}
