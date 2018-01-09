package test2;

public class student2 {
	public int  Roll;
	protected String Name;
	private float Mark;
 private String subject;
 
 void setData(int Roll, String Name, float Mark,String subject) {
		this.Roll = Roll ;
		this.Name = Name;
		this.Mark = Mark ;
		this.subject=subject;}
		
		void display(){
			
			System.out.println("Roll is : " + Roll);
			System.out.println("Name is : " + Name);
			System.out.println("Mark is : " + Mark) ;
			System.out.println("subject is :"+subject);
	}
	}