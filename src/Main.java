public class Main {

    // If id code length is 11 returns boolean
    public static boolean id_code_length(String id) {
        if (id.length() == 11) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(id_code_length("38709040298"));
        System.out.println(id_code_length("343535345345"));
        System.out.println(id_code_length("3234234234"));
    }
}

/* OUTPUT

true
false
false

 */
