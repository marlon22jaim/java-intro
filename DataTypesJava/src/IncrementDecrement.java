public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives);// 4

        lives--; // Decremento
        System.out.println(lives); // 3

        lives++; // Incremento
        System.out.println(lives); // 4

        // Prefija
        // gana un regalo por ganar una vida
        // int gift = 100 + lives++; // posfijo 104
        int gift = 100 + ++lives; // prefijo 105
        System.out.println(gift);

    }
}
