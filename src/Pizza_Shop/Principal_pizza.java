package Pizza_Shop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal_pizza {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;
        double costoTotal = 0;
        int cantidad = 0;
        Map<Integer, Pizza> map = new HashMap<Integer, Pizza>();
        do {
            System.out.println("Ingrese el numero del combo que desea:  \n Digite 1 para el combo1 \n Digite 2 para el combo2 \n Digite 3 para el combo3 \n Digite 4 para salir ");
            opcion = lector.nextInt();
            if (opcion == 1) {
                System.out.println("Ingrese la cantidad: ");
                cantidad = lector.nextInt();
                Pizza p = new Pizza("Pizza grande con sabor a eleccion acompañada de gaseosa 1.5lt", cantidad, 5000, 50000);
                map.put(1, p);
                costoTotal += p.calcularCosto();
            } else if (opcion == 2) {
                System.out.println("Ingrese la cantidad: ");
                cantidad = lector.nextInt();
                Pizza p2 = new Pizza("Pizza Toci Vegetales Personal - tocineta, champiñon, pimentón, cebolla y tomate.", cantidad, 5000, 25000);
                map.put(1, p2);
                costoTotal += p2.calcularCosto();
            } else if (opcion == 3){
                System.out.println("Ingrese la cantidad: ");
                cantidad = lector.nextInt();
                Pizza p3 = new Pizza("Pizza Peperoni Mega Chesse Personal - peperoni y queso mozarella en salsa napolitana incluye extra-queso.",cantidad,5000,30000);
                map.put(1,p3);
                costoTotal += p3.calcularCosto();
            }
        } while (opcion != 4);

        System.out.println("El valor de Cuenta es: "+ costoTotal );
    }
}
