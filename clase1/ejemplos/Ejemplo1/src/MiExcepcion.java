public class MiExcepcion extends Exception{

    public void mensaje(String mensaje){
        System.out.println("Se produjo una excepción del tipo MiExcepción: " + mensaje);
    }
   
}
