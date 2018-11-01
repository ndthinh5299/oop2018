/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thinhnguyen
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle();
        
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle();
        
        Square square = new Square();
        Square square1 = new Square();
        
        Triangle triangle = new Triangle();
        Triangle triangle1 = new Triangle();
        
        Hexagon hexagon = new Hexagon();
        Hexagon hexagon1 = new Hexagon();
        
        Layer layer = new Layer();
        
        Diagram listLayer = new Diagram();
        ArrayList<Shape> s = new ArrayList<Shape>(); 
                s.add(rectangle1);
                s.add(rectangle);
                
                s.add(triangle1);
                s.add(triangle);

                s.add(hexagon);
                s.add(hexagon1);

                s.add(circle1);
                s.add(circle);
                
                s.add(square1);
                
                
        //layer.getList().add(square);
        layer.setList(s);
        

        System.out.println("Danh sach truoc khi xoa la:");
        System.out.println("---------------------------------");
//
            layer.printLayer();
            layer.removeTriangle();
         //   layer.removesame();
//        //layer.removeCircle();
//        //layer.printLayer();
//
            System.out.println("---------------------------------");
            System.out.println("Danh sach sau khi xoa la: ");

            layer.printLayer();
//        listLayer.addLayer(layer);
//        //diagram.removeCircle();
//        listLayer.sortLayer();
//        listLayer.getListLayer();

    }
}
