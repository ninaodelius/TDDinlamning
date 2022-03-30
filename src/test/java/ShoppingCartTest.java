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

    //first test
    @Test
    @DisplayName("Running a test")
    void testIsAppleInShoppingCart () {
        assertTrue(shoppingCart.isAppleInShoppingCart("Apple"));
    }

    //third test
    @Test
    void testIsNotAppleInShoppingCart() {
        assertFalse(shoppingCart.isAppleInShoppingCart("Orange"));
    }

    //second test
    @Test
    void testTotalCost() {
        assertEquals(20,shoppingCart.sumTotal());
        //assertNotEquals(15,shoppingCart.sumTotal());
    }

    //third test
    @Test
    void testNumberOfFruitsInShoppingCart() {
        assertEquals(4,shoppingCart.NumberOfFruitsInShoppingCart());
    }
}
