package src.es.daw.patron;


public class AppImpresiones {

    public static void main(String[] args) {
        
//        ServicioImpresion servicio = new ServicioImpresion();
       
        ServicioImpresion servicio = new ServicioImpresion(new ServicioPDF(), new ServicioEnvioLog());
        
        servicio.imprimir();
        
    }
    
}
