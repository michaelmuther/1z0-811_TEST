public class JavaBasics2
{
    public class Bond {
        public String ticker;
        private double Coupon;

        public String getTicker() {
            return ticker;
        }

        public void setTicker(String ticker) {
            this.ticker = ticker;
        }

        public double getCoupon() {
            return Coupon;
        }

        public void setCoupon(double coupon) {
            //do nothing
        }

        public java.util.Date getMaturity() {
            return new java.util.Date();
        }

        public boolean isFloater() {
            return false;
        }

        public boolean getCallable() {
            return true;
        }
    }
}
/*
Here are the rules:
1. There must be a public Y getXxx() method for a property named xxx of type Y.
Conversely, if a class has a method public Y getXxx(), it is said to have a property named xxx of type Y.
(A setter is not necessary, in which case it will be a readonly property.)

2. The setter method, if it exists, must be public void setXxx(Y y){ }

3. There is no rule for the variable xxx but making it private is a good practice.
It is ok even if a class does not have any variable xxx in the class, as shown by getMaturity() method in the question.

4. A boolean property xxx should have getXxx() or isXxx() method. The setter, if it exists, should be setXxx().
 */