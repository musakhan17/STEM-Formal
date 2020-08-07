import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Formal {
    private static Scanner input;
    public HashMap<String, String> formal_event = new HashMap<String, String>();

    public boolean add(String person, String food) {
        if (formal_event.containsKey(person) != true) {
            formal_event.put(person, food);
            return true;
        } else {
            return false;
        }
    }

    public void remove(String person) {
        if (formal_event.containsKey(person)) {
            formal_event.remove(person);
        } else {
            throw new NoSuchElementException();
        }
    }

    public boolean change(String person, String food) {
        if (formal_event.containsKey(person)) {
            formal_event.replace(person, food);
            return true;
        } else {
            throw new NoSuchElementException();
        }
    }

    public String get(String person) {
        if (formal_event.containsKey(person)) {
            return formal_event.get(person);
        } else
            throw new NoSuchElementException();
    }
    
    public static void main(String args[]) {
        input = new Scanner(System.in);
        Formal stem = new Formal();

        while (true){
            System.out.println("Enter the number to choose from the following options");
            System.out.println("1) To add guests to the list");
            System.out.println("2) To remove guests from the list");
            System.out.println("3) To change dietary preference of a guest");
            System.out.println("4) To get dietary preference of a guest");
            System.out.println("5) To exit program");

            String option = input.nextLine();

            if(option.equals("1")){
                System.out.println("Enter name and dietary preference of the guest:");
                String person = input.nextLine();
                String food = input.nextLine();
                stem.add(person, food);
            }
            else if(option.equals("2")) {
                System.out.println("Enter name of the guest:");
                String person = input.nextLine();
                stem.remove(person);
            }
            else if(option.equals("3")) {
                System.out.println("Enter name of the guest:");
                String person = input.nextLine();
                String food = input.nextLine();
                stem.change(person, food);
            }
            else if(option.equals("4")) {
                System.out.println("Enter name of the guest:");
                String person = input.nextLine();
                System.out.println(stem.get(person));
            }
            else if(option.equals("5")) {
            	input.close();
                break;
            }
            else {
                System.out.println("Choose a valid option.");
            }
        }
    }
}