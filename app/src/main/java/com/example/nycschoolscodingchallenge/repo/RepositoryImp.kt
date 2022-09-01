package com.example.nycschoolscodingchallenge.repo

import com.example.nycschoolscodingchallenge.api.ApiDetails
import com.example.nycschoolscodingchallenge.model.SchoolDetail
import com.example.nycschoolscodingchallenge.model.SchoolDetailList
import com.example.nycschoolscodingchallenge.model.SchoolList
import retrofit2.Response
import javax.inject.Inject

class RepositoryImp @Inject constructor(
    val apiDetails: ApiDetails
): Repository {

    override suspend fun getSchoolList(): Response<SchoolList> =
        apiDetails.getSchoolList()

    override suspend fun getSchoolDetail(schoolName: String): Response<SchoolDetailList> =
        apiDetails.getSchoolDetail(schoolName)

}