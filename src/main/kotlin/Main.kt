fun main(){
    val facebookUser = FacebookUser("Lorenzo","abcd")
    val emailUser = EmailUser("Luca","1234","5678@libero.it")
    val googleUser = GoogleUser("Silvia","zxcv",)

    fun printUser(user: User) = when(user){
        is FacebookUser -> println("Facebook user: $user")
        is GoogleUser -> println("Google user: $user")
        is EmailUser -> println("Email user: $user")
    }

    printUser(facebookUser)
    printUser(googleUser)
    printUser(emailUser)






}