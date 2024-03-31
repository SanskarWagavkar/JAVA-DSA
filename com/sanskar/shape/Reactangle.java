package com.sanskar.shape;

class react{
    float length;
    float width;
    float height;
    float side;

    float get_volume(){      
        return length*width*height;
    }

    float get_sa(){
        return length*width;
    }

    void set(float length, float width, float height, float side){
        this.length = length;
        this.width = width;
        this.height = height;
        this.side = side;
    }
    void set_square(int i){
        this.side = i;
    }
    float get_square_area(){
        return side*side;
    }

}


public class Reactangle {
    public static void main(String[] args) {
        react r = new react();

        r.set(1, 2, 3, 4);
        System.out.println(r.get_volume());
        System.out.println(r.get_sa());

    }
}
