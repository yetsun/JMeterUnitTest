package test;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by junye on 3/7/16.
 */
public class Foo extends TestCase {


    private static  Bar staticBar;

    static{
        staticBar = new Bar();
        System.out.println("***********current thread:" + Thread.currentThread() + ". static is called. staticBar:" + staticBar);
    }


    private Bar memberBar;
    private Bar memberBar2;

    public Foo() {
        memberBar = new Bar();
        System.out.println(
            "***********current thread:" + Thread.currentThread() + ". Constructor is called. memberBar:" + memberBar + ". staticBar:" + staticBar);

    }


    @Before
    public void setUp(){
        memberBar2 = new Bar();
        System.out.println(
            "***********current thread:" + Thread.currentThread() + ". setup is called. memberBar:" + memberBar + ". memberBar2:" + memberBar2
                + ". staticBar:" + staticBar);
    }



    @Test
    public void testFoo(){
        System.out.println(
            "***********current thread:" + Thread.currentThread() + ". Test is called. memberBar:" + memberBar + ". memberBar2:" + memberBar2
                + ". staticBar:" + staticBar);
    }



    static class Bar{

    }
}
