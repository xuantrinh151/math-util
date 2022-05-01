package com.trinhnx151.mathutil.core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.trinhnx151.mathutil.core.MathUtil.getFactorial;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author xuant
 */
//Ta sẽ dùng kĩ thuật Data Driven Testing/Parameterzed Testing
//tham số hóa bộ dữ liệu test
//là bộ kĩ thuật tách dữ liệu test ra hẳn câu lệnh kiểm thử hàm

//bộ data có thể đặt ở excel , txt , db
//fill bộ data vào trong lời gọi hàm
//Tách bạch data và lời gọi hàm
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    //chuẩn bị bộ data đã 
    //nếu để file txt thì phải viết thêm đoạn code để đọc data
    @Parameters
    public static Object[][] initData(){
        return new Integer[][]{
                 {0,1},
                 {1,1},
                 {4,24},
                 {5,120}
        };
    }
    
    @Parameter(value = 0)
    public int n; //bạn muốn tính mấy giai thừa
    @Parameter(value = 1)
    public long expected; //bạn muốn kì vọng trả về mấy
    
    @Test //biến cái hàm đi kèm cái Annotation này thành hàm main()
    public void checkFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, getFactorial(n));
    }
       
}
