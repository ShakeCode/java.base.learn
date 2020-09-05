package com.java.learn.jvm;

/**
 * 类的加载是由类加载器完成的，类加载器包括：
 * 1、根加载器（ BootStrap ）、
 * 2、扩展加载器（ Extension ）、
 * 3、系统加载器（ System ）
 * 4、用户自定义类加载器（ java.lang.ClassLoader 的子类）。
 *
 * 从 Java 2 （ JDK 1.2 ）开始，类加载过程采取了父亲委托机制（ PDM ）。 PDM 更好的保证了 Java 平台的安全性，在该机制中， JVM 自带的 Bootstrap 是根加载器，其他的加载器都有且仅有一个父类加载器。类的加载首先请求父类加载器加载，父类加载器无能为力时才由其子类加载器自行加载。 JVM 不会向 Java 程序提供对 Bootstrap 的引用。下面是关于几个类加载器的说明：
 *
 * Bootstrap ：一般用本地代码实现，负责加载 JVM 基础核心类库（ rt.jar ）；
 * Extension ：从 java.ext.dirs 系统属性所指定的目录中加载类库，它的父加载器是 Bootstrap ；
 * system class loader ：又叫应用类加载器，其父类是 Extension 。它是应用最广泛的类加载器。它从环境变量 classpath 或者系统属性 java.class.path 所指定的目录中记载类，是用户自定义加载器的默认父加载器。
 * 用户自定义类加载器： java.lang.ClassLoader 的子类
 *
 * 父类委托机制是可以修改的，有些服务器就是自定义类加载器优先的。
 */
public class ClassLoader {
}
