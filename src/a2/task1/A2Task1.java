/* Test program of the class Cash whose objects represent amounts of Australia money
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2.task1;

/**
 *
 * @author mac
 */
public class A2Task1 {

    /**
     * Test program
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cash cash1 = new Cash(100, 5);// intiate a Cash class with 100 dollars and 5 cents
        cash1.setCash(100, 50);
        cash1.display(); //display dollars and cents of cash1
        System.out.println();

        Cash cash2 = new Cash(50);//intiate a Cash class with 50 dollars
        cash2.setDollars(40);
        cash2.display();// display contents of cash2
        System.out.println();

        Cash cash3 = Cash.add(cash1, cash2);// add dollars and cents of two Cash
        cash3.display();// display cash3
        System.out.println();

        Cash cash4 = Cash.minus(cash1, cash2);//minus between cash1 and cash2
        cash4.display();
        System.out.println();

        cash1 = new Cash(100, 5);
        cash2 = new Cash(50);
        cash1.add(cash2);// another add method
        cash1.display(); //display the sum one
        cash2.display(); //display cash2 which was subsituted by cash1
        System.out.println();

        cash1 = new Cash(100);
        cash2 = new Cash(50, 5);
        cash1.minus(cash2);//another minus method
        cash1.display();//display the minus result
        cash2.display();//display cash2 which was subsituted by cash1
        System.out.println();

        cash1 = new Cash(100, 5);
        cash2 = new Cash(50);
        System.out.println(cash1.equals(cash2));//display the equals method result
        System.out.println();

    }

}
