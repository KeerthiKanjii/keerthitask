package encapsulation;

public class Test {
public static void main(String[] args) {
	Patient p = new Patient();

	p.setId(651);

	p.setFirstName("keerthi");

	p.setSsn("xyz");

	System.out.println("Id:" + p.getId());

	System.out.println("Id:" + p.getFirstName());

	System.out.println("Id:" + p.getSsn());

	}



	


}

