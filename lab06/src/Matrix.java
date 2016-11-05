/**
 * CS180 - Lab 05 - Matrix
 *
 * matrix identify
 *
 * @author Jiacheng Yuan, yuan105@purdue.edu
 */
public class Matrix {
    public boolean isSymmetric(int[][] matrix) {
        if(matrix.length != matrix[0].length)
            return false;
        for(int i = 0; i< matrix.length; i++){
            for (int j = 0; j< matrix[i].length; j++){
                if(matrix[i][j] != matrix[j][i])
                    return false;
            }
        }
        return true;
    }
    public boolean isDiagonal(int[][] matrix) {
        if(matrix.length != matrix[0].length)
            return false;
        for(int i = 0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false;
                }
                else if (i == j && matrix[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
    public boolean isIdentity(int[][] matrix) {
        if(matrix.length != matrix[0].length)
            return false;
        for(int i = 0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i != j && matrix[i][j] != 0) || (i == j && matrix[i][j] != 1)) {
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isUpperTriangular(int[][] matrix) {
        if(matrix.length != matrix[0].length)
            return false;
        for(int i = 0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i <= j && matrix[i][j] == 0) {
                    return false;
                }
                else if (i > j && matrix[i][j] != 0)
                    return false;
            }
        }
        return true;
    }
    public boolean isTridiagonal(int[][] matrix) {
        if(matrix.length != matrix[0].length)
            return false;
        for(int i = 0; i< matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if ((i < j-1 || i > j+1) && matrix[i][j] != 0) {
                    return false;
                }
                else if ((i == j || i == j-1 || i == j+1) && matrix[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
