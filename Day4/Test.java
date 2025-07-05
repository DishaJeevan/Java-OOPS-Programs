import java.io.*;
class test{
    public static void main(String[] args)throws IOException {
        PrintWriter output=new PrintWriter(System.out,true);
        output.println("Enter your message:");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String message=input.readLine();
        output.println("You entered: "+ message);


    }
 }