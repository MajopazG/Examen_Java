package lavadoras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicio {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        List<lav_grande> lavG = new ArrayList<>();
        List<lav_pequeña> lavP = new ArrayList<>();
        int descuento = 0;


        int opcion = 0;
        double domicilio;
        do {
            System.out.println("Ingrese 1: Lavadora Pequeña \n Ingrese 2: Lavadora Grande \n Ingrese 3: salir");
            opcion = x.nextInt();

            if (opcion == 1) {
                System.out.println("ingreso cantidad horas");
                int cantidadHoras = x.nextInt();
                if (cantidadHoras > 5) {
                    descuento = 4000;
                }
                domicilio = (cantidadHoras * 6000) * 0.02;
                double cuentaCobro = cantidadHoras * 6000 + domicilio - descuento;
                lavP.add(new lav_pequeña(6000, domicilio, cantidadHoras, cuentaCobro));

                System.out.println(lavP);

                for (lav_pequeña a : lavP) {
                    System.out.println("Precio: " + a.getPrecio());
                    System.out.println("Domicilio: " + a.getDomicilio());
                    System.out.println("Cantidad De Horas: " + a.getCanHoras());
                    System.out.println("Cuenta De Cobro: " + a.getCuentaCobro());
                }
            }

            if (opcion == 2) {
                System.out.println("ingreso cantidad horas");
                int cantidadHoras = x.nextInt();
                domicilio = (cantidadHoras * 8000) * 0.02;
                double cuentaCobro = cantidadHoras * 8000 + domicilio - descuento;
                lavG.add(new lav_grande(8000, domicilio, cantidadHoras, cuentaCobro));

                System.out.println(lavG);

                for (lav_grande a : lavG) {
                    System.out.println("Precio: " + a.getPrecio());
                    System.out.println("Domicilio: " + a.getDomicilio());
                    System.out.println("Cantidad De Horas: " + a.getCanHoras());
                    System.out.println("Cuenta De Cobro: " + a.getCuentaCobro());
                }

            }

        } while (opcion != 3);
    }
}


