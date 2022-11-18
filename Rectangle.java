/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minipaint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author yousef abdou
 */
public class Rectangle extends AbstShape{

    private int height;
    private int width;
    public Rectangle(Point p,int width,int height) {
        super(p);
        this.width = width;
        this.height= height;
    }


    @Override
    public void draw(Graphics canvas) {
         canvas.setColor(this.getColor());
         canvas.drawRect(this.getPosition().x, this.getPosition().y, width, height);
         canvas.setColor(this.getFillColor());
         canvas.fillRect(this.getPosition().x, this.getPosition().y, width, height);

    }
    
}
