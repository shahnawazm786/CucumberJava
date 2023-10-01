package org.oops.inheritance;

public class InheritSingleInheritance extends SingleInheritanceExample{
    int empno;

    public InheritSingleInheritance(String name, String address,int empno) {
        super(name, address);
        this.empno=empno;
    }

    @Override
    public String show() {
        return "employee no\n"+this.empno+"\n"+super.show();
    }
}
