import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		Scanner docInName = null;
		PrintWriter docOutName = null;
		ArrayList<BikePart> bp=new ArrayList<BikePart>();

		do {
			System.out.println("Please enter the filename of the file you would like to read from: ");
			try {
				docInName = new Scanner(new File(user.nextLine()));
			} catch (FileNotFoundException e) {
				System.out.println("File not found!");
			}
		} while (docInName == null);

		int lineNum = Integer.parseInt(docInName.nextLine());
		System.out.println("please enter the max cost for a part: ");
		int cost = user.nextInt();
		user.nextLine();

		do {
			System.out.println("please enter a name for the file to write to (end with .txt): ");
			String out = user.nextLine();
			try {
				docOutName = new PrintWriter(out);
				for (int i = 1; i < lineNum; i++) {
					String line = docInName.nextLine();
					BikePart temp=new BikePart(line);
					bp.add(temp);
					if ((temp.getSalesPrice() < cost && temp.isOnSale() == true)
							|| (temp.getListPrice() < cost && temp.isOnSale() == false)) {
						docOutName.println(line);
					}
				}
				docOutName.close();
				System.out.println("file creation successful!");
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		} while (docOutName == null);
		
		user.close();
	}

}
