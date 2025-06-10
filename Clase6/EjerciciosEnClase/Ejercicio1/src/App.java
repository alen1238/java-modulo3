public class App {
    public static void main(String[] args) throws Exception {
        int numero = 13;
        boolean resultado = EsPrimo(numero);
        System.out.println("¿Es primo el número " + numero + "?: " + resultado);
    }

    public static boolean EsPrimo(int n){
        if(n <= 1){
            return false;
        }

        for(int i = 2; i <= n/2; i++ ){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
