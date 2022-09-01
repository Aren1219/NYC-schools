package com.example.nycschoolscodingchallenge.ui.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.nycschoolscodingchallenge.model.SchoolDetail
import com.example.nycschoolscodingchallenge.model.SchoolList
import com.example.nycschoolscodingchallenge.model.SchoolListItem
import com.example.nycschoolscodingchallenge.ui.MainViewModel

@Composable
fun SchoolDetailScreen(
    viewModel: MainViewModel,
    schoolName: String
) {

    viewModel.getSchoolDetail(schoolName)
    val schoolDetail by viewModel.schoolDetail.observeAsState()
    val schoolItem = viewModel.getSchoolItem(schoolName)

    Column() {
        schoolItem?.let { SchoolItemDetailUi(it) }
        schoolDetail?.let { SATDetailUi(it, schoolName) }
    }
}
@Composable
fun SchoolItemDetailUi(
    schoolListItem: SchoolListItem,
    modifier: Modifier = Modifier
){
    Card(modifier = modifier
        .fillMaxWidth()
        .padding(8.dp)) {
        Text(text = schoolListItem.schoolName)
    }
}

@Composable
fun SATDetailUi(
    schoolDetail: SchoolDetail,
    schoolName: String,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier
        .fillMaxWidth()
        .padding(8.dp)) {
        Column() {
            Text(text = schoolName)
            Text(text = schoolDetail.schoolName)
            Text(text = schoolDetail.satMathAvgScore)
        }
    }
}