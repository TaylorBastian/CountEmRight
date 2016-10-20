import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a sentence and press ENTER. His initals are SA");
		String x = sc.nextLine();
		x=x.toUpperCase();
		x=x.replaceAll("\\s+","");
		//x = x.toUpperCase();
		System.out.println(x);
		if(x.equals("EXIT")){
			System.exit(0);
		}
		for (int i = 0; i < x.length(); i++) {
			if (x.substring(i, i + 1).equals("S")) {
				try {
					if (x.substring(i + 1, i + 2).equals("A")){
					total++;
					}
				} catch (ArrayIndexOutOfBoundsException e) {
				}
			}
		}
		System.out.println("There are " + total + " occurrences.");
	}

}
