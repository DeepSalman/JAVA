package FINAL.Thread;

class SeriesThread extends Thread
{
    double x;
    int start;
    double sum = 0;

    SeriesThread(double x, int start)
    {
        this.x = x;
        this.start = start;
    }

    public void run()
    {
        for(int i=start; i<=50; i += 2)
        {
            sum += Math.pow(x,i) / (i+1);
        }
    }
}

class Code3 {

    public static void main(String[] args) {

        SeriesThread s1 = new SeriesThread(1.15, 0); // positive
        SeriesThread s2 = new SeriesThread(1.15, 1); // negative

        s1.start();
        s2.start();

        try
        {
            s1.join();
            s2.join();
        }
        catch(Exception e){}

        System.out.println("Sum of series = " + (s1.sum-s2.sum));


    }

}