package org.example;

import java.time.LocalDate;

abstract class Product {
  private String name;
  private double price;

  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "\nProduct{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}

class RealProduct extends Product{
  private int size;
  private int weight;

  public RealProduct(String name, double price, int size, int weight) {
    super(name, price);
    this.size = size;
    this.weight = weight;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "\nRealProduct{" +
        "name=" + getName() +
        ", price=" + getPrice() +
        ", size=" + size +
        ", weight=" + weight +
        '}';
  }
}
class VirtualProduct extends Product{
  private String code;
  private LocalDate expirationDate;

  public VirtualProduct(String name, double price, String code, LocalDate expirationDate) {
    super(name, price);
    this.code = code;
    this.expirationDate = expirationDate;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LocalDate getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(LocalDate expirationDate) {
    this.expirationDate = expirationDate;
  }

  @Override
  public String toString() {
    return "\nVirtualProduct{" +
        "name=" + getName() +
        ", price=" + getPrice() +
        ", code='" + code + '\'' +
        ", expirationDate=" + expirationDate +
        '}';
  }
}
class ProductFactory{
  public static Product createRealProduct(String name, double price, int size, int weight){
    return new RealProduct(name, price, size, weight);
  }
  public static Product createVirtualProduct(String name, double price,  String code, LocalDate expirationDate){
    return new VirtualProduct(name, price, code, expirationDate);
  }
}