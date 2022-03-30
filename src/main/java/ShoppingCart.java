import java.util.HashMap;

public class ShoppingCart {

        public HashMap<String, Integer> createShoppingCart() {
            HashMap<String, Integer> shoppingCart = new HashMap<String, Integer>();
            shoppingCart.put("Apple", 2);
            shoppingCart.put("Orange", 4);
            shoppingCart.put("Peach", 6);
            shoppingCart.put("Cherry", 8);
            //shoppingCart.put("Pear", 1);
            //System.out.println(shoppingCart);
        return shoppingCart;
    }
        //first method
        public boolean isAppleInShoppingCart (String a){
            HashMap<String, Integer> shoppingCart = createShoppingCart();
            for (String i : shoppingCart.keySet()) {
                if(i.equals("Apple") && i.equals(a)) {
                    return true;
                }
                }
            return false;
            }
            //second method
        public int sumTotal() {
            HashMap<String, Integer> shoppingCart = createShoppingCart();
            int total = 0;
            for (int j : shoppingCart.values()){
                total += j;
            }
            return total;
        }
    public int NumberOfFruitsInShoppingCart() {
        HashMap<String, Integer> shoppingCart = createShoppingCart();
        int numberOfFruits = 0;
        for(String j : shoppingCart.keySet()) {
            numberOfFruits++;
        }
        return numberOfFruits;
    }
}


