package outsiseprotect;

import protect.ProtectedExample;

public class OutsideClass {
    public static void main(String[] args) {
        ProtectedExample pe=new ProtectedExample();
        //pe.name; // name is protected member in the class , outside the package it is not accessible
        // so here name is not accessible
    }
}
