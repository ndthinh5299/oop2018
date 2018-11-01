/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.util.ArrayList;
//import week4.task2.Circle;

/**
 *
 * @author thinhnguyen
 */
import java.util.ArrayList;

public class Diagram {
    private ArrayList<Layer> listLayer = new ArrayList<Layer>();

    public void addLayer(Layer layer) {
        listLayer.add(layer);
    }

    public ArrayList<Layer> getListLayer() {
        for (int i = 0; i < listLayer.size(); i++) {
            System.out.println("#Layer " + i);
            listLayer.get(i).getList();
        }
        return listLayer;
    }

    public void removeAllCirle(){
        for (int i = 0; i < listLayer.size(); i++) {
            listLayer.get(i).removeCircle();
        }
    }
//    public void sortLayer() {
//        Layer circles = new Layer();
//        Layer triangles = new Layer();
//        Layer rectangles = new Layer();
//        Layer squares = new Layer();
//        Layer hexagons = new Layer();
//
//
//        for (Layer layer : listLayer) {
//            for (Shape shape : layer.getList()) {
//                if (shape instanceof Circle) circles.getList().add(shape);
//                if (shape instanceof Triangle) triangles.getList().add(shape);
//                if (shape instanceof Rectangle) rectangles.getList().add(shape);
//                if (shape instanceof Square) squares.getList().add(shape);
//                if (shape instanceof Hexagon) hexagons.getList().add(shape);
//
//            }
//        }
//        listLayer.clear();
//        listLayer.add(circles);
//        listLayer.add(triangles);
//        listLayer.add(rectangles);
//        listLayer.add(squares);
//        listLayer.add(hexagons);
//    }
}
