package com.example.dailydemo.thread;

import java.util.concurrent.*;

public class ExcutorTest {

    public static void main(String[] args) {
        Thread t =new Thread( new RunTask());
        t.start();
        FutureTask<Object> ft=new FutureTask<Object>(new CallTask());
        Thread f=new Thread(ft);
        f.start();
        try {
            System.out.println("callTask output:"+(String)ft.get());
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ExecutionException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Executor Test Start");
        ExecutorService exe=Executors.newFixedThreadPool(5);
        for(int i=0;i<20;i++){
            exe.execute(new RunTask());
            exe.submit(new RunTask());
        }
        /*//验证线程创建慢
        if(exe.isShutdown()){
             System.out.println("Thread 已经stop,等待线程创建");
             exe.execute(new RunTask());
             System.out.println("Executor Test end");
        }else{
            exe.shutdownNow();
        }   */
    }

}

class RunTask implements Runnable{

    @Override
    public void run() {
        System.out.println(" RunTask Thread Name is "+Thread.currentThread().getName());
    }

}

class CallTask implements Callable<Object> {

    @Override
    public Object call() throws Exception {
        TimeUnit.SECONDS.sleep(1);
        //System.out.println("This is callTask");
        return "callTask answer";
    }

}