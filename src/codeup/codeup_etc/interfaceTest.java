package codeup.codeup_etc;

public class interfaceTest {
    public static void main(String[] args) {
        checkclass checkclass = new checkclass();
        check.checkMethod();
    }
}
interface check {
    static void checkMethod() {

    }
}

class checkclass implements check{
    public void checkMethod(){
        System.out.println("check");
    }
}