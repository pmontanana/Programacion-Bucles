public class readme {
    public static int test(String operacion, int... numeros) {// Aquí no hace falta poner un nombre a cada parámetro o
        switch (operacion) {
            case "sumar":
                int suma = 0;
                for (int numero : numeros) {
                    suma += numero;
                }
                for (int i = 1; i < numeros.length; i++) {
                    if (numeros[i - 1] > numeros[i])
                        suma += numeros[i - 1] + 2;
                    else
                        suma += numeros[i];
                }
                return suma;
            case "restar":
                int resta = 0;
                for (int numero : numeros) {
                    resta -= numero;
                }
                return resta;
            case "multiplicar":
                int multiplicacion = 1;
                for (int numero : numeros) {
                    multiplicacion *= numero;
                }
                return multiplicacion;
            case "dividir":
                return numeros[0] / numeros[1];
            case "signo":
                return -numeros[0];
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Resultado de suma: " + test("sumar", 1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println("Resultado de resta: " + test("restar", 1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println("Resultado de multiplicar: " + test("multiplicar", 6, 7));
        System.out.println("Resultado de dividir: " + test("dividir", 63, 7));
        System.out.println("Resultado de signo: " + test("signo", 63));
    }

    public static int factorial(int numero) {
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero - 1);
    }
}
