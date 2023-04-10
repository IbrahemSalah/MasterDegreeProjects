package com.example.ibrahemsalah615885assignment3

object AuthDB {
    const val MIU_USER_EXTRA = "miu_user"
    const val PRODUCT_EXTRA = "product"
    private val miuUserList: ArrayList<MIUUser> = ArrayList<MIUUser>()

    private val organicDrinkList: ArrayList<Product> = ArrayList<Product>()

    fun addDummyListOfUser() {
        miuUserList.add(MIUUser("Ahmed", "Elgendy", "a", "a"))
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

    fun addDummyProductList() {
        organicDrinkList.add(
            Product(
                "Organic Tea",
                12.50,
                "1",
                "https://www.baileydesignsbooks.com/wp-content/uploads/2020/05/gardenwall.jpg",
                "Dummy Description for Organic Tea"
            )
        )
        organicDrinkList.add(
            Product(
                "Organic Orange Juice",
                16.50,
                "2",
                "https://creativereview.imgix.net/content/uploads/2022/12/hinton_outsiders_cover_instagram.jpg?auto=compress,format&q=60&w=1071&h=1571",
                "Dummy Description for Organic Orange Juice"
            )
        )
        organicDrinkList.add(
            Product(
                "Organic Nescafe",
                10.00,
                "3",
                "https://marketplace.canva.com/EAD7YHrjZYY/1/0/1003w/canva-blue-illustrated-stars-children%27s-book-cover-haFtaSNXXF4.jpg",
                "Dummy Description for Organic Nescafe"
            )
        )
        organicDrinkList.add(
            Product(
                "Organic Water",
                6.50,
                "4",
                "https://edit.org/images/cat/book-covers-big-2019101610.jpg",
                "Dummy Description for Organic Water"
            )
        )
        organicDrinkList.add(
            Product(
                "Organic Apple Juice",
                23.50,
                "5",
                "https://images.penguinrandomhouse.com/cover/9780593230985",
                "Dummy Description for Organic Apple Juice"
            )
        )
        organicDrinkList.add(
            Product(
                "Organic Coffee",
                50.50,
                "6",
                "https://www.readriordan.com/wp-content/uploads/2022/02/Lightning-Thief-flat-cover.png",
                "Dummy Description for Organic Coffee"
            )
        )
    }

    fun getProductList(): ArrayList<Product> {
        return organicDrinkList
    }
}