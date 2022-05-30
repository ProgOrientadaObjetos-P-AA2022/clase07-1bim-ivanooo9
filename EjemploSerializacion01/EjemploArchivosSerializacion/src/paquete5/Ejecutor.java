package paquete5;


public class Ejecutor {
       public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "Hospital.data";

        Hospital h1 = new Hospital("San Pablo", 500, 260541849.44);
        Hospital h2 = new Hospital("Isidro Ayora", 550, 26012449.44);
        

       Hospital[] lista = {h1, h2};

        EscrituraArchivoSecuencial archivo = new
        EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerRegistro(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        System.out.println(lectura);
    }
}