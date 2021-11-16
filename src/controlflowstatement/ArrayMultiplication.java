package controlflowstatement;

public class ArrayMultiplication {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4};
        int a2[] = {5, 2, 1, 3};

        int result[] = new int[a1.length];
        for (int i = 0; i < a2.length; i++) {
            result[i] = a1[i] * a2[i];
        }

            for (int j =0; j < a1.length; j++) {
                System.out.println(result[j] + " ");
            }
        }
}
