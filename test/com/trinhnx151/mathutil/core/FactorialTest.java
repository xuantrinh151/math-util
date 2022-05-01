/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinhnx151.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author xuant
 */
public class FactorialTest {

    @Test //biến cái hàm đi kèm cái Annotation này thành hàm main()
    public void checkFactorialGivenRightArgumentReturnsWell() {
        long expected = 120; //tui hy vọng 120 trả về
        long actual = MathUtil.getFactorial(5); // nếu tui tính 5!

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        Assert.assertEquals(720, MathUtil.getFactorial(6));

    }
    //test xem hàm có ném về ngoại lệ như kì vọng không
    //nếu tính f(-5) thì ném ngoại lệ
    //nếu đúng gọi f(-5) mà xem ném ra ngoại lệ thì hàm viết đúng
    //hàm đưuọc thiết kế đưa số âm ném ngoại lệ --> có nghĩa hàm đúng
    //Junit 4 coi ngoại lệ không là giá trị, nên k Assert được
    @Test(expected = IllegalArgumentException.class) 
    public void checkFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5); //phải ném ngoại lệ thì mới đúng
    }
}

//CHỐT HẠ CHO XANH ĐỎ
//XANH CHO TẤT CẢ MỌI TK PHẢI XANH, TỨC LÀ ACTUAL  PHẢI KHỚP VỚI EXPECTED
//ĐỎ KHI 1 TH ĐỎ
//HÀM ĐÃ ĐÚNG THÌ PHẢI ĐÚNG CHO MỌI TH
//KHÔNG CHẤP NHẬN ĐÚNG SAI 
