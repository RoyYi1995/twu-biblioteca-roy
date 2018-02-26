package biblioteca.util;


import java.util.Scanner;

public class InputHelper {

    private static Scanner scanner;
    private static InputHelper inputHelper;
    public static InputHelper getInstance() {
        if (inputHelper == null){
            synchronized (InputHelper.class){
                if (inputHelper == null){
                    inputHelper = new InputHelper();
                    scanner = new Scanner(System.in);
                }
            }
        }
        return inputHelper;
    }

    private InputHelper() {
    }


    public int getNum() {
        System.out.println("Please input number:");
        return scanner.nextInt();
    }
}