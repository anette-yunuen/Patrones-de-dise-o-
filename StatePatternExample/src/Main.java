public class Main {
    public static void main(String[] args) {
        MaquinaDeCaramelos maquina = new MaquinaDeCaramelos(3);

        maquina.insertarMoneda();
        maquina.despacharCaramelo();

        maquina.insertarMoneda();
        maquina.despacharCaramelo();

        maquina.insertarMoneda();
        maquina.despacharCaramelo();

        maquina.insertarMoneda();
    }
}
