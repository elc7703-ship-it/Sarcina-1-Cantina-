public class Lab2_B1 {

    public static boolean esteDeschis(int ziua, int ora) {
        return ((ziua >= 1 && ziua <= 5) && (ora >= 8 && ora < 16)) || 
               (ziua == 6 && (ora >= 9 && ora < 13));
    }

    public static void main(String[] args) {
        System.out.println("(3, 8) -> " + esteDeschis(3, 8));     // true
        System.out.println("(6, 12) -> " + esteDeschis(6, 12));   // true
        System.out.println("(3, 16) -> " + esteDeschis(3, 16));   // false
        System.out.println("(7, 10) -> " + esteDeschis(7, 10));   // false
    }
}