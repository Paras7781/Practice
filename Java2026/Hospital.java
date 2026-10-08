import java.util.*;

class EmergencyCase {

    String name;
    int priority;

    public EmergencyCase(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return "Name = " + name + ", Priority = " + priority;
    }
}

class SortByName implements Comparator<EmergencyCase> {

    public int compare(EmergencyCase e1, EmergencyCase e2) {

        return e1.name.compareTo(e2.name);
    }
}


class SortByPriority implements Comparator<EmergencyCase> {

    public int compare(EmergencyCase e1, EmergencyCase e2) {

        return e1.priority-e2.priority;
    }
}

public class Hospital {

    public static void main(String[] args) {

        ArrayList<EmergencyCase> cases = new ArrayList<>();

        cases.add(new EmergencyCase("Kanha",1));
        cases.add(new EmergencyCase("Datta", 1));
        cases.add(new EmergencyCase("Bade", 2));
        cases.add(new EmergencyCase("Ashish", 3));
        cases.add(new EmergencyCase("Kanha", 1));

        System.out.println("Original List:");
        System.out.println(cases);


        Collections.sort(cases, new SortByName());

        System.out.println("\nSorted By Name:");
        System.out.println(cases);


        Collections.sort(cases, new SortByPriority());

        System.out.println("\nSorted By Priority:");
        System.out.println(cases);
    }
}