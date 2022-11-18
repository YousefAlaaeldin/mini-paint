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
public class LineSegment extends AbstShape {

    private Point endPoint;
    public LineSegment(Point p,Point p2) {
        super(p);
        this.endPoint = p2;
    }

    
   
    @Override
    public void draw(Graphics canvas) {
         canvas.setColor(this.getColor());
         canvas.drawLine(this.getPosition().x, this.getPosition().y, endPoint.x,endPoint.y);
    }
    
}
