package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Division d1, d2;

    @BeforeAll public static void setUp() {
        d1 = new DivisionInternacional("XYZ", 200, "Francia", "Frances");
        d2 = new DivisionLocal("ABC", 25, "Sonora");
    }

    @Test public void testPais() {
        assertTrue(((DivisionInternacional)(d1)).getPais().equals("Francia"));
    }

    @Test public void testEstado() {
        assertTrue(((DivisionLocal)d2).getEstado().equals("Sonora"));
    }

    @Test public void testTipoDivision1() {
        assertTrue(d1.tipoDivision().equals("Internacional"));
    }

    @Test public void testTipoDivision2() {
        assertTrue(d2.tipoDivision().equals("Local"));
    }
}