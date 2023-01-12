package org.example;

import java.util.ArrayList;

public class MathModel {
    final float E = 0.000001f;
    GetData gt = new GetData();
    ArrayList<Float> point_list = new ArrayList<>();
    ArrayList<Float> value_list = new ArrayList<>();
    ArrayList<Float> square_list = new ArrayList<>();
    public MathModel(){
        get_points();
        get_values();
        get_squares();
        get_integral();
    }
    public void get_points(){
        float x = gt.data.left_side;
        while(x <= gt.data.right_side + E){
            point_list.add(x);
            x += gt.data.step;
        }
        if(gt.language.equals("ukr")){
            System.out.println("Множина точок, в яких обчислюється функція:");
        }
        else{
            System.out.println("A set of points for function calculating:");
        }
        for(float point : point_list){
            System.out.format("%.5f\n", point);
        }
    }
    public void get_values(){
        for(float p : point_list){
            value_list.add(gt.data.func(p));
        }
        if(gt.language.equals("ukr")){
            System.out.println("Множина відповідних значень функції:");
        }
        else{
            System.out.println("A set of corresponding function values:");
        }
        for(float value : value_list){
            System.out.format("%.5f\n", value);
        }
    }
    public void get_squares(){
        for(int i = 1; i < point_list.size(); i++){
            square_list.add(gt.data.step*0.5f*(value_list.get(i) + value_list.get(i-1)));
        }
        if(gt.language.equals("ukr")){
            System.out.println("Множина відповідних площ трапецій:");
        }
        else{
            System.out.println("A set of corresponding squares of trapeziums:");
        }
        for(float square : square_list){
            System.out.format("%.5f\n", square);
        }
    }

    public void get_integral(){
        float sum = 0;
        for(float square : square_list){
            sum += square;
        }
        if(gt.language.equals("ukr")){
            System.out.println("Значення визначеного інтегралу:");
        }
        else{
            System.out.println("Value of defined integral:");
        }
        System.out.format("%.5f\n", sum);
    }
}
