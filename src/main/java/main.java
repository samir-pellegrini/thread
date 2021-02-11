/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("il thread si chiama " + Thread.currentThread().getName());
        
      /* Thread t1= new threadp("brontolo");
        Thread t2= new threadp("Cucciolo");
        Thread t3= new threadp("dotto");
        Thread t4= new threadp("Eolo");
        Thread t5= new threadp("Gongolo");
        Thread t6= new threadp(" Mammolo");
        Thread t7= new threadp("Pisolo");
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();   
        t7.start();*/
      Runnable r1=new MioRunable();
      Thread t1= new Thread(r1,"brontolo");
      Thread t2= new Thread(r1,"Cucciolo");
      Thread t3= new Thread(r1,"dotto"); 
      Thread t4= new Thread(r1,"eolo");
      Thread t5= new Thread(r1,"Gongolo");
      Thread t6= new Thread(r1,"Mammolo");
      Thread t7= new Thread(r1,"Pisolo");
      t1.start();
      t2.start();
      t3.start();
      t4.start();
      t5.start();
      t6.start();   
      t7.start();
    }
    
}
