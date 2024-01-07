import java.util.*;
public class Main {
       
    public static void main(String[] args) {
      
     CustomThread customThread = new CustomThread();
      Runnable runAble = ()->{
       for(int i=0;i<8;i++){
       System.out.println(2);
       try{
         Thread.sleep(100);
       }catch(Exception e){
         System.out.println(e);
       }
        }
     };
     
     Thread secondThread = new Thread(runAble);
      
     
     customThread.start();
     secondThread.start();
     
     for(int i=0;i<3;i++){
       System.out.println(0);
       try{
         Thread.sleep(100);
       }catch(Exception e){
         System.out.println(e);
       }
     }
     
     
        
  }
  
  public static void printThreadState(Thread thread ){
      
      System.out.println("--------------------------------");
      System.out.println("Thread Id : "+thread.getId());
      System.out.println("Thread Name : "+thread.getName());
      System.out.println("Thread Priority : "+thread.getPriority());
      System.out.println("Thread State : "+thread.getState());
      System.out.println("Thread Group : "+thread.getThreadGroup());
      System.out.println("Thread isAlive : "+thread.isAlive());
    }
}
