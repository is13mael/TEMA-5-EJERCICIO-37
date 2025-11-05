public class App {
    public static void main(String[] args) throws Exception {
        try{
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numero = Integer.parseInt(System.console().readLine());

        int aux = numero;
        int divisor = 1;
        int longitud = 0;

        while (aux > 0) {
            aux = aux / 10;
            longitud++;
        }

        for(int i = 1; i < longitud; i++){
            divisor = divisor * 10;
        }

        aux = numero;
        String resultado = "";

        while (divisor > 0) {
            int digito = aux / divisor;
            aux = aux % divisor;
            divisor = divisor / 10;

            int contador = 0;
            while (contador < digito) {
                resultado = resultado + "|";
                contador++;
            }

            if (divisor > 0) {
                resultado = resultado + " - ";
            }
        }

        System.out.printf("El %d en decimal es el %s en el sistema de palotes", numero, resultado);
    }catch(NumberFormatException e){
        System.out.println("Número mal introducido.");
    }catch(Exception e){
        System.out.println("Error inesperado.");
    }
}
}