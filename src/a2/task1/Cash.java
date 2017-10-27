/* class Cash manages the australian dollars and cents
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2.task1;

/**
 *
 * @author mac
 */
public class Cash {

    private int dollars;
    private int cents;

    /**
     * constructor with two arguments
     *
     * @param dollars //Australian dollars
     * @param cents //cents contained
     */
    public Cash(int dollars, int cents) {
        setCash(dollars, cents);
    }

    /**
     * constructor with one argument
     *
     * @param dollars 
     */
    public Cash(int dollars) {
        setDollars(dollars);// intiated to zero
    }

    /**
     * set Cash with two parameters
     *
     * @param dollars
     * @param cents
     */
    public void setCash(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;

    }

    /**
     * set Cash with one parameters
     *
     * @param dollars
     */
    public void setDollars(int dollars) {
        this.dollars = dollars;
        this.cents = 0;

    }

    /**
     * toString method
     *
     * @return 
     */
    public String toString() {
        return ("The value of dollars is " + dollars + " The value of cents is " + cents + '\n');
    }

    /**
     * method that display the dollars and cents of Australian money
     *
     *
     */
    public void display() {
        System.out.print("The value of dollars is " + dollars + " The value of cents is " + cents + '\n');
    }

    /**
     * Add method with two arguments
     *
     * @param cash1 //the first argument
     * @param cash2 // the second argument
     * @return
     */
    public static Cash add(Cash cash1, Cash cash2) {
        int dollars1 = cash1.dollars + cash2.dollars, cents1; //dollars add in all
        if ((cash1.cents + cash2.cents) > 100) { // if sum of cents more than 100, dollars should be changed
            cents1 = (cash1.cents + cash2.cents) - 100;
            dollars1++; // dollars+1
        } else {
            cents1 = cash1.cents + cash2.cents;
        }
        return new Cash(dollars1, cents1); // return a new Cash object
    }

    /**
     * minus method with two arguments
     *
     * @param cash1
     * @param cash2
     * @return
     */
    public static Cash minus(Cash cash1, Cash cash2) {
        int dollarsVariable1, dollarsVariable2, centsVariable1, centsVariable2; // add variables to store the bigger and smaller one
        if (cash1.dollars > cash2.dollars || (cash1.dollars == cash2.dollars && cash1.cents >= cash2.cents)) {
            // if amount of cash1 is bigger than amount of cash2
            dollarsVariable1 = cash1.dollars; //minuend
            dollarsVariable2 = cash2.dollars; //subtractor
            centsVariable1 = cash1.cents;
            centsVariable2 = cash2.cents;
        } else {
            dollarsVariable1 = cash2.dollars; //minuend
            dollarsVariable2 = cash1.dollars; //subtractor
            centsVariable1 = cash2.cents;
            centsVariable2 = cash1.cents;
        }
        int dollars1 = dollarsVariable1 - dollarsVariable2, cents1;
        if ((centsVariable1 - centsVariable2) < 0) { // if difference is lower than 0
            cents1 = (centsVariable1 - centsVariable2) + 100;
            dollars1--;
        } else {
            cents1 = centsVariable1 - centsVariable2;
        }
        return new Cash(dollars1, cents1);
    }

    /**
     * Add method with one argument
     *
     * @param cash1
     */
    public void add(Cash cash1) {
        int dollarsVariable1 = dollars; //save cash1's dollars and cents
        int centsVariable1 = cents;
        dollars = add(this, cash1).dollars; //chaining the method
        cents = add(this, cash1).cents;
        cash1.dollars = dollarsVariable1; //assign cash1
        cash1.cents = centsVariable1;
    }

    /**
     * minus method with one argument
     *
     * @param cash1
     */
    public void minus(Cash cash1) {
        int dollarsVariable1 = dollars;
        int centsVariable1 = cents;
        dollars = minus(this, cash1).dollars; //chaining the method
        cents = minus(this, cash1).cents;
        cash1.dollars = dollarsVariable1;
        cash1.cents = centsVariable1;
    }

    /**
     * equals method compares whether two amounts are the same
     *
     * @param cash1
     * @return
     */
    public boolean equals(Cash cash1) {
        if (dollars == cash1.dollars && cents == cash1.cents) {
            return true;
        } else {
            return false;
        }
    }

}
