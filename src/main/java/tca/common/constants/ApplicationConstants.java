package tca.common.constants;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;


/***********************************************************************************
 *	Author				:	Rajesh Ramamoorthy
 *	Creation Date		:	23-Feb-2010
 *
 *	Description 		:	Holds all the application level constant variables
 *
 *  Reviewed by			:
 *  Reviewed on			:	 (mm/dd/yyyy)
 *  Input Parameters 	:	Variables required by this Element
 *	parameter 1			:	xxx
 *	parameter 2			:	xxx
 *	parameter 3			:	xxx
 *
 *  Output				:
 *  Revision History  	:
 *	Modified By		Modified Date		Reason for modification
 *	AL84237		    06/09/2010		    Advanced Course Search
 *	AL84237		    21/09/2010		    SMMS ID:3381
 ***********************************************************************************/
public class ApplicationConstants {
    public static final Properties prop = System.getProperties();

    public static final String IMAGE_CODE_SESSION = "IMAGE_CODE";
    public static String JOBS_ADMIN_MAIL_ID;
    public static String UAT_TESTING_MAILS_ID;
    public static String HTTPS_REQUEST;
    public static String smd_account_id_prod;
    public static String sms_domain_name_prod;
    public static String sms_APPCODE;
    public static String web_service_call;
    public static String ILP_WEBSERVICE_URLS_PROP_FILE;
    public static boolean TRG_API_FAILD_EMAIL_ALERTS;
    public static String WS_SERVER_IP;
    public static String SOAP_WS_USERID;
    public static String SOAP_WS_PWD;
    public static String MAIL_FROM;
    public static String DOMAIN_URL;

    static {

    }

    //The list for all possbile Referer host name for CRSF checkin function
    public static String[] JB_REFERER_HOST_NAME = {"www.jobsbank.gov.sg", "ilpuat.jobsbank.gov.sg", "192.168.88.142", "192.168.88.143", "192.168.88.144", "192.168.6.66", "localhost", "192.168.6.51", "192.168.6.123", "192.168.6.15"
        , "uat.icms.sg", "www.icms.sg", "appuat-hosted.jobsbank.gov.sg", "appuat-hosted.intra.jobsbank.gov.sg", "uat-hosted.icms.sg", "intra.icms.sg", "uat-intra.icms.sg"};
    /*****************************************************************************************
     * End: ILP ENVIRONMENT BASED PROPERTIES
     ******************************************************************************************/

    /*Start: added by Srini for ILP API	*/
    public static final String SOAP_DR_INDVDL_ENDPOINT_SYNC = WS_SERVER_IP + "/XISOAPAdapter/MessageServlet?senderParty=&senderService=WDA_DATA_RETRIEVAL_SERVICES&receiverParty=&receiverService=&interface=IdentityBulkQuery_Sync_Out_V01&interfaceNamespace=http%3A%2F%2Fwda.gov.sg%2Fservices%2FIdentity";
    public static final String SOAP_DP_INDVDL_ENDPOINT_SYNC = WS_SERVER_IP + "/XISOAPAdapter/MessageServlet?senderParty=&senderService=WDA_DATA_POSTING_SERVICES&receiverParty=&receiverService=&interface=IdentityCreation_Sync_Out_V01&interfaceNamespace=http://wda.gov.sg/services/Identity";
    public static final String SOAP_DP_ORG_ENDPOINT_SYNC = WS_SERVER_IP + "/XISOAPAdapter/MessageServlet?senderParty=&senderService=WDA_DATA_POSTING_SERVICES&receiverParty=&receiverService=&interface=OrganisationMasterCreation_Sync_Out_V01&interfaceNamespace=http://wda.gov.sg/services/Organisation";
    public static final String SOAP_DR_ORG_ENDPOINT_SYNC = WS_SERVER_IP + "/XISOAPAdapter/MessageServlet?senderParty=&senderService=WDA_DATA_RETRIEVAL_SERVICES&receiverParty=&receiverService=&interface=OrganisationMasterQuery_Sync_Out_V01&interfaceNamespace=http%3A%2F%2Fwda.gov.sg%2Fservices%2FOrganisation";
    public static final String SOAP_DP_ORG_CONT_ENDPOINT_SYNC = WS_SERVER_IP + "/XISOAPAdapter/MessageServlet?senderParty=&senderService=WDA_DATA_POSTING_SERVICES&receiverParty=&receiverService=&interface=OrganisationContactPersonCreation_Sync_Out_V01&interfaceNamespace=http://wda.gov.sg/services/Organisation";
    public static final String WS_ENCODE = "ENCODE";
    public static final String WS_DECODE = "DECODE";
    /*End: added by Srini for ILP API	*/


    //Environment Specific Params to be modified

    /* FOR UAT / PROD */
//	 public static final String FilepathUploadErrorDocument = "/mnt/wda/wda-error/";
//	 public static final String FilepathUploadDocument = "/mnt/wda/wda-icms/";

    /* For LOCAL */
    public static final String FilepathUploadErrorDocument = "D:/WDA_Docs/SR's/TM-PGM/UploadCrsSch/errorFile/";
    public static final String FilepathUploadDocument = "D:/WDA_Docs/SR's/TM-PGM/UploadCrsSch/uploadedFile/";


    public static final String TEMPPATH = "/mnt/wda/wda-temp/";
    public static final String AssessmentXMLPath = "/mnt/wda/assesment.xml";
    //Page Name declarations to redirect the controller to specific action when using the same controller for
    //different portlet instances
    //JBM Module
    public static final String RegEmployerPg = "Register_Employer";
    public static final String ViewEmployerPg = "ViewEmployer_Detail";
    public static final String ListEmployerPg = "List_Employer";
    public static final String ModifyEmployerPg = "Modify_Employer";
    public static final String NewJobpostPg = "Create_Jobpost";
    public static final String ViewJoblistingsPg = "List_Jobpostings";
    public static final String ViewJobpostingPg = "View_Job_Details";
    public static final String ModifyJobpostPg = "Modify_Jobpost";
    public static final String CopyJobpostPg = "Copyjobpost_Jobpost";
    public static final String LoadEmployerCatgPg = "Load_Employer_Catg";
    public static final String CreateEmployerCatgPg = "Create_Employer_Catg";
    public static final String CreateEmployerCategoryChecklistResult = "Create_Employer_Category_ChecklistResult";
    public static final String CreateEmployerCatChecklistResultSucces = "Create_Employer_Cat_ChecklistResult_Succes";
    public static final String RaiseEmployerCatgSuccessPg = "Raise_Employer_Catg_Success";
    public static final String JobBankController = "/portlets/jbm/JobBankMgmtController.jpf";
    public static final String GetValueFromSearchController = "/portlets/jbm/JobBankMgmtController.jpf";
    public static final String JBM_ADVJOBSEARCH_SESSION_JOBPOSTINGFORM = "FormJobsAdvancedSearch";
    public static final String ApproveListforCATAemployer = "Approve_List_for_CATAemployer";
    public static final String RequestforApproval = "Request_for_Approval";
    public static final String CreateEmployerBlacklist = "Create_Employer_Blacklist";
    public static final String MaintainPublicHoliday = "Master_Hoilday_Detail";
    public static final String Maintainpg1 = "Master_Hoilday_Detail";
    public static final String ViewHolidayListPg = "Master_Hoilday_List";

    public static final String TrainingProviderDataSource = "TCA";
    public static final String ROC = "343001";
    public static final String ROB = "343002";
    public static final String UENO = "343003";
    public static final String OTHERS = "343004";
    public static final String TP_SCREEN_TITLE_LIST_TRNG_PRVDR = "List Training Providers";
    public static final String TP_SCREEN_TITLE_CREATE_TRNG_PRVDR = "Create Training Provider";
    public static final String ENTITY_NUM = "5061633";


    //TM-PGM
    public static final String AwaitingCrsSch = "97";
    public static final String ReferredToProvider = "29";
    public static final String CrsFundingTypeCatA = "511001";


    public static final String CreateEmployerBlacklistSuccess = "Create_Employer_Blacklist_Success";
    public static final String AmendEmployerBlacklist = "Amend_Employer_Blacklist";
    public static final String AmendEmployerBlacklistSuccess = "Amend_Employer_Blacklist_Success";

    //Holiday Module
    public static final String Maintainpg = "Master_Hoilday_Detail";


    //Search Module
    public static final String AdvancedJobSearchPg = "Jobs_Advanced_Search";
    public static final String AdvancedClientSearchPg = "Client_Advanced_Search";
    public static final String AdvancedEmployerSearchPg = "Employer_Advanced_Search";
    public static final String AdvancedCourseSearchPg = "Course_Advanced_Search";
    public static final String ClientSearchResultPg = "Client_Search_Result";
    public static final String ClientSearchResultAdvance = "Client_Search_Result_Advance";
    public static final String ViewAllNotification = "View_All_Notifications";
    public static final String JobSearchResultPg = "Jobs_Search_Result";
    public static final String EmployerSearchResultPg = "Employer_Search_Result";
    public static final String TPSearchResultPg = "TP_Search_Result";
    public static final String CourseSearchResultPg = "Course_Search_Result";
    public static final String EventSearchResultPg = "Event_Search_Result";
    public static final String SearchController = "/portlets/searchResults/SearchResultsController.jpf";
    public static final String IndividualRegController = "/portlets/onlineregistration/OnlineRegistrationController.portlet";
    public static final String SelectedItemsController = "/portlets/selectedItems/SelectedItemsController.jpf";
    public static final String IndividualList = "individualList";
    public static final String EmployerList = "emplyrList";
    public static final String DownloadList = "downloadList";
    public static final String JobList = "jobList";
    public static final String TPList = "tpList";
    public static final String CourseList = "courseList";

    /*Leads-mgmnt CR changes by Kiran K on 25-02-2016 --Start */
    public static final String ListBasicAdvisoryPg = "List_Basic_Advisory_Pg";
    /*Leads-mgmnt CR changes by Kiran K on 25-02-2016 --End */

    //public static final String AssessmentXMLPath = "//klcfps001/WDA-ICMS/WDA_Upload/xml/assesment.xml";
    //public static final String FilepathUploadDocument = "D:/Naga/ICMSFolder/";
    //JPM Module
    public static final String CreateReferralsPg = "Create_Referral";
    public static final String CreateJobReferral = "Create_JobReferral";
    public static final String CreateAdhocJobReferralPg = "Create_Adhoc_Jobreferrals";
    public static final String CreateAdhocJobReferralConfirmPg = "Create_AdhocjobReferral_Confirm";
    public static final String CreateAdhocJobReferralSuccessPg = "Create_AdhocjobReferral_Success";
    public static final String ViewJobReferralsPg = "View_Job_Referral";
    public static final String ListJobReferralsPg = "List_Job_Referral";
    public static final String ViewadhocjobDetailsPg = "View_AdhocJob_Details";
    public static final String ViewadhocjobreferralPg = "View_AdhocJob_Referals";
    public static final String VoidadhocjobreferalsPg = "Void_AdhocJob_Referal";
    public static final String VoidJobReferralsPg = "Void_Job_Referral";
    public static final String JobReferralConfirmPg = "Job_Referral_Confirm";
    public static final String JobRefStatusUpdatePg = "JobRef_Status_Update";
    public static final String ScreeningJobRefbyESCPg = "Screening_JobRef_by_ESC";
    public static final String AdvSearchFromSearchController = "/portlets/referral/ReferralController.jpf";
    public static final String UpdateReferralController = "/portlets/referral/UpdateReferral/UpdateReferralController.jpf";
    public static final String JPMAction = "JPMAction";

