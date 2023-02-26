package LAB;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return this.numerator;
    }
    
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    public Fraction (Fraction f){
        this.numerator= f.numerator;
        this.denominator= f.denominator;
    }

    public Fraction add(Fraction f){
        int newnum = this.numerator* f.denominator + this.denominator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    } 

    public Fraction sub (Fraction f){
        int newnum = this.numerator* f.denominator + this.denominator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    }

    public Fraction mul(Fraction f){
        int newnum = this.numerator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    }

    public Fraction div(Fraction f){
        int newnum = this.numerator * f.numerator;
        int newden = this.denominator * f.denominator;
        return new Fraction(newnum, newden);
    }

    public int ucln (int numerator, int denominator){
        while (numerator!=denominator)
        {
            if(numerator>denominator)
                numerator=numerator-denominator;
            else 
                denominator=denominator-numerator;
        }
        return numerator;
    }

    public void reducer(){
        int i = ucln(this.numerator,this.denominator);
        this.numerator/=i;
        this.denominator/=i;
    }

    public String toString() {
        return "Fraction[num = " + getNumerator() + ",den = " +getDenominator() +"]";
    }
}
