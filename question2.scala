object answer2{
  def main(args: Array[String]): Unit = {
    printf("Enter an Integer : ");
    var x=scala.io.StdIn.readInt();
    def patternMatch(x:Int):Unit= x match {
      case x if x>=0 => println("The number is Negative / Zero");
      case x if x%2==0 => println("Number is Even");
      case x if x%2!=0 => println("Number is Odd");
 }
    patternMatch(x);
}
}