    public static final String referralDirect = "1";
    public static final String referralAdhoc = "2";
    public static final String CreateAdhocJobReferral = "Create_AdhocJobReferral";
    public static final String AmendAdhocJobReferral = "Amend_AdhocJobReferral";
    public static final String ViewAdhocJobDetail = "View_Adhoc_Job_Detail";
    public static final String AmendAdhocJobReferralsPg = "Amend_Adhoc_JobReferral";
    public static final String AmendAdhocJobReferralsAck = "Amend_Adhoc_JobReferral_Ack";

    public static final String VoidJobReferralAction = "VoidJobReferral";
    public static final String UpdateJobReferralAction = "VoidJobReferral";
    public static final String ActionPlanLookupController = "/portlets/ActionPlanPopUp/ActionPlanPopUp.jpf";
    public static final String ModifyEventCreateController = "/portlets/portlets/rem/RecruitmentEventController.jpf";

    //Update Referral Status
    public static final String DeclinedJobReferral = "18";
    public static final String UncontactableForUpdate = "21";
    public static final String Shortlisted = "22";
    public static final String DidNotTurnUpInterview = "23";
    public static final String DeclinedJobOffer = "24";
    public static final String ReferredToEmployer = "19";
    public static final String AcceptedJobOffer = "25";
    public static final String VoidJobReferral = "8";
    public static final String DidNotTurnUpWork = "26";
    public static final String Unsuccessful = "101";
    public static final String SuccessfullyPlaced = "27";

    //Added by sumalatha: Production issue : 1137607
    public static final String DeclinedTrngRef = "28";
    public static final String DidNotStartTrng = "36";
    //End

    public static final String FOJ = "40";
    public static final String UncontactableForInterview = "41";
    public static final String DeclinedInterview = "42";
    public static final String VacancyFilled = "20";
    public static final String ReasonOthers = "318004";
    public static final String PendingScrutiny = "70";
    public static final String NotShortListedForInterview = "69";
    public static final String ReferralStatusClosed = "9";
    public static final String ModOfAlert_EMail = "307001";
    public static final String ModOfAlert_SMS = "307002";
    public static final String ModOfContact_Mail = "711";
    public static final String ModOfContact_WalkIn = "713";
    public static final String ModOfContact_Email = "63";
    public static final String ModOfContact_Fax = "64";
    public static final String ModOfContact_Tel = "201";
    public static final String ModOfContact_FaceToFace = "204";
    public static final String SMSAlert = "307001";
    public static final String EmailAlert = "307002";
    public static final String ViewReferralTransactionType = "82009";
    public static final String JobDetailsPg = "JobDetailsPage";
    public static final String EmployerDetailsPg = "EmpDetailsPage";
    public static final String IndividualDetailsPg = "IndDetailsPage";
    public static final String JobReferralDetailsPg = "JobRefDetailsPage";

    public static final String JRL_JobReady = "179";
    public static final String JRL_NotJobReady = "180";
    public static final String JRL_Minimal = "181";
    //Ad-Hoc Update Referral Status Module
    public static final String AdHocJobRefStatusUpdatePg = "AdHoc_Job_Referral_Status_Update";
    public static final int MatureAge = 40;

    //Default Values
    public static final int DefaultPageSize = 5;

    //TCA Common JSP Error Page
    public static final String TCAJSPErrorPg = "/resources/jsp/TCAError.jsp";

    //add by fujun for double submit
    public static final String DoubleSubmitPg = "/resources/jsp/DoubleSubmitError.jsp";

    // Job Posting
    public static final int Active = 1;
    public static final int Checked = 3;
    public static final String CheckedValue = "TRUE";
    public static final String UncheckedValue = "False";
    public static final String tier1 = "309001";
    public static final String tier2 = "309002";
    public static final int Spoken_and_Written = 7;
    public static final int Spoken_Only = 5;
    public static final int Written_Only = 6;
    public static final int English = 58;
    public static final int Mandarin = 59;
    public static final int Malay = 60;
    public static final int Tamil = 61;
    public static final int Others = 62;
    public static final String EmpFulltime = "37";
    public static final String EmpParttime = "38";
    public static final String EmpPermenant = "78001";
    public static final String EmpContractual = "78002";
    public static final String TempAssgnmnt = "78003";
    public static final String empOddCasual = "78004";
    public static final String Freelance = "78005";
    public static final String flexi = "78006";
    public static final String HomeBased = "78007";
    public static final String SelfEmp = "78008";
    public static final String Null = "";

    // Strike and Sanction created by: Raju Garaga
    public static final String sanRequest = "1200";
    public static final String earlySanTermRequest = "1201";

    public static final String approved = "6";
    public static final String rejected = "7";
    public static final String notSupported = "88";
    public static final String pendingSupportOfficr = "86";
    public static final String pendingApprovOfficr = "87";
    public static final String TriningSancioned = "90";
    public static final String EmploymentSancioned = "91";
    public static final String sanctionTrainingServicesCD = "40001";
    public static final String sanctionEmploymentServicesCD = "40002";
    public static final String APPROVE_OFFICER_ROLE = "APPROVING OFFICER";
    public static final String SUPPORTING_OFFICER_ROLE = "SUPPORTING OFFICER";
    //Selected Item
    public static final String SelectedEmployerObject = "employer";
    public static final String SelectedIndividualObject = "individual";
    public static final String SelectedJobObject = "job";
    public static final String SelectedTrainingObject = "tp";
    public static final String SelectedCourse = "crs";
    public static final String SelectedEvent = "event";


    // public static List<RecruitmentEventVO> eventSelectedList = new ArrayList<RecruitmentEventVO>();
    public static final String SelectedNRIC = "nric";

    //Advance Job Search
    public static final String AdvanceJobSearch = "Jobs_Advanced_Search";
    public static final String BasicJobSearch = "Jobs_Search_Result";
    public static final String SearchDBDateFormat = "DD/MM/yyyy";

    // Auto Match Search Results for Job posting to Individual & Individual to Job posting
    public static final String AutoMatchResultsJtoI = "Auto_Match_Results_Job_to_Ind";

    // Auto Match Search Results for Job posting to Individual & Individual to Job posting
    public static final String Automatchresult = "Auto_Match_Results_Job_to_Ind";
    public static final String AutoMatchResultsItoJ = "Auto_Match_Results_Ind_to_Job";
    //public static final String AutoMatchResultsIndividual = "Auto_Match_Results_Individual";

    //CPM Module
    public static final String CPM = "CPM";
    public static final String CreateCompetencyProfilePg = "Create_CompetencyProfile";
    public static final String ModifyCompetencyProfilePg = "Modify_CompetencyProfile";
    public static final String ViewIndividualAssesProfilePg = "View_AssesmentProfile";
    public static final String ViewIndividualAssesHistoryPg = "View_AssesmentHistory";
    public static final String ViewJobPlacemenrHistoryPg = "View_JobPlacementHistory";
    public static final String CPMController = "/portlets/cpm/CompetencyProfileController.jpf";

    public static final String ReAssessProfilePg = "Reassess_Profile";
    // public static final String ViewIndividualProfilePg = "View_IndividualProfile";

    public static final String CPMPageOne = "Family/Financial";
    public static final String CPMPageTwo = "Health";
    public static final String CPMPageThree = "Personal Circumstances";
    public static final String CPMPageFour = "Literacy & Generic Skills Gap";
    public static final String CPMPageFive = "Personal Attributes";

    //Lookup
    public static final String LookupController = "/portlets/popupLookup/LookupController.jpf";
    public static final String IndividualCaseTrackPg = "Individual_Case_Track";
    public static final String BarrierNotExist = "Can't Create Action Plan No Barrier";
    public static final String ICTController = "/portlets/individualtrack/IndividualCaseTrackController.jpf";
    //public static final String AssessmentXMLPath = "//klcfps001/WDA-ICMS/WDA_Upload/xml/assesment.xml";
    //public static final String FilepathUploadDocument = "//klcfps001/wda-icms/";

    //CAM Module
    public static final String CreateAPPg = "Create_ActionPlan";
    public static final String CreateCase = "Create_Case";
    public static final String ModifyAPPg = "Modify_ActionPlan";
    public static final String viewAPPg = "view_action_plan";
    public static final String CAMController = "/portlets/cam/ActionPlanController.jpf";
    public static final String Status1 = "1";
    public static final String hiddenCreate2 = "2";
    public static final String hiddenModify0 = "0";
    public static final String hiddenCreate0 = "0";
    public static final String hiddenModify1 = "1";
    public static final String CopySuccess = "Copy Existing Action Plan SuccessFully";
    public static final String AutoMatchResultsJobtoInd = "Auto_Match_Results_Job_to_Ind";
    public static final String AutoMatchResultsIndividual = "Auto_Match_Results_Individual";
    public static final String AutoMatchResultsEmployer = "Auto_Match_Results_Employer";
    public static final String ApplyforjobIndividual = "Apply_Job";
    public static final String ApplyforjobAck = "Apply_Job_Ack";
    public static final String ApplyJobWithCvrLetter = "Apply_With_Cover_Letter";
    public static final String ShortListforIndividual = "Short_List_for_Individuals";
    public static final String ShortListforIndividualSuccess = "Short_List_for_Individuals_Success";
    public static final String UpdatePlacementDetails = "Update_Placement_Details";
    public static final String Status_Checked = "3";
    public static final String Status_Unchecked = "4";
    public static final String FollowupSts_Reslove = "67";
    public static final String FollowupSts_InProg = "79";
    public static final String Recmmndtn_Status = "Active";
    public static final String Classification_Null = "NA";
    public static final String PDF_CAM = "CAM-GenerateLetter";
    public static final String ActionPlan_DisCont = "Discontinued";
    public static final String ActionPlan_Close = "Closed";
    public static final String Case_Description = "MP Case";
    public static final String Min_Case_Description = "Minimal Case";
    //DRM CR PROD Release
    public static final String CASE_EMPLOYMENT_PURPOSE_VIST_CD = "528002";


    // Manage Criteria for Job posting to Individual & Individual to Job posting
    public static final String ManageCriteriaIndividualtoJobs = "Manage_Criteria_Individual_to_Jobs";
    public static final String ManageCriteriaJobstoIndividual = "Manage_Criteria_Jobs_to_Individual";
    public static final String PreviewIndtoJob = "Preview_IndtoJob";
    public static final String PreviewJobtoInd = "Preview_JobtoInd";

