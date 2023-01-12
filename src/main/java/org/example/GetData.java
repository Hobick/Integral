package org.example;

import java.util.Scanner;

public class GetData {
    Data data = new Data();
    String language;
    public GetData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose language/Оберіть мову(eng/ukr): ");
        language = scan.next();
        if (language.equals("ukr")) {
            System.out.println("Введіть ліву границю інтегрування: ");
            data.left_side = scan.nextFloat();

            System.out.println("Введіть праву границю інтегрування: ");
            data.right_side = scan.nextFloat();

            System.out.println("Введіть крок інтегрування: ");
            data.step = scan.nextFloat();
        } else {
                System.out.println("Input left side of integration: ");
                data.left_side = scan.nextFloat();

                System.out.println("Input right side of integration: ");
                data.right_side = scan.nextFloat();

                System.out.println("Input step of integration: ");
                data.step = scan.nextFloat();

        }
        scan.close();
        }
}
