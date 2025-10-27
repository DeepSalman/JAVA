package FINAL.Thread;

class ArrayMaxFinder extends Thread {
    int[] arr;
    int max;

    ArrayMaxFinder(int[] arr, String name) {
        super(name);
        this.arr = arr;
    }

    public void run() {
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(getName() + " found max: " + max);
    }

    public int getMax() {
        return max;
    }
}

class MaxFinder {
    public static void main(String[] args) {
        int[] a1 = {3, 1, -5, 10};
        int[] a2 = {-2, 6, 7, 8, 0};
        int[] a3 = {12, -6, 4, 2, 1};
        int[] a4 = {10, 5, -9, 18, 7};

        ArrayMaxFinder t1 = new ArrayMaxFinder(a1, "Thread 1");
        ArrayMaxFinder t2 = new ArrayMaxFinder(a2, "Thread 2");
        ArrayMaxFinder t3 = new ArrayMaxFinder(a3, "Thread 3");
        ArrayMaxFinder t4 = new ArrayMaxFinder(a4, "Thread 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int finalMax = t1.getMax();
        if (t2.getMax() > finalMax) finalMax = t2.getMax();
        if (t3.getMax() > finalMax) finalMax = t3.getMax();
        if (t4.getMax() > finalMax) finalMax = t4.getMax();

        System.out.println("Maximum number among all arrays: " + finalMax);
    }
}

