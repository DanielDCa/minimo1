package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ProductManager pm = new ProductManagerImple();
        User u = new User("Carlos");

        System.out.println("Productos ordenados por precio");
        List<Product> listPruebaOrderedByPrice = pm.getProductByPrice();
        for (Product p: listPruebaOrderedByPrice){
            System.out.println(p.getProduct() +": "+ p.getPrice());
        }
        System.out.println("--------------");


        //Añadimos orden a usuario Carlos
        Order o= new Order();
        o.setUsuario("1");
        o.addProduct("Coca cola", 2);
        o.addProduct("Donut", 3);
        u.addOrder(o);
        pm.newOrder(o);

        Order o2=new Order();
        o2.setUsuario("1");
        o.addProduct("Donut",4);
        o.addProduct("Bocata de jamon", 2);
        u.addOrder(o2);
        pm.newOrder(o2);


        pm.proccesOrder();
        //Hemos hecho 2 pedidos y hemos servido uno
        System.out.println("Pedidos servidos de Carlos");
        List<Order> listaCarlos;
        listaCarlos=u.getOrders();

        for(Order order: listaCarlos)
        {
            System.out.println(order.toString());
        }


        System.out.println("-------------");

        System.out.println("Lista de productos ordenados por ventas");
        List<Product> listOrderedBySales =pm.getProductBySales();
        for (Product p: listOrderedBySales){
            System.out.println(p.getProduct() + ": " + p.getVendidos());
        }



        /*roduct p = new Product ("Pepsi", 8);
        o.addProduct("Coca cola",2);
        o.addProduct("Bocata",1);
        o.addProduct("Donuts",2);

        pm.newOrder(o);
        u.addOrder(o);
        List<Product> products = o.listProducts();
        for (Product pr: products) {
            System.out.println("Pedido \n" + pr.getProduct());
        }

        HashMap<String,String> map;
        map = new HashMap<>();
        map.put("1","Hola");
        System.out.println("1 es: " + map.get("1"));*/
    }
}
