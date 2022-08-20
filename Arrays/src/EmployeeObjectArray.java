class BankEmployee{
    int id_no;
    String name;
    String  sallery;

    BankEmployee(int id_no,String name,String sallary){
        this.id_no=id_no;
        this.name=name;
        this.sallery=sallary;
    }
}
public class EmployeeObjectArray {
    public static void main(String[] args) {
        BankEmployee[] arr=new BankEmployee[3];

        arr[0]=new BankEmployee(10008, "Aman Sonkar", "6 LPA");
        arr[1]=new BankEmployee(10021, "Deepak Kumar", "10 LPA");
        arr[2]=new BankEmployee(10040, "Rajan Singh", "60 LPA");
        
        for (BankEmployee bankEmployee : arr) {
            System.out.println("Id_number: "+bankEmployee.id_no+", Name: "+bankEmployee.name+", Sallary: "+bankEmployee.sallery);
        }
        
    }
}
