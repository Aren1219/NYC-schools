package com.example.nycschoolscodingchallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.nycschoolscodingchallenge.model.SchoolListItem
import com.example.nycschoolscodingchallenge.ui.MainViewModel
import com.example.nycschoolscodingchallenge.ui.detail.SchoolDetailScreen
import com.example.nycschoolscodingchallenge.ui.list.SchoolListScreen
import com.example.nycschoolscodingchallenge.ui.theme.NYCSchoolsCodingChallengeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}


@Composable
fun MainScreen(
    viewModel: MainViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
    navController: NavHostController = rememberNavController()
) {
    NYCSchoolsCodingChallengeTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.surface
        ) {
            NavHost(navController = navController, startDestination = "schoolList") {
                composable("schoolList") {
                    SchoolListScreen(
                        viewModel = viewModel,
                        onNavigateToDetail = {schoolName -> navController.navigate("schoolDetail/$schoolName")}
                    )
                }
                composable("schoolDetail/{schoolName}",) { backStackEntry ->
                    backStackEntry.arguments?.getString("schoolName")?.let {
                        SchoolDetailScreen(
                            viewModel = viewModel,
                            schoolName = it.uppercase()
                        )
                    }
                }
            }
        }
    }
}