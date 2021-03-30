package com.company;

import java.util.LinkedList;
import java.util.List;

public class Order {

    public List<LP> orderedProducts;
    private String usuario;

    public Order(){
        orderedProducts = new LinkedList<>();
    }

    public String getUsuario() {

        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void addProduct(String p, int q){

        this.orderedProducts.add(new LP(p,q));
    }
    public List<LP> listProducts(){
        return orderedProducts;
    }

    protected class LP {
        protected final String p;
        protected final int q;

        public LP(String p, int q) {
            this.p = p;
            this.q = q;
        }

        public String getP() {
            return p;
        }

        public int getQ() {
            return q;
        }
    }
}
