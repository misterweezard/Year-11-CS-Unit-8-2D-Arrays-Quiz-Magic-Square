public class MagicSquare {

    /**
     *
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int x = 0;

        for(int col = 0; col < array2d.length; col++){
            {
                x += array2d[0][col];
            }
        }
            return x;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     *         Because we have already determined the sum of the first row
     *         via the method 'calculateCheckSum', this method can begin
     *         iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        boolean x = true;
        for (int i = 1; i < array2d.length; i++) {
            int sum = 0;
            for (int k = 0; k < array2d[i].length; k++) {
                sum += array2d[i][k];
            }
            if (sum != checkSum) {
                x = false;
            }
        }
        return x;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */

    public static boolean magicColumns(int[][] array2d, int checkSum) {
        boolean x = true;
        for (int i = 0; i < array2d.length; i++) {
            int sum = 0;
            for (int k = 0; k < array2d[i].length; k++) {
                sum += array2d[k][i];
            }
            if (sum != checkSum){
              x = false;
            }
        }
        return x;
    }


    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
        int row = 0;
        int col = 0;
        int sum = 0;
        boolean x = true;
        while (row < array2d.length) {
            sum += array2d[row][col];
            row++;
            col++;
        }
        if (sum != checkSum) {
            x = false;
        }
        row = 0;
        col = array2d[row].length-1;
        sum = 0;
        while (row < array2d.length) {
            sum += array2d[row][col];
            row++;
            col--;
        }
        if (sum != checkSum) {
            x = false;
        };
        return x;
    }

    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        boolean y = false;
        int sum = calculateCheckSum(array2d);
        if (magicRows(array2d, sum) && magicColumns(array2d, sum) && magicDiagonals(array2d, sum)) {
            y = true;
            return y;
        }
        else
        {return y;
        }
    }

}