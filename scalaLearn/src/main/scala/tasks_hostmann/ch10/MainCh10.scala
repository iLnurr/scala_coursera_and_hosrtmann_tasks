package tasks_hostmann.ch10

/**
  * Created by ilnur on 21.11.16.
  *
  */
object MainCh10 extends App{
  /**
    * ch10_tsk1
    */
  val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30) with RectangleLike
  egg.translate(10,-10)
  egg.grow(10,20)

  /**
    * ch10_tsk4
    */
  val msg = "While looking for code on how to create a random string in Scala, I came across this article, which shows" +
    " one approach for creating a random string. For my brain today, it also shows a nice way to create a list of alpha " +
    "or alphanumeric characters."
  println(CryptoLogger(msg).crypto())
  println(CryptoLogger(msg).decrypto())
}