    //CLPM Module
    public static final String CreatePlacementDetailsFOJPg = "Create_Placement_Details_FOJ";
    //Start:List Upload Placement CR by Suresh on 31-Aug-2017
    public static final String ListUploadedPlacementPg = "List_Uploaded_Placement_PG";
    public static final String ListUploadedCategories = "List_Uploaded_Categories";
    //End:List Upload Placement CR by Suresh on 31-Aug-2017
    public static final String CreatePostPlacementPg = "Create_Post_Placement";
    public static final String ModifyPostPlacementPg = "Modify_Post_Placement";
    public static final String ViewPostPlacementPg = "View_Post_Placement";
    public static final String CLPMController = "/portlets/clpm/ClientProgressController.jpf";
    public static final String CLPMNotificationTransactionType = "82010";
    public static final String CLPMDefaultSalary = "0";
    //Added by sumalatha for List Placements
    public static final String ListPlacementsPg = "List_Placement_pg";

    /*Session names used between CLPM and Individual Case Track page*/
    public static final String CLPM_INDVCSTRCK_SESSION_PLCMNTID = "postPlcmntId";
    public static final String CLPM_INDVCSTRCK_SESSION_SCHDTID = "schdDtId";
    public static final String CLPM_INDVCSTRCK_SESSION_FORM_INDVD = "Individual";

    //Duty Roster Module
    public static final String CreateDutyRosterPg = "Create_DutyRoster";
    public static final String ModifyDutyRosterPg = "Modify_DutyRoster";
    public static final String ViewDutyRosterPg = "View_DutyRoster";
    public static final String ViewDutyRosterMonthPg = "View_DutyRosterMonth";
    public static final String DownloadDutyRosterPg = "Download_DutyRoster";

    //Assistance Request Management Module
    public static final String CreateCCApptPg = "Create_CCAppt";
    public static final String ListCCApptPg = "List_CCAppt";
    public static final String ReassignCCApptPg = "Reassign_CCAppt";
    public static final String UpdateCCApptStatusPg = "Update_Status";
    public static final String AvailableCCStatusPg = "AvailableCC_Status";
    public static final String Ind_AssessmentPg = "Ind_Assessment";
    public static final String CancelCCApptPg = "Cancel_CCAppt";
    public static final String CreateCATApptPg = "Create_CATAppt";
    public static final String ListCATApptPg = "List_CATAppt";
    public static final String CancelCATApptPg = "Cancel_CATAppt";
    public static final String ViewCCApptPg = "View_CCAppt";
    public static final String ViewCATApptPg = "View_CATAppt";
    public static final String ModifyCCApptPg = "Modify_CCAppt";
    public static final String ModifyCATApptPg = "Modify_CATAppt";
    public static final String CCAppointmentController = "/portlets/ccappt/CCAppointmentController.jpf";
    public static final String DutyRosterController = "/portlets/drm/DutyRosterController.jpf";
    public static final String CATAppointmentController = "/portlets/catappt/CATAppointmentController.jpf";
    public static final String Package1 = "304001";
    public static final String Package2 = "304002";

    //Login Module
    public static final String TCALandingPg = "TCALanding_Page";
    //public static final String TCALandingPg = "View_Course";
    public static final String TCALandingPgRedirect = "/TCAPortal.portal?_nfpb=true&_pageLabel=TCALanding_Page";
    public static final String TCAAuthenticationPg = "TCA_Authentication";

    //REM Module

    public static final String CreateEventESCPg = "Create_Event_ESC";
    public static final String ListRecruitmentEventPg = "List_Recruitment_Event";
    public static final String MonthlyRecruitmentEventPg = "Monthly_Recruitment_Event";
    public static final String ViewRecruitmentEventPg = "View_Recruitment_Event";
    public static final String EventsCheckinPg = "Event_Checkin";
    public static final String CopyToEventPg = "Copy_To_Event";
    public static final int EVENTDAYS = 7;
    public static final int EVENTMONTHDAYS = 31;
    //Production Defect:IPI-97
    /* public static final String CreateEventPg = "Create_Event";*/
    public static final String EventChecklistPg = "Event_Checklist";
    public static final String ModifyEventPg = "Modify_Event";
    public static final String AmendEventPg = "Amend_Event";
    public static final String CopyEventPg = "Copy_Event";
    public static final String PreviewEventPg = "Preview_Event";
    public static final String ModifyPreviewEventPg = "Modify_Preview_Event";
    public static final String ViewEventsListPg = "Events_List";
    public static final String ViewEventPg = "Event_View";
    public static final String ViewEventDetailPg = "Event_Detail";
    public static final String previewEvent = "Preview_Create";
    public static final String REMController = "/portlets/rem/RecruitmentEventController.jpf";
    public static final String REMListController = "/portlets/remlist/RecruitmentEventListController.jpf";
    public static final String FileUploadController = "/portlets/fileupload/FileuploadController.jpf";
    public static final String EventCheckinPg = "Event_AppCheckin";
    public static final String CreateEventJobReferalPg = "CreateEventJobReferal";
    public static final String Registered = "80";
    public static final String AcceptedInvitation = "81";


    public static final String InviteIndividualsPg = "Invite_Individual";
    public static final String InviteEmployersPg = "Invite_Employer";
    public static final String InviteTrningProvsPg = "Invite_TrningProv";
    public static final String InvitedIndiviPg = "Invited_IndividualList";
    public static final String InvitedEmployerPg = "Invited_EmployerList";
    public static final String InvitedTPPg = "Invited_TpList";
    public static final String InviteIndActPlanPg = "Invite_ActionPlan";
    public static final String InviteClientPg = "Invite_Client";


    public static final String RegisterIndividualsPg = "Register_Individual";
    public static final String RegisterEmployersPg = "Register_Employers";
    public static final String RegisterTrningProvsPg = "Register_TrningProv";

    public static final String ViewEmployrEvntListPg = "View_EmployerEvntList";
    public static final String ViewIndvdlEvntListPg = "View_IndvdlEvntList";
    public static final String InviteIndividualController = "/portlets/reminvite/RemInviteController.jpf";
    public static final String InviteEmployerController = "/portlets/reminvite/RemInviteController.jpf";
    public static final String InviteTraingProviderController = "/portlets/reminvite/RemInviteController.jpf";
    public static final String IndividualAdvanceSearchController = "/portlets/search/SearchController.jpf";
    public static final String InvitedIndividualEventController = "/portlets/reminvite/RemInviteController.jpf";
    public static final String InvitedEmplyerEventController = "/portlets/reminvite/RemInviteController.jpf";
    public static final String InvitedTrnProvdrEventController = "/portlets/reminvite/RemInviteController.jpf";
    public static final String RegisterIndividualEventController = "/portlets/remregistration/RemRegistrationController.jpf";
    public static final String RecruitmentEventListController = "/portlets/remlist/RecruitmentEventListController.jpf";


    public static final String InviteIndividualPg = "Invite_Individual";
    public static final String InviteEmployerPg = "Invite_Employer";
    public static final String InviteTrningProvPg = "Invite_TrningProv";
    public static final String EventRegistration = "Event_Registration";


    public static final String RegisterIndividualListController = "/portlets/remregistration/RemRegistrationController.jpf";
    public static final String RegisterEmplyerListController = "/portlets/remregistration/RemRegistrationController.jpf";
    public static final String RegisterTrnProvdrListController = "/portlets/remregistration/RemRegistrationController.jpf";

    //REM Screens
    public static final String REM_SCREEN_TITLE_ADD_JOB = "Add Job";
    public static final String REM_SCREEN_TITLE_ADD_EMPLOYER = "Add Employer";
    public static final String REM_SCREEN_TITLE_ADD_TRAINING_PROVIDER = "Add Training Provider";
    public static final String REM_CREATE_EVENT_PAGE = "Create Recruitment Event by ESC";
    public static final String REM_SCREEN_TITLE_VIEW_JOB_DETAILS = "View Job Details";
    public static final String REM_SCREEN_TITLE_VIEW_EMPLOYER_DETAILS = "View Employer Details";
    public static final String REM_SCREEN_TITLE_VIEW_RECRUITMENT_EVENT = "View Recruitment Event";
    public static final String REM_SCREEN_TITLE_VIEW_RECRUITMENT_EVENTS_LIST = "List Recruitment Events";
    public static final String REM_SCREEN_TITLE_VIEW_RECRUITMENT_EVENTS = "View Recruitment Events";
    public static final String REM_SCREEN_TITLE_INVITE_CLIENT = "Invite Clients to Event";
    public static final String View_Recruitment_EventCheckin = "Event Checkin View";
    //Admin Module
    public static final String CreateCategoryPg = "Create_Category";
    public static final String ModifyCategoryPg = "Modify_Category";
    public static final String ViewCategoryDetailPg = "View_CategoryDetail";
    public static final String ViewCategoryListPg = "View_CategoryList";
    public static final String ListRoles = "View_ListRoles";
    public static final String Listmstr = "View_Mstr";
    public static final String CreateMasterDataPg = "Create_MasterData";
    public static final String ModifyMasterDataPg = "Modify_MasterData";
    public static final String ViewMasterDataDetailPg = "View_MasterDataDetail";
    public static final String ViewMasterDataListPg = "View_MasterDataList";
    public static final String CreateNotificationPg = "Create_Notification";
    public static final String ModifyNotificationPg = "Modify_Notification";
    public static final String ViewNotificationDetailPg = "View_NotificationDetail";
    public static final String ViewNotificationListPg = "View_NotificationList";
    public static final String CreateCDCPg = "Create_CDC";
    public static final String AddCCTimingSlots = "Add_CC_Timing_Slots";
    public static final String ModifyCDCPg = "Modify_CDC";
    public static final String ViewCDCDetailPg = "View_CDCDetail";
    public static final String ViewCDCListPg = "View_CDCList";
    public static final String AddIndustry = "Add_Industry";
    public static final String AmendAppParamErr = "Ammend_App_Param_Err";

    //Added by RAVI for 2FA CR on 19-Jul-2017
    public static final String ManageUserRoles = "Manage_User_Role_2FA";

    //Added by NaveenKumarA, for ICMSEnhancements for CMP Phase III CR, on 11-OCT-2017
    public static final String ListParameterGroups = "List_Parameter_Groups";

    //Feedback
    public static final String ViewFeedbackListPg = "View_FeedbackList";
    public static final String ViewFeedbackDetailPg = "View_feedbackDetail";
    public static final String TriggerEmpFeedbackPg = "Trigger_EmpFeedback";
    public static final String TriggerRecEventFeedbackPg = "Trigger_RecEventFeedback";
    public static final String SubmitEmployerFeedbackPg = "Submit_EmpFeedback";
    public static final String SubmitRecEventFeedbackPg = "View_RecEventFeedback";
    public static final String AmendFeedbackPg = "Modify_Feedback";
    public static final String ListFeedbackTemplatePg = "View_FeedbackTemplateList";
    public static final String ViewFeedbackTemplatePg = "View_FeedbackTemplate";

