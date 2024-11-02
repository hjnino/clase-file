import java.io.*;

public class Main {
    public static void main(String[] args) {

        File file = new File("D://Ejercicios/test.txt");

        //1.Leer un archivo, identificar si la ruta es correcta.

        System.out.println(file.exists());

        String ruta = "D://Ejercicios/";

        String nombreArchivo = "test.txt";

        try (FileReader fr = new FileReader(ruta + nombreArchivo)) {

            BufferedReader br = new BufferedReader(fr);

            String linea;
            double sumapromedio  = 0;
            double promedio = 0;
            int conteo = 0;
            int mayor = 0;
            int menor = 0;
            

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);

                try {
                    int i = Integer.parseInt(linea.trim());
                    if (conteo ==0 ) {
                        menor =i ;
                    }
                    sumapromedio = sumapromedio + i;

                    if (i > mayor) {
                        mayor = i;
                    }
                    if (i < menor){
                        menor = i;
                    }
                    //System.out.println("Conteo: " + conteo);
                    conteo++;

                }
                catch (NumberFormatException nfe){
                    //System.out.println("NumberFormatException: " + nfe.getMessage());
                }
            }

            promedio = sumapromedio/conteo;

            System.out.println("El promedio es: "+ promedio);
            System.out.println("El mayor es: "+ mayor);
            System.out.println("El menor es: "+ menor);

        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}
