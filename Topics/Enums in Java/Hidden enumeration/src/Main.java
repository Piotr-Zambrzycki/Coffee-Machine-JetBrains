public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (Secret v : Secret.values()) {
            if (v.toString().startsWith("STAR")) {
                count++;
            }

        }
        System.out.println(count);
    }
}



