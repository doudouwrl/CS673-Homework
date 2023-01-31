package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main m=new Main();
        //Q2
        m.multiplication(12);
        System.out.println("Hello world!");
        System.out.println(m.isPalindrome("aba"));
        System.out.println(m.leapyear(2023));
        System.out.println(m.fibonacci_numbers(100));
    }
    //Q3
    public void multiplication(int n){

        for (int i = 1; i <= 12; ++i){
            System.out.println(n + " * " + i +
                    " = " + n * i);
    }
    }
    //Q4
    public boolean isPalindrome(String s) {
        if(s==null){
            return true;
        }
        String sa=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for (char c : sa.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                sb.append(c);
            }
        }
        if(sb.toString().equals(sb.reverse().toString())){
            return true;
        }
        return false;

    }
    //Q5
    public List combine(List list1,List list2){
        ArrayList res=new ArrayList();
        for(int i=0;i<list1.size();i++){
            res.add(list1.indexOf(i) );
            res.add(list2.indexOf(i));
        }
        return res;
    }
    //Q6
    public int fibonacci_numbers(int n)
    {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibonacci_numbers(n-2) + fibonacci_numbers(n-1);
        }
    }
    //Q7
    public boolean leapyear(int year) {
        return year % 100 == 0 ? year % 400 == 0 : year % 4 == 0;
    }


}
