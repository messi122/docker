package com.example.docker.demo;

/**
 * @Description:
 * @ClassName: com.example.docker.demo
 * @Author: yuyong
 * @CreateDate: 2018/10/30 15:43
 * @UpdateUser:
 * @UpdateDate: 2018/10/30 15:43
 * @UpdateRemark:
 * @Version: 1.0
 * @since JDK 1.8
 */
public class YangHui {
    public static void main(String[] args) {

        int len =5;
        int[][] arr =new int[len][len];

        for(int i=0;i<len;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                   arr[i][j]=1;
                }else {
                    arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
                }
            }
        }

        //等腰输出
        for(int i=0;i<len;i++){
            int t=len-i;
            for (int j=0;j<=t;j++){
                System.out.print(" ");
            }

            for(int k=0;k<=i;k++){
                System.out.print(arr[i][k]+" ");
            }

            System.out.println();
        }


    }
}
