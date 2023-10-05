package org.oops.runnables;

public class RunnableExample {
    public static void main(String[] args) {

        Runnable runnable=new Runnable() {
            int sum=0;
            @Override
            public void run() {
                  for(int i=0;i<10;i++){
                      sum+=i;
                  }
                System.out.println("Traditional ->\t"+sum);
            }
        };
        new Thread(runnable).start();
        Runnable runnable1=()->
        {
          int sum=0;
            for(int i=0;i<10;i++){
                sum+=i;
            }
            System.out.println("Lambda Expression ->\t"+sum);
        };
        new Thread(runnable1).start();
        new Thread(()->{
            int sum=0;
            for(int i=0;i<10;i++){
                sum+=i;
            }
            System.out.println("Inside the Thread Lambda Expression \t"+sum);
        }).start();

    }

}
