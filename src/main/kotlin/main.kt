fun main(){
    print("Введи количество лайков: ")
    val likes = readLine()?.toUInt()

    if (likes != null) {
        if(likes > 0u) {
            if((likes % 100u) == 11u){
                println("Пост понравился $likes людям.")
            } else if ((likes % 10u) == 1u){
                println("Пост понравился $likes человеку.")
            } else {
                println("Пост понравился $likes людям.")
            }
        }
    }
}