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
public class Square extends AbstShape{

    private int side;
    public Square(Point p,int side) {
        super(p);
        this.side = side;
    }

 
    @Override
    public void draw(Graphics canvas) {
              canvas.setColor(this.getColor());
              canvas.drawRect(this.getPosition().x, this.getPosition().y, side, side);
              canvas.setColor(this.getFillColor());
              canvas.fillRect(this.getPosition().x, this.getPosition().y, side, side);

    }
    
}
