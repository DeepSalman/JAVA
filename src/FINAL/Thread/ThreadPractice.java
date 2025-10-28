package FINAL.Thread;

class Thread1 extends Thread //extend Thread class to make your class a Thread
{
    String name;

    Thread1(String name) //use constructor to take necessary variables for the thread
    {
        this.name = name;
    }

    public void run() //override run() method - the code of the thread must be written here
    {
        for(int i=1; i<=100; i++)
            System.out.println(name + " : " + i);
    }
}

class Code1 {

    public static void main(String[] args) {

        Thread1 t1 = new Thread1("Thread 1");
        Thread1 t2 = new Thread1("Thread 2");
        // Thread is created, but it is not running yet, need to start

        t1.start();
        t2.start();
        // Thread is started, now CPU can give access to any thread at any time
        // We do not call run() method, we call start() method which automatically calls run() method
        // 3 threads are running -> Main, t1 and t2

        for(int i=1; i<=100; i++)
            System.out.println("Main : " + i);


    }

}
