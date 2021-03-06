# 第19章 策略模式(strategy)

## 定义
+ 定义了算法家族，分别封装起来，让它们之间可以互相替换，此模式让算法的变化不会影响到使用算法的用户
+ 和if..else的逻辑类似，可以用来减少if..else..
+ 类型：行为型

## 适用场景
+ 系统有很多类，而它们的区别仅仅在于他们的行为不同
+ 一个系统需要动态地在几种算法中选择一种

## 优点
+ 符合开闭原则
+ 避免使用多重条件转移语句
+ 提高算法的保密性和安全性

## 缺点
+ 客户端必须知道所有的策略类，并自行决定使用哪一个策略类
+ 产生很多策略类

## 相关设计模式
+ 策略模式和工厂模式：工厂模式创建好对象提供给策略模式
+ 策略模式状态模式：策略模式需要关心状态，状态模式不需要关心具体的状态(因为状态会自动转换)

## 应用
+ JDK：
  + `java.utl.Comparator`及其实现类
  + `java.utl.Arrays`及其实现类
  + `java.utl.TreeMap`及其实现类
+ Spring:
  + `org.springframework.core.io.Resource`及其实现类
  + `org.springframework.beans.factory.support.InstantiationStratety`及其实现类

