/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118001.latihan62.livingthing;

/**
 *
 * @author
 * Nama      : Alfian Soasiu
 * Kelas     : PBO1
 * NIM       : 10118001
 * Deskripsi :
 */
public class IndexLivingThing {
    public static void main(String[] args) {
        
        Human human = new Human();
        human.setNama("Alfian Soasiu");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
        
    }
    
}

