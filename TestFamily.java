package inheritance;

public class TestFamily {

	public static void main(String[] args) {
	
		
		GrandParents gp = new GrandParents();
		gp.height();
				
		Parents ps = new Parents();
		ps.haircolor();
		ps.height();
		
		Uncle un = new Uncle();
		un.maritalstatus();
		un.height();
		
		Children ch = new Children();
		ch.weight();
		ch.haircolor();
		ch.height();
		
		

	}

}
