package com.company;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
      public static void print(int index,Object obj){
          System.out.println(String.format("{%d},%s",index,obj.toString()));
      }
    public static void random1(){
          Random random=new Random();
        random.setSeed(2);
          for (int i=0;i<5;i++){
              print(i,random.nextInt(200));
          }
          List<Integer> array= Arrays.asList(new Integer[]{1,2,3,4,5});
          print(3,array);
        Collections.shuffle(array);
        print(4,array);
        Date date=new Date();
        print(5,date);
        print(6,date.getTime());
        DateFormat df=new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
        print(7,df.format(date));
    }
    public static void main(String[] args) {
	print(1,"hello java");
	print(2,5<<2);                          //静态可以直接调静态，不需要用对象
        for(int i=0;i<6;i++){
            if(i==1){continue;}  //跳过该次循环执行下次循环
            if(i==5){break;}
             if(i%2==1){
                print(8,"i%2==1");
             }
             print(7,i);
        }
        random1();
    }
}
