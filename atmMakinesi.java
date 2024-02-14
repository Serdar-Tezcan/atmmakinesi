
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pursa
 */
public class atmMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        Scanner scan = new Scanner(System.in);
        
        int bakiye;
        bakiye = 1000;
        
        System.out.println("bakiyeniz: " + bakiye);
        System.out.println("\n****İŞLEMLER****\n");
        System.out.println("1. bakiye sargulama");
        System.out.println("2.para çekme");
        System.out.println("3.para yatırma");
        System.out.println("kart iade");
        
        System.out.println("\n***İŞLEMİNİZİ SEÇİNİZ\n***");
        int islem = scan.nextInt();
        
        switch(islem){
            case 1:
                System.out.println("bakiyeniz= " + bakiye);
                break;
                
            case 2:
                System.out.println("çekmek istediğiniz tutarı giriniz:");
                int tutar = scan.nextInt();
                if(tutar>bakiye){
                    System.out.println("yetersiz bakiye");
                }
                tutar -= bakiye;
                
                System.out.println("kalan bakiyeniz= " + (bakiye-tutar));
                break;
                
            case 3:
                System.out.println("yatırmak istediğiniz tutarı giriniz:");
                tutar = scan.nextInt();
                System.out.println("toplam bakiyeniz" + (tutar+bakiye));
                break;
            case 4 :
                System.out.println("lütfen kartınızı alınız");
            default :
                System.out.println("yanlış işlem seçtiniz.");
                
                
        }
        
        
    
    }
    
}
