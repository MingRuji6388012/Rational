class Rational { 
    long numerator,denominator; 

    class Illegal extends Exception { 
        String reason; 
        Illegal (String reason) { 
            this.reason = reason; 
        } 
    } 

    Rational() {
        // to be completed
        numerator = 0;
        denominator = 1;
    }

    Rational(long numerator, long denominator) throws Illegal {
        // to be completed
        this.numerator = numerator;
        this.denominator = denominator;

        if (denominator == 0) {
            throw new Illegal("Division by zero error");
        }
    }

    // find the reduce form 
    private void simplestForm() { 
        long computeGCD; 
        computeGCD = GCD(Math.abs(numerator), denominator); 
        numerator /= computeGCD; 
        denominator /= computeGCD; 
    } 

    // find the greatest common denominator 
    private long GCD(long a, long b) { 
        if (a%b ==0) return b; 
        else return GCD(b,a%b); 
    }

    /***
     * Compute an addition of the current rational number to another given rational number
     * @param x the rational number to be added to the current rational number
     */
    public void add(Rational x) { 
        numerator = (numerator * x.denominator) + (x.numerator * denominator);
        denominator = (denominator * x.denominator); 
        simplestForm(); 
    }

    /***
     * Compute a subtraction of the current rational number to another given rational number
     * @param x the rational number to be subtracted from the current rational number
     */
    public void subtract(Rational x) {
        // to be completed
        numerator = (numerator * x.denominator) - (x.numerator * denominator);
        denominator = (denominator * x.denominator);
        simplestForm();
    }

    /***
     * Compute a multiplication of the current rational number to another given rational number
     * @param x the rational number to be multiplied to the current rational number
     */
    public void multiply(Rational x) { 
        // to be completed
        numerator = numerator * x.numerator;
        denominator = denominator * x.denominator;
        simplestForm();
    }

    /***
     * Compute a division of the current rational number to another given rational number
     * @param x the rational number to be divided by the current rational number
     */
    public void divide(Rational x) {
        // to be completed
        numerator = numerator * x.denominator;
        denominator = denominator * x.numerator;
        simplestForm();
    }

    /***
     * Check if the given rational number equals to the current rational number
     * @param x the rational number to be compared to the current rational number
     * @return true if the given rational number equals to the current, false otherwise
     */
    public boolean equals(Object x) {
        // to be completed
        if(this == x && this.numerator == ((Rational) x).numerator && this.denominator == ((Rational) x).denominator) {
            return true; // TODO: This needs to be modified.
        }if (x == null || getClass() != x.getClass()) {
            return false;
        }else return numerator == ((Rational) x).numerator && denominator == ((Rational) x).denominator;
    }

    /***
     * Compare the current rational number to the current rational number
     * @param x the rational number to be compared to the current rational number
     * @return -1 if the current rational number is less than the given number, 0 if they're equal, 1 if the current
     * rational number is larger than the given number
     */
    public long compareTo(Object x) {
        // to be completed
        if (!(x instanceof Rational)) {
            throw new IllegalArgumentException("Cannot compare a Rational to a non-Rational object.");
        }

        Rational RationalX = (Rational) x;
        long X_Numerator = RationalX.numerator * this.denominator;
        long current_Numerator = this.numerator * RationalX.denominator;

        if (current_Numerator < X_Numerator) {
            return -1;
        } else if (current_Numerator > X_Numerator) {
            return 1;
        } else {
            return 0;
        }

//        if(numerator == ((Rational) x).numerator && denominator == ((Rational) x).denominator) {
//            return 0;
//        }else if(((numerator * ((Rational) x).denominator) / (denominator * ((Rational) x).denominator)) > (((((Rational) x).numerator) * denominator) / (((Rational) x).denominator) * denominator)){
//            return 1;
//        }else return -1;
    }

    /***
     * Give the formatted string of the rational number
     * @return the string representation of the rational number. For example, "1/2", "3/4".
     */
    public String toString() {
        // to be completed
        if(this.denominator == 0){
            return "Invalid Rational";
        }
        simplestForm();
        // In case of the rational number is divisible (integer form)
        if(this.numerator % this.denominator == 0){
            return String.valueOf(this.numerator / this.denominator);
        }else if(this.numerator < 0 && this.denominator < 0) {
            return String.valueOf(-numerator) + "/" + String.valueOf(-denominator);
            //In case of both numerator and denominator are negative (-x/-y = x/y)
        }else return String.valueOf(numerator) + "/" + String.valueOf(denominator); // TODO: This needs to be modified.
    }

    public static void main(String[] args) {
        System.out.println("This is Rational class.");
    }
}