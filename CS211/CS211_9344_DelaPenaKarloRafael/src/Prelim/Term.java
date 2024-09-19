import java.util.Objects;

/*
Name: Dela Pena, Karlo Rafael G.
Class Code: CS211 9344
Schedule: TTHS 8:30-9:30, 10:30-12:00
Date: 19-09-2024

This class is a custom object class for constructing a polynomial.
This object class takes a double for the coefficient, char for the variable, and int for the exponent of a term.
*/


public class Term {


    double coefficient;
    char variable;
    int exponent;
    public Term(){} //Constructor for a term with no given parameters
    public Term(double coefficient, char variable,int exponent){ //Constructor for a term with given parameters
        this.coefficient = coefficient;
        this.variable = variable;
        this.exponent = exponent;
    }

    /* Each variable of the Term class has a getter method that returns the value of each variable
     * */
    public double getCoefficient() {
        return coefficient;
    }

    public char getVariable() {
        return variable;
    }

    public int getExponent() {
        return exponent;
    }

    /* Each variable of the Term class has a setter method that can change the value of each variable
    * */
    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public void setVariable(char variable) {
        this.variable = variable;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

    /*The toString method is used to convert a Term to a string for displaying a Terms values or for use in other methods such as the .compareTo method*/
    @Override
    public String toString() {
        return coefficient +variable + "^" + exponent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Term term = (Term) o;
        return Double.compare(term.coefficient, coefficient) == 0 && variable == term.variable && exponent == term.exponent;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coefficient, variable, exponent);
    }
    /*The setVariableValue is a method that will assign a double value to the variable of a term and calculate the final value using this given value*/
    public double setVariableValue(double variableValue){
        return (this.coefficient) * ((variableValue) * Math.exp(this.exponent));
    }
    /*The addTwoTerms method will show the sum of two terms*/
    public void addTwoTerms(Term one, Term two){
        Term newTerm = new Term();
        if(one.getExponent() == two.getExponent()){
            newTerm.setCoefficient(one.getCoefficient() + two.getCoefficient());
            newTerm.setVariable(one.getVariable());
            newTerm.setExponent(one.getExponent());
            System.out.println("The sum of the two terms is : " + newTerm);
        } else if (one.getExponent() > two.getExponent()){
            System.out.println("The sum of the two terms is : " + one + " + " + two);
        } else if (one.getExponent() < two.getExponent()){
            System.out.println("The sum of the two terms is : " + two + " + " + one);
        }
    }

    /*The subtractTwoTerms method will show the difference of two terms*/
    public void subtractTwoTerms(Term one, Term two){
        Term newTerm = new Term();
        if(one.equals(two)){
            System.out.println("The difference of the two terms is : 0");
        }
        if(one.getExponent() == two.getExponent()){
            newTerm.setCoefficient(one.getCoefficient() - two.getCoefficient());
            newTerm.setVariable(one.getVariable());
            newTerm.setExponent(one.getExponent());
            System.out.println("The difference of the two terms is : " + newTerm);
        } else if (one.getExponent() > two.getExponent()){
            System.out.println("The difference of the two terms is : " + one + " - " + two);
        } else if (one.getExponent() < two.getExponent()){
            System.out.println("The difference of the two terms is : " + two + " - " + one);
        }
    }

    /*The multiTwoTerms method will show the product of two terms*/
    public void multiTwoTerms(Term one, Term two){
        Term newTerm = new Term();
        newTerm.setCoefficient(one.getCoefficient() * two.getCoefficient());
        newTerm.setExponent(one.getExponent() + two.getExponent());
        System.out.println("The product of the two terms is : " + newTerm);
    }
    /*The div two terms method will show the quotient of two terms*/
    public void divTwoTerms(Term one, Term two){
        Term newTerm = new Term();
        newTerm.setCoefficient(one.getCoefficient() / two.getCoefficient());
        newTerm.setExponent(one.getExponent() - two.getExponent());
        System.out.println("The quotient of the two terms is : " + newTerm);
    }
}
