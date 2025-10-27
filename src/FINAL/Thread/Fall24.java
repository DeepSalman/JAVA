package FINAL.Thread;

class NegativePart extends Thread {
    double sum = 0;
    double x;

    NegativePart(double x) {
        this.x = x;
    }

    public void run() {
        // Negative terms are at even powers (x^1/2, x^3/4, x^5/6, ...)
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 1) { // odd power means negative term
                sum -= Math.pow(x, i) / (i + 1);
            }
        }
    }

    public double getSum() {
        return sum;
    }
}

class PositivePart extends Thread {
    double sum = 0;
    double x;

    PositivePart(double x) {
        this.x = x;
    }

    public void run() {
        // Positive terms: 1, x^2/3, x^4/5, ...
        sum += 1; // the first term
        for (int i = 2; i <= 50; i++) {
            if (i % 2 == 0) { // even power means positive term
                sum += Math.pow(x, i) / (i + 1);
            }
        }
    }

    public double getSum() {
        return sum;
    }
}

class ZCalculator {
    public static void main(String[] args) {
        double x = 1.15;

        NegativePart negThread = new NegativePart(x);
        PositivePart posThread = new PositivePart(x);

        negThread.start();
        posThread.start();

        try {
            negThread.join();
            posThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        double z = negThread.getSum() + posThread.getSum();

        System.out.println("Final value of z = " + z);
    }
}

