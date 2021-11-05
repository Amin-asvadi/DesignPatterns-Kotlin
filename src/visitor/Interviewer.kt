package visitor

interface Interviewer {
    fun visit(student: Student)
    fun visit(engineer: Engineer)
}
