//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("What's your name");
        Scanner s = new Scanner(System.in);
        String name= s.nextLine();
        System.out.println("Hello, " + name + "!");
        }
    }
