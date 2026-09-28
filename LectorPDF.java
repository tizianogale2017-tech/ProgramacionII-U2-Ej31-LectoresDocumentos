package Ejercicio31_lectoresDocumentos;

public class LectorPDF extends LectorDocumento {
    @Override
    public void abrirArchivo(String ruta) {
        validarExtension(ruta, ".pdf");
    }

    @Override
    public String extraerTexto() {
        validarAbierto();
        return "[PDF] Texto extraído de las páginas de " + ruta;
    }
}
