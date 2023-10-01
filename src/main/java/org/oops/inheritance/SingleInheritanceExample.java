package org.oops.inheritance;

public class SingleInheritanceExample {
    String name;
    String address;
    public String show(){
        return "Name ->"+this.name+"\n Address ->"+this.address;
    }
    //Constructor
    public SingleInheritanceExample(String name,String address){
    this.name=name;
    this.address=address;
    }
}
