package com.android.assignment6.ui.work

object WorkDataSource {
    val comp1 = CompanyDataClass(
    "Facebook",
    "https://upload.wikimedia.org/wikipedia/en/thumb/0/04/Facebook_f_logo_%282021%29.svg/2048px-Facebook_f_logo_%282021%29.svg.png"
    )
    val comp2 = CompanyDataClass(
    "Microsoft Corporation",
    "https://pngimg.com/d/microsoft_PNG14.png"
    )
    val comp3 = CompanyDataClass(
    "Apple",
    "https://www.vectorlogo.zone/logos/apple/apple-ar21.png"
    )
    val comp4 = CompanyDataClass(
    "Tesla",
    "https://logos-world.net/wp-content/uploads/2020/10/Tesla-Logo.png"
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