package app;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) throws Exception {
        System.out.print("Introduce un caracter: ");
        String LetraP; //Declara el caracter que se va a pedir
        final Scanner LetraScan = new Scanner(System.in); //Se pide el caracter
        LetraP = LetraScan.nextLine(); //Se guarda el caracter
        int LetrasA = 0; //Se declara el valor numerico que va a tomar
        LetrasA = LetraP.charAt(0); //Pasa de ser caracter a su valor en ascii
        String b; //Se declara el valor en binario que va a tomar
        b = Integer.toBinaryString(LetrasA); //se trasforma a binario
        System.out.print("Introduce el divisor: ");
        String DivisorP;
        final Scanner DivisorScan = new Scanner(System.in);
        DivisorP = DivisorScan.nextLine();
        System.out.println("Seleccione el tipo de Paridad");
        System.out.println("1. Par");
        System.out.println("2. Impar");
        System.out.print("Opcion: ");
        int OpcP;
        final Scanner OpcScan = new Scanner(System.in);
        OpcP=OpcScan.nextInt();
        switch(OpcP){
            case 1:
                
                break;
            case 2: 
                
                break;
            default:
                System.out.println("Opcion no valida");
        }

    }
    
    public void menu(){

    }
}