    //Success story
    public static final String GenerateSuccessStoryPg = "Generate_SuccessStory";
    public static final String GenerateSuccStory = "GenerateSuccStory";
    public static final String SuccessStoryController = "/portlets/successstory/SuccessStoryController.jpf";
    public static final String FilepathUploadDocument_Sucess = "D:/successstory";
    //Client Portal
    public static final String TrngRefController = "/portlets/trainingReferral/TrainingReferralController.jpf";
    public static final String TrngRefAdhocController = "/portlets/trainingReferralAdhoc/TrainingReferralAdhocController.jpf";
    public static final String TraningRef360Page = "/portlets/trainingReferral360page/TrainingReferral360pageController.jpf";
    public static final String OnlineRegController = "/portlets/onlineregistration/OnlineRegistrationController.jpf";
    public static final String PortalController = "/portlets/IndividualPortal/IndividualPortalController.jpf";
    public static final String IndividualRegistration = "Create_Ind_Profile";
    public static final String AccessRestricted = "Access_Restricted";
    public static final String ViewMyProfile = "View_My_Profile";
    public static final String EditMyProfile = "Edit_My_Profile";
    public static final String ViewTrngDetails = "View_Trng_Details";
    public static final String BrowseCourses = "Browse_Courses";
    public static final String CourseDirectory = "Course_Directory";
    public static final String RegHome = "Reg_Home";
    public static final String Portal_Logout = "Portal_Logout";
    public static final String Test_Page = "Test_Page";
    public static final String IndividualLandingPg = "IndividualLandingPg";
    /*Changed the URL by Priyanka on 21/09/2016 for Re-Org CR*/
    public static final String PortalMarketingPage = "http://www.ssg-wsg.gov.sg";


    public static final String TrngReferralList = "List_Training_Referrals";
    public static final String TrngReferral360 = "Training_Referral_360";
    public static final String TrngReferralAdhoc = "Training_Referral_Adhoc";

    //Start:List Upload Placement CR by Suresh on 31-Aug-2017
    //CLPM Screens
    public static final String CLPM_SCREEN_TITLE_UPLOAD = "Upload Individuals Placement";
    public static final String CLPM_SCREEN_TITLE_LIST_UPLOAD = "List Placement Uploads";
    public static final String FLUPLD_SCREEN_TITLE_LIST_UPLOAD = "List Uploaded Categories";
    public static final String FLUPLD_SCREEN_TITLE_LIST_CAT_UPLOAD = "List Category Uploads";
    public static final String FLUPLD_SCREEN_SCREEN_TITLE_UPLOAD = "Upload Category Data";
    //End:List Upload Placement CR by Suresh on 31-Aug-2017
    public static final String ClientRegistration = "Individual_Registration";
    public static final String IndividualProfileUpdation = "Individual_Profile_Updation";
    public static final String IndividualProfileUpdationSuccessPg1 = "Individual_Profile_Updation_Success_page1";
    public static final String IndividualProfileUpdationSuccessPg2 = "Individual_Profile_Updation_Success_page2";
    public static final String IndividualProfileUpdationSuccessPg3 = "Individual_Profile_Updation_Success_page3";
    public static final String IndividualProfileUpdationSuccessPg4 = "Individual_Profile_Updation_Success_page4";
    public static final String IndividualProfileUpdationSuccessPg5 = "Individual_Profile_Updation_Success_page5";
    public static final String IndividualProfileUpdationSuccessPg6 = "Individual_Profile_Updation_Success_page6";
    public static final String IndProfile = "65003";
    public static final String ViewIndividualProfilePg = "View_Individual_ProfilePg";
    public static final String ONREG_SEARCHRESULT_SESSION_NRIC = "Nric";
    public static final String IndividualCreateSuccess = "Individual_Reg_Success";
    public static final String EventCheckInFromReg = "EventCheckInFrom_Reg";
    //Added by sumalatha: Lead CR (Light Registration Update)
    public static final String IndividualProfileUpdationSuccessPg1Light = "Individual_Profile_Updation_Success_page1_Light";
    public static final String IndividualProfileUpdationLight = "Individual_Profile_Updation_Light";

    //Training Management
    public static final String TrainingProviderController = "/portlets/tm/TrainingManagementController.jpf";
    public static final String CreateTrainingProvider = "Create_Training_Provider";
    public static final String ViewTrainingProvider = "View_Training_Provider";
    public static final String ViewTrainingProviderDetails = "View_Training_Provider_Details";
    public static final String ViewTrainingReferrals = "View_Training_Referrals";
    public static final String ViewGrantEnquiryAndPaymentReceipt = "Grant_Enquiry_And_Payment_Receipt";
    public static final String AmendTrainingProvider = "Amend_Training_Provider";
    public static final String AmendTrainingProviderSCN = "Amend_Training_Provider_SCN"; //Added by Manivannan for ICMS Phase II
    public static final String AmendTrainingReferral = "Amend_Training_Referral";
    public static final String ReScheduleTrainingReferral = "Reschedule_Training_Referral";
    public static final String UploadCourseDetails = "Upload_Course_Details";
    public static final String UploadTPDetails = "Upload_TP_Details";
    public static final String UploadCourseSchedule = "Upload_Course_Schedule";
    public static final String ViewCourseSchedule = "View_Course_Schedule";
    public static final String AmendCourseSchedule = "Amend_Course_Schedule";
    public static final String SelectIndividualTrainingReferral = "Select_Individual_Training_Referral";
    public static final String UploadAttendancePG = "Upload_Attendance";
    public static final String ViewAttendancePG = "View_Attendance";
    public static final String UploadAssessmentRecords = "Upload_Assesment_Records";
    public static final String UploadReassessmentRecords = "Upload_Reassesment_Records";
    public static final String ConfirmTrainingReferral = "Confirm_Training_Referral";
    public static final String ViewAssessmentRecords = "View_Assessment_Records";
    public static final String AmendAssessmentRecord = "Amend_Assessment_Record";
    public static final String AdvancedCourseSearch = "Advanced_Course_Search";

    //PGM
    public static final String DiscFundController = "/portlets/discretionaryFund/DiscretionaryFundController.jpf";
    public static final String PaymentsGrantController = "/portlets/pgm/PaymentsGrantController.jpf";
    public static final String UtilisationMonitoring = "Utilisation_Monitoring";
    public static final String requestforDiscretionaryFundApproval = "request_Discretionary_Fund_Approval";
    public static final String requestforDiscretionaryFundApprovalSuccess = "request_Discretionary_Fund_Approval_Success";
    public static final String approveDiscretionaryFund = "approve_Discretionary_Fund";
    public static final String approveDiscretionaryFundSuccess = "approve_Discretionary_Fund_Success";
    public static final String dfCloseApprovalStatus = "dfClose_Approval_Status";
    public static final String ApprovedCode = "6";
    public static final String Approvedstatus = "Approved";
    public static final String Rejectedstatus = "Rejected";

    //User Management Module
    public static final String CreateUserPg = "Create_User";
    public static final String ModifyUserPg = "Modify_User";
    public static final String ViewUserDetailPg = "View_UserDetail";
    public static final String ViewUserListPg = "View_UserList";
    public static final String ProfileUpdatePg = "Profile_Update";
    public static final String ChangePasswordPg = "Change_Password";
    public static final String MyCalendarPg = "MyCalendar";

    //Course
    public static final String CourseController = "/portlets/course/CourseController.jpf";
    public static final String CreateCourse = "Create_Course";
    public static final String UploadCourse = "Upload_Course";
    public static final String ViewCourse = "View_Course";
    public static final String ViewCourseDetail = "ViewCourse_Detail"; // CS: add to portlet
    public static final String AmendCourse = "Amend_Course";
    public static final String CourseUploadType = "310003"; //Map to Entity table
    public static final String CourseScheduleUploadType = "310004"; //Map to Entity table
    public static final String TPUploadType = "310007"; //Map to Entity table
    public static final String COURSE_ADV_COURSESEARCH_SESSION_COURSEFORM = "FormCourseAdvancedSearch";
    public static final String DutyRosterUploadType = "310001";
    public static final String UploadProcessingFile = "drm.uploadProcessFile";
    public static final String LoadAmendDutyRoster = "drm.loadDutyRoster";
    public static final String LoadDutyRosterMonth = "drm.loadMonth";
    public static final String LoadCDCTime = "drm.loadCDCTime";
    public static final String LoadCDCTimeDetails = "drm.loadCDCTimeDetails";
    public static final String AmendDutyRoster = "drm.amendDutyRoster";
    public static final String GetOfficerFromCDC = "drm.getOfficersBasedOnCDC";
    public static final String GetPendingDutyRosterSchedular = "drm.getDutyRosterUploadFile";
    public static final String OfficerCode = "officerCode";
    public static final String CareerCentreCode = "careerCentreCode";
    public static final String DutyRosterMonth = "dutyRosterMonth";
    public static final String DutyRosterYear = "dutyRosterYear";
    public static final String DutyRosterCreatedBy = "dutyRosterCreatedBy";
    public static final String LoginUserId = "loginUserId";
    public static final String DutyRosterStartDate = "dutyRosterStartDate";
    public static final String DutyRosterEndDate = "dutyRosterEndDate";
    public static final String YES_INDICATOR = "Y";
    public static final String NO_INDICATOR = "N";
    public static final int DUTYROSTERDAYS = 7;
    public static final int DUTYROSTERMONTHDAYS = 31;
    public static final String FIRST_PAGE_IND = "FirstPage";
    public static final String NEXT_PAGE_IND = "NextPage";
    public static final String PREV_PAGE_IND = "PrevPage";
    public static final String ADDDATE = "ADD";
    public static final String REMOVEDATE = "REMOVE";
    public static final String SAVE = "SAVE";
    public static final String SAVESUCCESS = "SaveSuccess";
    public static final String FileUploadNewStatus = "5";
    public static final String FileUploadSuccessStatus = "50";
    public static final String FileUploadFailureStatus = "51";
    public static final String RESET = "RESET";
    public static final String GetUploadFile = "common.getUploadFile";
    public static final String ICSMDataSource = "ICMSDS";
    public static final String CONTEXT_URL = "t3//localhost:7001";
    public static final String CONTEXT_FACTORY = "weblogic.jndi.WLInitialContextFactory";
    public static final String GetCDCFromDesc = "drm.getCDCDetails";
    public static final String CreateDutyRoster = "drm.createDutyRoster";
    public static final String ACTIVE_INDICATOR = "1";
    public static final String INACTIVE_INDICATOR = "0";
    public static final String DASHBOARD_DRM_CREATE = "82019";
    public static final String DASHBOARD_COURSE_SCHEDULE_CREATE = "82031"; //Map to Entity table
    public static final String DASHBOARD_COURSE_CREATE = "82030"; //Map to Entity table
    public static final String UpdateUploadFile = "common.updateUploadFile";
    public static final String UploadCourseFileFirstName = "COURSE";
    public static final String UploadClassFileFirstName = "CLASS";
    public static final String UploadTPFileFirstName = "TP";

