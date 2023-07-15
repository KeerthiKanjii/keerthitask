
public class PoojaTest {

	public static void main(String[] args) {
		StringBuilder builder1=new StringBuilder("21");
StringBuilder builder2=new StringBuilder("hello");
int cap1 = builder1.capacity();
int cap2 = builder2.capacity();
System.out.println(cap1==cap2);

	}

}
