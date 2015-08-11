/*
 * Raymond Luu
 * 
 * TCSS 305 - Winter 2012
 * Assignment 1 - Shopping Cart
 */
/**
 * This is a class code for an Item.
 * 
 * @author Raymond Luu
 * @version 5 January 2012
 */
public class Item {
  /**
   * String format for rounding double to nearest hundredth.
   */
  private static final String FORMAT = "%.2f";
  /**
   * Name of the item.
   */
  private String my_name;
  /**
   * Price of the item.
   */
  private double my_price;
  /**
   * The bulk quantity of the item.
   */
  private int my_bulk_quantity;
  /**
   * The Bulk price of the item.
   */
  private double my_bulk_price;
  
  /**
   * Constructor to create the item.
   * 
   * @param the_name Name of item.
   * @param the_price Price of item.
   */
  public Item(final String the_name, final double the_price) {
    my_name = the_name;
    my_price = the_price;
  }
  /**
   * Constructor to create an item with bulk price and quantity.
   * 
   * @param the_name Name of item.
   * @param the_price Price of item.
   * @param the_bulk_quantity Bulk quantity of item.
   * @param the_bulk_price Bulk price of item.
   */
  public Item(final String the_name, final double the_price, final int the_bulk_quantity,
              final double the_bulk_price) {
    this(the_name, the_price);
    my_bulk_quantity = the_bulk_quantity;
    my_bulk_price = the_bulk_price;
  }
  /**
   * Returns the total price of quantity of items.
   * 
   * @param the_quantity quantity of item.
   * @return the price.
   */
  public double priceFor(final int the_quantity) {
    double total_price = 0;
    int quantity = the_quantity;
    if (my_bulk_quantity > 0) {
      total_price += my_bulk_price * (the_quantity / my_bulk_quantity);
      quantity = quantity % my_bulk_quantity;
      total_price += quantity * my_price;
    } else {
      total_price += my_price * the_quantity;
    }
    return total_price;
  }

  // methods overridden from java.lang.Object
  /**
   * {@inheritDoc}
   */
  @Override
  public String toString() {
    final StringBuilder s = new StringBuilder();
    s.append(my_name);
    s.append(", $");
    s.append(String.format(FORMAT, my_price));
    if (my_bulk_price > 0) {
      s.append(" (");
      s.append(my_bulk_quantity);
      s.append(" for $");
      s.append(String.format(FORMAT, my_bulk_price));
      s.append(")");
    }
    return s.toString();
  }
  /**
   * {@inheritDoc}
   */
  @Override
  public boolean equals(final Object the_other) {
    Boolean valid = false;
    if (the_other != null && toString().equals(the_other.toString())) {
      valid = true;
    }
    return valid;
  }
  /**
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return toString().hashCode();
  }
}
