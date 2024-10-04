public class DecimalConversion {
    public static void main(String[] args) {
        int decimal = 6719; // Example decimal value

        String hex = Integer.toHexString(decimal);

        String octal = Integer.toOctalString(decimal);

        int hexd = Integer.parseInt("1a3f",16);
        int octd = Integer.parseInt("15077", 8);

        System.out.println("Decimal value: " + decimal);
        System.out.println("Hexadecimal value: " + hex);
        System.out.println("Octal value: " + octal);
        System.out.println(hexd);
        System.out.println(octd);
    }
}
