/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respitory;

import Model.Circle;
import Model.Rectangle;
import Model.Triangle;

/**
 *
 * @author fpt
 */
public interface IShapeRepository {
    
    void display(Triangle trigle, Rectangle rectangle, Circle circle);   
    
    Triangle inputTriangle();
    
    Rectangle inputRectangle();
    
    Circle inputCircle();
    
}
