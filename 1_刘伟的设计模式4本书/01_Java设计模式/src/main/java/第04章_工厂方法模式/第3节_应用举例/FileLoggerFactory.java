/***********************************************************
 * @Description : 数据库日志工厂
 * @author      : 梁山广(Liang Shan Guang)
 * @date        : 2020/5/17 14:44
 * @email       : liangshanguang2@gmail.com
 ***********************************************************/
package 第04章_工厂方法模式.第3节_应用举例;

public class FileLoggerFactory implements LoggerFactory{

    @Override
    public Logger createLogger() {
        // 创建文件日志记录器
        Logger logger = new FileLogger();
        // 创建文件，代码省略
        return logger;
    }
}
