import java.util.HashMap;

public class ShoppingCart {

        public HashMap<String, Integer> createShoppingCart() {

            HashMap<String, Integer> shoppingCart = new HashMap<String, Integer>();

            shoppingCart.put("Apple", 2);
            shoppingCart.put("Orange", 4);
            shoppingCart.put("Peach", 6);
            shoppingCart.put("Cherry", 8);

            //System.out.println(shoppingCart);
        return shoppingCart;

    }

        public boolean isAnApple (String a){
            HashMap<String, Integer> shoppingCart = createShoppingCart();

            for (String i : shoppingCart.keySet()) {
                if(i.equals("Apple")) {
                    return true;
                }
                }
            return false;
            }
        }


