//Import java.awt.datatransfer._ and make an object of type SystemFlavorMap with the call
//var flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
//Then call getNativesForFlavor method with parameter DataFlavor.imageFlavor, and get
//the return value as a scala buffer

import java.awt.datatransfer._
import scala.collection.JavaConversions._
//cast the default flavor map to SystemFlavorMap
var flavors = SystemFlavorMap.getDefaultFlavorMap().asInstanceOf[SystemFlavorMap]
var buffer: scala.collection.mutable.Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)
