import scala.io.Source

object HelloWorld {
   def main(args: Array[String]) {
        val dbName = "ams_test"
        for(line <- Source.fromFile("myfile.txt").getLines()){
            if (line.contains("ams")){
                val line2 = line.replace("ams", dbName)
                println(line2)
            }
        }
   }
}

