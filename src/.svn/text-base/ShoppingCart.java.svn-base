/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Assignment 1 - Shopping Cart
 */
import java.util.HashSet;
import java.util.Set;
/**
 * This is the class code for ShoppingCart.
 * 
 * @author Raymond Luu
 * @version 11 January 2012
 */
public class ShoppingCart {
  
  /**
   * Constant for total price to receive discount.
   */
  private static final double AVAILABLE_DISCOUNT = 20.00;
  
  /**
   * Constant for discount price.
   */
  private static final double DISCOUNT = .9;
  
  /**
   * Stores all Item Orders in this HashSet.
   */
  private final Set<ItemOrder> my_shopping_cart;
  
  /**
   * Stores valid membership.
   */
  private boolean my_membership;
  
  /**
   * Constructs the shopping cart.
   */
  public ShoppingCart() {
    my_shopping_cart = new HashSet<ItemOrder>();
  }
  /**
   * Adds an order to the shopping cart.
   * 
   * @param the_order the Item order.
   */
  public void add(final ItemOrder the_order) {
    Boolean found = false;
    ItemOrder item = null;
    for (ItemOrder i : my_shopping_cart) {
      if (the_order.getItem().equals(i.getItem())) {
        found = true;
        item = i;
      }
    }

    if (found) {
      my_shopping_cart.remove(item);
      my_shopping_cart.add(the_order);
    } else {
      my_shopping_cart.add(the_order);
    }
  }
  
  /**
   * Sets the membership to get a discount.
   * 
   * @param the_discount membership discount.
   */
  public void setMembership(final boolean the_discount) {
    my_membership = the_discount;
  }
  
  /**
   * Gets total of items in shopping cart.
   * 
   * @return the total price.
   */
  public double getTotal() {
    double total = 0.0;
    for (ItemOrder i : my_shopping_cart) {
      total += i.getPrice();
    }
    if (total > AVAILABLE_DISCOUNT && my_membership) {
      total = total * DISCOUNT;
    }
    return total;
  }
}
