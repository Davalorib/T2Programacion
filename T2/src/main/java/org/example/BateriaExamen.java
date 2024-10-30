package org.example;

import java.util.Scanner;

public class BateriaExamen {

    public void ej1(){

        Scanner en = new Scanner(System.in);

        int cont0 =0, cont1=0, cont2=0;

        System.out.println("dime el num");
        int nume = en.nextInt();

        for (int i=1; i<=nume; i++){

            System.out.println("damelo");
            int num = en.nextInt();

            if (num<0){
                cont0++;
            } else if (num>0){
                cont1++;
            } else{
                cont2++;
            }

        }

        System.out.println(cont0+" "+cont1+" "+cont2+" ");

    }

    public void ej2(){

        Scanner en = new Scanner(System.in);


        System.out.println("Dame el 1er num: ");
        int num1 = en.nextInt();
        int num3 = num1;
        System.out.println("Dame el exponente: ");
        int num2 = en.nextInt();

        for (int i = 1; i<num2; i++){

            num3*=num1;

        }

        System.out.println(num3);

    }

    public void ej3(){

        Scanner en = new Scanner(System.in);

        System.out.println("Dime los meses de tu financiacion: ");
        int fin = en.nextInt();
        int num1 = 10, num2=0;

        for (int i=1; i<=fin; i++){

            System.out.println("Mes "+i+": "+num1+"€");
            num2+=num1;
            num1*=2;

        }

        System.out.println("Total a pagar: "+num2+"€");

    }


}
