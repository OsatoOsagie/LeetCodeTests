data class Employee(
    val name:String,
    val age: Int
){
    fun findOldestEmployee(employee: List<Employee>): Employee? {
        return employee.maxByOrNull { it.age }

    }
}

class EmployeeManager{


}



