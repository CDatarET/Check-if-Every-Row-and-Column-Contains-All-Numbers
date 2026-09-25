class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            int[] count = new int[matrix.length];
            for(int j = 0; j < matrix.length; j++){
                if(matrix[i][j] > matrix.length){
                    return false;
                }

                if(++count[matrix[i][j] - 1] == 2){
                    return false;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            int[] count = new int[matrix.length];
            for(int j = 0; j < matrix.length; j++){
                if(matrix[j][i] > matrix.length){
                    return false;
                }

                if(++count[matrix[j][i] - 1] == 2){
                    return false;
                }
            }
        }

        return true;
    }
}
