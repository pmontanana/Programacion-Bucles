import java.util.*;

public class Bucles {
    static Scanner sc = new Scanner(System.in);

    public static void intervaloBucles() {
        int num1, num2, num3;
        int mayor, menor;
        int leidos = 1;

        do {
            System.out.println("Introduce primer número");
            num1 = sc.nextInt();
            System.out.println("Introduce segundo número");
            num2 = sc.nextInt();
        } while (Math.abs(num1 - num2) != 25 || num1 < 0 || num2 < 0);
        System.out.println("El intervalo es entre " + num1 + " y " + num2);
        if (num1 > num2) {
            mayor = num1;
            menor = num2;
        } else {
            mayor = num2;
            menor = num1;
        }

        do {
            System.out.println("Introduce numero (" + leidos + ") :");
            num3 = sc.nextInt();
            if (num3 <= mayor && num3 >= menor) {
                System.out.println("El número es correcto");
                leidos++;
            } else {
                System.out.println("El numero es incorrecto");
            }
        } while (leidos < 8);

    }

    public static double iva(String tipo, int base) {
        double cuota = 0;

        switch (tipo) {
            case "superreducido":
                cuota = base * 4 / 100;
                break;
            case "reducido":
                cuota = base * 0.1;
                break;
            case "normal":
                cuota = base * 0.21;
                break;
        }
        return cuota;
    }

    public static double descuento(int base) {
        double descontado = 0;

        if (base > 100000 ) {
            descontado = base * 0.2;
        } else if (base > 10000) {
            descontado = base * 0.15;
        } else if (base > 1000) {
            descontado = base * 0.1;
        }

        return descontado;
    }

    public static void ivaDescuentos(){
        int importe;
        String tipoIva;
        double cuotaIva, importeDescuento;

        System.out.println("¿Que tipo de IVA pagas?:");
        tipoIva = sc.nextLine();
        System.out.println("¿Cuanto vas a pagar?:");
        importe = Integer.parseInt(sc.nextLine());
        cuotaIva = iva(tipoIva, importe);
        importeDescuento = descuento(importe);
        System.out.println("Total:"+ (importe+cuotaIva-importeDescuento) + "********** IVA: " + iva(tipoIva, importe) + "********** Descuento: " + descuento(importe));

    }

    public static String menu(){
        String menu;

        menu = sc.next();
        return menu;
    }

    public static int precio(){
        int precio;

        precio = sc.nextInt();
        return precio;
    }


    public static void Restaurante(){
        do{
            
        }while(precio() != 0);
    }
    

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("1. Intervalo con bucles");
            System.out.println("2. IVA y descuentos");
            System.out.println("3. Restaurante");
            System.out.println("4. Sobrecarga: Suma de N numeros con bucle");
            System.out.println("5. Sobrecarga: Suma de N numeros recursivos");
            System.out.println("6. Salir");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    intervaloBucles();
                    break;
                case 2:
                    ivaDescuentos();
                    break;

                case 3:
                    // restaurante();
                    break;

                case 4:
                    // sumaNBucles();
                    break;

                case 5:
                    // sumaNRecursivos();
                    break;
            }
        } while (opcion != 6);

    }
}