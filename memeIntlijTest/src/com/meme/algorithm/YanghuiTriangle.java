package com.meme.algorithm;

/**
 * Created by zhangb on 25/9/2015.
 * 杨辉三角 打印
 */
public class YanghuiTriangle {

    public static void main(String[] args) {
        printTriangle(20000);
    }

    static void printTriangle(int sequence){
        int triangle[][]=new int[sequence][];
         
        for (int i = 0; i < triangle.length; i++) {
            triangle[i]=new int[i+1]; 
             
            for(int j=0;j<=i;j++){

                if(i==0||j==0||j==i){
                    triangle[i][j]=1;
                }else{ 
                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
                }
                System.out.print(triangle[i][j]+"\t");          
            }
            System.out.println();               
        }
    }
}
