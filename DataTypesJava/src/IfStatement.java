public class IfStatement {
    public static void main(String[] args) {
        boolean isBluetoothEnable = false;
        int fileSended = 3;
        if (isBluetoothEnable) {
            // send File
            fileSended++;
            System.out.println("Archivo Enviando");
        } else {
            fileSended--;
            System.out.println("Por favor enciende el Bluetooth");
        }
        System.out.println(fileSended);
    }
}
