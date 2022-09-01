package com.example.nycschoolscodingchallenge.repo

import com.example.nycschoolscodingchallenge.model.SchoolDetail
import com.example.nycschoolscodingchallenge.model.SchoolDetailList
import com.example.nycschoolscodingchallenge.model.SchoolList
import retrofit2.Response

interface Repository {

    suspend fun getSchoolList(): Response<SchoolList>

    suspend fun getSchoolDetail(schoolName: String): Response<SchoolDetailList>

}