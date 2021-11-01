
object Demo {
   case class Person (val name: String, var age: Int)

   def main(args: Array[String]): Unit = {
      val people = List(new Person("Romeo", 22),
                        new Person("Julia", 21))

      val adults = people.filter(p => p.age >= 18)
      println(adults)
   }
}

object ScalaLibrary {

  case class Book(author: String, title: String)

  val books = List(Book("A", "A2"), Book("A","A1"), Book("B","B1"))

  def booksByAuthor(author: String): List[Book] = 
    books.filter(b => b.author == author)

  def main(args: Array[String]): Unit = 
    println(booksByAuthor("A").sortBy(b => b.title))
}


