/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minipaint;

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author yousef abdou
 */
public class Circle extends AbstShape{

    private int radius;

    public Circle(int radius,Point p) {
        super(p);
        this.radius = radius;
        
    }
    
    @Override
    public void draw(Graphics canvas) {
      canvas.setColor(this.getColor());
      canvas.drawOval(this.getPosition().x,this.getPosition().y,2*this.radius,2*this.radius);
      canvas.setColor(this.getFillColor());
      canvas.fillOval(this.getPosition().x, this.getPosition().y, 2*this.radius, 2*this.radius);
    }
    
}
