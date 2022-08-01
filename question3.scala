object answer3{
  def main(args: Array[String]): Unit = {
    def toUpper(x: String): String = {
      x.toUpperCase()
    }
    def toLower(x: String): String = {
      x.toLowerCase()
    }
    def formatNames(name: String, index: Array[Int], func: (String) => String): String = {
      if(index.isEmpty){
        func(name)
      }else{
       var str = ""
       for( i <- 0 to name.length()-1){
        if(index.contains(i)) str=str+func(name.charAt(i).toString())
        else str=str+name.charAt(i).toString()
       }
       str
      }
    }

    println(formatNames("Benny",Array(),toUpper(_)))
    println(formatNames("Niroshan",Array(0,1),toUpper(_)))
    println(formatNames("Saman",Array(),toLower(_)))
    println(formatNames("Kumara",Array(5),toUpper(_)))
  }
}