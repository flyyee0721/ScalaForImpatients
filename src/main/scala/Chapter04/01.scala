//Set up a map of prices of a number of gizmos you covet. Then produce a second map with the same keys and prices at 10% discount.
import scala.collection.immutable.Map
var m = Map[String, Double]("gizmosA"->20, "gizmosB"->30.2, "gizmosC"->101, "gizmosD"->59.3, "gizmosE"->17.9)
//var m:Map[String, Double] = Map("gizmosA"->20, "gizmosB"->30.2, "gizmosC"->101, "gizmosD"->59.3, "gizmosE"->17.9)
//If not specified the map key and value types, it will be Map[String, AnyVal]
//var m = Map("gizmosA"->20, "gizmosB"->30.2, "gizmosC"->101, "gizmosD"->59.3, "gizmosE"->17.9)
print(m)
var n = for ((k, v) <- m) yield (k, 0.9 * v)
print(n)

var p = Map[String, Double]()
//foreach only works on function with side effects
m.foreach({case (k, v) => p += (k -> 0.9 * v)})
print(p)



