package Ejercicio31_lectoresDocumentos;

public class LectorTextoPlano extends LectorDocumento {
    @Override
    public void abrirArchivo(String ruta) {
        validarExtension(ruta, ".txt");
    }

    @Override
    public String extraerTexto() {
        validarAbierto();
        return "[TXT] Contenido leído línea por línea de " + ruta;
    }
}
