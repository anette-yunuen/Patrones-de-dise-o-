public class Main {
    public static void main(String[] args) {
        // Crear figuras originales
        Circulo circuloOriginal = new Circulo(5, "Rojo");
        Rectangulo rectanguloOriginal = new Rectangulo(10, 5, "Azul");

        // Clonar las figuras
        Circulo circuloClonado = (Circulo) circuloOriginal.clone();
        Rectangulo rectanguloClonado = (Rectangulo) rectanguloOriginal.clone();

        // Modificar el clon sin afectar el original
        circuloClonado.setColor("Verde");

        // Mostrar resultados
        System.out.println("Círculo Original: " + circuloOriginal);
        System.out.println("Círculo Clonado: " + circuloClonado);
        System.out.println("Rectángulo Original: " + rectanguloOriginal);
        System.out.println("Rectángulo Clonado: " + rectanguloClonado);
    }
}
