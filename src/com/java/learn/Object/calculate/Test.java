package com.java.learn.Object.calculate;

public class Test {

    public static void main(String[] args) {
        System.out.println(13&17);

       /* &运算符：两个数都转为二进制，然后从两个数的最高位进行与运算，两个都为真（1），结果才为真（1），否则为假（0）
        13：01101
        17：10001
        结果：00001，既为1*/

        // 11101
        // |运算符：两个数都转为二进制，然后从两个数的最高位进行与运算，一个为真（1），结果为真（1）
        System.out.println(13|17);

        System.out.println(Integer.toBinaryString(29));

        // 异或运算
        System.out.println(14^3);

        /**
         * ^表示异或 就是相同是0 不同是1
         * 14是1110   1*2的三次方+1*2的2次方+1*2的1次方+0*2的0次方 = 8+4+2+0
         *  3是0011
         * 所以14^3=1101，即13
         */

        // 与运算  两个操作数二进制中位都为1，结果才为1，否则结果为0
        int a=129;
        int b=128;
        System.out.println("a 和b 与的结果是："+(a&b));

        /**
         * a 和b 与的结果是：128
         * 下面分析这个程序：
         * “a”的值是129，转换成二进制就是10000001，而“b”的值是128，转换成二进制就是10000000。根据与运算符的运算规律，只有两个位都是1，结果才是1，可以知道结果就是10000000，即128。
         */

        // 或运算 二进制中两个位只要有一个为1，那么结果就是1，否则就为0
        System.out.println("a 和b 或的结果是："+(a|b));
        /**
         * a 和b 或的结果是：129
         * 下面分析这个程序段：
         * a 的值是129，转换成二进制就是10000001，而b 的值是128，转换成二进制就是10000000，根据或运算符的运算规律，只有两个位有一个是1，结果才是1，可以知道结果就是10000001，即129。
         */

        /**
         * 非运算符
         * 非运算符用符号“~”表示，其运算规律如下：
         *
         * 如果位为0，结果是1，如果位为1，结果是0
         */
        int sss=2;
        System.out.println("a 非的结果是："+(~sss));

        /**
         * 移位运算符操作的对象就是二进制的位，可以单独用移位运算符来处理int型整数。
         *
         * 运算符	含义	例子
         * <<	左移运算符，将运算符左边的对象向左移动运算符右边指定的位数（在低位补0）	x<<3
         * >>	"有符号"右移运算 符，将运算符左边的对象向右移动运算符右边指定的位数。使用符号扩展机制，也就是说，如果值为正，则在高位补0，如果值为负，则在高位补1.	x>>3
         * >>>	"无符号"右移运算 符，将运算符左边的对象向右移动运算符右边指定的位数。采用0扩展机制，也就是说，无论值的正负，都在高位0.例如	x>>>3
         *
         *
         *
         * 注：x<<y 相当于 x*2y（2的y次方） ；x>>y相当于x/2y （2的y次方）
         *     从计算速度上讲，移位运算要比算术运算快。
         *     如果x是负数，那么x>>>3没有什么算术意义，只有逻辑意义
         */

        // 输出二进制数据
        System.out.println(Integer.toBinaryString(6297));
        System.out.println(Integer.toBinaryString(-6297));
        System.out.println(Integer.toBinaryString(6297>>5));
        System.out.println(Integer.toBinaryString(-6297>>5));
        System.out.println(Integer.toBinaryString(6297>>>5));
        System.out.println(Integer.toBinaryString(-6297>>>5));
        System.out.println(Integer.toBinaryString(6297<<5));
        System.out.println(Integer.toBinaryString(-6297<<5));
    }
}
