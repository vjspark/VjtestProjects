
type Set = Int => Boolean


def contains(s: Set, elem: Int): Boolean = s(elem)

def singletonSet(elem: Int): Set = (x => x == elem)


def union(s: Set, t: Set): Set = i =>  s(i) || t(i)

def intersect(s: Set, t: Set): Set = i => s(i) && t(i)

def diff(s: Set, t: Set): Set = i => s(i) && !t(i)

def filter(s: Set, p: Int => Boolean): Set = intersect(s,p)
val a = Set(1,2,3,4)
val b = Set(4,5,6)
val k = union(a,b)
println(toString(k))




