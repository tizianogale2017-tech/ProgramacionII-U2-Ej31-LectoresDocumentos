package Ejercicio31_lectoresDocumentos;

public class LectorWord extends LectorDocumento {
    @Override
    public void abrirArchivo(String ruta) {
        validarExtension(ruta, ".docx");
    }

    @Override
    public String extraerTexto() {
        validarAbierto();
        return "[Word] Párrafos extraídos de " + ruta;
    }
}
