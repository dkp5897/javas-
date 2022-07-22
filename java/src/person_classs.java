public class person_classs {

    int age=25;
    int weight=60;
    String color="Light";

    void eat()
    {
        System.out.println("I am Eating...");
    }
    void sleep()
    {
        System.out.println("I am sleeping...");
    }
    public static void main(String[] args) {

        person_classs p=new person_classs();
        System.out.println("the age is: "+p.age);
        System.out.println("the weight is: "+p.weight);
        System.out.println("the color is: "+p.color);

        p.eat();   p.sleep();
        /* here p is the object which is used to accese the property
           and behaviour of the class*/ 
        
    }
    
}
