import scala.io.Source

object HelloWorld {
   def main(args: Array[String]) {
      for(line <- Source.fromFile("myfile.txt").getLines())
        println(line)
   }
}