    /*Start: By Suresh Upload Parameters CR on 16-Oct-2017 */
    public static final String UPLOAD_CATEGORIES_CODE = "310009";
    public static final String UPLOAD_PLCMNT_CODE = "310008";
    public static final String UPLOAD_PLCMNT_FILE_DESCR = "PLACEMENT";
    public static final String UPLOAD_CATEGORIES_FILE_DESCR = "CATEGORIES";
    public static final String UPLOAD_PLCMNT_FILE_NAME = "PLACEMENT_DD-MMM-YYYY.xls";
    public static final String UPLOAD_CATEGORIES_FILE_NAME = "CATEGORIES_DD-MMM-YYYY.xls";
    /*End: By Suresh Upload Parameters CR on 16-Oct-2017 */
    public static final String ACTIVE_STATUS = "1";


    //Client Portal
    public static final String ONREG_SEARCHRESULT_SESSION_RECNUM = "RecNumber";
    public static final String ONREG_SEARCHRESULT_SESSION_TYPECDTWO = "TypeCdTwo";


    //Apply for Job
    public static final String ApplyForJobController = "/portlets/applyforjob/ApplyforJobController.jpf";

    //CAM PDF Generate Letter
    public static final String PDFController = "/portlets/pdf/PDFController.jpf";

    //DashBoard Message
    public static final String CreateEmployerMessage = "has been registered into ICMS";
    public static final String CreateBlackListEmployerMessage = "has been blacklisted";
    public static final String updateReferralStatusDecline = " has declined interview for ";
    public static final String updateReferralStatusVacancy = " Vacancy is filled for ";
    public static final String updateReferralStatusNotShortlisted = " is not shortlisted for interview for job  ";
    public static final String updateReferralStatusNotShortlisted2 = "  Please follow up.";
    //DashBoard URL
    public static final String CreateEmployerDBoardURL = "http:\\test";
    public static final String updateReferralStatusURL = "http:\\test";
    public static final String CreateBlackListEmployerDBoardURL = "http:\\test";

    //Login Module
    public static final String LoginPg = "ICMS_LoginPage";
    public static final String LogoutPg = "ICMS_LogoutPage";
    public static final String PortalLogoutPg = "http://www.google.com";
    public static final String AmendDutyRosterTransactionType = "82020";
    public static final String TimeslotChanges = "Please note that your working time slot on ";
    public static final String ChangedTo = " is changed to ";

    //Intray

    public static final String IntrayListPg = "Intray_List";

    public static final String IntrayController = "/portlets/myintray/MyInTray.jpf";
    public static final String SanctionTransactionType = "82039";

    public static final String ScheduleCancelTransactionType = "82070";
    public static final String TmBlackListTransactionType = "82071";

    // TM Assessment Upload
    public static final String AssessmentUploadType = "310005"; //Map to Entity table
    public static final String ReassessmentUploadType = "310006"; //Map to Entity table

    public static final String AssessmentUploadFileFirstName = "ASSESSMENT";

    // REM
    public static final String WithInCenter = "55001";
    public static final String AllCenter = "55002";
    public static final String PublicCenter = "55003";
    public static final String E2i = "54001";
    public static final String CentralSingapore = "54002";
    public static final String NorthEast = "54003";
    public static final String NorthWest = "54004";
    public static final String SouthEast = "54005";
    public static final String SouthWest = "54006";
    public static final String Flyer = "51001";
    public static final String Radio = "51002";
    public static final String Workers = "52002";
    public static final String PMET = "52001";
    public static final String RankAndFile = "11002";
    public static final String PME = "11001";
    public static final String JobPair = "50001";
    public static final String WalkInInterview = "50002";
    public static final String IndustryPreview = "50003";
    public static final String JobPreparation = "50004";

    public static final String EventType1 = "Job Fair";
    public static final String EventType2 = "Walk in Interview";
    public static final String EventType3 = "Industry Preview";
    public static final String EventType4 = "Job Preparation Exercise";
    public static final String REMstatus = "1";
    public static final String REMResultstatus = "Active";
    public static final String PublicityFlyers = "Flyers";
    public static final String PublicityRadio = "Radio";
    public static final String PublicityRadio1 = "/ Radio";
    public static final String empty = "";

    public static final String OrganizerE2i = "E2i";
    public static final String OrganizerE2i1 = "/ E2i";
    public static final String OrganizerCentralSg = "Central Singapore";
    public static final String OrganizerCentralSg1 = "/ Central Singapore";
    public static final String OrganizerNorthEast = "North East";
    public static final String OrganizerNorthEast1 = "/ North East";
    public static final String OrganizerNorthWest = "North West";
    public static final String OrganizerNorthWest1 = "/ North West";
    public static final String OrganizerSorthEast = "South East";
    public static final String OrganizerSorthEast1 = "/ South East";
    public static final String OrgrSorthWest = "South West";
    public static final String OrgrSorthWest1 = "/ South West";

    public static final String WthnCtr = "Within centre";
    public static final String WthnCtr1 = "/ Within centre";
    public static final String AllCentre = "All centres";
    public static final String AllCentre1 = "/ All centres";
    public static final String PublicCentre = "Public";
    public static final String PublicCentre1 = "/ Public";

    public static final String TgtPmet = "PMET";
    public static final String TgtWrks = "Workers";
    public static final String TgtWrks1 = "/ Workers";

    public static final String AttchmntCd = "No Attachment";

    public static final String select = "select";
    public static final String ActiveStatus = "1";
    public static final String Completed = "72";
    public static final String Cancelled = "43";
    public static final String IndividualUserTypeCd = "53001";
    public static final String EmployerUserTypeCd = "53002";
    public static final String TPUserTypeCd = "53003";

    public static final String Pending = "74";
    public static final String Accepted = "75";

    public static final String CompletedStatus = "Completed";
    public static final String CancelledStatus = "Cancelled";

    public static final String AmendREMTransactionTypCd = "82013";
    public static final String CreateREMTransactionTypCd = "82012";
    //TM Deactivate Course
    public static final String DeactivateCoursePg = "Deactivate_Course_Pg";

    // TM Attendance Upload
    public static final String AttendanceUploadType = "310002"; //Map to Entity table
    public static final String AttendanceUploadFileFirstName = "ATTENDANCE";

    public static final String FIRSTCOL_INTRO_NOTES = "	a) Refer to the legend at the bottom of the template for reference on the timeslots for AM1, PM1, AM2 and PM2 ##" +
        "	b) For a full day duty roster - CSE to update the slot as either AM1/PM1 or AM2/PM2 ## " +
        " 	c) Please note that only ONE duty roster can be uploaded successfully for the same month. ## " +
        "	d) After the duty roster has been successfully uploaded on ICMS, you can still make changes via the \"Amend Duty Roster\" function ## " +
        "	e) Ensure that all data are entered correctly before uploading this excel file on ICMS ## " +

        "	f) Ensure that only excel files with \".xls\" can be uploaded on ICMS ## ";
    public static final String EmployerProvideFeedback = "Employer_Provide_Feedback";
    public static final String GetValueToFeedBackController = "/portlets/feedback/FeedbackController.jpf";
    public static final String RecuitmentEventFeedback = "Recruitment_Event_Provide_Feedback";

    public static final String EventSufficicent = "Was the information about the event sufficient?";
    public static final String InformationClear = "Was the information clear and concise?";

    public static final String PublicityOfEvent = "Was the publicity on the event sufficient?";
    public static final String ConfirmationOfEvent = "Upon confirmation of the event, was there enough time for preparation?";
    public static final String RateEvent = "Please rate the accessibility of the event venue.";
    public static final String RateLayoutOfEvent = "Please rate the layout of the event venue.(e.g. entrance/exit, arrangement of booth/counters,interview area)";
    public static final String RateProcessAndCoord = "Please rate the process and coordination at the event.(e.g. registration, crowd control, interview section)";
    public static final String RateAdministration = "Please rate on administration and logistics support.";
    public static final String EventPlanned = "Was the event well-planned?";
    public static final String EventMetObjective = "Has the event met your objective?";
    public static final String IntrstedParticipation = "Would you be interested to participate in subsequent events?";
    public static final String ModeOfContact = "What would be your preferred mode of contact";
    public static final String OtherComments = "Other Comments";
    public static final String ProfessionalismOfficer = "Professionalism of officers";
    public static final String EffectCareerCentre = "Effectiveness of the Career Centre as a recruitment channel";
    public static final String AbilityToUnderstand = "Ability to understand your company's recruitment needs";
    public static final String ResponsivenessCareerCentre = "Responsiveness of the Career Centre to your company's recruitment needs";
    public static final String SuitabilityCandidates = "Suitability of candidates referred to your company";
    public static final String ConductOfCandidates = "Conduct of candidates during the interview";

    public static final String AreasPerformedWell = "Please list 3 areas that we have performed well";
    public static final String AreasNeedImprovement = "Please list 3 areas that we need improvement on";
    public static final String ContinueWorkingCareerCen = "Would you like to continue working with the Career Centre for future recruitment needs";
    public static final String IndividualActiveStatus = "N";


    //Environment Specific Params to be modified
/*	 public static final String FilepathUploadErrorDocument = "/mnt/wda/wda-error/";
	 public static final String TEMPPATH = "/mnt/wda/wda-temp/";
	 public static final String AssessmentXMLPath = "/mnt/wda/assesment.xml";
	 public static final String FilepathUploadDocument = "/mnt/wda/wda-icms/";*/
    public static final String ReferralLetterPath = "/mnt/wda/CPMReferralLetterTemplate.docx";
    // public static final String FilepathUploadDocument_Temp = "D:/icms/upload";
    public static final String JBMFileUploadDocument = "/mnt/wda/wda-icms/";
    public static final String JBMFileUploadDocument_Windows = "D:/wda/upload";
    public static final String filepath_checklist_rem = "/mnt/wda/wda-icms/REMChecklist.docx";
    public static final String FilepathUploadDocument_Temp = "D:/icms/upload";

