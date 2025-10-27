package FINAL.Thread;

class OddAdder extends Thread {
    int sum = 0;

    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            sum += i; // add odd numbers
        }
    }

    public int getSum() {
        return sum;
    }
}

class EvenSubtractor extends Thread {
    int sum = 0;

    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            sum -= i; // subtract even numbers
        }
    }

    public int getSum() {
        return sum;
    }
}

class ExpressionCalculator {
    public static void main(String[] args) {
        OddAdder oddThread = new OddAdder();
        EvenSubtractor evenThread = new EvenSubtractor();

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result = oddThread.getSum() + evenThread.getSum();
        System.out.println("Final Result: " + result);
    }
}
