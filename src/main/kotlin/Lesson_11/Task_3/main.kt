package org.example.Lesson_11.Task_3

class Participant(
    val nickname: String,
    val avatarUrl: String,
    var status: String
)

class Room(
    val coverImage: String,
    val title: String
) {

    val participants = mutableListOf<Participant>()

    fun addParticipant(participant: Participant) {
        participants.add(participant)
        println("${participant.nickname} добавлен в комнату \"$title\"")
    }

    fun updateStatus(nickname: String, newStatus: String) {
        for (participant in participants) {
            if (participant.nickname == nickname) {
                participant.status = newStatus
                println("Статус участника \"$nickname\" обновлён на \"$newStatus\".")
                return
            }
        }
        println("Участник с никнеймом \"$nickname\" не найден.")
    }

    fun showParticipants() {
        println("Комната: $title")
        for (i in participants) {
            println("- ${i.nickname} [${i.status}]")
        }
    }
}

fun main() {
    val room = Room(".", "Искусство")

    val p1 = Participant("Андо", ".", "разговаривает")
    val p2 = Participant("Гево", ".", "микрофон выключен")
    val p3 = Participant("Арту", ".", "пользователь заглушен")

    room.addParticipant(p1)
    room.addParticipant(p2)
    room.addParticipant(p3)

    room.showParticipants()

    println("\nОбновим статус Гево:")
    room.updateStatus("Гево", "разговаривает")

    println("\nПосле обновления:")
    room.showParticipants()
}