    // STRIKE AND SANCTION
    public static final String createStrikeandSanctionIndPg = "CreateStrikeandSanctionIndividual_Pg";
    public static final String createStrikeandSanctionIndSuccessPg = "Create_StrikeandSanction_Ind_Success_Pg";
    public static final String preTerminateSanctionPg = "PreTerminateSanction_Pg";
    public static final String preTerminateSanctionSuccessPg = "PreTerminateSanction_Success_Pg";
    public static final String viewSanctionList = "View_SanctionList_Pg";
    public static final String StrikeandSanctionController = "/portlets/strikeandsanction/StrikeandSanctionController.jpf";
    public static final String trainingreferralSourcecd = "335002";
    public static final String jobreferralSourcecd = "335001";
    public static final String jobreferral = "jobreferral";
    public static final String trainingreferral = "trainingreferral";
    public static final String main = "main";
    public static final String viewStrikeAndSanction = "viewsanction_pg";
    public static final String sanctionClient = "sanctionClient_pg";
    public static final String errorMsg = "Individual Already Sanction For The Same Next Course of Action.Please Choose Different Value.";
    public static final String List_Sanction = "List_Sanction_pg";
    public static final String VIEW_APPROVAL = "View_Approval_pg";

    // TP BLACKLIST
    public static final String TPBlacklistController = "/portlets/TPBlacklist/TPBlacklistController.jpf";
    public static final String createTPBlacklistpg = "create_TPBlacklist_pg";
    public static final String createTPBlacklistSuccesspg = "create_TPBlacklistSuccess_pg";
    public static final String modifyTPBlacklistpg = "modify_TPBlacklist_pg";
    public static final String modifyTPBlacklistSuccesspg = "modify_TPBlacklistSuccess_pg";
    public static final String preTerminateEmployerBlacklistpg = "preTerminate_Employer_Blacklist_pg";
    public static final String TPBlacklisttypeCD = "53003";

    public static final String TrainingProviderCd = "53003";
    public static final String EmployerCd = "53002";
    public static final String Feedback_StsCode = "1";
    public static final String Feedback_StsCodeTwo = "2";
    public static final String RecEventFeedback = "326002";
    public static final String CarCentreFeedback = "326001";
    public static final String Question = "Enter feedback question";
    public static final String NewSection = "Enter section title";
    public static final String GeneralServices = "328005";
    public static final String ReferralsOfCandidates = "328006";
    public static final String GeneralFeedback = "328007";

    public static final String BeforeEvent = "328001";
    public static final String DuringEvent = "328002";
    public static final String AfterEvent = "328003";
    /*Start - Pagination dropdown changes, modified by Vinay/Srinivasa on 09Jun2015*/
    public static final String PageSize = "20";
    /*End - Pagination dropdown changes, modified by Vinay/Srinivasa on 09Jun2015*/

    public static final String VerNum = "1";
    /*Changed the URL by Priyanka on 21/09/2016 for Re-Org CR*/
    public static final String WebSite = "www.ssg-wsg.gov.sg";
    public static final String TransactionType = "82026";
    public static final String CareerCentreServices = "Career Centre Services";
    public static final String RecruitmentEvent = "Recruitment Event";
    public static final String TypeofInput = "Select type of input";

    //for Feedback module
    public static final String fmCheckbox = "cb";
    public static final String fmDropdown = "dd";
    public static final String fmRadiobutton = "rb";
    public static final String fmTextfield100 = "tf100";
    public static final String fmTextarea500 = "ta500";

    public static final Map<String, String> feedbackInputControlMap = new LinkedHashMap<String, String>();

    static {
        feedbackInputControlMap.put("", "Select");
        feedbackInputControlMap.put(fmCheckbox, "Check Box");
        feedbackInputControlMap.put(fmDropdown, "Dropdown");
        feedbackInputControlMap.put(fmRadiobutton, "Option Button");
        feedbackInputControlMap.put(fmTextfield100, "Text Field");
        feedbackInputControlMap.put(fmTextarea500, "Text Area");
    }

    public static final String SourceVal = "10";
    public static final String SourceValOne = "1";
    public static final String NotApplicable = "Not Applicable";
    public static final String DateFormat = "dd-MMM-yyyy";
    public static final String Success = "success";
    public static final String WplnCatScoresVal = "wplnCatScoresVal";
    public static final String EducationLevelInfo = "educationLevelInfo";
    public static final String ClientTrng = "clientTrng";
    public static final String PreviousExperience = "preExper";
    public static final String ProfileInfo = "profileInfo";
    public static final String PrepTraining = "prepTraining";
    public static final String VactionTraining = "vactionTraining";
    public static final String JobReferral = "jobReferral";
    public static final String Feedback = "feedback";
    public static final String PlcmntDetails = "plcmntDetails";
    public static final String SuccStryTabValList = "succStryTabValList";
    public static final String DescAssistance = "descDescAssistance";
    public static final String YES = "Yes";
    public static final String NO = "No";
    public static final String IndividualId = "IndividualId";
    public static final String FeaturedBfrInd = "FeaturedBfrInd";
    public static final String FeaturedBfr = "FeaturedBfr";
    public static final String Remarks = "Remarks";
    public static final String SuccessStoryPdf = "SuccessStory.pdf";
    public static final String EmpCategory = "20006";
    public static final String CategoryE = "E";
    public static final String Contact_Mail = "Mail";
    public static final String Contact_Fax = "Fax";
    public static final String Contact_Phone = "Phone";
    public static final String searchableWithContactDtl = "S";
    public static final String searchableWithOutContactDtl = "H";
    public static final String notSearchable = "N";

    public static final String JBM_SCREEN_TITLE_VIEW_JOB_APPS = "View Job Applications and Referrals";
    public static final String JBM_SCREEN_TITLE_AMEND_EMPLOYER = "Amend Employer";
    public static final String JBM_SCREEN_TITLE_VIEW_EMPLOYER = "View Employer";
    public static final String JBM_SCREEN_TITLE_LIST_EMPLOYER = "List Employers";
    public static final String JBM_SCREEN_TITLE_CREATE_EMPLOYER = "Create Employer";
    public static final String JBM_SCREEN_TITLE_CREATE_JOB_POSTING = "Create Job Posting";
    public static final String JBM_SCREEN_TITLE_VIEW_JOB_POSTING = "View Job Posting";
    public static final String JBM_SCREEN_TITLE_AMEND_JOB_POSTING = "Amend Job Posting";
    public static final String JBM_SCREEN_TITLE_COPY_JOB_POSTING = "Copy Job Posting";
    public static final String JBM_SCREEN_TITLE_LIST_JOB_POSTING = "List Job Postings";
    public static final String JBM_SCREEN_TITLE_PREVIEW_AMEND_JOB_POSTING = "Preview Amended Job Posting";
    public static final String JBM_SCREEN_TITLE_PREVIEW_JOB_POSTING = "Preview Job Posting";
    public static final String JPM_SCREEN_TITLE_SELECT_JOB_POSTING = "Search Job Posting";
    public static final String JPM_SCREEN_TITLE_LIST_JOB_REFERRAL = "List Job Referrals";
    //Naveen added for SaveAsDraft constant on Nov 23 2016
    public static final int JBM_SAVE_AS_DRAFT_CD = 83;
    public static final int JBM_OPEN_STS_CD = 102;
    public static final int JBM_REOPEN_STS_CD = 103;
    public static final int JBM_CLOSED_STS_CD = 9;
    //SSOC Admin screens
    public static final String CreateJobTitle = "Create_JobTitle";
    public static final String ViewJobTitleDetails = "View_JobTitle";
    public static final String ViewJobTitleList = "List_JobTitle";
    public static final String AmendJobTitle = "Amend_JobTitle";
    //cart
    public static final String cartViewPage = "ICMSPortal_portal_page_cart";
    //Reports
    public static final String Reports_TCA_Page = "Reports_TCA_Page";
    public static final String Report_A1_a_b = "Report_A1_a_b";
    public static final String Report_A2_a = "Report_A2_a";

    public static final String Individual_Training = "1";
    public static final String Individual_Certification = "2";

    //CC Dashboard
    public static final String Appointment_09AM = "1";
    public static final String Appointment_10AM = "2";
    public static final String Appointment_11AM = "3";
    public static final String Appointment_12PM = "4";
    public static final String Appointment_01PM = "5";
    public static final String Appointment_02PM = "6";
    public static final String Appointment_03PM = "7";
    public static final String Appointment_04PM = "8";

    public static final String SLOT1 = "SLOT1";
    public static final String SLOT2 = "SLOT2";
    public static final String SLOT3 = "SLOT3";
    public static final String SLOT4 = "SLOT4";
    public static final String SLOT5 = "SLOT5";
    public static final String SLOT6 = "SLOT6";
    public static final String SLOT7 = "SLOT7";
    public static final String SLOT8 = "SLOT8";


    public static Map<String, String> appntConstMap = new LinkedHashMap<String, String>();

    static {
        appntConstMap.put("09.00 AM-10.00 AM", "1");
        appntConstMap.put("10.00 AM-11.00 AM", "2");
        appntConstMap.put("11.00 AM-12.00 PM", "3");
        appntConstMap.put("12.00 PM-01.00 PM", "4");
        appntConstMap.put("01.00 PM-02.00 PM", "5");
        appntConstMap.put("02.00 PM-03.00 PM", "6");
        appntConstMap.put("03.00 PM-04.00 PM", "7");
        appntConstMap.put("04.00 PM-05.00 PM", "8");
    }

    public static final String TRAINIG_ONLY = "Training Only";
    public static final String EMPLOYMENT = "Employment";

    /*Renamed by Priyanka for Re-Org CR on 6/09/2016*/
    // sending Email
    public static final String Email_Content = "Dear CETC/PP," +
        "\n\nGreetings from WSG!" +
        "\n\nAs one of our key partners in delivering quality training to the workforce, we will like extend the use of the Course Directory to you to widen the outreach of your Cat-A courses." +
        "\n\nThe WSG Website Course Directory provides a comprehensive course listing, which comprises of 10,000 WSQ and Non-WSQ courses, supported by WSG.  " +
        "Website users could browse courses by Area of Training, Job Level and WSG Initiatives.  " +
        "Users could also use the simplified course search to look for courses that fit their training needs.  " +
        "It also serves as an important platform for training providers to market their courses to the public (both individual workers and employers). " +
        "In addition, the data from this course directory will be published on WSG mobile app that allows individual to check out courses supported by WSG on the go," +
        "and hence further widening the outreach of your courses." +
        "\n\nAs a CETC/PP, you could access the restricted function in the Training Provider Portal to update the additional course information and course schedules of your Cat-A courses. " +
        " It empowers you with greater flexibility and control in the information to provide to our website users, in return widen the outreach of your courses.  " +
        "With the course information and course schedules entered, " +
        "you can then publish the course on the WSG Website Course Directory under the Course Details page." +
        "\n\nGet started today!  Please click on the below hyperlink to login to the Training Provider Portal. " +
        "\nTraining Provider Portal: <sample url>" +
        "\n\n\nSystem Administrator" +
        "\nIntegrated Client Management System (ICMS)" +
        "\nWorkforce Singapore Agency" +
        "\n\n[This is an auto generated email, please do not reply.]";


    //Added for JobsBank Employer listing page
    public static final String EmployerStartIndex = "1";
    public static final String EmployerEndIndex = "300";
    public static final String defaultIndex = "A";
    public static final int EmployerRange = 300;
    public static final String pageIndex = "1";

