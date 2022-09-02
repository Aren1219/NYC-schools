package com.example.nycschoolscodingchallenge

import com.example.nycschoolscodingchallenge.model.SchoolDetail
import com.example.nycschoolscodingchallenge.model.SchoolDetailList
import com.example.nycschoolscodingchallenge.model.SchoolList
import com.example.nycschoolscodingchallenge.model.SchoolListItem

object TestFunctions {

    fun getSchoolList(): SchoolList {
        val schoolList = SchoolList()
        schoolList.add(getSchoolListItem())
        return schoolList
    }

    private fun getSchoolListItem(): SchoolListItem =
        SchoolListItem(
            "paragraph",
            "123",
            "@email",
            "epic",
            "9999",
            "www"
        )

    fun getSchoolDetailList(schoolName: String): SchoolDetailList {
        val list = SchoolDetailList()
        list.add(getSchoolDetail(schoolName))
        return list
    }

    private fun getSchoolDetail(schoolName: String): SchoolDetail =
        SchoolDetail(
            "F&HB^&",
            "244",
            "13",
            "12",
            "11",
            schoolName
        )
}