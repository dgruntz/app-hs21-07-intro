package ch.mse.app

// import scala.reflect.Selectable.reflectiveSelectable
import java.io.Closeable

object Control {

  def using[A, B <: Closeable](closeable: B)(f: B => A): A =
    try { f(closeable) } finally { closeable.close() }

}

/*
import ch.mse.app.Control._

using(new java.io.PrintWriter("sample.txt")) { out => 
  out.println("hello world!") 
}

val x = new java.io.Closeable() { def close() = println("close") }
using (x) { x => println(x) }
using (x) ( x => println(x) )
using {x} { x => println(x) }

*/
