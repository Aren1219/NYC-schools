package com.example.nycschoolscodingchallenge.model


import com.google.gson.annotations.SerializedName

data class SchoolListItem(
//    @SerializedName("academicopportunities1")
//    val academicopportunities1: String,
//    @SerializedName("academicopportunities2")
//    val academicopportunities2: String,
//    @SerializedName("academicopportunities3")
//    val academicopportunities3: String,
//    @SerializedName("academicopportunities4")
//    val academicopportunities4: String,
//    @SerializedName("academicopportunities5")
//    val academicopportunities5: String,
//    @SerializedName("addtl_info1")
//    val addtlInfo1: String,
//    @SerializedName("admissionspriority11")
//    val admissionspriority11: String,
//    @SerializedName("admissionspriority110")
//    val admissionspriority110: String,
//    @SerializedName("admissionspriority12")
//    val admissionspriority12: String,
//    @SerializedName("admissionspriority13")
//    val admissionspriority13: String,
//    @SerializedName("admissionspriority14")
//    val admissionspriority14: String,
//    @SerializedName("admissionspriority15")
//    val admissionspriority15: String,
//    @SerializedName("admissionspriority16")
//    val admissionspriority16: String,
//    @SerializedName("admissionspriority17")
//    val admissionspriority17: String,
//    @SerializedName("admissionspriority18")
//    val admissionspriority18: String,
//    @SerializedName("admissionspriority19")
//    val admissionspriority19: String,
//    @SerializedName("admissionspriority21")
//    val admissionspriority21: String,
//    @SerializedName("admissionspriority22")
//    val admissionspriority22: String,
//    @SerializedName("admissionspriority23")
//    val admissionspriority23: String,
//    @SerializedName("admissionspriority24")
//    val admissionspriority24: String,
//    @SerializedName("admissionspriority25")
//    val admissionspriority25: String,
//    @SerializedName("admissionspriority26")
//    val admissionspriority26: String,
//    @SerializedName("admissionspriority27")
//    val admissionspriority27: String,
//    @SerializedName("admissionspriority28")
//    val admissionspriority28: String,
//    @SerializedName("admissionspriority29")
//    val admissionspriority29: String,
//    @SerializedName("admissionspriority31")
//    val admissionspriority31: String,
//    @SerializedName("admissionspriority32")
//    val admissionspriority32: String,
//    @SerializedName("admissionspriority33")
//    val admissionspriority33: String,
//    @SerializedName("admissionspriority34")
//    val admissionspriority34: String,
//    @SerializedName("admissionspriority35")
//    val admissionspriority35: String,
//    @SerializedName("admissionspriority36")
//    val admissionspriority36: String,
//    @SerializedName("admissionspriority37")
//    val admissionspriority37: String,
//    @SerializedName("admissionspriority41")
//    val admissionspriority41: String,
//    @SerializedName("admissionspriority42")
//    val admissionspriority42: String,
//    @SerializedName("admissionspriority43")
//    val admissionspriority43: String,
//    @SerializedName("admissionspriority44")
//    val admissionspriority44: String,
//    @SerializedName("admissionspriority46")
//    val admissionspriority46: String,
//    @SerializedName("admissionspriority51")
//    val admissionspriority51: String,
//    @SerializedName("admissionspriority52")
//    val admissionspriority52: String,
//    @SerializedName("admissionspriority53")
//    val admissionspriority53: String,
//    @SerializedName("admissionspriority54")
//    val admissionspriority54: String,
//    @SerializedName("admissionspriority56")
//    val admissionspriority56: String,
//    @SerializedName("admissionspriority61")
//    val admissionspriority61: String,
//    @SerializedName("admissionspriority62")
//    val admissionspriority62: String,
//    @SerializedName("admissionspriority63")
//    val admissionspriority63: String,
//    @SerializedName("admissionspriority64")
//    val admissionspriority64: String,
//    @SerializedName("admissionspriority71")
//    val admissionspriority71: String,
//    @SerializedName("admissionspriority74")
//    val admissionspriority74: String,
//    @SerializedName("advancedplacement_courses")
//    val advancedplacementCourses: String,
//    @SerializedName("applicants1specialized")
//    val applicants1specialized: String,
//    @SerializedName("applicants2specialized")
//    val applicants2specialized: String,
//    @SerializedName("applicants3specialized")
//    val applicants3specialized: String,
//    @SerializedName("applicants4specialized")
//    val applicants4specialized: String,
//    @SerializedName("applicants5specialized")
//    val applicants5specialized: String,
//    @SerializedName("applicants6specialized")
//    val applicants6specialized: String,
//    @SerializedName("appperseat1specialized")
//    val appperseat1specialized: String,
//    @SerializedName("appperseat2specialized")
//    val appperseat2specialized: String,
//    @SerializedName("appperseat3specialized")
//    val appperseat3specialized: String,
//    @SerializedName("appperseat4specialized")
//    val appperseat4specialized: String,
//    @SerializedName("appperseat5specialized")
//    val appperseat5specialized: String,
//    @SerializedName("appperseat6specialized")
//    val appperseat6specialized: String,
//    @SerializedName("attendance_rate")
//    val attendanceRate: String,
//    @SerializedName("auditioninformation1")
//    val auditioninformation1: String,
//    @SerializedName("auditioninformation2")
//    val auditioninformation2: String,
//    @SerializedName("auditioninformation3")
//    val auditioninformation3: String,
//    @SerializedName("auditioninformation4")
//    val auditioninformation4: String,
//    @SerializedName("auditioninformation5")
//    val auditioninformation5: String,
//    @SerializedName("auditioninformation6")
//    val auditioninformation6: String,
//    @SerializedName("auditioninformation7")
//    val auditioninformation7: String,
//    @SerializedName("bbl")
//    val bbl: String,
//    @SerializedName("bin")
//    val bin: String,
//    @SerializedName("boro")
//    val boro: String,
//    @SerializedName("borough")
//    val borough: String,
//    @SerializedName("boys")
//    val boys: String,
//    @SerializedName("building_code")
//    val buildingCode: String,
//    @SerializedName("bus")
//    val bus: String,
//    @SerializedName("campus_name")
//    val campusName: String,
//    @SerializedName("census_tract")
//    val censusTract: String,
//    @SerializedName("city")
//    val city: String,
//    @SerializedName("code1")
//    val code1: String,
//    @SerializedName("code10")
//    val code10: String,
//    @SerializedName("code2")
//    val code2: String,
//    @SerializedName("code3")
//    val code3: String,
//    @SerializedName("code4")
//    val code4: String,
//    @SerializedName("code5")
//    val code5: String,
//    @SerializedName("code6")
//    val code6: String,
//    @SerializedName("code7")
//    val code7: String,
//    @SerializedName("code8")
//    val code8: String,
//    @SerializedName("code9")
//    val code9: String,
//    @SerializedName("college_career_rate")
//    val collegeCareerRate: String,
//    @SerializedName("common_audition1")
//    val commonAudition1: String,
//    @SerializedName("common_audition2")
//    val commonAudition2: String,
//    @SerializedName("common_audition3")
//    val commonAudition3: String,
//    @SerializedName("common_audition4")
//    val commonAudition4: String,
//    @SerializedName("common_audition5")
//    val commonAudition5: String,
//    @SerializedName("common_audition6")
//    val commonAudition6: String,
//    @SerializedName("common_audition7")
//    val commonAudition7: String,
//    @SerializedName("community_board")
//    val communityBoard: String,
//    @SerializedName("council_district")
//    val councilDistrict: String,
//    @SerializedName("dbn")
//    val dbn: String,
//    @SerializedName("diplomaendorsements")
//    val diplomaendorsements: String,
//    @SerializedName("directions1")
//    val directions1: String,
//    @SerializedName("directions2")
//    val directions2: String,
//    @SerializedName("directions3")
//    val directions3: String,
//    @SerializedName("directions4")
//    val directions4: String,
//    @SerializedName("directions5")
//    val directions5: String,
//    @SerializedName("directions6")
//    val directions6: String,
//    @SerializedName("directions7")
//    val directions7: String,
//    @SerializedName("earlycollege")
//    val earlycollege: String,
//    @SerializedName("eligibility1")
//    val eligibility1: String,
//    @SerializedName("eligibility2")
//    val eligibility2: String,
//    @SerializedName("eligibility3")
//    val eligibility3: String,
//    @SerializedName("eligibility4")
//    val eligibility4: String,
//    @SerializedName("eligibility5")
//    val eligibility5: String,
//    @SerializedName("eligibility6")
//    val eligibility6: String,
//    @SerializedName("eligibility7")
//    val eligibility7: String,
//    @SerializedName("ell_programs")
//    val ellPrograms: String,
//    @SerializedName("end_time")
//    val endTime: String,
//    @SerializedName("extracurricular_activities")
//    val extracurricularActivities: String,
//    @SerializedName("fax_number")
//    val faxNumber: String,
//    @SerializedName("finalgrades")
//    val finalgrades: String,
//    @SerializedName("geoeligibility")
//    val geoeligibility: String,
//    @SerializedName("girls")
//    val girls: String,
//    @SerializedName("grade9geapplicants1")
//    val grade9geapplicants1: String,
//    @SerializedName("grade9geapplicants10")
//    val grade9geapplicants10: String,
//    @SerializedName("grade9geapplicants2")
//    val grade9geapplicants2: String,
//    @SerializedName("grade9geapplicants3")
//    val grade9geapplicants3: String,
//    @SerializedName("grade9geapplicants4")
//    val grade9geapplicants4: String,
//    @SerializedName("grade9geapplicants5")
//    val grade9geapplicants5: String,
//    @SerializedName("grade9geapplicants6")
//    val grade9geapplicants6: String,
//    @SerializedName("grade9geapplicants7")
//    val grade9geapplicants7: String,
//    @SerializedName("grade9geapplicants8")
//    val grade9geapplicants8: String,
//    @SerializedName("grade9geapplicants9")
//    val grade9geapplicants9: String,
//    @SerializedName("grade9geapplicantsperseat1")
//    val grade9geapplicantsperseat1: String,
//    @SerializedName("grade9geapplicantsperseat10")
//    val grade9geapplicantsperseat10: String,
//    @SerializedName("grade9geapplicantsperseat2")
//    val grade9geapplicantsperseat2: String,
//    @SerializedName("grade9geapplicantsperseat3")
//    val grade9geapplicantsperseat3: String,
//    @SerializedName("grade9geapplicantsperseat4")
//    val grade9geapplicantsperseat4: String,
//    @SerializedName("grade9geapplicantsperseat5")
//    val grade9geapplicantsperseat5: String,
//    @SerializedName("grade9geapplicantsperseat6")
//    val grade9geapplicantsperseat6: String,
//    @SerializedName("grade9geapplicantsperseat7")
//    val grade9geapplicantsperseat7: String,
//    @SerializedName("grade9geapplicantsperseat8")
//    val grade9geapplicantsperseat8: String,
//    @SerializedName("grade9geapplicantsperseat9")
//    val grade9geapplicantsperseat9: String,
//    @SerializedName("grade9gefilledflag1")
//    val grade9gefilledflag1: String,
//    @SerializedName("grade9gefilledflag10")
//    val grade9gefilledflag10: String,
//    @SerializedName("grade9gefilledflag2")
//    val grade9gefilledflag2: String,
//    @SerializedName("grade9gefilledflag3")
//    val grade9gefilledflag3: String,
//    @SerializedName("grade9gefilledflag4")
//    val grade9gefilledflag4: String,
//    @SerializedName("grade9gefilledflag5")
//    val grade9gefilledflag5: String,
//    @SerializedName("grade9gefilledflag6")
//    val grade9gefilledflag6: String,
//    @SerializedName("grade9gefilledflag7")
//    val grade9gefilledflag7: String,
//    @SerializedName("grade9gefilledflag8")
//    val grade9gefilledflag8: String,
//    @SerializedName("grade9gefilledflag9")
//    val grade9gefilledflag9: String,
//    @SerializedName("grade9swdapplicants1")
//    val grade9swdapplicants1: String,
//    @SerializedName("grade9swdapplicants10")
//    val grade9swdapplicants10: String,
//    @SerializedName("grade9swdapplicants2")
//    val grade9swdapplicants2: String,
//    @SerializedName("grade9swdapplicants3")
//    val grade9swdapplicants3: String,
//    @SerializedName("grade9swdapplicants4")
//    val grade9swdapplicants4: String,
//    @SerializedName("grade9swdapplicants5")
//    val grade9swdapplicants5: String,
//    @SerializedName("grade9swdapplicants6")
//    val grade9swdapplicants6: String,
//    @SerializedName("grade9swdapplicants7")
//    val grade9swdapplicants7: String,
//    @SerializedName("grade9swdapplicants8")
//    val grade9swdapplicants8: String,
//    @SerializedName("grade9swdapplicants9")
//    val grade9swdapplicants9: String,
//    @SerializedName("grade9swdapplicantsperseat1")
//    val grade9swdapplicantsperseat1: String,
//    @SerializedName("grade9swdapplicantsperseat10")
//    val grade9swdapplicantsperseat10: String,
//    @SerializedName("grade9swdapplicantsperseat2")
//    val grade9swdapplicantsperseat2: String,
//    @SerializedName("grade9swdapplicantsperseat3")
//    val grade9swdapplicantsperseat3: String,
//    @SerializedName("grade9swdapplicantsperseat4")
//    val grade9swdapplicantsperseat4: String,
//    @SerializedName("grade9swdapplicantsperseat5")
//    val grade9swdapplicantsperseat5: String,
//    @SerializedName("grade9swdapplicantsperseat6")
//    val grade9swdapplicantsperseat6: String,
//    @SerializedName("grade9swdapplicantsperseat7")
//    val grade9swdapplicantsperseat7: String,
//    @SerializedName("grade9swdapplicantsperseat8")
//    val grade9swdapplicantsperseat8: String,
//    @SerializedName("grade9swdapplicantsperseat9")
//    val grade9swdapplicantsperseat9: String,
//    @SerializedName("grade9swdfilledflag1")
//    val grade9swdfilledflag1: String,
//    @SerializedName("grade9swdfilledflag10")
//    val grade9swdfilledflag10: String,
//    @SerializedName("grade9swdfilledflag2")
//    val grade9swdfilledflag2: String,
//    @SerializedName("grade9swdfilledflag3")
//    val grade9swdfilledflag3: String,
//    @SerializedName("grade9swdfilledflag4")
//    val grade9swdfilledflag4: String,
//    @SerializedName("grade9swdfilledflag5")
//    val grade9swdfilledflag5: String,
//    @SerializedName("grade9swdfilledflag6")
//    val grade9swdfilledflag6: String,
//    @SerializedName("grade9swdfilledflag7")
//    val grade9swdfilledflag7: String,
//    @SerializedName("grade9swdfilledflag8")
//    val grade9swdfilledflag8: String,
//    @SerializedName("grade9swdfilledflag9")
//    val grade9swdfilledflag9: String,
//    @SerializedName("grades2018")
//    val grades2018: String,
//    @SerializedName("graduation_rate")
//    val graduationRate: String,
//    @SerializedName("interest1")
//    val interest1: String,
//    @SerializedName("interest10")
//    val interest10: String,
//    @SerializedName("interest2")
//    val interest2: String,
//    @SerializedName("interest3")
//    val interest3: String,
//    @SerializedName("interest4")
//    val interest4: String,
//    @SerializedName("interest5")
//    val interest5: String,
//    @SerializedName("interest6")
//    val interest6: String,
//    @SerializedName("interest7")
//    val interest7: String,
//    @SerializedName("interest8")
//    val interest8: String,
//    @SerializedName("interest9")
//    val interest9: String,
//    @SerializedName("international")
//    val international: String,
//    @SerializedName("language_classes")
//    val languageClasses: String,
//    @SerializedName("latitude")
//    val latitude: String,
//    @SerializedName("location")
//    val location: String,
//    @SerializedName("longitude")
//    val longitude: String,
//    @SerializedName("method1")
//    val method1: String,
//    @SerializedName("method10")
//    val method10: String,
//    @SerializedName("method2")
//    val method2: String,
//    @SerializedName("method3")
//    val method3: String,
//    @SerializedName("method4")
//    val method4: String,
//    @SerializedName("method5")
//    val method5: String,
//    @SerializedName("method6")
//    val method6: String,
//    @SerializedName("method7")
//    val method7: String,
//    @SerializedName("method8")
//    val method8: String,
//    @SerializedName("method9")
//    val method9: String,
//    @SerializedName("neighborhood")
//    val neighborhood: String,
//    @SerializedName("nta")
//    val nta: String,
//    @SerializedName("offer_rate1")
//    val offerRate1: String,
//    @SerializedName("offer_rate2")
//    val offerRate2: String,
//    @SerializedName("offer_rate3")
//    val offerRate3: String,
//    @SerializedName("offer_rate4")
//    val offerRate4: String,
//    @SerializedName("offer_rate5")
//    val offerRate5: String,
//    @SerializedName("offer_rate6")
//    val offerRate6: String,
//    @SerializedName("offer_rate7")
//    val offerRate7: String,
//    @SerializedName("offer_rate8")
//    val offerRate8: String,
//    @SerializedName("offer_rate9")
//    val offerRate9: String,
    @SerializedName("overview_paragraph")
    val overviewParagraph: String,
//    @SerializedName("pbat")
//    val pbat: String,
//    @SerializedName("pct_stu_enough_variety")
//    val pctStuEnoughVariety: String,
//    @SerializedName("pct_stu_safe")
//    val pctStuSafe: String,
    @SerializedName("phone_number")
    val phoneNumber: String,
//    @SerializedName("prgdesc1")
//    val prgdesc1: String,
//    @SerializedName("prgdesc10")
//    val prgdesc10: String,
//    @SerializedName("prgdesc2")
//    val prgdesc2: String,
//    @SerializedName("prgdesc3")
//    val prgdesc3: String,
//    @SerializedName("prgdesc4")
//    val prgdesc4: String,
//    @SerializedName("prgdesc5")
//    val prgdesc5: String,
//    @SerializedName("prgdesc6")
//    val prgdesc6: String,
//    @SerializedName("prgdesc7")
//    val prgdesc7: String,
//    @SerializedName("prgdesc8")
//    val prgdesc8: String,
//    @SerializedName("prgdesc9")
//    val prgdesc9: String,
//    @SerializedName("primary_address_line_1")
//    val primaryAddressLine1: String,
//    @SerializedName("program1")
//    val program1: String,
//    @SerializedName("program10")
//    val program10: String,
//    @SerializedName("program2")
//    val program2: String,
//    @SerializedName("program3")
//    val program3: String,
//    @SerializedName("program4")
//    val program4: String,
//    @SerializedName("program5")
//    val program5: String,
//    @SerializedName("program6")
//    val program6: String,
//    @SerializedName("program7")
//    val program7: String,
//    @SerializedName("program8")
//    val program8: String,
//    @SerializedName("program9")
//    val program9: String,
//    @SerializedName("psal_sports_boys")
//    val psalSportsBoys: String,
//    @SerializedName("psal_sports_coed")
//    val psalSportsCoed: String,
//    @SerializedName("psal_sports_girls")
//    val psalSportsGirls: String,
//    @SerializedName("ptech")
//    val ptech: String,
//    @SerializedName("requirement1_1")
//    val requirement11: String,
//    @SerializedName("requirement1_2")
//    val requirement12: String,
//    @SerializedName("requirement1_3")
//    val requirement13: String,
//    @SerializedName("requirement1_4")
//    val requirement14: String,
//    @SerializedName("requirement1_5")
//    val requirement15: String,
//    @SerializedName("requirement1_6")
//    val requirement16: String,
//    @SerializedName("requirement1_7")
//    val requirement17: String,
//    @SerializedName("requirement1_8")
//    val requirement18: String,
//    @SerializedName("requirement2_1")
//    val requirement21: String,
//    @SerializedName("requirement2_2")
//    val requirement22: String,
//    @SerializedName("requirement2_3")
//    val requirement23: String,
//    @SerializedName("requirement2_4")
//    val requirement24: String,
//    @SerializedName("requirement2_5")
//    val requirement25: String,
//    @SerializedName("requirement2_6")
//    val requirement26: String,
//    @SerializedName("requirement2_7")
//    val requirement27: String,
//    @SerializedName("requirement2_8")
//    val requirement28: String,
//    @SerializedName("requirement3_1")
//    val requirement31: String,
//    @SerializedName("requirement3_2")
//    val requirement32: String,
//    @SerializedName("requirement3_3")
//    val requirement33: String,
//    @SerializedName("requirement3_4")
//    val requirement34: String,
//    @SerializedName("requirement3_5")
//    val requirement35: String,
//    @SerializedName("requirement3_6")
//    val requirement36: String,
//    @SerializedName("requirement3_7")
//    val requirement37: String,
//    @SerializedName("requirement3_8")
//    val requirement38: String,
//    @SerializedName("requirement4_1")
//    val requirement41: String,
//    @SerializedName("requirement4_2")
//    val requirement42: String,
//    @SerializedName("requirement4_3")
//    val requirement43: String,
//    @SerializedName("requirement4_4")
//    val requirement44: String,
//    @SerializedName("requirement4_5")
//    val requirement45: String,
//    @SerializedName("requirement4_6")
//    val requirement46: String,
//    @SerializedName("requirement4_7")
//    val requirement47: String,
//    @SerializedName("requirement5_1")
//    val requirement51: String,
//    @SerializedName("requirement5_2")
//    val requirement52: String,
//    @SerializedName("requirement5_3")
//    val requirement53: String,
//    @SerializedName("requirement5_4")
//    val requirement54: String,
//    @SerializedName("requirement5_5")
//    val requirement55: String,
//    @SerializedName("requirement5_6")
//    val requirement56: String,
//    @SerializedName("requirement5_7")
//    val requirement57: String,
//    @SerializedName("requirement6_1")
//    val requirement61: String,
//    @SerializedName("requirement6_2")
//    val requirement62: String,
//    @SerializedName("requirement6_3")
//    val requirement63: String,
//    @SerializedName("requirement6_7")
//    val requirement67: String,
//    @SerializedName("school_10th_seats")
//    val school10thSeats: String,
//    @SerializedName("school_accessibility_description")
//    val schoolAccessibilityDescription: String,
    @SerializedName("school_email")
    val schoolEmail: String,
    @SerializedName("school_name")
    val schoolName: String,
//    @SerializedName("school_sports")
//    val schoolSports: String,
//    @SerializedName("seats101")
//    val seats101: String,
//    @SerializedName("seats1010")
//    val seats1010: String,
//    @SerializedName("seats102")
//    val seats102: String,
//    @SerializedName("seats103")
//    val seats103: String,
//    @SerializedName("seats104")
//    val seats104: String,
//    @SerializedName("seats105")
//    val seats105: String,
//    @SerializedName("seats106")
//    val seats106: String,
//    @SerializedName("seats107")
//    val seats107: String,
//    @SerializedName("seats108")
//    val seats108: String,
//    @SerializedName("seats109")
//    val seats109: String,
//    @SerializedName("seats1specialized")
//    val seats1specialized: String,
//    @SerializedName("seats2specialized")
//    val seats2specialized: String,
//    @SerializedName("seats3specialized")
//    val seats3specialized: String,
//    @SerializedName("seats4specialized")
//    val seats4specialized: String,
//    @SerializedName("seats5specialized")
//    val seats5specialized: String,
//    @SerializedName("seats6specialized")
//    val seats6specialized: String,
//    @SerializedName("seats9ge1")
//    val seats9ge1: String,
//    @SerializedName("seats9ge10")
//    val seats9ge10: String,
//    @SerializedName("seats9ge2")
//    val seats9ge2: String,
//    @SerializedName("seats9ge3")
//    val seats9ge3: String,
//    @SerializedName("seats9ge4")
//    val seats9ge4: String,
//    @SerializedName("seats9ge5")
//    val seats9ge5: String,
//    @SerializedName("seats9ge6")
//    val seats9ge6: String,
//    @SerializedName("seats9ge7")
//    val seats9ge7: String,
//    @SerializedName("seats9ge8")
//    val seats9ge8: String,
//    @SerializedName("seats9ge9")
//    val seats9ge9: String,
//    @SerializedName("seats9swd1")
//    val seats9swd1: String,
//    @SerializedName("seats9swd10")
//    val seats9swd10: String,
//    @SerializedName("seats9swd2")
//    val seats9swd2: String,
//    @SerializedName("seats9swd3")
//    val seats9swd3: String,
//    @SerializedName("seats9swd4")
//    val seats9swd4: String,
//    @SerializedName("seats9swd5")
//    val seats9swd5: String,
//    @SerializedName("seats9swd6")
//    val seats9swd6: String,
//    @SerializedName("seats9swd7")
//    val seats9swd7: String,
//    @SerializedName("seats9swd8")
//    val seats9swd8: String,
//    @SerializedName("seats9swd9")
//    val seats9swd9: String,
//    @SerializedName("shared_space")
//    val sharedSpace: String,
//    @SerializedName("specialized")
//    val specialized: String,
//    @SerializedName("start_time")
//    val startTime: String,
//    @SerializedName("state_code")
//    val stateCode: String,
//    @SerializedName("subway")
//    val subway: String,
    @SerializedName("total_students")
    val totalStudents: String,
//    @SerializedName("transfer")
//    val transfer: String,
    @SerializedName("website")
    val website: String,
//    @SerializedName("zip")
//    val zip: String
)