public class lesson15 {
    public static void main(String[] args) {
        int[] array = {23, 421, 12, 12};
        try {
            System.out.println(array[9]);
        } catch (Exception exception) {
            System.out.println("Index value = 9  is out of bounds");
        }
        try {
            int sum = 6742 + 1;
            System.out.println(sum);
        } catch (Exception exception) {
            System.out.println("Index value = 9  is out of bounds");
        }


    }
}

