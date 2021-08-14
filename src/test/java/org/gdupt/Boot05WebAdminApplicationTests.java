package org.gdupt;

import org.junit.jupiter.api.*;//全部导入junit.api中的jar包
import org.springframework.boot.test.context.SpringBootTest;

@DisplayName("Boot05WebAdminApplicationTests测试类")
@SpringBootTest
class Boot05WebAdminApplicationTests {


    /**
     * @Test :表示方法是测试方法。但是与JUnit4的@Test不同，他的职责非常单一不能声明任何属性，拓展的测试将会由Jupiter提供额外测试
     * @ParameterizedTest :表示方法是参数化测试，下方会有详细介绍
     * @RepeatedTest :表示方法可重复执行，下方会有详细介绍
     * @DisplayName :为测试类或者测试方法设置展示名称
     * @BeforeEach :表示在每个单元测试之前执行
     * @AfterEach :表示在每个单元测试之后执行
     * @BeforeAll :表示在所有单元测试之前执行
     * @AfterAll :表示在所有单元测试之后执行
     * @Tag :表示单元测试类别，类似于JUnit4中的@Categories
     * @Disabled :表示测试类或测试方法不执行，类似于JUnit4中的@Ignore
     * @Timeout :表示测试方法运行如果超过了指定时间将会返回错误
     * @ExtendWith :为测试类或测试方法提供扩展类引用
     * @RepeatedTest(10) : 为重复测试该方法10次
     * @
     */

    //import org.junit.jupiter.api.DisplayName;
    @DisplayName("contextLoads测试方法")
    //junit5测试引入import org.junit.jupiter.api.Test;
    @Test
    void contextLoads() {
        System.out.println("测试的方法整体");
    }

    @Test
    void contextLoads2() {
        System.out.println("测试的方法整体2");
    }

    @RepeatedTest(10)
    @Test
    void contextLoads4() {
        System.out.println("测试的方法整体4");
        System.out.println("热修分支");
        System.out.println();
    }

    @Disabled
    @Test
    void contextLoads3() {
        System.out.println("测试的方法整体3");
    }

    @BeforeEach
    void testBeforeEach() {

        System.out.println("测试方法之前");
    }

    @AfterEach
    void testAfterEach() {
        System.out.println("测试方法执行完成之后");
    }


    //标注了 @BeforeAll 和 @AfterAll 所有测试方法的之前或者之后的测试只会执行一遍
    @BeforeAll
    static void allTestAfterEach() {
        System.out.println("所有测试方法之前");

    }

    @AfterAll
    static void allTestBeforeEach() {
        System.out.println("所有测试方法执行完成之后");

    }


}
