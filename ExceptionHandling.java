// 2 types of Exception handing 

// 1 using throw and throws
// 2 try catch 

// difference is throw and throws terminate our program 
// try and catch don't terminate program 

// public class ExceptionHandling{
// 	public static void main(String[] args) throws Exception {
		

// 		Student s = new Student();
// 		s.setAge(-10);
// 		System.out.println(s.getAge());


// 	}
// }

// class Student{

// 	 private String name ;
// 	 private int age;

// 	 // mark as danger method via throws Exception
// 	public void  setAge(int age) throws Exception{

// 		if(age < 0){
// 			throw new Exception("age can't be negetive\n ");
// 		}

// 		this.age = age ;
// 	}

// 	public int getAge(){
// 		return this.age;
// 	}
	

// }
public class ExceptionHandling{
	public static void main(String[] args)  {
		
		System.out.println("Hello");
		Student s = new Student();

		try{
		s.setAge(-10); 
		System.out.println("try block"); // don't execute if Exception found
	}catch (Exception e) {
		System.out.println("in catch block");
	}
		System.out.println(s.getAge());

		System.out.println("bye");
	}
}

class Student{

	 private String name ;
	 private int age;

	 // mark as danger method via throws Exception
	public void  setAge(int age) throws Exception{

		if(age < 0){
			throw new Exception("age can't be negetive\n ");
		}

		this.age = age ;
	}

	public int getAge(){
		return this.age;
	}
	

}