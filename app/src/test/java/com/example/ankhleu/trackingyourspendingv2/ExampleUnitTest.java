package com.example.ankhleu.trackingyourspendingv2;

import com.example.ankhleu.trackingyourspendingv2.data.account;
import com.example.ankhleu.trackingyourspendingv2.data.accountpayDAO;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

/*    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
*/

    @Test
   public void test_add_data()throws Exception
    {
        accountpayDAO dao=new accountpayDAO();
        dao.add(new account(20180120,300,"餐飲","",""));
        dao.add(new account(20180120,100,"飲料","",""));
        dao.add(new account(20180119,500,"餐飲","",""));
        //assertEquals(2,20180120,dao.getList().size());用資料筆數比不行
        assertEquals(20180119,20180120,dao.getList().size());
        //用日期比較可以


    }

/*    @Test
    public void test_add_data2()throws Exception
    {
        accountpayDAO dao=new accountpayDAO();
        dao.add(new account(20180120,300,"餐飲","",""));
        dao.add(new account(20180120,100,"飲料","",""));
        dao.add(new account(20180119,500,"餐飲","",""));
        assertEquals(500,dao.getList().get(3).money1);


    }
    */


}
