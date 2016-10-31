import scala.collections.JavaConversions.propertiesAsScalaMap

//construct scala map
var m = propertiesAsScalaMap(System.getProperties())
val padding = 10
var maxLength = m.keySet.map(_.length).max + padding
m.foreach({case (k, v) => println(k + " " * (maxLength - k.length) + "| " + v)})
