
public class Test {

	public static void main(String[] args) {
try {
	foo();
}
catch(Exception e) {
	System.out.println(e);
	
}
	}
	 static void foo() throws Exception {
		 throw new Exception("foo");
	 }

}
