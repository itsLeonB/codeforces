import java.util.*;

public class cf792b {
    public static void main(String args[]) {
        int x, y, z;
        Scanner scn = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String ls = System.getProperty("line.separator");
        sc.useDelimiter(ls);
        int n = scn.nextInt();
        String[] testArr = new String[n];
        for(int i=0; i<n; i++) {
            testArr[i] = sc.nextLine();
        }
        System.out.println("\n\n");
        for(String s : testArr) {
            String[] splited = s.split(" ");
            int a = Integer.parseInt(splited[0]);
            int b = Integer.parseInt(splited[1]);
            int c = Integer.parseInt(splited[2]);
            z=c;
            y=z+b;
            x=y+a;
            System.out.println(x + " " + y + " " + z);
        }
    }
}
