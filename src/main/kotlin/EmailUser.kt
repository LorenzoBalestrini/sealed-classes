data class EmailUser(override val id: String, val password: String? = null, val email: String? = null):User(id){}
