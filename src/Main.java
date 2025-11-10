import Menus.MenuDriver;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) { //Driver Program
        Scanner scnr = new Scanner(System.in);
        MenuDriver driver = new MenuDriver(scnr); //needs scnr to be passed on for driver to work
        driver.run();
    }
}