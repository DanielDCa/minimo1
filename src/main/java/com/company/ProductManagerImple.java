package com.company;

import java.util.*;

public class ProductManagerImple implements ProductManager{
/*
    2.1 Elección de las estructuras de datos
    2.3 La fachada deberá implementarse como un Singleton.
    2.4 Todos los métodos deberán tener una TRAZA (a nivel de INFO) de
    LOG4J que muestre el valor de los parámetros al inicio de los métodos y
    al final. También debe contemplarse trazas de otros niveles (ERROR o
    FATAL)

 */
    HashMap<String, User> users;
    Queue<Order> pendingOrders;
    List<Product> productList;

    public ProductManagerImple(){
        //Inicializar los valores del HashMap
        this.users = new HashMap<>();
        users.put("1",new User("Carlos"));
        users.put("2",new User("Sebastian"));
        users.put("3",new User("Federico"));

        //Inicializar  la cola
        pendingOrders =new LinkedList<>();

        //Inicialisamos la lista de productos
        this.productList = new LinkedList<>();
        Product p1 = new Product("Coca cola",2,20);
        Product p2 = new Product("Donut",8, 20);
        Product p3 = new Product("Bocata de jamon",3 ,30);

        this.productList.add(p1);
        this.productList.add(p2);
        this.productList.add(p3);

    }

    //Retorna una lista ordenada de menor a mayor
    @Override
    public List<Product> getProductByPrice() {

        Collections.sort(this.productList, Product.CMP_PRICE);//Llama a la función static CMP_PRICE del producto
        //Arrays.sort();

        return productList ;
    }

    //Añade un pedido a la lista de pedidos
    @Override
    public void newOrder(Order o) {//Realizar pedido
        pendingOrders.add(o);
    }


    @Override
    public void proccesOrder() {//Servir orden

        Order o = this.pendingOrders.poll();
        List<Order.LP> lps = o.listProducts();
        for (Order.LP lp: lps ){
            Product p = this.getProductByName(lp.p);
            p.updateCantidad(lp.q);
        }
        User u = this.getUserByName(o.getUsuario());
        u.addOrder(o);

    }

    private User getUserByName(String usuario) {

        return users.get(usuario);
    }

    private Product getProductByName(String p) {

        for (Product pr:productList) {
            if(pr.getProduct() == p){
               return pr;
            }
        }
        return null;
    }

    @Override
    public List<Order> getOrderByUser(String usuario) {//Listado de pedidos de un usuario que ya hayan sido realizados
        User u;
        //List<Order> o= new LinkedList<>();
        u = this.users.get(usuario);

        return u.orders;
    }

    @Override
    public List<Product> getProductBySales() {//Poner un contador
        Collections.sort(this.productList, Product.CMP_SOLD);//Llama a la función static CMP_PRICE del producto
        //Arrays.sort();

        return productList ;
    }





}
