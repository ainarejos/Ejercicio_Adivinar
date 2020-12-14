import java.util.Scanner;

public class Parte2 {
    public static void main(String[] args) {
        boolean acertar=false;
        int valor;
        int adivinar=(int)(Math.random()*99+0);
        int[] valores=new int[5];
        int contador=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Intenta adivinar el numero entre el 0 y 99 que estoy pensando: ");
        valor = sc.nextInt();
        for (int i = 0; i <4 ; i++) {
            if (adivinar>valor){
                System.out.println("El valor introducido es incorrecto, el valor a adivinar es mas grande: ");
                valores[i]=valor;
                valor = sc.nextInt();
                contador++;
            } else if (adivinar<valor){
                System.out.println("El valor introducido es incorrecto, el valor a adivinar es mas pequeño: ");
                valores[i]=valor;
                valor = sc.nextInt();
                contador++;
            }
        }
        if (adivinar==valor){
            System.out.println("Enorabuena has acertado en : " + contador + " intentos");
            valores[contador-1]=valor;
            System.out.println("Los valores que has probado son: " + valores[0] + " " + valores[1] + " " + valores[2] + " " + valores[3] + " " + valores[4]);
            acertar=true;
        } else if (acertar==false) {
            System.out.println("No has acertado, tu numero de intentos han sido: " + contador);
            valores[4]=valor;
            System.out.println("Los numeros que has introducido han sido: " + valores[0] + " " + valores[1] + " " + valores[2] + " " + valores[3] + " " + valores[4]);
        }
    }
}
