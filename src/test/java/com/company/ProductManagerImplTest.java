package com.company;

import com.company.Order;
import com.company.User;
import com.company.Product;
import com.company.ProductManager;
import com.company.ProductManagerImple;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductManagerImplTest {

  /*  ProductManager pm = new ProductManagerImple();

    private List<Product> products = new ArrayList<>();
    Product p1 = new Product("Manzana", 3, 20);
    Product p2 = new Product("Platano", 7, 20);
    Product p3 = new Product("Agua", 1, 20);
    Product p4 = new Product("Galletas", 4, 20);
    Order o = new Order();
    User u = new User("Toni");


    @Before //antes de hacer el test debemos preparar las operaciones
    public void inicializar(){
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);

        o.addProduct("Manzana", 3);
        o.addProduct("Agua", 2);
        o.addProduct("Galletas",5);

        o.setUsuario(u.getName());
        pm.newOrder(o);

    }

    @After //una vez terminados los tests reseteamos las operaciones

    public void resetear(){
    products = new ArrayList<>();
    }

    @Test
    public void getProductsByPriceTest(){
        List<Product> productsOrdenados = new ArrayList<>();
        productsOrdenados.add(p2);
        productsOrdenados.add(p4);
        productsOrdenados.add(p1);
        productsOrdenados.add(p3);

        products = pm.getProductByPrice();


        Assert.assertEquals(productsOrdenados,products);

    }

    @Test
    public void getProductsBySalesTest(){
        List<Product> resultado = new ArrayList<>();
        resultado.add(p4);
        resultado.add(p1);
        resultado.add(p3);
        resultado.add(p2);

        products=pm.getProductBySales();

        Assert.assertEquals(resultado, products);

    }*/


}
