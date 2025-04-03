# Assignment1-IMAD

# MealMate

MealMate is an Android application designed to help users discover and manage their favorite recipes. It allows users to browse food categories, view recipes, and save their favorite meals for easy access.

## Features

*   Browse Food Categories: Explore recipes by category (Breakfast, Lunch, Dinner, Dessert).
*   View Recipes: See detailed information about each recipe, including ingredients and instructions.
*   Favorites: Save your favorite meals to a dedicated favorites section.
* Room Database: The favorites are saved in a Room database.
* Traditional Views: The app uses the traditional Android View system.
* View Binding: The app uses View Binding.
* ViewModel: The app uses a ViewModel.
* RecyclerView: The app uses a RecyclerView.

## Project Structure

The project is organized into the following packages:

*   `adapter/`: Contains the `FoodCategoryAdapter` and `FavoritesAdapter` for managing the `RecyclerView`s.
*   `data/`: Contains the data classes (`FoodCategory`, `Recipe`, `FavoriteMeal`), the `FavoriteMealDao`, and the `MealDatabase`.
*   `ui/`: Contains the UI components, including:
    *   `home/`: The `HomeFragment` for displaying food categories.
    *   `recipe/`: The `RecipeListActivity` for displaying recipes.
    *   `favorites/`: The `FavoritesFragment` for displaying favorite meals.
* `viewmodel/`: Contains the `FavouriteViewModel`.

## Technologies Used

*   Kotlin: The primary programming language.
*   Android SDK: For building the Android application.
*   Android Jetpack:
    *   Room: For local data persistence (favorites).
    *   ViewModel: For managing UI-related data.
    *   LiveData: For observing data changes.
    * View Binding: For binding views.
    * RecyclerView: For displaying lists.
*   Gradle: For project building and dependency management.

## Setup and Installation

1.  Clone the Repository:

   git clone [your-repository-url]

   
