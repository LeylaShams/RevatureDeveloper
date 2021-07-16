
public class ReturnTypes {

	public static void main(String[] args) {
		//create a class instance
		ReturnTypes rt = new ReturnTypes();
		rt.returnNothing();
		boolean b = rt.returnBoolean();
		
	
	
	}
    public void returnNothing(){
       System.out.println("Inside of a void method");

}
    //a method that returns a boolean
    public boolean returnBoolean() {
    	return true;
    	
    }
    }
