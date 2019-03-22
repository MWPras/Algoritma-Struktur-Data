/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu1;

/**
 *
 * @author LENOVO
 */
public class PacmanOOP {
    public static void main(String[] args) {
        Pacman pac = new Pacman();
        pac.height = 20;
        pac.width = 20;
        pac.x = 7;
        pac.y = 4;
        pac.moveDown();
        pac.moveLeft();
        pac.moveLeft();
        pac.moveRight();
        pac.moveUp();
        pac.moveUp();
        System.out.println("Koordinat :" + pac.x + "," + pac.y);
    }
}