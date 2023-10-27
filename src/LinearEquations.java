class LinearEquations {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    public LinearEquations(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public double calculate_slope() {
        return roundedToHundredth((y2-y1)/(x2-x1));
    }
    public String fraction_slope() {
        double slope = calculate_slope();
        int numerator = (int)(slope*100);
        int denominator = 100;
        numerator /= 10;
        denominator /= 10;
        if (numerator%denominator==0) {
            return " "+(numerator/denominator);
        }
        return numerator + "/" + denominator;
    }
    public double calculate_Distance() {
        return roundedToHundredth(Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2)));
    }
    public double calculate_y() {
        return roundedToHundredth(y1-(calculate_slope()*x1));
    }
    public String calculate_equation() {
        return "y =" + fraction_slope() + "x + " + calculate_y();
    }
    public String coordinateForX(double xValue) {
        return ("The point on the line is ( "+xValue+", "+(double)(calculate_slope()*xValue+calculate_y())+")");
    }
    public double roundedToHundredth(double toRound) {
        return Math.round(toRound*100)/100.0;
    }

    public String lineInfo() {
        return "The two points are: ("+x1+", "+y1+") and ("+x2+", "+y2+")\nThe equation of the line is: "+calculate_equation()+"\nThe slope of this line is: "+calculate_slope()+"\nThe y-intercept of the line is "+calculate_y()+"\nThe distance between the two points is: "+calculate_Distance();
    }
}