// What happens when you zip together two strings, such as "Hello".zip("World")? Come up with a plausible use case.

//Zip up two strings, each string will be converted to a chararray, and chars at the same position will be
//zipped together into a tuple.
//Only chars that have matching ones will be zipped.
"Hello".zip("Worl")
//returns res63: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((H,W), (e,o), (l,r), (l,l))
"Hello".zip("World")

//A plausible use case is to calculate the number of characters that are the same on every position
"Hello".zip("World").count({case (a, b) => a == b})

//case converter
val m = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".zip("abcdefghijklmnopqrstuvwxyz").toMap
m('B') = b
