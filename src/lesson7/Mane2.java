package lesson7;

public class Mane2 {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (j < i) {
                    System.out.print(nums[i][j] + "  ");
                } else {
                    System.out.print(" " + "  ");
                }


            }
            System.out.println();

        }
    }
}
