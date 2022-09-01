package com.example.nycschoolscodingchallenge.ui

import androidx.compose.runtime.MutableState
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nycschoolscodingchallenge.model.SchoolDetail
import com.example.nycschoolscodingchallenge.model.SchoolList
import com.example.nycschoolscodingchallenge.model.SchoolListItem
import com.example.nycschoolscodingchallenge.repo.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val repository: Repository
): ViewModel(){

    private val _schoolList: MutableLiveData<SchoolList> = MutableLiveData()
    val schoolList: LiveData<SchoolList> = _schoolList

    private val _schoolDetail: MutableLiveData<SchoolDetail> = MutableLiveData()
    val schoolDetail: LiveData<SchoolDetail> = _schoolDetail

    init {
        getSchoolList()
    }

    private fun getSchoolList() {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = repository.getSchoolList()
                if (response.isSuccessful) _schoolList.postValue(response.body())
            } catch (e: Exception) {}
        }
    }

    fun getSchoolItem(schoolName: String): SchoolListItem? {
        for (item in schoolList.value!!){
            if (item.schoolName.uppercase() == schoolName.uppercase()) return item
        }
        return null
    }

    fun getSchoolDetail(schoolName: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val response = repository.getSchoolDetail(schoolName)
                if (response.isSuccessful) _schoolDetail.postValue(response.body())
            } catch (e: Exception) {}
        }
    }
}