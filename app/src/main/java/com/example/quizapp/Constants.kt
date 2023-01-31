package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {

        val questionList = ArrayList<Question>()

        val que1 = Question(
            1, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Austrália", "Armênia ", "Áustria",
            1
        )

        questionList.add(que1)

        // 2
        val que2 = Question(
            2, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Áustria",
            "Austrália", "Armênia", 3
        )

        questionList.add(que2)

        // 3
        val que3 = Question(
            3, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brasil", 4
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Bélgica",
            "Barbados", "Belize", 2
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_fiji,
            "Gabão", "França",
            "Fiji", "Finlandia", 3
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_germany,
            "Alemanha", "Georgia",
            "Grécia", "nenhuma dessas", 1
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egito",
            "Dinamarca", "Ethiopia", 3
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_india,
            "Irlanda", "Iran",
            "Hungria", "India", 4
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_new_zealand,
            "Austrália", "Nova Zelândia",
            "Tuvalu", "Estados Unidos", 2
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "Qual país essa bandeira pertence?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordânia",
            "Sudão", "Palestina", 1
        )

        questionList.add(que10)

        return questionList

    }

}