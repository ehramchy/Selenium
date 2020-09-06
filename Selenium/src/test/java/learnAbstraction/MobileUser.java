package learnAbstraction;

//Its fully an abstract class, because this has no abstract Method
public abstract class MobileUser {
	/*void call() {            //this is a non abstract method, it has implementation
		System.out.println("This is call Method");		
	}*/
	//After adding call() Method, it is not a fully abstract Method, 
	//it has abstract and non abstract Method
	abstract void sendMessage(); // This is a fully abstract Method	
	

}
