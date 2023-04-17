package com.android.assignment6.ui.work

object WorkDataSource {
    val comp1 = CompanyDataClass(
    "Facebook",
    "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b8/2021_Facebook_icon.svg/2048px-2021_Facebook_icon.svg.png"
    )
    val comp2 = CompanyDataClass(
    "Microsoft Corporation",
    "https://pngimg.com/d/microsoft_PNG14.png"
    )
    val comp3 = CompanyDataClass(
    "Apple",
    "https://alchemyimmersive.com/wp-content/uploads/sites/4/2020/04/apple-logo-transparent.png"
    )
    val comp4 = CompanyDataClass(
    "Tesla",
    "https://cdn.worldvectorlogo.com/logos/tesla-motors.svg"
    )

    var workList = arrayListOf<WorkDataClass>(
        WorkDataClass("Software Engineer",
        comp1,
        "2019 - Present",
        "New York",
        "Responsibilities may include software design, coding, testing, debugging, and maintenance."),
        WorkDataClass("Product Manager",
        comp2,
        "2016 - 2019",
        "San Francisco",
        "A product manager is responsible for the strategy, roadmap, and feature definition of a product or product line."),
        WorkDataClass("Data Analyst",
        comp3,
        "2014 - 2016",
        "Seattle",
        "A data analyst collects, processes, and performs statistical analyses on large datasets."),
        WorkDataClass("Marketing Specialist",
        comp4,
        "2012 - 2014",
        "Los Angeles",
        "A marketing specialist is responsible for creating and executing marketing campaigns to promote a product, service, or brand."))

}