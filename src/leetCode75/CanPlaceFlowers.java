package leetCode75;

public class CanPlaceFlowers {

    public static void main(String args[]){
        System.out.print(canPlaceFlowers(new int[]{1,0,0,0,1},2));
    }


    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n <= 0)
                return true;
            if (flowerbed[i] == 0) {
                if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    n--;
                    i++;
                    continue;
                } else {
                    i += 2;
                    continue;
                }
            } else {
                i++;
                continue;
            }
        }
        return n <= 0;
    }
}
