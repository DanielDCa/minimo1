package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class OrderTest {

    int i = 99;

   // ProductManager pm = new ProductManagerImple();
    Order o= new Order();
    Order o2=new Order();

   //User u = new User("Carlos");

    @Before
    public void setUp(){//Inicializa la estructura de datos

        //Añadimos 2 ordenes a usuario carlos
        o.setUsuario("1");
        o.addProduct("Coca cola", 2);
        o.addProduct("Donut", 3);

        o2.setUsuario("1");
        o2.addProduct("Donut",4);
        o2.addProduct("Bocata de jamon", 2);



        i = 0;
        
    }
    @After
    public void tearDown(){//Libera los recursos
        //i = 99;
    }
    @Test
    public void placeOrder(){//Realizar pedido

        //Verificamos que no se haya asociado ningun pedido (0 pedidos ordenados)
        i=ProductManagerImple.getInstance().getOrderByUser("1").size();
        Assert.assertEquals(0,i);

        //Realizamos el pedido
        ProductManagerImple.getInstance().newOrder(o);
        ProductManagerImple.getInstance().newOrder(o2);

        //Verificamos que sean "2" pedidos realizados por el usuario 2
        i = ProductManagerImple.getInstance().getOrderByUser("1").size();
        Assert.assertEquals(2,i);

        //i = 10;
        //Assert.assertEquals(10,i);//Tambien esta el assertNoequals
    }
    @Test
    public void serveOrder(){//Servir un pedido



        i = ProductManagerImple.getInstance().getOrderByUser("1").size();
        System.out.println(i);
        //Order order;
        //List<Product> products1= pm.getProductBySales();

        //products1
        //Hemos hecho 2 pedidos hemos servido uno
        //pm.newOrder(o);
        //pm.newOrder(o2);

        //Servimos la primera orden
        //order = pm.proccesOrder();

        //
        //Falta probar algna cosa aqui   Assert.assertEquals(products1,products2);
        //


        //Assert.assertEquals(products1,products2);
        //i = 20;
        //Assert.assertEquals(20,i);
    }


}
