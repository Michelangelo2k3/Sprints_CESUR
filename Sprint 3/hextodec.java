public class hextodec {

    public static int hexToDec(final String hexString) {

        return Integer.parseInt(hexString, 16);
    }

    public static void main(String[] args) {

        System.out.println(hexToDec("1A"));
        System.out.println(hexToDec("FF"));
        System.out.println(hexToDec("10"));
        System.out.println(hexToDec("0"));
        System.out.println(hexToDec("ABC"));
    }
}
