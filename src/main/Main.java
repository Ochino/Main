package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
  
public class Main {
  
    private static BufferedReader bR;
  
    public static void main(String[] args) {
        int sum = 1;
        bR = new BufferedReader(new InputStreamReader(System.in));
        try {
            String linea = bR.readLine();
            int n = Integer.parseInt(linea);
            sum = (n * (n+1))/2;
            System.out.println(sum);
        }catch (Exception e) {
        }
    }
}