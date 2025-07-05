public class objectcount {

    static int count = 0;

    // Constructor (fix: no return type, correct name matches class)
    public objectcount() {
        count++;
    }

    // Method to display count (fix: must have return type 'void')
    public void displayCount() {
        System.out.println("Number of objects created: " + count);
    }

    public static void main(String[] args) {
        objectcount o1 = new objectcount(); // fix: add parentheses
        o1.displayCount();

        objectcount o2 = new objectcount();
        o2.displayCount();

        // Fix: declare variable i with type 'int'
        for (int i = 0; i < 10; i++) {
            new objectcount();
        }

        o2.displayCount();
    }
}
