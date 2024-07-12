class StudentScore {
    fun getScore() {
        var scores = mutableListOf<Pair<String, Int>>()
        var student = mutableMapOf<String,MutableList<Int>>()
        var name: String? = null
        var score:Int? = null

        println("Enter the Length of Students : ")
        var n = readln().toInt()

        for (i in 1..n) {
            println("Enter the Name of Student $i : ")
            name = readln()
            println("Enter the Score of $name : ")
            score = readln().toInt()
            scores.add(Pair(name, score))
        }
        for (j in 0..<n) {
            if (student.contains(scores[j].first)){
                student[scores[j].first]!!.add(scores[j].second)
            }else{
                student[scores[j].first] = mutableListOf(scores[j].second)
            }
        }
        println(student)
    }
}
fun main(){
    var s1 = StudentScore()
    s1.getScore()

}