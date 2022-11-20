public class FoorLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        // usando operador ternario para hacer un if simplificado
        String mensaje = (isTurnOnLight) ? "Se encendió la luz" : "Se apagó la luz";
        System.out.println(mensaje);
        for (int i = 0; i <= 10; i++) {
            printSOS();
        }
    }

    public static void printSOS() {
        System.out.println(". . . _ _ _ . . .");
    }

    /**
     * Descripción: Funcion que enciende o apaga la luz dependiendo de su estado inicial hace una cosa o la otra
     *
     * @return isTurnOnLight Devuelve la luz apagada o encendida
     * @author Marliton
     */
    public static boolean turnOnOffLight() {
        isTurnOnLight = (isTurnOnLight)
                ? false
                : true;
        return isTurnOnLight;
    }
}


