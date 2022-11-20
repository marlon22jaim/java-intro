public class WhileLoop {
    static boolean isTurnOnLight = false;

    public static void main(String[] args) {
        turnOnOffLight();
        int i = 1;
        while (isTurnOnLight && i <= 10) {
            printSOS();
            i++;
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
