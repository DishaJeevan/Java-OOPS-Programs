public class DisplayNoObjects {
    static int count=0; 
    public DisplayNoObjects(){
        count++;
    }
    // Static variable to keep track of the number of objects
    public static void Display() {
        System.out.println("Number of objects created: " + count);
    }
    public static void main(String[] args) {

            // DisplayNoObjects obj1 = new DisplayNoObjects();
            // obj1.Display();
            // DisplayNoObjects obj2 = new DisplayNoObjects(); 
            // obj2.Display();
            for (int i=0;i<10;i++){
                new DisplayNoObjects();
                // Display the count of objects created
    }
    DisplayNoObjects.Display();
}
}
