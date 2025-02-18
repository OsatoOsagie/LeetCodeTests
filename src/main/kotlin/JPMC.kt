data class Employee(
    val name:String,
    val age: Int
)

class EmployeeManager{
    fun findOldestEmployee(employee: List<Employee>): Employee? {
        return employee.maxByOrNull { it.age }

    }

}



