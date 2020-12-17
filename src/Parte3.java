import java.util.Scanner;

public class Parte3 {
    public static void main(String[] args) {
        Boolean salir = false;
        Scanner sc = new Scanner(System.in);
        int[] valores=new int[5];
        int contador=0;
        int adivinar=(int)(Math.random()*99+0);
        System.out.println("Introduce una moneda: ");
        int moneda =sc.nextInt();
        while (moneda==1){
            System.out.println("Intenta adivinar el numero entre el 0 y 99 que estoy pensando: ");
            int valor = sc.nextInt();
            while (!salir){
                if ((valor==adivinar)||(contador==4)){
                    salir=true; //activa bandera cuando la condicion se cumple que es 5
                }else{
                    //tractament del programa
                    if (adivinar>valor){
                        System.out.println("El valor introducido es incorrecto, el valor a adivinar es mas grande: ");
                        valores[contador]=valor;
                        valor = sc.nextInt();
                        contador++;
                    } else if (adivinar<valor){
                        System.out.println("El valor introducido es incorrecto, el valor a adivinar es mas pequeño: ");
                        valores[contador]=valor;
                        valor = sc.nextInt();
                        contador++;
                    }
                }
            }
            if (adivinar==valor){
                System.out.println("Enorabuena has acertado en : " + (contador + 1) + " intentos");
                valores[contador-1]=valor;
                System.out.println("Los valores que has probado son: " + valores[0] + " " + valores[1] + " " + valores[2] + " " + valores[3] + " " + valores[4]);
            } else {
                System.out.println("No has acertado, tu numero de intentos han sido: " + (contador + 1));
                valores[4]=valor;
                System.out.println("Los numeros que has introducido han sido: " + valores[0] + " " + valores[1] + " " + valores[2] + " " + valores[3] + " " + valores[4]);
            }
            contador=0;
            System.out.println("Introduce otra moneda si quieres seguir jugando");
            moneda=sc.nextInt();
        }
    }
}
