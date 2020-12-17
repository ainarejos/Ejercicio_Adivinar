import java.util.Scanner;

public class Parte3 {
    public static void main(String[] args) {
        boolean admin=false;
        Scanner sc = new Scanner(System.in);
        int[] valores=new int[5];
        int contador=0;
        int ganados=0;
        int monedero=20;
        //Se le pide al usuario que introduzca una moneda, en el caso de que el dueño queira apagar la maquina introduciria el codigo secreto(1234).
        System.out.println("Introduce una moneda, si aciertas ganaras un bonus de 5€");
        int moneda =sc.nextInt();
        //Si introduce algo que no sea una moneda o el numero secerto, se le vuelve a soluicitar al usurio que introduza la moneda.
        while (moneda!=1&&moneda!=1234){
            System.out.println("Unicamente puedes introducir una moneda, por fabor vuelve a intentaro");
            moneda =sc.nextInt();
        }
        if (moneda==1234){
            admin=true;
        }
        //Comienza el juego
        while (moneda==1&&admin==false&&monedero>0){
            int adivinar=(int)(Math.random()*99+0);
            System.out.println(adivinar);
            Boolean salir = false;
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
            //repuestas para si acierta o no.
            if (adivinar==valor){
                System.out.println("Enorabuena has acertado en : " + (contador + 1) + " intentos, como bonus recibes 5€");
                valores[contador]=valor;
                System.out.println("Los valores que has probado son: " + valores[0] + " " + valores[1] + " " + valores[2] + " " + valores[3] + " " + valores[4]);
                monedero=monedero-5;
                ganados++;
                System.out.println("Se han ganado: " + ganados + " veces");
            } else {
                System.out.println("No has acertado, tu numero de intentos han sido: " + (contador + 1));
                valores[4]=valor;
                System.out.println("Los numeros que has introducido han sido: " + valores[0] + " " + valores[1] + " " + valores[2] + " " + valores[3] + " " + valores[4]);
            }
            contador=0;
            //Se le pide al usuario, que si quiere seguir jugando introduzca otra oneda
            if (monedero>0){
                System.out.println("Introduce otra moneda si quieres seguir jugando");
                moneda=sc.nextInt();
            }
            while (moneda!=1&&moneda!=1234){
                System.out.println("Unicamente puedes introducir una moneda, por fabor vuelve a intentaro");
                moneda =sc.nextInt();
            }
        }
        System.out.println("El saldo de la maquina es: " + monedero);
    }
}
