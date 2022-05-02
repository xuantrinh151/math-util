/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinhnx151.mathutil.core;

/**
 *
 * @author xuant
 */
public class MathUtil {

    //Viết hàm giai thừa
    //21! tràn kiểu long 
    //tính giai thừa trong khoảng từ 0 đến 20 
    //Ta xài luôn kĩ thuật lập trinh tdd(test first development)
    //Nghĩa là ta nghĩ về bộ dữ liệu test trước khi viết code
//    public static long getFactorial(int n) {
//        long product = 1;
//        if(n < 0 || n > 20)
//            throw new IllegalArgumentException("n must be between 0..20");
//        if(n == 0 || n ==1)
//            return 1;
//        for (int i = 2; i <= n; i++) {
//            product *= i;
//        }
//
//        return product;
//    }
    
    //Đệ quy , recursion , gọi lại chính mình với quy mô khác
    //Tính 5!
    //5! = 5 * 4!
    //......
    //1! = 1 dừng
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
          throw new IllegalArgumentException("n must be between 0..20");
        if(n == 0 || n == 1)
            return 1;
        return n * getFactorial(n-1);
    }
}
