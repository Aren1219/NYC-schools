package com.example.nycschoolscodingchallenge.api

import com.example.nycschoolscodingchallenge.api.ApiReferences.DETAIL_END_POINT
import com.example.nycschoolscodingchallenge.api.ApiReferences.LIST_END_POINT
import com.example.nycschoolscodingchallenge.model.SchoolDetail
import com.example.nycschoolscodingchallenge.model.SchoolList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiDetails {

    @GET(LIST_END_POINT)
    suspend fun getSchoolList(): Response<SchoolList>

    @GET(DETAIL_END_POINT)
    suspend fun getSchoolDetail(
        @Query("school_name") schoolName: String
    ): Response<SchoolDetail>

}