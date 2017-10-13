package año.bisiesto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        int anio ;

        System.out.println("Lectura de Datos");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("introduzca anio a saber: ");
        anio = Integer.parseInt(br.readLine());
        if((anio %4 ==0 && anio%100 !=0) || anio %400==0 )
            System.out.println("el anio es bisiesto");
        else
            System.out.println("el anio es bisiesto");

    }
}
