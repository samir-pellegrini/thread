/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class MioRunable implements Runnable  {

    @Override
    public void run() {
          System.out.println("il nome del trhead è "+ Thread.currentThread().getName()); 
   }
    
    
}
