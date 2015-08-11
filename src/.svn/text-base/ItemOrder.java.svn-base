/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Assignment 1 - Shopping Cart
 */
/**
 * This is the class code for ItemOrder.
 * 
 * @author Raymond Luu
 * @version 11 January 2012
 */
public class ItemOrder {
  
  /**
   * Stores the item being ordered.
   */
  private final Item my_item;
  
  /**
   * Stores the quantity being ordered.
   */
  private final int my_quantity;
  
  /**
   * Constructs the item order.
   * 
   * @param the_item the Item.
   * @param the_quantity the quantity of Item.
   */
  public ItemOrder(final Item the_item, final int the_quantity) {
    my_item = the_item;
    my_quantity = the_quantity;
  }
  
  /**
   * Returns the price of ordered item.
   * 
   * @return price of the ordered item.
   */
  public double getPrice() {
    return my_item.priceFor(my_quantity);
  }
  
  /**
   * Getter method for the item.
   * 
   * @return the item.
   */
  public Item getItem() {
    return my_item;
  }
}
