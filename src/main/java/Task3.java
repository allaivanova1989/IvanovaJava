public class Task3 {
    public static void main(String[] args) {
        int[] array = new int[]{5, 23, 102, -12, -38, 17, 21, 12, 18, -25};

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);

            }
        }
    }
}
