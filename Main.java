package Ejercicio31_lectoresDocumentos;

public class Main {
    public static void main(String[] args) {
        LectorDocumento[] lectores = {new LectorPDF(), new LectorWord(), new LectorTextoPlano(), new LectorPDF()};
        String[] archivos = {"contrato.pdf", "informe.docx", "notas.txt", "planilla.xlsx"};

        for (int i = 0; i < lectores.length; i++) {
            try {
                lectores[i].abrirArchivo(archivos[i]);
                System.out.println(lectores[i].extraerTexto());
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }
}
