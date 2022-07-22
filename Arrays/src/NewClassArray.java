class Student
{
	public int Roll_No;
	public String Name;
	Student(int Roll_No ,String Name)
	{
		this.Roll_No=Roll_No;
		this.Name=Name;
	}
}
public class NewClassArray {

	public static void main(String[] args) {
		
		// creating array for an object (Student)
		
		Student std[] = new Student[3];
		
		// putting elements
		
		std[0]=new Student(1, "Aman");
		std[1]=new Student(2, "Deepak");
		std[2]=new Student(3, "Rajan");
		
		for(int i=0;i<std.length;i++)
		{
			System.out.println("The Element at index " + i +" : "+std[i].Roll_No+", "+std[i].Name );
		}
	}

}
