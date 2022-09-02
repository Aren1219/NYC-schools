package com.example.nycschoolscodingchallenge.ui.detail

import android.util.Log
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.interaction.DragInteraction
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
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

    val schoolItem = viewModel.getSchoolItem(schoolName)
    LaunchedEffect(key1 = schoolName){
        viewModel.getSchoolDetail(schoolName.uppercase())
    }

    val schoolDetail by viewModel.schoolDetail.observeAsState()

    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        SchoolItemDetailUi(schoolItem!!)
        if (schoolDetail?.numOfSatTestTakers?.matches(Regex("[0-9]+")) == true)
            schoolDetail?.let { SATDetailUi(it) }
    }

}
@Composable
fun SchoolItemDetailUi(
    schoolListItem: SchoolListItem,
    modifier: Modifier = Modifier
){
    val p = 12.dp
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(p),
        elevation = 12.dp
    ) {
        Column() {

            Text(
                text = schoolListItem.schoolName,
                style = MaterialTheme.typography.h5,
                modifier = Modifier.padding(p)
            )
            if (schoolListItem.website != null)
            Text(
                text = schoolListItem.website,
                modifier = Modifier.padding(start = p, top = 0.dp, end = p, bottom = 0.dp)
            )
            if (schoolListItem.phoneNumber != null)
            Text(
                text = schoolListItem.phoneNumber,
                modifier = Modifier.padding(start = p, top = 0.dp, end = p, bottom = 0.dp)
            )

            if (schoolListItem.schoolEmail != null)
            Text(
                text = schoolListItem.schoolEmail,
                modifier = Modifier.padding(start = p, top = 0.dp, end = p, bottom = p)
            )
            if (schoolListItem.totalStudents != null)
            Text(
                text = "total students: ${schoolListItem.totalStudents}",
                modifier = Modifier.padding(start = p, top = 0.dp, end = p, bottom = p)
            )
            if (schoolListItem.overviewParagraph != null)
            Text(
                text = schoolListItem.overviewParagraph,
                modifier = Modifier.padding(start = p, top = 0.dp, end = p, bottom = p)
            )
        }
    }
}

@Composable
fun SATDetailUi(
    schoolDetail: SchoolDetail,
    modifier: Modifier = Modifier
) {
    val p = 12.dp
    Card(
        elevation = 12.dp,
        modifier = modifier
            .fillMaxWidth()
            .padding(start = p, top = 0.dp, end = p, bottom = p)
    ) {
        Column() {
            Text(
                text = "SAT average scores (${schoolDetail.numOfSatTestTakers} test takers)",
                modifier = modifier.padding(p),
                style = MaterialTheme.typography.h6,
                textAlign = TextAlign.Center
            )
            Text(
                text = "Math: ${schoolDetail.satMathAvgScore}",
                modifier = Modifier.padding(start = p, top = 0.dp, end = p, bottom = p)
            )
            Text(
                text = "Writing: ${schoolDetail.satWritingAvgScore}",
                modifier = Modifier.padding(start = p, top = 0.dp, end = p, bottom = p)
            )
            Text(
                text = "Reading: ${schoolDetail.satCriticalReadingAvgScore}",
                modifier = Modifier.padding(start = p, top = 0.dp, end = p, bottom = p)
            )
        }
    }
}