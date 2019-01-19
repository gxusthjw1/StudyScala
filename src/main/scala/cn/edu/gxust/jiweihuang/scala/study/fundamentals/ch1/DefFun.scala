package cn.edu.gxust.jiweihuang.scala.study.fundamentals.ch1

object DefFun {
  def looper(x: Long, y: Long): Long = {
    var a = x
    var b = y
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }
}



