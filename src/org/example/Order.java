package org.example;


import java.util.List;

public class Order {
  private User user;
  private List<Product> productList;

  private Order(User user, List<Product> productList) {
    this.user = user;
    this.productList = productList;
  }

  public static Order createOrder(User user, List<Product> productList){
    return new Order(user, productList);
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public List<Product> getProductList() {
    return productList;
  }

  public void setProductList(List<Product> productList) {
    this.productList = productList;
  }

  @Override
  public String toString() {
    return "\nOrder{" +
        "user=" + user +
        ", productList=" + productList +
        '}';
  }
}
