/*
 * Marketing API
 * Marketing API
 *
 * OpenAPI spec version: 3.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.tencent.ads.v3;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.tencent.ads.container.v3.*;
import com.tencent.ads.guice.GuiceModule;

public class App {

  @Inject AdDiagnosisApiContainer adDiagnosisApiContainer;
  @Inject AdParamApiContainer adParamApiContainer;
  @Inject AdUnionReportsApiContainer adUnionReportsApiContainer;
  @Inject AdcreativePreviewsApiContainer adcreativePreviewsApiContainer;
  @Inject AdcreativePreviewsQrcodeApiContainer adcreativePreviewsQrcodeApiContainer;
  @Inject AdgroupNegativewordsApiContainer adgroupNegativewordsApiContainer;
  @Inject AdgroupsApiContainer adgroupsApiContainer;
  @Inject AdvertiserApiContainer advertiserApiContainer;
  @Inject AdvertiserDailyBudgetApiContainer advertiserDailyBudgetApiContainer;
  @Inject AgencyApiContainer agencyApiContainer;
  @Inject AgencyRealtimeCostApiContainer agencyRealtimeCostApiContainer;
  @Inject AndroidChannelApiContainer androidChannelApiContainer;
  @Inject AsyncReportFilesApiContainer asyncReportFilesApiContainer;
  @Inject AsyncReportsApiContainer asyncReportsApiContainer;
  @Inject AsyncTasksApiContainer asyncTasksApiContainer;
  @Inject AudienceGrantRelationsApiContainer audienceGrantRelationsApiContainer;
  @Inject BatchAsyncRequestSpecificationApiContainer batchAsyncRequestSpecificationApiContainer;
  @Inject BatchAsyncRequestsApiContainer batchAsyncRequestsApiContainer;
  @Inject BatchRequestsApiContainer batchRequestsApiContainer;
  @Inject BidSimulationApiContainer bidSimulationApiContainer;
  @Inject BidwordApiContainer bidwordApiContainer;
  @Inject BidwordFlowApiContainer bidwordFlowApiContainer;
  @Inject BrandApiContainer brandApiContainer;
  @Inject BusinessPointApiContainer businessPointApiContainer;
  @Inject ComponentReviewResultsApiContainer componentReviewResultsApiContainer;
  @Inject ConversionsApiContainer conversionsApiContainer;
  @Inject CreativeTemplateApiContainer creativeTemplateApiContainer;
  @Inject CreativeTemplateListApiContainer creativeTemplateListApiContainer;
  @Inject CreativeTemplatePreviewsApiContainer creativeTemplatePreviewsApiContainer;
  @Inject CreativetoolsTextApiContainer creativetoolsTextApiContainer;
  @Inject CustomAudienceEstimationsApiContainer customAudienceEstimationsApiContainer;
  @Inject CustomAudienceFilesApiContainer customAudienceFilesApiContainer;
  @Inject CustomAudiencesApiContainer customAudiencesApiContainer;
  @Inject DailyBalanceReportApiContainer dailyBalanceReportApiContainer;
  @Inject DailyReportsApiContainer dailyReportsApiContainer;
  @Inject DataSourceDispatchApiContainer dataSourceDispatchApiContainer;
  @Inject DynamicAdImageTemplatesApiContainer dynamicAdImageTemplatesApiContainer;
  @Inject DynamicAdImagesApiContainer dynamicAdImagesApiContainer;
  @Inject DynamicAdVideoApiContainer dynamicAdVideoApiContainer;
  @Inject DynamicAdVideoTemplatesApiContainer dynamicAdVideoTemplatesApiContainer;
  @Inject DynamicCreativeReviewResultsApiContainer dynamicCreativeReviewResultsApiContainer;
  @Inject DynamicCreativesApiContainer dynamicCreativesApiContainer;
  @Inject EcommerceOrderApiContainer ecommerceOrderApiContainer;
  @Inject EstimationApiContainer estimationApiContainer;
  @Inject ExtendPackageApiContainer extendPackageApiContainer;
  @Inject FundStatementsDetailedApiContainer fundStatementsDetailedApiContainer;
  @Inject FundTransferApiContainer fundTransferApiContainer;
  @Inject FundsApiContainer fundsApiContainer;
  @Inject GameFeatureApiContainer gameFeatureApiContainer;
  @Inject GameFeatureTagsApiContainer gameFeatureTagsApiContainer;
  @Inject HourlyReportsApiContainer hourlyReportsApiContainer;
  @Inject ImagesApiContainer imagesApiContainer;
  @Inject KeywordRecommendApiContainer keywordRecommendApiContainer;
  @Inject LabelsApiContainer labelsApiContainer;
  @Inject LandingPageSellStrategyApiContainer landingPageSellStrategyApiContainer;
  @Inject LeadsApiContainer leadsApiContainer;
  @Inject LeadsActionTypeReportApiContainer leadsActionTypeReportApiContainer;
  @Inject LeadsCallRecordApiContainer leadsCallRecordApiContainer;
  @Inject LeadsCallRecordsApiContainer leadsCallRecordsApiContainer;
  @Inject LeadsCallVirtualNumberApiContainer leadsCallVirtualNumberApiContainer;
  @Inject LeadsClaimApiContainer leadsClaimApiContainer;
  @Inject LeadsInvalidPayApiContainer leadsInvalidPayApiContainer;
  @Inject LeadsListApiContainer leadsListApiContainer;
  @Inject LeadsStatusApiContainer leadsStatusApiContainer;
  @Inject LeadsVoipCallApiContainer leadsVoipCallApiContainer;
  @Inject LeadsVoipCallTokenApiContainer leadsVoipCallTokenApiContainer;
  @Inject LiveRoomComponentStatusApiContainer liveRoomComponentStatusApiContainer;
  @Inject LiveRoomComponentsApiContainer liveRoomComponentsApiContainer;
  @Inject LocalStoresApiContainer localStoresApiContainer;
  @Inject LocalStoresAddressParsingResultApiContainer localStoresAddressParsingResultApiContainer;
  @Inject LocalStoresCategoriesApiContainer localStoresCategoriesApiContainer;
  @Inject LocalStoresSearchInfoApiContainer localStoresSearchInfoApiContainer;
  @Inject LocalStoresWxpayMerchantsApiContainer localStoresWxpayMerchantsApiContainer;
  @Inject MarketingTargetAssetCategoriesApiContainer marketingTargetAssetCategoriesApiContainer;
  @Inject MarketingTargetAssetDetailApiContainer marketingTargetAssetDetailApiContainer;
  @Inject MarketingTargetAssetPropertiesApiContainer marketingTargetAssetPropertiesApiContainer;

  @Inject
  MarketingTargetAssetPropertyValuesApiContainer marketingTargetAssetPropertyValuesApiContainer;

  @Inject MarketingTargetAssetsApiContainer marketingTargetAssetsApiContainer;
  @Inject MarketingTargetTypesApiContainer marketingTargetTypesApiContainer;
  @Inject MaterialDcatagApiContainer materialDcatagApiContainer;
  @Inject MaterialLabelsApiContainer materialLabelsApiContainer;
  @Inject MergeFundTypeDailyBalanceReportApiContainer mergeFundTypeDailyBalanceReportApiContainer;

  @Inject
  MergeFundTypeFundStatementsDetailedApiContainer mergeFundTypeFundStatementsDetailedApiContainer;

  @Inject MergeFundTypeFundsApiContainer mergeFundTypeFundsApiContainer;
  @Inject MergeFundTypeSubcustomerTransferApiContainer mergeFundTypeSubcustomerTransferApiContainer;
  @Inject OauthApiContainer oauthApiContainer;
  @Inject OptimizationGoalPermissionsApiContainer optimizationGoalPermissionsApiContainer;
  @Inject OrganizationAccountRelationApiContainer organizationAccountRelationApiContainer;
  @Inject PagesApiContainer pagesApiContainer;
  @Inject ProductCatalogsApiContainer productCatalogsApiContainer;
  @Inject ProductItemsApiContainer productItemsApiContainer;
  @Inject ProductSeriesApiContainer productSeriesApiContainer;
  @Inject ProfilesApiContainer profilesApiContainer;
  @Inject ProgrammedApiContainer programmedApiContainer;
  @Inject ProgrammedTemplateApiContainer programmedTemplateApiContainer;
  @Inject QualificationsApiContainer qualificationsApiContainer;
  @Inject RealtimeCostApiContainer realtimeCostApiContainer;
  @Inject ReviewElementPrereviewResultsApiContainer reviewElementPrereviewResultsApiContainer;
  @Inject SceneSpecTagsApiContainer sceneSpecTagsApiContainer;
  @Inject SubcustomerTransferApiContainer subcustomerTransferApiContainer;
  @Inject TargetingTagReportsApiContainer targetingTagReportsApiContainer;
  @Inject TargetingTagsApiContainer targetingTagsApiContainer;
  @Inject TargetingTagsUvApiContainer targetingTagsUvApiContainer;
  @Inject UnionPositionPackagesApiContainer unionPositionPackagesApiContainer;
  @Inject UserActionSetReportsApiContainer userActionSetReportsApiContainer;
  @Inject UserActionSetsApiContainer userActionSetsApiContainer;
  @Inject UserActionsApiContainer userActionsApiContainer;
  @Inject VideoChannelDealerDataApiContainer videoChannelDealerDataApiContainer;
  @Inject VideoChannelFansDataApiContainer videoChannelFansDataApiContainer;
  @Inject VideoChannelLeadsDataApiContainer videoChannelLeadsDataApiContainer;
  @Inject VideoChannelLiveDataApiContainer videoChannelLiveDataApiContainer;
  @Inject VideosApiContainer videosApiContainer;
  @Inject WechatPagesApiContainer wechatPagesApiContainer;
  @Inject WechatPagesCustomApiContainer wechatPagesCustomApiContainer;
  @Inject WechatPagesGrantinfoApiContainer wechatPagesGrantinfoApiContainer;
  @Inject WildcardsApiContainer wildcardsApiContainer;
  @Inject WxPackageAccountApiContainer wxPackageAccountApiContainer;
  @Inject WxPackagePackageApiContainer wxPackagePackageApiContainer;
  @Inject XijingComplexTemplateApiContainer xijingComplexTemplateApiContainer;
  @Inject XijingPageApiContainer xijingPageApiContainer;
  @Inject XijingPageByComponentsApiContainer xijingPageByComponentsApiContainer;
  @Inject XijingPageListApiContainer xijingPageListApiContainer;
  @Inject XijingTemplateApiContainer xijingTemplateApiContainer;
  @Inject XijingTemplateListApiContainer xijingTemplateListApiContainer;

  public App() {
    Guice.createInjector(new GuiceModule()).injectMembers(this);
  }

  public AdDiagnosisApiContainer adDiagnosis() {
    return adDiagnosisApiContainer;
  }

  public AdParamApiContainer adParam() {
    return adParamApiContainer;
  }

  public AdUnionReportsApiContainer adUnionReports() {
    return adUnionReportsApiContainer;
  }

  public AdcreativePreviewsApiContainer adcreativePreviews() {
    return adcreativePreviewsApiContainer;
  }

  public AdcreativePreviewsQrcodeApiContainer adcreativePreviewsQrcode() {
    return adcreativePreviewsQrcodeApiContainer;
  }

  public AdgroupNegativewordsApiContainer adgroupNegativewords() {
    return adgroupNegativewordsApiContainer;
  }

  public AdgroupsApiContainer adgroups() {
    return adgroupsApiContainer;
  }

  public AdvertiserApiContainer advertiser() {
    return advertiserApiContainer;
  }

  public AdvertiserDailyBudgetApiContainer advertiserDailyBudget() {
    return advertiserDailyBudgetApiContainer;
  }

  public AgencyApiContainer agency() {
    return agencyApiContainer;
  }

  public AgencyRealtimeCostApiContainer agencyRealtimeCost() {
    return agencyRealtimeCostApiContainer;
  }

  public AndroidChannelApiContainer androidChannel() {
    return androidChannelApiContainer;
  }

  public AsyncReportFilesApiContainer asyncReportFiles() {
    return asyncReportFilesApiContainer;
  }

  public AsyncReportsApiContainer asyncReports() {
    return asyncReportsApiContainer;
  }

  public AsyncTasksApiContainer asyncTasks() {
    return asyncTasksApiContainer;
  }

  public AudienceGrantRelationsApiContainer audienceGrantRelations() {
    return audienceGrantRelationsApiContainer;
  }

  public BatchAsyncRequestSpecificationApiContainer batchAsyncRequestSpecification() {
    return batchAsyncRequestSpecificationApiContainer;
  }

  public BatchAsyncRequestsApiContainer batchAsyncRequests() {
    return batchAsyncRequestsApiContainer;
  }

  public BatchRequestsApiContainer batchRequests() {
    return batchRequestsApiContainer;
  }

  public BidSimulationApiContainer bidSimulation() {
    return bidSimulationApiContainer;
  }

  public BidwordApiContainer bidword() {
    return bidwordApiContainer;
  }

  public BidwordFlowApiContainer bidwordFlow() {
    return bidwordFlowApiContainer;
  }

  public BrandApiContainer brand() {
    return brandApiContainer;
  }

  public BusinessPointApiContainer businessPoint() {
    return businessPointApiContainer;
  }

  public ComponentReviewResultsApiContainer componentReviewResults() {
    return componentReviewResultsApiContainer;
  }

  public ConversionsApiContainer conversions() {
    return conversionsApiContainer;
  }

  public CreativeTemplateApiContainer creativeTemplate() {
    return creativeTemplateApiContainer;
  }

  public CreativeTemplateListApiContainer creativeTemplateList() {
    return creativeTemplateListApiContainer;
  }

  public CreativeTemplatePreviewsApiContainer creativeTemplatePreviews() {
    return creativeTemplatePreviewsApiContainer;
  }

  public CreativetoolsTextApiContainer creativetoolsText() {
    return creativetoolsTextApiContainer;
  }

  public CustomAudienceEstimationsApiContainer customAudienceEstimations() {
    return customAudienceEstimationsApiContainer;
  }

  public CustomAudienceFilesApiContainer customAudienceFiles() {
    return customAudienceFilesApiContainer;
  }

  public CustomAudiencesApiContainer customAudiences() {
    return customAudiencesApiContainer;
  }

  public DailyBalanceReportApiContainer dailyBalanceReport() {
    return dailyBalanceReportApiContainer;
  }

  public DailyReportsApiContainer dailyReports() {
    return dailyReportsApiContainer;
  }

  public DataSourceDispatchApiContainer dataSourceDispatch() {
    return dataSourceDispatchApiContainer;
  }

  public DynamicAdImageTemplatesApiContainer dynamicAdImageTemplates() {
    return dynamicAdImageTemplatesApiContainer;
  }

  public DynamicAdImagesApiContainer dynamicAdImages() {
    return dynamicAdImagesApiContainer;
  }

  public DynamicAdVideoApiContainer dynamicAdVideo() {
    return dynamicAdVideoApiContainer;
  }

  public DynamicAdVideoTemplatesApiContainer dynamicAdVideoTemplates() {
    return dynamicAdVideoTemplatesApiContainer;
  }

  public DynamicCreativeReviewResultsApiContainer dynamicCreativeReviewResults() {
    return dynamicCreativeReviewResultsApiContainer;
  }

  public DynamicCreativesApiContainer dynamicCreatives() {
    return dynamicCreativesApiContainer;
  }

  public EcommerceOrderApiContainer ecommerceOrder() {
    return ecommerceOrderApiContainer;
  }

  public EstimationApiContainer estimation() {
    return estimationApiContainer;
  }

  public ExtendPackageApiContainer extendPackage() {
    return extendPackageApiContainer;
  }

  public FundStatementsDetailedApiContainer fundStatementsDetailed() {
    return fundStatementsDetailedApiContainer;
  }

  public FundTransferApiContainer fundTransfer() {
    return fundTransferApiContainer;
  }

  public FundsApiContainer funds() {
    return fundsApiContainer;
  }

  public GameFeatureApiContainer gameFeature() {
    return gameFeatureApiContainer;
  }

  public GameFeatureTagsApiContainer gameFeatureTags() {
    return gameFeatureTagsApiContainer;
  }

  public HourlyReportsApiContainer hourlyReports() {
    return hourlyReportsApiContainer;
  }

  public ImagesApiContainer images() {
    return imagesApiContainer;
  }

  public KeywordRecommendApiContainer keywordRecommend() {
    return keywordRecommendApiContainer;
  }

  public LabelsApiContainer labels() {
    return labelsApiContainer;
  }

  public LandingPageSellStrategyApiContainer landingPageSellStrategy() {
    return landingPageSellStrategyApiContainer;
  }

  public LeadsApiContainer leads() {
    return leadsApiContainer;
  }

  public LeadsActionTypeReportApiContainer leadsActionTypeReport() {
    return leadsActionTypeReportApiContainer;
  }

  public LeadsCallRecordApiContainer leadsCallRecord() {
    return leadsCallRecordApiContainer;
  }

  public LeadsCallRecordsApiContainer leadsCallRecords() {
    return leadsCallRecordsApiContainer;
  }

  public LeadsCallVirtualNumberApiContainer leadsCallVirtualNumber() {
    return leadsCallVirtualNumberApiContainer;
  }

  public LeadsClaimApiContainer leadsClaim() {
    return leadsClaimApiContainer;
  }

  public LeadsInvalidPayApiContainer leadsInvalidPay() {
    return leadsInvalidPayApiContainer;
  }

  public LeadsListApiContainer leadsList() {
    return leadsListApiContainer;
  }

  public LeadsStatusApiContainer leadsStatus() {
    return leadsStatusApiContainer;
  }

  public LeadsVoipCallApiContainer leadsVoipCall() {
    return leadsVoipCallApiContainer;
  }

  public LeadsVoipCallTokenApiContainer leadsVoipCallToken() {
    return leadsVoipCallTokenApiContainer;
  }

  public LiveRoomComponentStatusApiContainer liveRoomComponentStatus() {
    return liveRoomComponentStatusApiContainer;
  }

  public LiveRoomComponentsApiContainer liveRoomComponents() {
    return liveRoomComponentsApiContainer;
  }

  public LocalStoresApiContainer localStores() {
    return localStoresApiContainer;
  }

  public LocalStoresAddressParsingResultApiContainer localStoresAddressParsingResult() {
    return localStoresAddressParsingResultApiContainer;
  }

  public LocalStoresCategoriesApiContainer localStoresCategories() {
    return localStoresCategoriesApiContainer;
  }

  public LocalStoresSearchInfoApiContainer localStoresSearchInfo() {
    return localStoresSearchInfoApiContainer;
  }

  public LocalStoresWxpayMerchantsApiContainer localStoresWxpayMerchants() {
    return localStoresWxpayMerchantsApiContainer;
  }

  public MarketingTargetAssetCategoriesApiContainer marketingTargetAssetCategories() {
    return marketingTargetAssetCategoriesApiContainer;
  }

  public MarketingTargetAssetDetailApiContainer marketingTargetAssetDetail() {
    return marketingTargetAssetDetailApiContainer;
  }

  public MarketingTargetAssetPropertiesApiContainer marketingTargetAssetProperties() {
    return marketingTargetAssetPropertiesApiContainer;
  }

  public MarketingTargetAssetPropertyValuesApiContainer marketingTargetAssetPropertyValues() {
    return marketingTargetAssetPropertyValuesApiContainer;
  }

  public MarketingTargetAssetsApiContainer marketingTargetAssets() {
    return marketingTargetAssetsApiContainer;
  }

  public MarketingTargetTypesApiContainer marketingTargetTypes() {
    return marketingTargetTypesApiContainer;
  }

  public MaterialDcatagApiContainer materialDcatag() {
    return materialDcatagApiContainer;
  }

  public MaterialLabelsApiContainer materialLabels() {
    return materialLabelsApiContainer;
  }

  public MergeFundTypeDailyBalanceReportApiContainer mergeFundTypeDailyBalanceReport() {
    return mergeFundTypeDailyBalanceReportApiContainer;
  }

  public MergeFundTypeFundStatementsDetailedApiContainer mergeFundTypeFundStatementsDetailed() {
    return mergeFundTypeFundStatementsDetailedApiContainer;
  }

  public MergeFundTypeFundsApiContainer mergeFundTypeFunds() {
    return mergeFundTypeFundsApiContainer;
  }

  public MergeFundTypeSubcustomerTransferApiContainer mergeFundTypeSubcustomerTransfer() {
    return mergeFundTypeSubcustomerTransferApiContainer;
  }

  public OauthApiContainer oauth() {
    return oauthApiContainer;
  }

  public OptimizationGoalPermissionsApiContainer optimizationGoalPermissions() {
    return optimizationGoalPermissionsApiContainer;
  }

  public OrganizationAccountRelationApiContainer organizationAccountRelation() {
    return organizationAccountRelationApiContainer;
  }

  public PagesApiContainer pages() {
    return pagesApiContainer;
  }

  public ProductCatalogsApiContainer productCatalogs() {
    return productCatalogsApiContainer;
  }

  public ProductItemsApiContainer productItems() {
    return productItemsApiContainer;
  }

  public ProductSeriesApiContainer productSeries() {
    return productSeriesApiContainer;
  }

  public ProfilesApiContainer profiles() {
    return profilesApiContainer;
  }

  public ProgrammedApiContainer programmed() {
    return programmedApiContainer;
  }

  public ProgrammedTemplateApiContainer programmedTemplate() {
    return programmedTemplateApiContainer;
  }

  public QualificationsApiContainer qualifications() {
    return qualificationsApiContainer;
  }

  public RealtimeCostApiContainer realtimeCost() {
    return realtimeCostApiContainer;
  }

  public ReviewElementPrereviewResultsApiContainer reviewElementPrereviewResults() {
    return reviewElementPrereviewResultsApiContainer;
  }

  public SceneSpecTagsApiContainer sceneSpecTags() {
    return sceneSpecTagsApiContainer;
  }

  public SubcustomerTransferApiContainer subcustomerTransfer() {
    return subcustomerTransferApiContainer;
  }

  public TargetingTagReportsApiContainer targetingTagReports() {
    return targetingTagReportsApiContainer;
  }

  public TargetingTagsApiContainer targetingTags() {
    return targetingTagsApiContainer;
  }

  public TargetingTagsUvApiContainer targetingTagsUv() {
    return targetingTagsUvApiContainer;
  }

  public UnionPositionPackagesApiContainer unionPositionPackages() {
    return unionPositionPackagesApiContainer;
  }

  public UserActionSetReportsApiContainer userActionSetReports() {
    return userActionSetReportsApiContainer;
  }

  public UserActionSetsApiContainer userActionSets() {
    return userActionSetsApiContainer;
  }

  public UserActionsApiContainer userActions() {
    return userActionsApiContainer;
  }

  public VideoChannelDealerDataApiContainer videoChannelDealerData() {
    return videoChannelDealerDataApiContainer;
  }

  public VideoChannelFansDataApiContainer videoChannelFansData() {
    return videoChannelFansDataApiContainer;
  }

  public VideoChannelLeadsDataApiContainer videoChannelLeadsData() {
    return videoChannelLeadsDataApiContainer;
  }

  public VideoChannelLiveDataApiContainer videoChannelLiveData() {
    return videoChannelLiveDataApiContainer;
  }

  public VideosApiContainer videos() {
    return videosApiContainer;
  }

  public WechatPagesApiContainer wechatPages() {
    return wechatPagesApiContainer;
  }

  public WechatPagesCustomApiContainer wechatPagesCustom() {
    return wechatPagesCustomApiContainer;
  }

  public WechatPagesGrantinfoApiContainer wechatPagesGrantinfo() {
    return wechatPagesGrantinfoApiContainer;
  }

  public WildcardsApiContainer wildcards() {
    return wildcardsApiContainer;
  }

  public WxPackageAccountApiContainer wxPackageAccount() {
    return wxPackageAccountApiContainer;
  }

  public WxPackagePackageApiContainer wxPackagePackage() {
    return wxPackagePackageApiContainer;
  }

  public XijingComplexTemplateApiContainer xijingComplexTemplate() {
    return xijingComplexTemplateApiContainer;
  }

  public XijingPageApiContainer xijingPage() {
    return xijingPageApiContainer;
  }

  public XijingPageByComponentsApiContainer xijingPageByComponents() {
    return xijingPageByComponentsApiContainer;
  }

  public XijingPageListApiContainer xijingPageList() {
    return xijingPageListApiContainer;
  }

  public XijingTemplateApiContainer xijingTemplate() {
    return xijingTemplateApiContainer;
  }

  public XijingTemplateListApiContainer xijingTemplateList() {
    return xijingTemplateListApiContainer;
  }
}
