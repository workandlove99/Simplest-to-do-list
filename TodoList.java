import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TodoList {

	List<String> list = new ArrayList<>();

	public void pushTask(String s) {
		list.add(s);
	}

	public void changeTask(int n, String s) {
		list.set(n, s);
	}

	public List returnList() {
		return list;
	}

	public static void main(String[] args) {
		String[] optionList = {"1. Show ToDo's", "2. add item", "3. remove item",
				"4. change item", "5. Mark as DONE"};
 		String message = "";
		for (int i=0; i<optionList.length; i++) {
 			message = message + optionList[i]+"\n" ;
 		}
		String input = JOptionPane.showInputDialog("Type in the number of the option that you want "
				+ "to chose:\n"+message);
		int n = Integer.parseInt(input);
		
	}
}
