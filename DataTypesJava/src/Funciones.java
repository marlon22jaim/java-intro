public class Funciones {
    public static void main(String[] args) {
        double y = 3;

        // area de un circulo -> pi * r2
        circleArea(y);

        // area de una esfera -> 4 * PI * r2
        sphereArea(y);

        // volumen de una esfera -> (4/3) * PI * r3
        sphereVolumen(y);

        /**
         * */
        System.out.println("PESOS A DOLARES: " + converToDolar(1000,"COL"));
    }

    /**
     * Descripcion: funcion para calcular el area de un circulo
     * @param r Es el radio
     * @return devuelve el area de un circulo
     * */
    public static double circleArea(double r) {
        return (Math.PI * Math.pow(r, 2));
    }

    public static double sphereArea(double r) {
        return (4 * Math.PI * Math.pow(r, 2));
    }

    public static double sphereVolumen(double r) {
        return (4 / 3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Descripcion: Funcion que especificando su moneda convierte una cantidad de dinero a dolares
     *
     * @param currency Tipo de moneda: solo acepta MXN o COP
     * @param quantity Cantidad de dinero
     * @return quantity Devuelve la cantidad actualizada en dolares
     * */
    public static double converToDolar(double quantity, String currency) {
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.52;
                break;
            case "COL":
                quantity = quantity * 0.00031;
                break;
        }
        return quantity;
    }

}
