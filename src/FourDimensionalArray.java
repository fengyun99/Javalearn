public class FourDimensionalArray {
    public static void main(String[] args) {
        int[][][][] fourdismensionarray = new int[2][2][2][3];
        int num = 0;
        for (int i = 0; i < fourdismensionarray.length; i++){
            for (int j = 0; j < fourdismensionarray[i].length; j++){
                for (int m = 0; m < fourdismensionarray[i][j].length; m++){
                    for (int n = 0; n < fourdismensionarray[i][j][m].length; n++){
                        fourdismensionarray[i][j][m][n] = ++num;
                    }
                }
            }
        }
        for (int i = 0; i < fourdismensionarray.length; i++){
            for (int j = 0; j < fourdismensionarray[i].length; j++){
                for (int m = 0; m < fourdismensionarray[i][j].length; m++){
                    for (int n = 0; n < fourdismensionarray[i][j][m].length; n++){
                        System.out.println(fourdismensionarray[i][j][m][n]);
                    }
                }
            }
        }
    }
}
