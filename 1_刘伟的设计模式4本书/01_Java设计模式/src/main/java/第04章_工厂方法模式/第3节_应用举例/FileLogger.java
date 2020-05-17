/***********************************************************
 * @Description : 文件日志记录器
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 14:41
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第3节_应用举例;

public class FileLogger implements Logger {

    public FileLogger() {
        System.out.println("创建文件日志记录器");
    }

    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
