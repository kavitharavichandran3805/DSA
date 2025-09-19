
public class _3hexToBinary {
    public static void main(String[] args) {
        String inp = "1AC5";
        // int decimal = Integer.parseInt(inp, 16);
        // String binary = Integer.toBinaryString(decimal);
        // System.out.println(binary);

        StringBuilder sb = new StringBuilder();
        while (!inp.isEmpty()) {
            char rem = inp.charAt(inp.length() - 1);
            sb.append(getBinary(rem));
            inp = inp.substring(0, inp.length() - 1);
        }

    }

    public static String getBinary(Character ch) {
        String bin_dict[] = { "1010", "1011", "1100", "1101", "1110", "1111" };
        String result = "";
        char inp = Character.toUpperCase(ch);
        if (Character.isLetter(inp)) {
            if (inp >= 'A' && inp <= 'F') {

            } else {
                System.out.println("Not a valid hexa decimal number");
                System.exit(0);
            }
        }
        return result;
    }
}
