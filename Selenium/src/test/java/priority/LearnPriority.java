package priority;

import org.testng.annotations.Test;

public class LearnPriority {
	
	
	@Test(priority=2) 
    public void text(){
		System.out.println("Yusra");
	}
@Test(priority=1)
public void text1() {
	System.out.println("Ehsan");
}
@Test(priority=0)
public void text3() {
	System.out.println("Adyan");
}

}
