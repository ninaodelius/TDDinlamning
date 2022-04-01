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
        //first method
        public boolean isAppleInShoppingCart (String givenFruitName){
            HashMap<String, Integer> shoppingCart = createShoppingCart();
            for (String actualFruitName : shoppingCart.keySet()) {
                if(actualFruitName.equals("Apple") && actualFruitName.equals(givenFruitName)) {
                    return true;
                }
                }
            return false;
            }
            //second method
        public int sumTotal() {
            HashMap<String, Integer> shoppingCart = createShoppingCart();
            int total = 0;
            for (int eachValueInHashMap : shoppingCart.values()){
                total += eachValueInHashMap;
            }
            System.out.println(total);
            return total;
        }
    public int NumberOfFruitsInShoppingCart() {
        HashMap<String, Integer> shoppingCart = createShoppingCart();
        int numberOfFruits = 0;
        for(String eachKeyInHashMap : shoppingCart.keySet()) {
            numberOfFruits++;
        }
        return numberOfFruits;
    }

    //public HashMap<String, Integer> addFruitToShoppingCart(String fruitName, int fruitPrice) {
     //       HashMap<String, Integer> shoppingCart = createShoppingCart();
      //      shoppingCart.put(fruitName, fruitPrice);
       //     return shoppingCart;
       // }


}


