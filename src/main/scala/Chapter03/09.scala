import java.util.TimeZone

var zones = TimeZone.getAvailableIDs.filter(_.startsWith("America/")).map(_.drop("America/".size)).sortWith(_<_)
print(zones.mkString(","))
