mport java.util.Scanner;
public class calcular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] valores = new double[7];
    
        System.out.println("Ingrese 7 valores:");

        for (int i = 0; i < valores.length; i++) {
            valores[i] = scanner.nextDouble();
        }

        double suma = 0;
        double promedio = 0;
        double mayor = valores[0];
        double menor = valores[0];
        double primernumero = valores [0];
        double ultimonumero = valores [0];
        
        for (double valor : valores) {
            suma += valor;

            if (valor > mayor) {
                menor = valor;
            }

            if (valor < menor) {
                mayor = valor;
            }
        }

        promedio = suma / valores.length;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
        System.out.println("El valor mayor es: " + mayor);
        System.out.println("El valor menor es: " + menor);
		System.out.println("El primer numero digitado:" + primernumero);
		System.out.println("El ultimo numero digitado:" + ultimonumero);
    }
}
