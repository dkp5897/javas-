class Student{

    public int roll_No;
    public String name;

    Student(int roll_No, String name){
        this.roll_No=roll_No;
        this.name=name;
    }
}

public class ObjectArray{
    public static void main(String[] args) {
        Student[] arr;
        arr=new Student[5];
        arr[0]=new Student( 8,  "Aman Sonkar");
        arr[1]=new Student(21, "Deepak Kumar");
        arr[2]=new Student(40, "Rajan Singh");
        arr[3]=new Student(58, "Sooraj Patel");
        arr[4]=new Student(59, "Udhbhav Pandey");

        for(int i=0;i<arr.length;i++){
            System.out.println("Roll No. "+arr[i].roll_No+", Name:- "+arr[i].name);
        }
    }
}