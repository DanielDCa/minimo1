package com.company;

import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ProductManager pm = new ProductManagerImple();
        //User u = new User(); Se debe creae en ProductManagerImpl

        /*List<Product> listOrderedByPrice =pm.getProductByPrice();
        for (Product p: listOrderedByPrice){
            System.out.println(p.getPrice());
        }*/

        //Añadiendo orden a usuario Carlos
        Order o= new Order();
        o.setUsuario("1");
        o.addProduct("Coca cola", 2);
        o.addProduct("Donut", 3);

        pm.newOrder(o);
        pm.proccesOrder();
        System.out.println("---------------");


        List<Product> listOrderedBySales =pm.getProductBySales();
        for (Product p: listOrderedBySales){
            System.out.println(p.getVendidos());
        }








        //roduct p = new Product ("Pepsi", 8);
        /*o.addProduct("Coca cola",2);
        o.addProduct("Bocata",1);
        o.addProduct("Donuts",2);

        pm.newOrder(o);
        u.addOrder(o);
        List<Product> products = o.listProducts();
        for (Product pr: products) {
            System.out.println("Pedido \n" + pr.getProduct());
        }*/

        /*HashMap<String,String> map;
        map = new HashMap<>();
        map.put("1","Hola");
        System.out.println("1 es: " + map.get("1"));*/
    }
}
