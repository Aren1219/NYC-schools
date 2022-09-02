package com.example.nycschoolscodingchallenge.repo

import com.example.nycschoolscodingchallenge.TestFunctions.getSchoolDetailList
import com.example.nycschoolscodingchallenge.TestFunctions.getSchoolList
import com.example.nycschoolscodingchallenge.api.ApiDetails
import com.example.nycschoolscodingchallenge.model.SchoolDetail
import com.example.nycschoolscodingchallenge.model.SchoolDetailList
import com.example.nycschoolscodingchallenge.model.SchoolList
import com.example.nycschoolscodingchallenge.model.SchoolListItem
import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import retrofit2.Response

class RepositoryImpTest {

    private lateinit var repository: RepositoryImp

    @Mock
    lateinit var apiDetails: ApiDetails

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        repository = RepositoryImp(apiDetails)
    }

    @Test
    fun `school list`() {
        runBlocking {
            val dummy = Response.success(getSchoolList())
            Mockito.`when`(apiDetails.getSchoolList()).thenReturn(dummy)
            val result = repository.getSchoolList()
            assertEquals(dummy, result)
        }
    }

    @Test
    fun `school detail`() {
        runBlocking {
            val str = "epic"
            val dummy = Response.success(getSchoolDetailList(str))
            Mockito.`when`(apiDetails.getSchoolDetail(str)).thenReturn(dummy)
            val result = repository.getSchoolDetail(str)
            assertEquals(dummy, result)
        }
    }



}