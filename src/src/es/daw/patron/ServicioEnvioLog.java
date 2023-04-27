package src.es.daw.patron;


public class ServicioEnvioLog extends ServicioEnvio{

    @Override
    public void enviar() {
        System.out.println("Haciendo log del envio del documento...");
        super.enviar(); 
    }
    
    
    
}
