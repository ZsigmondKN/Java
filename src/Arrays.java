
public class Arrays {
	public static void ranMessage() {
		String[] verbs = {"running", "created", "found"};
			//to call an element from an array we need to call its index and index starts with 0
		String[] random = {"Oy", "mate", "here"};
		
		int randVerbs = (int)(Math.random() * verbs.length);
		int ranRan = (int)(Math.random() * verbs.length);
		
		System.out.println(verbs[randVerbs] + random[ranRan] + verbs[randVerbs]);
	}
}