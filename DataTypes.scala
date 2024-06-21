object DataTypes {
  def main(args: Array[String]): Unit = {
    // Integer Data Type
    val intNum: Int = 20
    val longNum: Long = 1234567890L
    val shortNum: Short = 32765
    val byteNum: Byte = 127

    //Floating Datatypes
    val FloatingNum: Float = 3.14f
    val doubleNum: Double = 3.1215977265858711

    //String DataType
    val stringVar: String = "Hello Scala"

    //Character DataType
    val CharVal: Char = 'A'

    //Unit DataType
    val unitValue: Unit = ()

    //Printing values
    println(s"Integer :$intNum")
    println(s"string : $stringVar")

    //mutable datatypes

    //boolean - true ,false
    println(s"Charecter:$CharVal")
    var boolVar: Boolean = true
    println("Boolean" + boolVar)
    var intVar: Int = 1234
    println("Integer Variable:" + intVar)

    //update item assignment in mutable variable

    intVar = intVar + 1000
    println("Updated Value:" + intVar)


  }
}
