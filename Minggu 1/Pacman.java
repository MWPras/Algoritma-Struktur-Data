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
public class Pacman {
    int x, y, width, height;
    void moveLeft() {
        if (x <= width && x > 0) {
            x -= 1;
        }
    }
    void moveRight() {
        if (x <= width && x > 0) {
            x += 1;
        }
    }
    void moveUp() {
        if (y <= height && y > 0) {
            y += 1;
        }
    }
    void moveDown() {
        if (y <= height && y > 0) {
            y -= 1;
        }
    }
}