    //added parameters for pagination.
    public static final Integer startIndexJobBank = 1;
    public static final Integer endIndexJobBank = 20;
    //Start: Suresh - Fixed for Object Restriction in Listing Screens.
    public static final Integer recordsPerPage = 20;
    public static final String Job_orderByPostingDate = "1";
    public static final Integer orderByPostingDate = 1;
    //End: Suresh - Fixed for Object Restriction in Listing Screens.
    public static final String advancedSearch = "Advanced Search";
    public static final String quickSearch = "Quick Search";
    public static final String SELECT_OPTION = "Select";

    //Admin TP Utilisation CAPS

    public static final String UtilCapsCreateMasterDataPg = "UtilCapsCreate_MasterData";
    public static final String UtilCapsModifyMasterDataPg = "UtilCapsModify_MasterData";
    public static final String UtilCapsViewMasterDataDetailPg = "UtilCapsView_MasterDataDetail";
    public static final String UtilCapsViewMasterDataListPg = "UtilCapsView_MasterDataList";


    //Start Venkat Added
    public static final String start = "Start";
    public static final String end = "End";
    public static final String exception = "Exception Details";
    public static final String conSym = " :: ";
    public static final Date time = new Date();

    public static final String COURSE_FUNDING_TYPE_OTHERS = "511004";
    public static final String COURSE_SCHDLE_STATUS = "Confirmed";
    public static final String SAVE_MODE = "save";
    public static final String UPDATE_MODE = "update";
    public static final String TRA_REASSESSMENT_RES_REQ_TYPE = "R";
    public static final String TRA_REASSESSMENT_FT_REQ_TYPE = "F";

    //End Venkat Added

    //for attended start
    public static final String Status_Attended = "44";
    public static final String Status_Invited = "90";
    public static final String Status_Referred = "89";
    public static final String Status_Void = "8";
    //for event attnded end
    public static final String DashboardInboxController = "/portlets/dashboardInbox/DashboardInboxController.jpf";

    //Start Ananthan for Password Management
    public static final String Expired = "112";
    public static final String FirstTime = "113";

    //SMS

    public static final String sms_unicode = "0";
    public static final String sms_USER_AGENT = "Mozilla/5.0";
    public static final String sms_url = "http://wdasms.izenoondemand.com/sendSMS.php";
    //re org changed
    public static final String sms_sender = "WSG";
    public static final String sms_sender_arm = "WSG";


    /* added By Kiran K 05-02-2015 */
    /* USER Management */
    public static final String ORG_TYP_ETY_LK_CD = "600";
    public static final String WDA_STAFF = "600001";
    public static final String NON_WDA_STAFF = "600001";
    /*Start:Added For PP CR 01/03/2017 by Anusha */
    public static final String PRIVATE_PROVIDER_STAFF = "600018";
    /*End:Added For PP CR 01/03/2017 by Anusha */
    //public static Map<String, String> orgnstnTypeMap 	= new LinkedHashMap<String, String>();
    //	   static{
    //		   orgnstnTypeMap.put(WDA_STAFF, 	 		  "WDA Staff");
    //		   orgnstnTypeMap.put(NON_WDA_STAFF, 		  "Non WDA Staff");
    //	   }
    public static final String USR_ACTIVE_STS_CD = "1";
    public static final String USR_INACTIVE_STS_CD = "2";

    /* Centre Type */
    public static final String NON_WDA_CENTRE = "0";
    public static final String WDA_CENTRE = "1";
    public static final String WDA_CENTRE_PLUS_HQ = "2";
    /*Start:Added For PP CR 01/03/2017 by Anusha */
    public static final String Private_Provider = "3";
    /*End:Added For PP CR 01/03/2017 by Anusha */
    /*Start:Renamed 'WDA' to 'WSG' on 09/08/2016 by Priyanka */
    public static Map<String, String> CENTRE_TYP_MAP = new LinkedHashMap<String, String>();

    static {
        CENTRE_TYP_MAP.put(WDA_CENTRE, "WSG Career Centre ");
        CENTRE_TYP_MAP.put(NON_WDA_CENTRE, "Non-WSG Career Centre ");
        /*Start:Added For PP CR 01/03/2017 by Anusha */
        CENTRE_TYP_MAP.put(Private_Provider, "Career Matching Provider Centre");
        /*End:Added For PP CR 01/03/2017 by Anusha */
    }
    /*End:Renamed 'WDA' to 'WSG' on 09/08/2016 by Priyanka */

    //19/02/2015
    public static final String NO_REMARK = "0";
    public static final String IN_ACTV_USR_RESON_1 = "1";
    public static final String IN_ACTV_USR_RESON_2 = "2";
    public static final String IN_ACTV_USR_RESON_3 = "3";
    public static final String IN_ACTV_USR_RESON_4 = "4";
    public static final String IN_ACTV_NON_WDA_USR = "5";
    public static Map<String, String> usrInAvivateRsnMap = new LinkedHashMap<String, String>();

    static {
        usrInAvivateRsnMap.put(IN_ACTV_USR_RESON_1, "Left Organisation");
        usrInAvivateRsnMap.put(IN_ACTV_USR_RESON_2, "Not Logged in last 3 months");
        usrInAvivateRsnMap.put(IN_ACTV_USR_RESON_3, "Remark 3");
        usrInAvivateRsnMap.put(IN_ACTV_USR_RESON_4, "Remark 4");
        /*Start:Renamed 'WDA' to 'WSG' on 09/08/2016 by Priyanka */
        usrInAvivateRsnMap.put(IN_ACTV_NON_WDA_USR, "Default Centre changed to NON WSG");
        /*End:Renamed 'WDA' to 'WSG' on 09/08/2016 by Priyanka */
    }

    /* end USER Management */
    public static final String READ_ONLY_ACC = "R";
    public static final String READ_WRITE_ACC = "RW";
    public static final String HOME_PAGE_LBL_1 = "ICMSPortal_portal_book_Home";
    public static final String HOME_PAGE_LBL_2 = "ICMSLanding_Page";

    /* end: added By Kiran K 05-02-2015 */

    //Venkat added for Black List

    public static final String BLACKLIST_INACTIVE = "Y";
    public static final String BLACKLIST_ACTIVE_RINS = "N";
    public static final String BLACKLIST_ACTIVE = "A";
    public static final String CAM_VIEW_CASE = "View_Case";

    //Start: Suresh - Fixed for Object Restriction in Listing Screens.
    public static final Integer startIndexSearch = 1;
    //End: Suresh - Fixed for Object Restriction in Listing Screens.
    /* Start: added by RAVI for Ministers-Feedback CR on 21-Jan-2016*/
    public static final String APP_RECVD_EMAIL_NOTFC_Y = "Y";
    public static final String APP_RECVD_EMAIL_NOTFC_N = "N";
    public static final String JOB_EXPRY_EMAIL_NOTFC_Y = "Y";
    public static final String JOB_EXPRY_EMAIL_NOTFC_N = "N";
    /*Added by RAVI For ministry feedback CR on 29-Dec-2015*/

    /*Start: added by Kiran K for Leads-Management CR */

    public static final String ADVSRY_TITL_LKUP_CD = "545";
    public static final String TRAINING_ADVSRY_LKUP_CD = "546";
    public static final String EMP_ADVSRY_LKUP_CD = "547";
    public static final String PROGR_ADVSRY_LKUP_CD = "542";
    public static final String OTHER_ADVSRY_LKUP_CD = "548";

    /*End: added by Kiran K for Leads-Management CR */

    public static final String strVacancyStatus = "A";

    /* Start: Added by venkat on 12May2016 For BlackList Trainees  */
    public static final String BlackListController = "/portlets/blackList/BlackListController.jpf";
    public static final String BLACK_LIST = "List Blacklisted Trainees";
    /* End: Added by venkat on 12May2016 For BlackList Trainees  */

    //public static final String strVacancyStatus = "A";

    /*
     * Added by RAVI for Excel download Defect when records in large numbers (Production Defect)
     */
    public static final Integer MaxNoofRecPerExcel = 20000;

    /*Start: Venkat - Minister Feedback phase II  -  WDA-ICMS-2016-03-001 */

    public static final String MINS_FEDBAK_LIVE_DTE = "11/09/2016";

    /*End  : Venkat - Minister Feedback phase II  -  WDA-ICMS-2016-03-001 */
    //Suresh:20-Jul-2016-Lead CR
    public static final String ListMasterFrsLvlPg = "View_Master_Values_List";
    //Suresh:20-Jul-2016-Lead CR


    /*Start: Added by RAVI for Private Providers cr on 02-MAr-2017*/
    public static final String PRIVATE_PROVIDER_STAFF_CD = "600018";
    public static final String PRIVATE_PROVIDER_USER = "[PP]";
    public static final String PP_REQUESTED_BY_CLIENT = "608002";
    /*End: Added by RAVI for Private Providers cr on 02-MAr-2017*/

    /*Start: Added by NaveenKumarA, for CR to ICMS' course grant calculator and discretionary funds on 27Mar2017*/
    public static final String ADHOC_TR_OTHER_COURSE = "Others";
    /*End: Added by NaveenKumarA, for CR to ICMS' course grant calculator and discretionary funds on 27Mar2017*/


    /*Start: added by Kiran for ILP API	*/
    public static final String WS_SERVER_JB_SRCH_ERROR = "Error: No response from ILP. Please contact system admin";
    public static final String WS_SERVER_CONN_ERROR = "Error: Problem in reaching ILP API. Please contact system admin";
    public static final String OLD_SOURCE_CAREER_CENTRE = "Y";
    public static final String OLD_SOURCE_EMPLOYER_PORTAL = "N";
    public static final String SOURCE_CAREER_CENTRE = "Career Centre";
    public static final String SOURCE_EMPLOYER_PORTAL = "Employer Portal";
    public static final String SOURCE_CAREER_AT_GOV = "Careers@Gov";
    //Added by RAVI for ILP changes on 24-Sep-2017
    public static final String SOURCE_CAREER_AT_GOV_WS = "C";
    public static final String SG_COUNTRY_CODE = "415080";
    public static final String SG_COUNTRY_FLG = "S";
    public static final String SKILLS_LKUP_CD = "609";

    public static final int ICMS_ISLAND_CD = 9999;
    public static final int ILP_ISLAND_CD = 998;

    public static final String ICMS_SRC_SYS_ID = "B";
    //104	Closed-Vacancy Filled
    //105	Closed-Vacancy Available
    public static final String JBM_VACANCY_FILLED = "104";
    public static final String JBM_VACANCY_AVAILABLE = "105";
    /*End: added by Kiran for ILP API	*/
    public static final String WS_ILP_ITRFCE_JB_ERROR = "Job details not found in ILP. We apologize for the inconvenience caused. Thank you.";
    public static final String WS_ILP_INTERFACE_ERROR = "A system interface error has occurred. Please contact Service Desk with the following error codes. We apologize for the inconvenience caused. Thank you.";
    public static final String JOB_SKILLS_OTHERS = "Others";

