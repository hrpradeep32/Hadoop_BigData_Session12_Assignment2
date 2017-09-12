object type_name 
{
  def main(args: Array[String])
  {
    val names = List[String]("alpha","gamma","omega","zeta","beta")
    //to find the strings with length 4     
    val result1 = names.find{x=>x.length() == 4}
    println(result1.getOrElse("No string with length equal to 4"))
    println("\t")
    
    //to display each string's length   
    names.foreach(result2=> println(result2.length));
    println("\t")
    
    //to find the string which contains alphabet 'm'
    val result3 = names.find{x=> x.contains('m')}
    println (result3)
    
    //to find the string which starts with alphabet 'a'
    val result4 = names.find{x=> x.charAt(0) == 'a'}
    println(result4.getOrElse("No a"));
    println("\t")
    
  }
}
