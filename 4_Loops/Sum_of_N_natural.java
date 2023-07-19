package Loops;

import java.util.*;

public class Sum_of_N_natural {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int counter = 0;
    int sum = 0;
    while(counter<=n)
    {
        System.out.println(counter);
        counter++;
        sum = sum + counter;
    }
    

}
