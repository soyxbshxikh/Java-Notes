# Multithreading

# Multitasking : Performing multiple task at a single time

#### Use : It increases the performance of CPU

---

#### Types

1 . Process based Multitasking { Multiprocessing }

2 . Thread based Mutitasking { Multithreading }

## Multiprocessing

- Multiprocessing : When one system is connected to multiple processor in order to complete the task

## Multithreading

- Multithreading : Excecuting multiple threads at single time

- Threads : in one process there is more than one small task are running is called as Threads

---

## Without Thread Example

```java
class Mxplayer
{
    public static void main()
    {
        playvideo();
        playmusic();
    }
};
class Video
{
   void playvideo()
   {
       //code
   }
};
class Music
{
   void playmusic()
   {
        //code
   }
}
```

> # We can create threads with two types

### 1. Thread Class

    1. In this method we have to extend the Thread class and override the run() method.
    2. In Thread Class there are many methods

```java
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread Start");
    }
    public static void main(String args[])
    {
        MyThread t = new MyThread();
        t.start();
    }
}
```

---

### Output : Thread Start

---

### 2. Runnable Interface

    1. In this method we have to implement the Runnable interface and override the run() method.
    2. In Runnable Interface here is only one method run();

```java
class MyThread implements Runnable
{
    public void run()
    {
       System.out.println("Thread Start");
    }
    public static void main(String args[])
    {
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        t1.start();
    }
}
```

---

### Output : Thread Start

---

## 1. Performing single task from single thread

```java
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread Start");
    }
}
class Main
{
    public static void main(String args[])
    {
        MyThread t = new MyThread();
        t.start();
    }
}
```

---

## 2. Performing multiple task from single thread

```java
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread Start");
    }
    public void run(int x)
    {
        System.out.println(x);
    }
}
class Main
{
    public static void main(String args[])
    {
        MyThread t = new MyThread();
        t.start();
    }
}
```

---

## 3. Performing multiple task from multiple thread

```java
class MyThread1 extends Thread
{
    public void run()
    {
        System.out.println("Thread Start1");
    }
}
class MyThread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread Start2");
    }
}
class Main
{
    public static void main()
    {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
```

<br><br>

> # Thread class Methods and Constructor

### Consturctor

- Thread()
- Thread(String name)
- Thread(Runnable r)
- Thread(Runnable r, String name)
- Thread(ThreadGroup tg,Runnable r)
- Thread(ThreadGroup tg,String name)
- Thread(ThreadGroup tg,Runnable r,String name)
- Thread(ThreadGroup tg,Runnable r,String name,Long Stacksize)

### Methods

- Basic Methods
  - void start()
  - void run()
  - isAlive()
  - currentThread()
- Naming Methods
  - getName()
  - setName()
- Daemon Threads methods
  - isDaemon()
  - setDaemon()
- Priority based methods
  - getPriority()
  - setPriority()
- Preventing thread exceution
  - sleep()
  - yeild()
  - join()
- Interrupting thread methods
  - intrupt
  - isIterrupted()
  - interrupted()

### Example 1

```java
class Test
{
    public static void main(String args[])
    {
        System.out.println("Hello");
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Nothing");
        System.out.println(Thread.currentThread().getName());
        System.out.println(10/0);
    }
}
```

### Example 2

```java
class Test extends Thread
{
    public void run()
    {
        System.out.println("Thread is excecuted by "+Thread.currentThread().getName());
    }
    public static void main(String args[])
    {
        System.out.println("Hello is printed by "+Thread.currentThread().getName());
        Test t1 = new Test();
        t1.setName("Java");
        t1.start();

        Test t2 = new Test();
        t2.setName("Lecture");
        t2.start();
    }
}
```

## 1. Daemon Threads methods

- Which is run in the background of another thread
- It provides services to the threads
- Daemon thread is depend on the main function
- Ex : ErrorHandling , Spellchecker
- Methods
  - public final void setDaemon(boolean b)
  - public final void isDaemon()

### Example

```java
class Test extends Thread
{
    public void run()
    {
        if(Thread.currentThread().isDaemon())
        {
            System.out.println("Daemon Thread");
        }
        else
        {
            System.out.println("Child Thread");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Main Thread");
        Test t = new Test();
        t.setDaemon(true);
        t.start();
    }
}
```

## 2. Sleep Threads methods

- It is used to pause the execution of the thread for a specified amount of time
- It is a static method of Thread class

### Example 1

```java
class Test extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args)
    {
        Test t1 = new Test();
        t1.start();
    }
}

```+

### Example 2

```java
class Sleep extends Thread
{
    public static void main(String args[]) throws Exception
    {
        for(int i=1;i<5;i++)
        {
            Thread.sleep(1000);
            System.out.println(i);
        }
    }
}
```

### Example 3

```java
class Test extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(i+" : "+Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String args[])
    {
        Test t1 = new Test();
        t1.start();
        Test t2 = new Test();
        t2.start();
    }
}
```
