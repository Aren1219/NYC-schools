package com.example.nycschoolscodingchallenge.ui

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.nycschoolscodingchallenge.TestFunctions.getSchoolDetailList
import com.example.nycschoolscodingchallenge.TestFunctions.getSchoolList
import com.example.nycschoolscodingchallenge.getOrAwaitValue
import com.example.nycschoolscodingchallenge.model.SchoolDetail
import com.example.nycschoolscodingchallenge.model.SchoolDetailList
import com.example.nycschoolscodingchallenge.model.SchoolList
import com.example.nycschoolscodingchallenge.model.SchoolListItem
import com.example.nycschoolscodingchallenge.repo.Repository
import com.example.nycschoolscodingchallenge.repo.RepositoryImp
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
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

@OptIn(ExperimentalCoroutinesApi::class)
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
        runBlocking {
            Mockito.`when`(repository.getSchoolList()).thenReturn(Response.success(getSchoolList()))
            viewModel = MainViewModel(repository)
        }
    }

    @After
    fun teardown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `test school list live data`() { runBlocking{
        val dummy = Response.success(getSchoolList())
        val result = viewModel.schoolList.getOrAwaitValue()
        assertEquals(dummy.body(), result)
    }}


    @Test
    fun `test school detail live data`() = runBlocking {
        val str = "epic"
        val dummy = Response.success(getSchoolDetailList(str))
        Mockito.`when`(repository.getSchoolDetail(str)).thenReturn(dummy)
        viewModel.getSchoolDetail(str)
        val result = viewModel.schoolDetail.getOrAwaitValue()
        assertEquals(dummy.body()!![0], result)
    }

    @Test
    fun `test get school item function`() = runBlocking {
        viewModel.schoolList.getOrAwaitValue()
        val result = viewModel.getSchoolItem("epic")
        assertEquals(getSchoolList()[0], result)
    }
}