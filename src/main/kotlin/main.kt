fun main(){
    print("����� ���������� ������: ")
    val likes = readLine()?.toUInt()

    if (likes != null) {
        if(likes > 0u) {
            if((likes % 100u) == 11u){
                println("���� ���������� $likes �����.")
            } else if ((likes % 10u) == 1u){
                println("���� ���������� $likes ��������.")
            } else {
                println("���� ���������� $likes �����.")
            }
        }
    }
}