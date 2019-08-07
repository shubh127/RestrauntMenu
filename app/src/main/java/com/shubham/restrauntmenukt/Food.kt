package com.shubham.restrauntmenukt

class Food {
    var foodName: String? = null
    var foodDescription: String? = null
    var foodImage: Int? = null

    constructor(foodName: String, foodDescription: String, foodImage: Int) {
        this.foodName = foodName
        this.foodDescription = foodDescription
        this.foodImage = foodImage
    }
}