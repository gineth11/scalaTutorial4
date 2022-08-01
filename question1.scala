object answer1{
  def main(args: Array[String]): Unit = {
    def interest(x:Double):Double= x match{
      case x if x<=20000 => x*0.02;
      case x if x<=200000 => x*0.04;
      case x if x<=2000000 => x*0.035;
      case x if x>2000000  => x*0.65;
    }
    println("Enter the Amount : ");
    var amount=scala.io.StdIn.readDouble();
    print("Interest : "+interest(amount));
  }
}