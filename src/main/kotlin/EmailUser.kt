data class EmailUser(override val id: String, val password: String, val email: String):User(id){}
