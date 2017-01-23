def gcdLoop(x: Long, y: Long): Long = {
  var a = x
  var b = y
  while (a != 0) {
    val temp = a
    a = b % a
    b = temp
  }
  b
}


val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val TwoThreeFour = 2 :: threeFour
val oneTwoThreefour = 1 :: TwoThreeFour
val oneTwoThree = 1 :: 2 :: 3 :: Nil
val thrill = "Will" :: "fill" ::
  "until" :: Nil
thrill.count(s => s.length == 4)
thrill.dropRight(2)
thrill.exists(s=>s=="until")
thrill.filter(s=>s.length == 4)
thrill.forall(s=>s.endsWith("k"))
thrill.foreach(s=>println(s))
thrill.map(s=>s+"y")
val a1 =  thrill.mkString(",")


val pair = (99, "Luftballons", 's', 0 ,32, "Vijay")

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lunar"
println(jetSet.contains("Cessna"))


def g() { "this String gets lost too" }
g
def f() = { "this String gets lost too" }
f
