package org.benf.cfr.tests

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 18/07/2014
 * Time: 08:43
 */
object ScalaTest2 {
  def foo(i: Integer) : Any = {
    var res = Array.ofDim[Any](i,i)
    for (x <- 0 until i; y <- 0 until i) {
      res(x)(y) = x+y
    }
    res
  }
}
