package com.example.myrecipeapp.presentation.screen.recipe_detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myrecipeapp.presentation.components.ErrorMessage
import com.example.myrecipeapp.presentation.components.LoadingIndicator
import com.example.myrecipeapp.presentation.components.MyTopBar
import com.example.myrecipeapp.presentation.viewmodels.RecipeDetailViewModel
import com.example.myrecipeapp.ui.theme.CustomColour

@Composable
fun RecipeDetailScreen(
    recipeId : Int,
    onBack: () -> Unit,
    viewModel: RecipeDetailViewModel = viewModel()
){

    LaunchedEffect(recipeId) {
        viewModel.fetchRecipeDetail(recipeId)
    }

    Scaffold(
        topBar = {MyTopBar(
            title = "Recipe Details",
            onBackClick = onBack,
            icon = Icons.AutoMirrored.Filled.ArrowBack
        )}
    ) { innerPadding->

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(color = CustomColour.copy(alpha = 0.02f))
        )

         {
            when{

                viewModel.isLoading -> LoadingIndicator(strokeWidth = 1.dp)

                viewModel.errorMessage != null -> ErrorMessage(
                    errorMessage = viewModel.errorMessage,
                    onRetry = {viewModel.fetchRecipeDetail(id = recipeId)}
                )



            }

        }
    }


}