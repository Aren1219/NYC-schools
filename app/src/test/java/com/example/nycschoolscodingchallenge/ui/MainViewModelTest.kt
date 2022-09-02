package com.example.nycschoolscodingchallenge.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.nycschoolscodingchallenge.getOrAwaitValue
import com.example.nycschoolscodingchallenge.model.SchoolDetail
import com.example.nycschoolscodingchallenge.model.SchoolDetailList
import com.example.nycschoolscodingchallenge.model.SchoolList
import com.example.nycschoolscodingchallenge.model.SchoolListItem
import com.example.nycschoolscodingchallenge.repo.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations
import retrofit2.Response

class MainViewModelTest{

    private val testDispatcher = TestCoroutineDispatcher()
    @get:Rule
    val instantTaskExecutionRule: TestRule = InstantTaskExecutorRule()

    lateinit var viewModel: MainViewModel

    @Mock
    lateinit var repository: Repository

    @Before
    fun setup() {
        MockitoAnnotations.openMocks(this)
        Dispatchers.setMain(testDispatcher)
        viewModel = MainViewModel(repository)
    }

    @After
    fun teardown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `test school list live data`() = runBlocking{
        val dummy = Response.success(getSchoolList())
        Mockito.`when`(repository.getSchoolList()).thenReturn(dummy)
        val result = viewModel.schoolList.getOrAwaitValue()
        assertEquals(dummy.body(), result)
    }

//    @Test
//    fun `test school detail live data`() = runBlocking {
//        val dummy = Response.success(SchoolDetailList())
//    }

    private fun getSchoolList(): SchoolList {
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
}