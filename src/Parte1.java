import java.util.Scanner;

public class Parte1 {
    public static void main(String[] args) {
        Boolean salir = false;
        int valor;
        int adivinar=(int)(Math.random()*9+0);
        int contador=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intenta adivinar el numero entre el 0 y 9 que estoy pensando: ");
        valor = sc.nextInt();
        while (!salir){
            if (valor==adivinar){
                salir=true; //activa bandera cuando la condicion se cumple que es 5
            } else {
                //tractament del programa
                System.out.println("El numero introducido no es el correcto, vuelve a intentarlo: ");
                valor = sc.nextInt();
                contador++;
            }
        }
        System.out.println("Enorabuena has acertado en: " + contador + " intentos");
        System.out.println("El numero a adivinar era: " + adivinar);

    }
}
