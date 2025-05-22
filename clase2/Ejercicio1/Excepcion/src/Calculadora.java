public class Calculadora {

    public double sumar(int a , int b){
        return a + b;
    }

    public double dividir(double a, double b) throws ArithmeticException, DivisionInvalidaException {
        if(b==0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        if(b > a){
            throw new DivisionInvalidaException("El divisor no puede ser mayor");
        }
        return a/b;
    }
}
