package LinkedList;

import java.util.Scanner;

public class TuoFeng {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char [] c = s.toCharArray();
        int len = c.length;
        if(len <= 2)
            System.out.println(c);
        int j = -1;
        for(int i = 0; i < len - 2;i++)
        {
            if(c[i] == c[i+2] && c[i] != c[i+1])
            {
                j = i + 2;
                i++;
            }
            else if(i != j)
            {
                System.out.print(c[i]);
            }
        }
        in.close();
    }
}
