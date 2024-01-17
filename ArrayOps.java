public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {
        int sum = 0;
        int mis = 0;
        for (int i = 0; i < array.length + 1; i++) {
            sum += i;
        }
        for (int i = 0; i < array.length; i++) {
            mis = sum - array[i];
            sum = mis;
        }
        return mis;
    }

    public static int secondMaxValue(int [] array) {
        int max = array [0];
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (max != array [i]) {
                if (max < array [i]) {
                max = array [i];
                j = i;
                }
            }
        }
        int x = array [0];
        array [0] = array [j];
        array [j] = x;
        int max2 = array [1];
        for (int y =2; y < array.length; y++) {
           if (max2 != array [y]) {
                if (max2 < array [y]) {
                max2 = array [y];
                }
            }
        }
        return max2;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        int l1 = array1.length;
        int l2 = array2.length;
        boolean g = true;
        for (int i = 0; i < l1; i++) {
			int counter = 0;
            for (int j = 0; j < l2; j++) {
                if (array1 [i] != array2 [j]) {
                    counter++;
					if (counter == l2) {
                       g = false;
                       break;
					}
                }
            }
        }
        return g;
    }

    public static boolean isSorted(int [] array) {
        int max = array [0];
        int j = 0;
        boolean g = true;
        for (int i = 1; i < array.length; i++) {
            if (max != array [i]) {
                if (max < array [i]) {
                max = array [i];
                j = i;
                }
            }
        }
        if (j != 0 && j != array.length - 1) {
            g = false;
        }
        else if (j == 0) {
            for (int i = 1; i < array.length; i++) {
                if (array [i] > array [i - 1]) {
                    g = false;
                    break;
                }
            }
        }
        else if (j == array.length - 1) {
            for (int i = array.length - 2; i > 0; i--) {
                if (array [i] > array [i + 1]) {
                    g = false;
                    break;
                }
           }
        }
        return g;
    }

}
