package cn.edu.gxust.jiweihuang.scala.study.fundamentals.ch1

object HelloScala {
  /**
    * <p>1.main方法的快速输入：先输入 main，然后按 Tab 键。</p>
    * <p>2.反编译.class文件的命令：</p>
    * <p>（1）在IDEA环境下，定位到out目录下的编译输出.class文件</p>
    * <p>（2）右键 Open in Termimal</p>
    * <p>（3）在命令提示符下输入：dir 查看实际输出的.class文件名。</p>
    * <p>（4）使用javap命令进行发编译：javap -private HelloScala.class</p>
    * <p>3.输入命令行参数的方式</p>
    * <p>（1）在IDEA工具栏上，运行图标的左边的下拉列表中，选择 Edit Configurations</p>
    * <p>（2）在弹出的对话框的 Programs arguments 项中输入即可。</p>
    * <p>4.运行Run Scala Console
    * （1）选择 run -> Run Scala Console
    *  (2) 光标定位到Scala Console，输入语句，然后按 CTRl + Enter
    * @param args 命令行参数
    */
  def main(args: Array[String]): Unit = {
    println("Hello Scala!!! A new World!!!")
    //使用for循环
    for (arg <- args) println(s"arg = $arg")
    //调用foreach方法
    args.foreach(arg => println(s"arg = $arg"))
  }
}
