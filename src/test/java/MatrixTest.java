import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {
    Matrix matrix;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
        matrix = null;
    }

    @Test
    void avgArray() {
        matrix = new Matrix();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(5.0, matrix.avgArray(array));
    }

    @Test
    void isMatrixSquareTest1() {
        matrix = new Matrix();
        Integer[][] matrixTest = new Integer[5][5];
        assertTrue(matrix.isMatrixSquare(matrixTest));
    }

    @Test
    void isMatrixSquareTest2() {
        matrix = new Matrix();
        Integer[][] matrixTest = new Integer[][]{{1, 2, 3}, {1, 2, 3, 4}, {1, 2, 3}};
        assertFalse(matrix.isMatrixSquare(matrixTest));
    }

    @Test
    void isMatrixSquareTest3() {
        matrix = new Matrix();
        Integer[][] matrixTest = new Integer[0][0];
        assertFalse(matrix.isMatrixSquare(matrixTest));
    }

    @Test
    void isMatrixSquareTest4() {
        matrix = new Matrix();
        Integer[][] matrixTest = new Integer[5][6];
        assertFalse(matrix.isMatrixSquare(matrixTest));
    }
}

