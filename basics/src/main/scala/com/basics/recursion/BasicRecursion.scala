package com.basics.recursion

class BasicRecursion {

  def factorial(n: Int): Int = {
    if (n == 1) return 1
    n * factorial(n - 1)
  }

  def fibN(n: Int): Int = {
    if (n == 0 || n == 1) return n
    fibN(n - 2) + fibN(n - 1)
  }

  def naturalNo(n: Int): Unit = {
    if (n == 0) return
    println(n)
    naturalNo(n - 1)
    if (n == 1) return
    println(n)
  }
}

object RunBasicRecursion {
  def main(args: Array[String]): Unit = {
    val obj = new BasicRecursion()
    val n = 5

    println(s"fact of $n is " + obj.factorial(n))
    println(s"$n Fibonacci no. is " + obj.fibN(n))
    println(s"first n natural no. are : " + obj.naturalNo(n))
  }
}
