package Ejercicio31_lectoresDocumentos;

public abstract class LectorDocumento {
    protected String ruta;

    public abstract void abrirArchivo(String ruta);

    public abstract String extraerTexto();

    protected void validarExtension(String ruta, String extension) {
        if (!ruta.toLowerCase().endsWith(extension)) {
            throw new IllegalArgumentException("Extensión no compatible: se esperaba " + extension + " y se recibió \"" + ruta + "\".");
        }
        this.ruta = ruta;
    }

    protected void validarAbierto() {
        if (ruta == null) {
            throw new IllegalStateException("Primero hay que abrir un archivo.");
        }
    }
}
