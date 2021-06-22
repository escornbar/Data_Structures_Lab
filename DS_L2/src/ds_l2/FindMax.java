/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds_l2;

/**
 *
 * @author syaam
 */
public class FindMax {
    
    public static void main(String[] args) {
        Integer[] a={1,2,3};
        String[] b={"red","green","blue"};
        Circle[] c={new Circle(3.0), new Circle(2.9), new Circle(5.9)};
        System.out.println(max(c).radius);
        System.out.println(max(a));
        
    }

    static class Circle implements Comparable<Circle>{
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public int compareTo(Circle obj) {
            if(this.radius > obj.radius){
                return 1;
            } else if( this.radius < obj.radius){
                return -1;
            } else {
                return 0;
            }
        }
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E max=list[0];
        
        for(int i=1;i<list.length;i++){
            if(list[i].compareTo(max)>0){
                max=list[i];
            }
        }
        
        return max;
    }
}
