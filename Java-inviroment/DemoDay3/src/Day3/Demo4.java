package Day3;

public class Demo4 {

	public static void main(String[] args) {

        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = new String("Mark");
        
     // true  because both refers to same instance
        System.out.println(s1 == s2);
        
     // false because s3 refers to instance created in normal heap
        System.out.println(s1 == s3);  

	}

}
