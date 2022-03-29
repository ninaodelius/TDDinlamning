import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    ShoppingCart shoppingCart;


    @BeforeEach
    void setUp() {
       shoppingCart = new ShoppingCart();
    }

    @Test
    @DisplayName("Running a test")
    public void testIsItApple () {
        assertTrue(shoppingCart.isAnApple("Apple"));
    }

}
