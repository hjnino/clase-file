import java.io.*;

public class LeerArchivo {

    public static void main(String[] args) {
        String ruta = "D:\\";

        String nombreArchivo = "CARGAMASIVA_GARANTIASROBOTIC.txt";

        try (FileReader fr = new FileReader(ruta + nombreArchivo)) {

            BufferedReader br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

