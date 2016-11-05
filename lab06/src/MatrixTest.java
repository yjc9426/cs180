import static org.junit.Assert.*;
import org.junit.*;
/**
 * Created by yuan105 on 6/30/16.
 */
public class MatrixTest {
    private Matrix m;
    @Before
    public void setUp() throws Exception {
        m = new Matrix();
    }
    @Test(timeout = 100)
    public void testSymmetric() {
        int[][] mat = {{1,0,0},{0,1,0},{0,0,1}};
        String message = "isSymmetric(): check when matix is symmetric";
        boolean expected = true;
        boolean actual = m.isSymmetric(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testSymmetric2() {
        int[][] mat = {{1,0,1},{0,1,0},{0,0,1}};
        String message = "isSymmetric(): check when matix is not symmetric";
        boolean expected = false;
        boolean actual = m.isSymmetric(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testSymmetric3() {
        int[][] mat = {{1,0,1},{0,1,0},{1,0,1}};
        String message = "isSymmetric(): check when matix is symmetric";
        boolean expected = true;
        boolean actual = m.isSymmetric(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testDiagonal() {
        int[][] mat = {{1,0,0},{0,1,0},{0,0,1}};
        String message = "isDiagonal(): check when matix is diagonal";
        boolean expected = true;
        boolean actual = m.isDiagonal(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testDiagonal2() {
        int[][] mat = {{1,0,3},{1,1,0},{4,0,1}};
        String message = "isDiagonal(): check when matix is not diagonal";
        boolean expected = false;
        boolean actual = m.isDiagonal(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testDiagonal3() {
        int[][] mat = {{0,0,0},{0,0,0},{0,0,0}};
        String message = "isDiagonal(): check when matix is diagonal";
        boolean expected = false;
        boolean actual = m.isDiagonal(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testDiagonal4() {
        int[][] mat = {{1,0,3},{1,1,0},{4,0,1},{1,4,3}};
        String message = "isDiagonal(): check when matix is not NxN";
        boolean expected = false;
        boolean actual = m.isDiagonal(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testIdentity() {
        int[][] mat = {{1,0,0},{0,1,0},{0,0,1}};
        String message = "isIdentity(): check when matix is identity";
        boolean expected = true;
        boolean actual = m.isIdentity(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testIdentity2() {
        int[][] mat = {{1,0,2},{0,1,3},{0,0,1}};
        String message = "isIdentity(): check when matix is not identity";
        boolean expected = false;
        boolean actual = m.isIdentity(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testIdentity3() {
        int[][] mat = {{0,0,0},{0,0,0},{0,0,0}};
        String message = "isIdentity(): check when matix is not identity";
        boolean expected = false;
        boolean actual = m.isIdentity(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testUpperTriangular() {
        int[][] mat = {{1,2,3},{0,2,3},{0,0,3}};
        String message = "isIdentity(): check when matix is uppertriangular";
        boolean expected = true;
        boolean actual = m.isUpperTriangular(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testUpperTriangular2() {
        int[][] mat = {{1,0,0},{0,1,0},{0,0,1}};
        String message = "isIdentity(): check when matix is not uppertriangular";
        boolean expected = false;
        boolean actual = m.isUpperTriangular(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testUpperTriangular3() {
        int[][] mat = {{1,1,1},{1,1,1},{1,1,3}};
        String message = "isIdentity(): check when matix is not uppertriangular";
        boolean expected = false;
        boolean actual = m.isUpperTriangular(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testTridiagonal() {
        int[][] mat = {
                {1, 4, 0, 0},
                {3, 4, 1, 0},
                {0, 2, 3, 4},
                {0, 0, 1, 3}};
        String message = "isIdentity(): check when matix is tridiagonal";
        boolean expected = true;
        boolean actual = m.isTridiagonal(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testTridiagonal2() {
        int[][] mat = {{0,0,0},{0,0,0},{0,0,0}};
        String message = "isIdentity(): check when matix is not tridiagonal";
        boolean expected = false;
        boolean actual = m.isTridiagonal(mat);
        assertEquals(message, expected, actual);
    }
    @Test(timeout = 100)
    public void testTridiagonal3() {
        int[][] mat = {{1,1,1},{1,1,1},{1,1,1}};
        String message = "isIdentity(): check when matix is not tridiagonal";
        boolean expected = false;
        boolean actual = m.isTridiagonal(mat);
        assertEquals(message, expected, actual);
    }
}
