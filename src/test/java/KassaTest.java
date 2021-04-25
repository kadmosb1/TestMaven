import static org.junit.jupiter.api.Assertions.*;

class KassaTest {

    @org.junit.jupiter.api.Test
    void getTotalPrijs() {
        assertEquals (0, new Kassa ().getTotalPrijs());
    }
}