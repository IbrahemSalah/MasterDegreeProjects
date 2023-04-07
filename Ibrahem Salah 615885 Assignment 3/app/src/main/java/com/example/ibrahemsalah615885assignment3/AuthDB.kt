package com.example.ibrahemsalah615885assignment3

object AuthDB {
    const val MIU_USER_EXTRA = "miu_user"
    private val miuUserList: ArrayList<MIUUser> = ArrayList<MIUUser>()

    fun addDummyListOfUser() {
        miuUserList.add(MIUUser("Ahmed", "Elgendy", "Ahmed@miu", "123"))
        miuUserList.add(MIUUser("Ibrahem", "Salah", "Salah@miu", "123"))
        miuUserList.add(MIUUser("Mo", "Salah", "Mo@miu", "123"))
        miuUserList.add(MIUUser("Usama", "Alawneh", "Usama@miu", "123"))
        miuUserList.add(MIUUser("ALi", "Express", "Ali@miu", "123"))
    }

    fun signUpNewUser(user: MIUUser) {
        miuUserList.add(user)
    }

    fun signInUser(user: MIUUser): Boolean {
        return miuUserList.contains(user)
    }

    fun userNameExists(username: String): Boolean {
        val exists = miuUserList.count { it.userName.lowercase() == username.lowercase() }
        return exists > 0
    }

    fun getPasswordForEmail(username: String): String {
        val account = miuUserList.filter { it.userName.lowercase() == username.lowercase() }
        return account[0].password
    }
}