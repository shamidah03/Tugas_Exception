/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author Acer
 */
public class soal3 {
    public static void main(String[] args) {
        byte[] b = new byte[5];
        System.out.println("Input Bilangan Bulat : ");
        try{
            System.in.read(b);
        }
        catch (java.io.IOException e){
            System.err.println(e);
        }
        String a = new String(b).trim();
        int N = Integer.valueOf(a);
        System.out.println("Hasil : "+(N+2));
            
    }
}
