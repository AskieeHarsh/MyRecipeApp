# MyRecipeApp 🍽️

A recipe app I built using Kotlin and Jetpack Compose while learning Android development.

The app gets recipe data from the DummyJSON API and displays it on the home screen. Users can browse recipes, filter them by cuisine and tap on a recipe to see its full details, including ingredients and cooking instructions.

## What the app can do

- Show recipes in a grid.
- Filter recipes by cuisine.
- View details of a selected recipe.
- See cooking time, preparation time, calories and servings.
- View ingredients and cooking instructions.
- Load recipe images from the internet.
- Show loading and error states.

## Technologies used

- Kotlin
- Jetpack Compose
- MVVM Architecture
- ViewModel
- Kotlin Coroutines
- Ktor Client
- Kotlin Serialization
- Navigation Compose
- Coil

## API

I used the [DummyJSON Recipes API](https://dummyjson.com/recipes) to get the recipe data.

- `/recipes` – Gets the list of recipes.
- `/recipes/{id}` – Gets details of a particular recipe.

## Things I learned

This project gave me a chance to work with:

- Jetpack Compose and its UI components.
- ViewModel and state management.
- MVVM and Repository Pattern.
- Kotlin Coroutines.
- Making API requests using Ktor.
- Working with JSON data.
- Navigation and passing recipe IDs between screens.
- Loading images using Coil.
- Filtering recipes by cuisine.
- Handling loading and error states.

## A little about the project

I used YouTube tutorials and Google documentation while working on this project. There were quite a few concepts that were new to me, so I spent time understanding how they work and why they are used.

Building this app helped me get a better idea of how all these concepts come together in an actual Android application.

I'm still learning, and this is one of the projects I've built along the way.
