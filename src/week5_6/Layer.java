/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;
import  java.util.ArrayList;
import week5_6.Shape;
import week5_6.Triangle;

/**
 *
 * @author thinhnguyen
 */
public class Layer{
    private ArrayList<Shape> list ;

    
    
    private boolean visible;

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public ArrayList<Shape> getList() {
        return list;
    }
    public void setList(ArrayList<Shape> list) {
        this.list = list;
    }
    
    public void printLayer() {
        for (Shape shape : list) {
            System.out.println(shape.toString());
        }
    }
    

    public void removeTriangle(){
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i) instanceof Triangle){
                list.remove(i--);
                
            }
        }
    }

    public void removeCircle(){
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i) instanceof Circle){
                list.remove(i--);
                
            }
        }
    }
    public void removesame() {
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }
            if (count > 0) list.remove(i--);
        }
        printLayer();
    }
    

}
