// Constructor is a special type of mathod whose name is same as the class
// java compilar introduce a constructor itself and also intiazed the instant variable
// the main purpose of contructor is initialize the value of instant variables which are the part of object
// Every java class has a constructor
// A constructor is automatically called at the time of object creation
// A contructor never contain any return type including void




class b {
    int a;   String name;

    b()    // default constructor
    {                            // when we comment on contructor part then java initialize default values
        a=2;   name="deepak";
    }
    void show()
    {
        System.out.println(a+" "+name);
    }
}

class contructors{
    public static void main(String[] args) {

        b ref=new b();
        ref.show();

    }
    
}
