object demo_pro {
  def main(args: Array[String]): Unit = {
  //  var a = readLine()
    var c =new demo("demo","12")
//print(a)

    print(c)
  }
}
 class demo(n:String,i:String){
  var name=n
  var id=i

  override def toString: String = return "name "+name+" id "+id;


}