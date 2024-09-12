package com.driver;
class Product {
    public int product(int x, int y) {
        int product = x*y;
        return product;
    }
    public int product(int x, int y, int z) {
        int product = x*y*z;
        return product;
    }
    public double product(double x, double y) {
        double product = x*y;
        return product;
    }
}
public class Main {


    public static void main(String[] args) {
        Product product = new Product();
        System.out.println(product.product(5,4));
        System.out.println(product.product(2,3,4));
        System.out.println(product.product(3.3,4.5));

    }
}
