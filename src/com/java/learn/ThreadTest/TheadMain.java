package com.java.learn.ThreadTest;

/**
 *    1.新建状态(New)： 
 *         当用new操作符创建一个线程时， 例如new Thread(r)，线程还没有开始运行，此时线程处在新建状态。 当一个线程处于新生状态时，程序还没有开始运行线程中的代码
 *
 *      2.就绪状态(Runnable)
 *
 *         一个新创建的线程并不自动开始运行，要执行线程，必须调用线程的start()方法。当线程对象调用start()方法即启动了线程，start()方法创建线程运行的系统资源，并调度线程运行run()方法。当start()方法返回后，线程就处于就绪状态。
 *
 *         处于就绪状态的线程并不一定立即运行run()方法，线程还必须同其他线程竞争CPU时间，只有获得CPU时间才可以运行线程。因为在单CPU的计算机系统中，不可能同时运行多个线程，一个时刻仅有一个线程处于运行状态。因此此时可能有多个线程处于就绪状态。对多个处于就绪状态的线程是由Java运行时系统的线程调度程序(thread scheduler)来调度的。
 *
 *     3.运行状态(Running)
 *
 *         当线程获得CPU时间后，它才进入运行状态，真正开始执行run()方法.
 *
 *     4. 阻塞状态(Blocked)
 *
 *         线程运行过程中，可能由于各种原因进入阻塞状态:
 *         1>线程通过调用sleep方法进入睡眠状态；
 *         2>线程调用一个在I/O上被阻塞的操作，即该操作在输入输出操作完成之前不会返回到它的调用者；
 *         3>线程试图得到一个锁，而该锁正被其他线程持有；
 *         4>线程在等待某个触发条件；
 *         ......           
 *
 *         所谓阻塞状态是正在运行的线程没有运行结束，暂时让出CPU，这时其他处于就绪状态的线程就可以获得CPU时间，进入运行状态。
 *
 *     5. 死亡状态(Dead)
 *
 *         有两个原因会导致线程死亡：
 *         1) run方法正常退出而自然死亡，
 *         2) 一个未捕获的异常终止了run方法而使线程猝死。
 *         为了确定线程在当前是否存活着（就是要么是可运行的，要么是被阻塞了），需要使用isAlive方法。如果是可运行或被阻塞，这个方法返回true； 如果线程仍旧是new状态且不是可运行的， 或者线程死亡了，则返回false.
 */
public class TheadMain {

    // 线程状态 new (新建)->start 就绪 -> 运行（run方法）or ->阻塞 -> 死亡
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                runA();
            }
        };
        t.run();    // 开启线程是start(), 单独调用run()是当普通方法运行
        System.out.print("DW");
        // 输出360DW
    }

    static void runA() {
        System.out.print("360");
    }
}