package com.example.nycschoolscodingchallenge.ui.list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.nycschoolscodingchallenge.model.SchoolList
import com.example.nycschoolscodingchallenge.model.SchoolListItem
import com.example.nycschoolscodingchallenge.ui.MainViewModel

@Composable
fun SchoolListScreen(
    viewModel: MainViewModel,
    onNavigateToDetail: (schoolName: String) -> Unit
) {

    var search by rememberSaveable { mutableStateOf("")}
    val list by viewModel.schoolList.observeAsState()

    Column() {
        SearchBar(
            text = search,
            onTextChange = {text -> search = text},
            onSearchClicked = {}
        )

        list?.let { SchoolListUi(
            schoolList = it,
            selectSchool = {item -> onNavigateToDetail(item.schoolName) },
            search = search
        ) }
    }
}

@Composable
fun SearchBar(
    text: String,
    onTextChange: (String) -> Unit,
    onSearchClicked: (String) -> Unit,
    modifier: Modifier = Modifier
) {
    TextField(
        value = text,
        onValueChange = onTextChange,
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        },
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = MaterialTheme.colors.surface
        ),
        placeholder = {
            Text("search school name")
        },
        singleLine = true,
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp),
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Search),
        keyboardActions = KeyboardActions(onSearch = { onSearchClicked(text) })
    )
}

@Composable
fun SchoolListUi(
    schoolList: SchoolList,
    modifier: Modifier = Modifier,
    selectSchool: (SchoolListItem) -> Unit,
    search: String
) {
    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ){
        items(schoolList){ schoolItem ->
            SchoolListItemUi(
                schoolListItem = schoolItem,
                onClick = { selectSchool(schoolItem) }
            )
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun SchoolListItemUi(
    schoolListItem: SchoolListItem,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick
//        backgroundColor = MaterialTheme.colors.primaryVariant
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = schoolListItem.schoolName,
                textAlign = TextAlign.Center
            )
            Text(
                text = schoolListItem.website,
                textAlign = TextAlign.Center
            )
        }
    }
}