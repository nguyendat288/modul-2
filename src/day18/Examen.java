package day18;

import java.util.Scanner;

public class Examen {
    public static void main(String[] args) {
        Scanner t=new Scanner (System.in);
        int inhora, inmin, inseg, finhora, finmin, finseg;
        do
        {
            System.out.println("Ingresa una hora de inicio:");
            inhora=t.nextInt();
            if (inhora <0 || inhora>=24)
                System.out.println("Hora incorrecta");
        }
        while (inhora <0 || inhora>=24);

        do
        {
            System.out.println("Ingresa el minuto de inicio:");
            inmin=t.nextInt();
            if (inmin <0 || inmin>=60)
                System.out.println("Minuto incorrecto");
        }
        while (inmin <0 || inmin>=60);

        do
        {
            System.out.println("Ingresa el segundo de inicio:");
            inseg=t.nextInt();
            if (inseg <0 || inseg>=60)
                System.out.println("Segundo incorrecto");
        }
        while (inseg <0 || inseg>=60);

        System.out.println("Hora de inicio ingresada:"+inhora+":"+inmin+":"+inseg);

        do
        {
            System.out.println("Ingresa una hora de finalización:");
            finhora=t.nextInt();
            if (finhora <0 || finhora>=24)
                System.out.println("Hora incorrecta");
            if (finhora<inhora)
                System.out.println("La hora final tiene que ser mayor que la inicial");
        }
        while (finhora <0 || finhora>=24);

        do
        {
            System.out.println("Ingresa el minuto de finalización:");
            finmin=t.nextInt();
            if (finmin <0 || finmin>=60)
                System.out.println("Minuto incorrecto");
        }
        while (finmin <0 || finmin>=60);

        do
        {
            System.out.println("Ingresa el segundo de finalización:");
            finseg=t.nextInt();
            if (finseg <0 || finseg>=60)
                System.out.println("Segundo incorrecto");
        }
        while (finseg <0 || finseg>=60);

        System.out.println("Hora final ingresada:"+finhora+":"+finmin+":"+finseg);

        do
        {
            System.out.println(inhora+":"+inmin+":"+inseg);

            inseg++;
            if (inseg>59)
            {
                inseg=0;
                inmin++;
            }
            if (inmin>59)
            {
                inmin=0;
                inhora++;
            }

            if (inhora>23)
            {
                inhora=0;
            }


        } while (inhora!=finhora);
    }
}
