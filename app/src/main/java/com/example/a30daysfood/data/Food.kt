package com.example.a30daysfood.data

import com.example.a30daysfood.R

data class Food(
    val day: Int,
    val title: String,
    val description: String,
    val imageRes: Int
)


val foods = listOf(
    Food(1, "Ceasar Salad", "made with romaine lettuce, croutons, Parmesan cheese, and Caesar dressing", R.drawable.image1),
    Food(2, "Sunny Side Up Egg", "a style of fried egg where the egg is cooked only on one side.", R.drawable.image2),
    Food(3, "French Toast", "a dish of sliced bread soaked in beaten eggs and often milk or cream, then pan-fried", R.drawable.image3),
    Food(4, "Meat Sandwich", "a simple sandwich consisting of slices of cooked meat placed between two slices of bread, often with additional condiments like mustard or mayonnaise", R.drawable.image4),
    Food(5, "Egg Benedict", "a breakfast dish of toasted English muffins topped with Canadian bacon, poached eggs, and hollandaise sauce", R.drawable.image5),
    Food(6, "Chicken and Waffle", "fried chicken on top of a waffle, covered in either butter and syrup or gravy", R.drawable.image6),
    Food(7, "BBQ Ribs", "a cut of meat from the ribcage of a pig or cow that are cooked and served with barbecue sauce", R.drawable.image7),
    Food(8, "Donut", "a small, fried or baked ring of sweet dough", R.drawable.image8),
    Food(9, "Spaghetti", "long, thin, solid pasta that originated in Italy", R.drawable.image9),
    Food(10, "Pizza", "an Italian dish of flatbread topped with tomato sauce, cheese, and other ingredients, then baked", R.drawable.image10),
    Food(11, "Fried Chicken", "a popular dish made by coating chicken pieces with a seasoned batter or breading and then deep-frying or pan-frying them until they are golden brown and crispy", R.drawable.image11),
    Food(12, "Ramen", "a Japanese noodle soup made with wheat noodles, broth, and various toppings", R.drawable.image12),
    Food(13, "Toasted Siopao", "a savory Filipino baked bun with a crispy crust and a soft, juicy interior", R.drawable.image13),
    Food(14, "Sushi", "a Japanese dish of vinegared rice with a variety of fillings, such as raw or cooked seafood, vegetables, or eggs", R.drawable.image14),
    Food(15, "Pastil", "a Filipino dish of steamed rice wrapped in banana leaves with a filling of shredded meat, fish, or eggs", R.drawable.image15),
    Food(16, "Xiao Long Bao", "small steamed buns, originally from the Jiangnian region in China, especially connected to Shanghai and Wuxi. Traditionally they are filled with pork, but this can be mixed with other things, like crab meat and roe (eggs)", R.drawable.image16),
    Food(17, "Ice Cream", "a frozen dessert made from milk, cream, sugar, and flavorings", R.drawable.image17),
    Food(18, "Burrito", "a Mexican or Tex-Mex food item made of a flour tortilla folded around a filling", R.drawable.image18),
    Food(19, "Taco", "a small, hand-sized Mexican dish of a folded tortilla filled with various ingredients", R.drawable.image19),
    Food(20, "Chocolate Cake", "a cake flavored with melted chocolate, cocoa powder, or both", R.drawable.image20),
)