    public static final String ICMS_DB_ERROR = "A system error has occurred. Please contact Service Desk. Thank You.";

    public static final String CHECK_JOB_APP_NRIC_NOT_FOUND = "Result Not Found";
    public static final String CHECK_JOB_APP_NRIC_FOUND = "Result Found";

    public static final String JOB_APPLN_STS_RECEIVED = "Received";
    public static final String JOB_APPLN_STS_UNERREVIEW = "Under Review";
    public static final String JOB_APPLN_STS_SUCCESSFUL = "Successful";
    public static final String JOB_APPLN_STS_UNSUCCESSFUL = "Unsuccessful";
    //Registration Tyoe
    public static final String REG_OF_COMPANY = "1";
    public static final String REG_OF_BUSINESS = "2";
    public static final String OTHER_UNIQUE_EST = "3";
    public static final String OTHER_REG_TYPE = "4";


    /* Start: Added by RAVI/Srinivasa for ILP */
    public static final String WS_EMP_CHECK_MAX_SLEEP_TIME = "55"; // Iteration count
    public static final String WS_EMP_CHECK_SLEEP_TIME = "1000"; // milli sec

    public static final String WS_IND_CHECK_MAX_SLEEP_TIME = "55"; // Iteration count
    public static final String WS_IND_CHECK_SLEEP_TIME = "1000"; // milli sec

    public static final String WS_PCP_CD = "541002";
    public static final String WS_MHA_SRC = "MHA_IND_DATA";
    public static final String WS_CHARMS_SRC = "CHARMS_ASSESSMENT_STAFF";
    public static final String WS_ACRA_SRC = "ACRA_ORG_DATA";
    public static final String WS_SCN_SRC = "SCN_COMPANY_REG";
    public static final String WS_APPREF_WTDRW = "Withdrawn";
    /*End: Added by RAVI/Srinivasa for ILP  */

    //Added by NaveenKumarA, SSEC_NUM's for below Diploma qualifications, on 16Jun2017
    public static final String QUALIFICATIONS_BELOW_DIPLOMA = "01~02~03~04~11~12~13~21~22~23~24~31~32~33~34~35~39~41~42~43~44~45~46~47~48~49";

    //added by Kiran
    public static final Integer SAL_TYP_LKUP_CD = 612;
    public static final int SAL_TYPE_MONTHLY_CD = 612001;
    public static final int SAL_TYPE_ANNUALLY_CD = 612002;


    public static final String ILP_WEBSERVICE_ERR_PROP_FILE = "ILP_ErrorCodes.properties";

    public static final String SOURCESYSTEM = "ICMS";
    //Start: Added by Suresh : Private Provider Phase-2b on 12-jul-17
    public static final String CENTRE_TYPE = "Career Centre Weekly Quota";
    //End: Added by Suresh : Private Provider Phase-2b on 12-jul-17
    //added by Kiran
    public static final String TBL_JOB_MSTR = "jobMstr";
    public static final String FLD_CREATED = "createdDt";
    public static final String FLD_MODIFIED = "modifiedDt";
    public static final String DBSYSDATE = "DBSYSDATE";

    //Start: Added by RAVI for TCA Reports CR on 16-Aug-2017
    public static final boolean FALSE_INDICATOR = false;
    public static final String TCA_RAW_DATA_REPORT_ERROR_MSG = "No records found for the selected payout month.";
    //End: Added by RAVI for TCA Reports CR on 16-Aug-2017


    public static final HashMap<String, String> FILE_MIME_TYPE = new HashMap<String, String>();

    static {
        // adobe
        FILE_MIME_TYPE.put("pdf", "application/pdf");
        FILE_MIME_TYPE.put("psd", "image/vnd.adobe.photoshop");
        FILE_MIME_TYPE.put("ai", "application/postscript");
        FILE_MIME_TYPE.put("eps", "application/postscript");
        FILE_MIME_TYPE.put("ps", "application/postscript");

        // ms office
        FILE_MIME_TYPE.put("doc", "application/msword");
        FILE_MIME_TYPE.put("rtf", "application/rtf");
        FILE_MIME_TYPE.put("xls", "application/vnd.ms-excel");
        FILE_MIME_TYPE.put("ppt", "application/vnd.ms-powerpoint");

        FILE_MIME_TYPE.put("docx", "application/vnd.openxmlformats-officedocument.wordprocessingml.document");
        FILE_MIME_TYPE.put("xlsx", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        FILE_MIME_TYPE.put("pptx", "application/vnd.openxmlformats-officedocument.presentationml.presentation");

        //text
        FILE_MIME_TYPE.put("txt", "text/plain");
        FILE_MIME_TYPE.put("htm", "text/html");
        FILE_MIME_TYPE.put("html", "text/html");
        FILE_MIME_TYPE.put("php", "text/html");
        FILE_MIME_TYPE.put("css", "text/css");
        FILE_MIME_TYPE.put("js", "application/javascript");
        FILE_MIME_TYPE.put("json", "application/json");
        FILE_MIME_TYPE.put("xml", "application/xml");
        FILE_MIME_TYPE.put("swf", "application/x-shockwave-flash");
        FILE_MIME_TYPE.put("flv", "video/x-flv");

        // images
        FILE_MIME_TYPE.put("png", "image/png");
        FILE_MIME_TYPE.put("jpe", "image/jpeg");
        FILE_MIME_TYPE.put("jpeg", "image/jpeg");
        FILE_MIME_TYPE.put("jpg", "image/jpeg");
        FILE_MIME_TYPE.put("gif", "image/gif");
        FILE_MIME_TYPE.put("bmp", "image/bmp");
        FILE_MIME_TYPE.put("ico", "image/vnd.microsoft.icon");
        FILE_MIME_TYPE.put("tiff", "image/tiff");
        FILE_MIME_TYPE.put("tif", "image/tiff");
        FILE_MIME_TYPE.put("svg", "image/svg+xml");
        FILE_MIME_TYPE.put("svgz", "image/svg+xml");

        // archives
        FILE_MIME_TYPE.put("zip", "application/zip");
        FILE_MIME_TYPE.put("rar", "application/x-rar-compressed");
        FILE_MIME_TYPE.put("exe", "application/x-msdownload");
        FILE_MIME_TYPE.put("msi", "application/x-msdownload");
        FILE_MIME_TYPE.put("cab", "application/vnd.ms-cab-compressed");

        // audio/video
        FILE_MIME_TYPE.put("mp3", "audio/mpeg");
        FILE_MIME_TYPE.put("qt", "video/quicktime");
        FILE_MIME_TYPE.put("mov", "video/quicktime");

        // open office
        FILE_MIME_TYPE.put("odt", "application/vnd.oasis.opendocument.text");
        FILE_MIME_TYPE.put("ods", "application/vnd.oasis.opendocument.spreadsheet");
        FILE_MIME_TYPE.put(null, "application/octet-stream");
        FILE_MIME_TYPE.put("", "application/octet-stream");


    }

    /*Start: Added/modified by NaveenKumarA, for Access Rights Enhancement CR:SSG-ICMS-2017-06-004, on 25Sept2017*/
    public static final String TIER_INF_ETY_LK_CD = "613";
    public static final String TIER_1_ENTITY = "613001";
    public static final String TIER_2_ENTITY = "613002";
    public static final String TIER_3_ENTITY = "613003";

    public static final String CASE_CLASFCTN_ADVSRY_ENTY_NAME = "CASE CLASSIFICATION";
    /*Start: By Suresh Upload Parameters CR on 16-Oct-2017 */
    public static final String JB_UPLD_CAT_ADVSRY_ENTY_NAME = "Categories";
    /*End: By Suresh Upload Parameters CR on 16-Oct-2017 */
    public static final String REFERRED_CAT_ETY_LK_CD = "614";

    public static final String USER_GROUP_ROLE_CM = "CM";
    public static final String USER_GROUP_ROLE_ACM = "ACM";
    /*End: Added/modified by NaveenKumarA, for Access Rights Enhancement CR:SSG-ICMS-2017-06-004, on 25Sept2017*/

    /*Start: Added/modified by NaveenKumarA, for CMP Phase III Enhancements, on 13DEC2017*/
    public static final String USER_GROUP_ROLE_CMP_ADMIN = "[CMP-Admin]";
    public static final String USER_GROUP_ROLE_CMP = "[CMP]";

    public static final String GROUP_PARAMETERS_ENTY_NAME = "GROUP PARAMETERS";

    public static final String GROUP_PARAMETERS_CLIENT_AGE = "Client Age(in years)";
    public static final String GROUP_PARAMETERS_EMPLYMNT_TY = "Employment Type";
    public static final String GROUP_PARAMETERS_UNEMPLYD_DUR = "Unemployed Duration(in days)";
    public static final String GROUP_PARAMETERS_PMET_EDUC = "PMET Education";
    public static final String GROUP_PARAMETERS_OPN_CAS_DUR = "Open Case Duration(in days)";
    public static final String GROUP_PARAMETERS_CAS_CLSR_DUR = "Case Closure Duration(in days)";
    /*End: Added/modified by NaveenKumarA, for CMP Phase III Enhancements, on 13DEC2017*/

    /* Start: Added By NaveenKumarAlone, for EventUploadCR, on 01MAR2018 */
    public static final String UPLOAD_EVNT_RFRL_TYP_INVITED = "Invited";
    public static final String UPLOAD_EVNT_RFRL_TYP_REFERRED = "Referred";
    public static final String UPLOAD_EVNT_RFRL_TYP_ATTENDED = "Attended";
    public static final String UPLOAD_EVNT_RFRL_TYP_DID_NOT_TURN_UP = "Did not turn up";
    public static final String UPLOAD_EVNT_RFRL_TYP_VOID = "Void";
    public static final String STATUS_DID_NOT_TURN_UP = "45";
    public static final String STATUS_VOID = "8";
    public static final String CLIENT_ID_TYPE_BLUE = "Singapore Blue IC";
    public static final String CLIENT_ID_TYPE_PINK = "Singapore Pink IC";
    public static final String CLIENT_ID_TYPE_WORK_PERMIT = "Fin/Work Permit/SAF 11B";
    public static final String CLIENT_ID_TYPE_OTHERS = "Others";
    /* End: Added By NaveenKumarAlone, for EventUploadCR, on 01MAR2018 */
    //add by fujun for ICMS-2019-04-001
    public static final String UmpHypText = "555551";
    public static final String UmpHypUrl = "555552";
    //add by fujun for Multiple
    public static final String MultipleMessage = "Multiple browser tabs detected. Please close the current browser tab and use only one browser tab for ICMS.";

    //add by fujun for ICMS-2019-07-001
    public static final String loginPwdCatCode = "1005";

    //add by yunlong Sensitive data in url's GET parameter
    public static final String encodeStr = "x!Yabc2Da";
}
