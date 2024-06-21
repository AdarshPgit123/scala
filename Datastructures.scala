object Datastructures{

  def main(args:Array[String]):Unit={
    //List Immutable,Homogeneous collection of Data

    val fruits:List[String]=List("apple","orange","pineapple","watermelon","guava","grapes")
    println("First Element:" + fruits.head )
    println("Values excluding the first element :"+fruits.tail)
    var firstElem=fruits.head
    println(firstElem)
    var tailElems=fruits.tail
    println(tailElems)
    println("Last Element: "+fruits.last)


    var List1=List("Hadoop","spark","Flume","PySpark",10324,4.34)

    println(List1.getClass)


    //Empty list declaration

    val EmptyList:List[Nothing]=List()

    //Array Data Type : Array is mutable , fixed size collection of data structures
    //Array is homogeneous collection


    val arrayDataType=Array("Hadoop","spark","Flume","PySpark")
    println("ArrayDataType: "+arrayDataType)


    //Printe elemet by element output in new line
    arrayDataType.foreach(println)

    //print all values

    println(arrayDataType.mkString(", "))

    arrayDataType(0)="banana"
    println(arrayDataType.mkString(","))

    //array data type is mutable so if we use var or val we can mutate it.

    //declare an empty array

    val arr_1=new Array[String](10)
    val ar_2= Array.ofDim[Int](2,2)
    ar_2(0)(0)=5
    ar_2(0)(1)=5
    ar_2(1)(0)=5
    ar_2(1)(1)=5
    //print the array
    val flattenArr: Array[Int]=ar_2.flatten
    println(flattenArr.mkString(","))


    //list declaration


    var list2=10::30::23::132::123::Nil
    println("LIST2 :"+ list2)


    //create a list buffer

    import scala.collection.mutable.ListBuffer
    var cities =new ListBuffer[String]()

    cities+="Thiruvananthapuram"
    cities+="kolkata"
    cities+="Thrissur"
    cities -= "kolkata"
    println(cities)

    cities.toList  //type casting in scala is done by toDataType
    println(cities)


    //set collection :immutable collection

    //Hashset - mutable collection of sets

    val set_1: Set[Int]=Set()
    val set_2 =Set("apple","orange","watermelon")


    import scala.collection.mutable.Set
    val mutableSet=Set("apple","oranges","watermelon","grapes")
    mutableSet-="apple"



    //tuple declaration


    //in scala tuple is fixed size
    //can hold multiple data types together

    val Tuple_1 =(10,20,30,40,50,60,70,80)

    //Tuple_1._1="String" this produces an error


    println(Tuple_1._2) //accessing individual value (2 nd element)





    //maps in scala.



    //import scala.collection.immutable.Map


    var mapVariable : Map[String,Int]=Map() //empty varible decalaration

    var MapVar1=Map("01"->"ad","02"->"mi")
    println(MapVar1.contains("01"))
    println(MapVar1.get("01"))
    println(MapVar1.values)
    println(MapVar1.keys )

    //declare mutable map data types

    import scala.collection.mutable.Map
    val mutable_var=Map("apple"->"red","banana"->"yelllow") //here val doesn't help in immutability

    mutable_var+=("grape"->"violet")

    //iterators in scala programming
    //an iterator in scala represent a sequence of elements
    //that allows you to traverse through the collection sequentially.

    val myList=List(20,30,40,50,60,70,80,90)
    val iter=myList.iterator

    //method of iterator to check if there is more elements (.hasNext())
    //.next() - to retrieve next value
    //.remove()- to remove elements from mutable iterators
    println(iter.next())
    println(iter.next())



    //LAZY INITIALIZATION  using scala

    lazy val donuts : Int =100
    println(donuts * 5)

    //lazy var donuts_1 : Int =20 //can't use with var
    
    //some description nbeede  tobe completed







  }
}