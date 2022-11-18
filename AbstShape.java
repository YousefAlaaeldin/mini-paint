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
public abstract class  AbstShape implements Shape {

    private Color borderColor;
    private Color fillColor;
    private Point position;
    
    public AbstShape(Point p){
        this.position=p;
    }
    
    @Override
    public void setPosition(Point position) {
       this.position = position;
    }

    @Override
    public Point getPosition() {
        return this.position;
        }

    @Override
    public void setColor(Color color) {
        this.borderColor = color;
     }

    @Override
    public Color getColor() {
        return this.borderColor;
     }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

    @Override
    public void draw(Graphics canvas) {
    }
    
}
