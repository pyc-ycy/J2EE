package base.IOCollection;

public class OutputDemoSet {
    public static void main(String[] args) {
        printlnDemo();
    }

    /*
    println 方法在 PrintStream 类中，类路径为 【JRT, java.base】java.io.PrintStream
    一共重载了 10 个方法，涵盖 Java 基本数据类型
     */
    public static void printlnDemo() {
//        第一个方法为输出换行
        System.out.println();
//        第二个方法为输出boolean 类型的值
        System.out.println(true);
//        第三个方法输出 char 型值
        System.out.println('A');
//        第四个为 int 型参数
        System.out.println(13);
//
        System.out.println("Hell World");
    }

}
