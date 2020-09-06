package learnAbstraction;

public class Rayhan extends MobileUser {
	//Both call(), sendMessage(), Methods internally comes here for inheritance concept
	@Override
	void sendMessage() {
		System.out.println("Hi, I am Rayhan");
	}

}
