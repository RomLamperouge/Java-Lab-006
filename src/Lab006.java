import java.util.Scanner;

/**
 * Colton Simpson
 * @since Version 0.0.1
 */
public class Lab006 {
    /**
     * these are my integers, n and m
     */
    int n;
    int m;
    /**
     * this is my method for isDivisible which should decide whether the users input is true or false
     */
    public String isDivisible() {

        if (n % m == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return null;
    }

    /**
     * this is my method to prompt the user and hopefully store their inputs
     *
     * @return
     */
    public void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input n");
        n = input.nextInt();
        System.out.print("input m");
        m = input.nextInt();

        /**
         * this is my object
         * @return
         */
         Lab006 myObject = new Lab006();
            isDivisible();
        System.out.println(myObject);


    }
    }


