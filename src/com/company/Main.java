package com.company;

public class Main {
    private String str1;
    private String str2;
    private String str3;
    private String str4;
    private String str5;


    public static void main(String[] args) {
        // write your code here
        Main01.sumint(2, 2);
        Main01.sumint(3, 3);
        Main01.summm(1, 2);
        Main01.summm(1, 2);

        int n = 4;
        int result = sum(n);
        System.out.println(result);
        Main01 s = new Main01();
        int xx = s.ifxc;

        Main01 ss;
        ss = new Main01();
        String VV = ss.ff;
        System.out.println();
        Main asf = new Main();
        asf.setStr1("fff");
        System.out.println(asf.getStr1());
        System.out.println("11");
        System.out.println("11223");
        System.out.println("1125图5日式风格的发23");
        System.out.println("1125图5日式风格555的发23");
    }

    /**
     * fasffhg
     *
     * @param
     * @return
     */
    // 递归方式计算n的求和
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String getStr4() {
        return str4;
    }

    public void setStr4(String str4) {
        this.str4 = str4;
    }

    public String getStr5() {
        return str5;
    }

    public void setStr5(String str5) {
        this.str5 = str5;
    }
}
