import java.io.*;
public class Addup
{
    static public void main(String args[]) {
        InputStreamReader stdin = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(stdin);
        int i1 = 0,i2 = 0;
        String s1,s2;
        try {
	    s1 = console.readLine();
	    i1 = Integer.parseInt(s1);
	    s2 console.readLine();
	    i2 = Integer.parseInt(s2);
	}		
	catch(IOException ioex) {
	    System.out.println("Input error");
	    System.exit(1);
	}
	catch(NumberFormatException nfex) {
	    System.out.println("\"" + nfex.getMessage() + "\" is not numeric");
	    System.exit(1);
	}
	System.out.println(i1 + " + " + i2 + " = " + (i1+i2));
	System.exit(0);
    }
}
%> javac Addup.java
%> java Addup
