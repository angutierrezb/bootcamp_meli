/*
Se plantea desarrollar un programa que permita mediante una interfaz imprimir diferentes tipos de documentos.

Entre los tipos de documentos se encuentran:

Curriculums: incluye a una persona con todos sus atributos más una lista de sus habilidades.
Libros en PDF: Incluyen atributos como cantidad de páginas, nombre del autor, título y género.
Informes: Incluyen un texto de n longitud, cantidad de páginas, autor, y revisor.
Representar un escenario donde se creen cada uno de estos objetos y que, por medio de un método estático
de una interfaz imprimible, se pueda pasar cualquier tipo de documento y sea impreso el contenido.
*/

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum("Bob", "Patiño", Arrays.asList("Java", "Spring", "SQL"));
        PDFBook book = new PDFBook(300, "Gabriel García Márquez", "Cien Años de Soledad", "Realismo mágico");
        Report report = new Report("Este es un informe sobre...", 10, "Ana García", "Luis Morales");

        Printable.printDocument(cv);
        Printable.printDocument(book);
        Printable.printDocument(report);
    }
}