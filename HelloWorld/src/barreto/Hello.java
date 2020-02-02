package barreto;

public class Hello {


    public void sayHello(String name) {
        System.out.println("Hello Team 2 Amy, John, Carson my name is "+name+" !");
    }
    public static void main (String[] args){
        Hello  hello = new Hello();
        hello.sayHello("valter");
        System.out.println("Hello Valter, my name is John.");
        System.out.println("I'm glad to finally know at least the basics of Git");
        System.currentTimeMillis();
    }
}
