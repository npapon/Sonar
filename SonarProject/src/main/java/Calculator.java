
public class Calculator {

    public int add( int a, int b ) {
        return a + b;
    }

    public int multiply( int a, int b ) {
        return a * b;
    }

    public double add( double a, double b ) {
        return a + b;
    }

    public double multiply( double a, double b ) {
        return a * b;
    }

    public String superieurA( int nombre, int limite ) {
        if ( nombre > limite ) {
            return "Superieur";
        } else if ( nombre < limite ) {
            return "inférieur";
        } else {
            return "egal";
        }

    }

}
