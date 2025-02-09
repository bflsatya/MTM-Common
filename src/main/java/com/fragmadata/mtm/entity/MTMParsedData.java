package com.fragmadata.mtm.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "MTMParsedData")
public class MTMParsedData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MTMParseID")
    private Long mtmParseId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "ParentSheetMasterID", nullable = false)
    private ParentSheet parentSheet;

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "CounterPartyID", nullable = false)
    private CounterParty counterPartyId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "FileMasterID", nullable = false)
    private FileMaster file;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "EmailInstanceID", nullable = false)
    private EmailInstance emailInstance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "EmailAttachmentID", nullable = false)
    private EmailAttachmentInstance emailAttachmentInstance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    @JoinColumn(name = "FileAttachmentSheetInstanceID", nullable = false)
    private FileAttachmentSheetInstance fileAttachmentSheetInstance;

    @Column(name = "CustomerLiabilityID")
    private String customerLiabilityId;

    @Column(name = "SecondaryCustomerLiabilityID")
    private String secondaryCustomerLiabilityId;

    @Column(name = "IsCollateral")
    private Boolean isCollateral;

    @Column(name = "CreatedBy")
    private String createdBy;

    @Column(name = "CreatedDate")
    private LocalDateTime createdDate;

    @Column(name = "AccInterest")
    private String accInterest;

    @Column(name = "Account")
    private String account;

    @Column(name = "AccruedPremium_LocalCcy")
    private String accruedPremiumLocalCcy;

    @Column(name = "AccruedPremium_ReportCcy")
    private String accruedPremiumReportCcy;

    @Column(name = "AOrE")
    private String aOrE;

    @Column(name = "Barr1")
    private String barr1;

    @Column(name = "Barr2")
    private String barr2;

    @Column(name = "BarrierDown")
    private BigDecimal barrierDown;

    @Column(name = "BarrierLevel")
    private String barrierLevel;

    @Column(name = "BarrierType")
    private String barrierType;

    @Column(name = "BarrierUp")
    private BigDecimal barrierUp;

    @Column(name = "Bid")
    private BigDecimal bid;

    @Column(name = "BidMark")
    private BigDecimal bidMark;

    @Column(name = "BOSTrade_ID")
    private String bostradeId;

    @Column(name = "BuySell")
    private String buySell;

    @Column(name = "CapitalGainsNonDiscounted_ReportCcy")
    private String capitalGainsNonDiscountedReportCcy;

    @Column(name = "CapitalGainsNonDiscounted_RiskCcy")
    private String capitalGainsNonDiscountedRiskCcy;

    @Column(name = "CapitalGainsPresentValue_ReportCcy")
    private String capitalGainsPresentValueReportCcy;

    @Column(name = "CapitalGainsPresentValue_RiskCcy")
    private String capitalGainsPresentValueRiskCcy;

    @Column(name = "Ccy")
    private String ccy;

    @Column(name = "Ccy1")
    private String ccy1;

    @Column(name = "CcyPair")
    private String ccyPair;

    @Column(name = "CDSParPremium")
    private String cdsParPremium;

    @Column(name = "CDSPremium")
    private BigDecimal cdsPremium;

    @Column(name = "Clearer")
    private String clearer;

    @Column(name = "Client")
    private String client;

    @Column(name = "ClosingSpot")
    private String closingSpot;

    @Column(name = "COBDate")
    private LocalDateTime COBDate;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "Counterparty")
    private String counterParty;

    @Column(name = "CPFreq")
    private String cpFreq;

    @Column(name = "CPPays")
    private String cpPays;

    @Column(name = "CPRate")
    private BigDecimal cpRate;

    @Column(name = "CreditSpread")
    private String creditSpread;

    @Column(name = "CustPayIndex")
    private String custPayIndex;

    @Column(name = "CustPayRate")
    private String custPayRate;

    @Column(name = "CustRecIndex")
    private String custRecIndex;

    @Column(name = "CustRecRate")
    private String custRecRate;

    @Column(name = "DataSink_ID")
    private Long dataSinkId;

    @Column(name = "Days")
    private String days;

    @Column(name = "DBPaysDBReceives")
    private String dbPaysDbReceives;

    @Column(name = "DealGroup_ID")
    private String dealGroupId;

    @Column(name = "DealType")
    private String dealType;

    @Column(name = "DeliveryDate")
    private LocalDateTime deliveryDate;

    @Column(name = "Delta")
    private BigDecimal delta;

    @Column(name = "DeltaCCY")
    private String deltaCcy;

    @Column(name = "EffDate")
    private LocalDateTime effDate;

    @Column(name = "Extra1")
    private String extra1;

    @Column(name = "Extra10")
    private String extra10;

    @Column(name = "Extra11")
    private String extra11;

    @Column(name = "Extra12")
    private String extra12;

    @Column(name = "Extra13")
    private String extra13;

    @Column(name = "Extra14")
    private String extra14;

    @Column(name = "Extra15")
    private String extra15;

    @Column(name = "Extra16")
    private String extra16;

    @Column(name = "Extra17")
    private String extra17;

    @Column(name = "Extra18")
    private String extra18;

    @Column(name = "Extra19")
    private String extra19;

    @Column(name = "Extra2")
    private String extra2;

    @Column(name = "Extra20")
    private String extra20;

    @Column(name = "Extra3")
    private String extra3;

    @Column(name = "Extra4")
    private String extra4;

    @Column(name = "Extra5")
    private String extra5;

    @Column(name = "Extra6")
    private String extra6;

    @Column(name = "Extra7")
    private String extra7;

    @Column(name = "Extra8")
    private String extra8;

    @Column(name = "Extra9")
    private String extra9;

    @Column(name = "Face_Base")
    private String faceBase;

    @Column(name = "Face_Counter")
    private String faceCounter;

    @Column(name = "FairPrice")
    private String fairPrice;

    @Column(name = "Fixed")
    private String fixed;

    @Column(name = "FixedOrFloating")
    private String fixedOrFloating;

    @Column(name = "FixRate")
    private String fixRate;

    @Column(name = "Floating")
    private String floating;

    @Column(name = "FloatRate")
    private String floatRate;

    @Column(name = "Forward")
    private String forward;

    @Column(name = "FXDate")
    private LocalDateTime fxDate;

    @Column(name = "FxRate")
    private String fxRate;

    @Column(name = "Global")
    private String global;

    @Column(name = "ImpliedVolatility")
    private BigDecimal impliedVolatility;

    @Column(name = "IndependentAmountAmount")
    private String independentAmountAmount;

    @Column(name = "IndependentAmountCurrency")
    private String independentAmountCurrency;

    @Column(name = "InitialMarginAmount")
    private String initialMarginAmount;

    @Column(name = "InitialMarginCurrency")
    private String initialMarginCurrency;

    @Column(name = "Instrument")
    private String instrument;

    @Column(name = "Interest")
    private String interest;

    @Column(name = "IntrinsicValue")
    private String intrinsicValue;

    @Column(name = "IntrinsicValueCcy")
    private String intrinsicValueCcy;

    @Column(name = "ISIN")
    private String isin;

    @Column(name = "IsProcessed")
    private Boolean isProcessed;

    @Column(name = "KnockInDate")
    private LocalDateTime knockInDate;

    @Column(name = "Leg1Accrual")
    private BigDecimal leg1Accrual;

    @Column(name = "Leg1Index")
    private String leg1Index;

    @Column(name = "Leg1PayOrRec")
    private String leg1PayOrRec;

    @Column(name = "Leg2Accrual")
    private BigDecimal leg2Accrual;

    @Column(name = "Leg2Index")
    private String leg2Index;

    @Column(name = "Leg2PayOrRec")
    private String leg2PayOrRec;

    @Column(name = "LegCCY")
    private String legCcy;

    @Column(name = "LegMTM")
    private BigDecimal LegMtm;

    @Column(name = "LinkTrade_ID")
    private String linkTradeId;

    @Column(name = "Location")
    private String location;

    @Column(name = "LongOrShort")
    private String longOrShort;

    @Column(name = "MaturityDate")
    private LocalDateTime maturityDate;

    @Column(name = "MLFreq")
    private String mlfreq;

    @Column(name = "MLPays")
    private String mlPays;

    @Column(name = "MLRate")
    private BigDecimal mlRate;

    @Column(name = "MTM")
    private BigDecimal mtm;

    @Column(name = "MtMDateCOB")
    private LocalDateTime MtMDateCOB;

    @Column(name = "MTMLessAccruedInterest")
    private String mtmLessAccruedInterest;

    @Column(name = "MTMNonDiscounted_Ccy2")
    private String mtmNonDiscountedCcy2;

    @Column(name = "MTMNonDiscounted_ReportCcy")
    private String mtmNonDiscountedReportCcy;

    @Column(name = "MTMPresentValueClean_LocalCcy")
    private String mtmPresentValueCleanLocalCcy;

    @Column(name = "MTMPresentValueClean_ReportCcy")
    private String mtmPresentValueCleanReportCcy;

    @Column(name = "NextReset")
    private String nextReset;

    @Column(name = "Nominal")
    private String nominal;

    @Column(name = "NotAmt1")
    private BigDecimal notAmt1;

    @Column(name = "NotAmt2")
    private BigDecimal notAmt2;

    @Column(name = "NotCcy1")
    private String notCcy1;

    @Column(name = "NotCcy2")
    private String notCcy2;

    @Column(name = "Notional")
    private String notional;

    @Column(name = "NumberOfShares")
    private String numberOfShares;

    @Column(name = "Offer")
    private BigDecimal offer;

    @Column(name = "OptionStyle")
    private String optionStyle;

    @Column(name = "OptionType")
    private String optionType;

    @Column(name = "Party")
    private String party;

    @Column(name = "PmtCcy")
    private String pmtCcy;

    @Column(name = "PmtRateRef")
    private String pmtRateRef;

    @Column(name = "POrR")
    private String pOrR;

    @Column(name = "Position")
    private String position;

    @Column(name = "Premium")
    private BigDecimal premium;

    @Column(name = "PremiumCcy")
    private String premiumCcy;

    @Column(name = "PremiumValueDate")
    private LocalDateTime premiumValueDate;

    @Column(name = "Price")
    private BigDecimal price;

    @Column(name = "Price_1")
    private BigDecimal price_1;

    @Column(name = "Price1")
    private String price1;

    @Column(name = "Price2")
    private String price2;

    @Column(name = "PriceNotation")
    private String priceNotation;

    @Column(name = "PricePerUnit")
    private String pricePerUnit;

    @Column(name = "ProductType")
    private String productType;

    @Column(name = "PutOrCall")
    private String putOrCall;

    @Column(name = "Quantity")
    private String quantity;

    @Column(name = "Rate")
    private BigDecimal rate;

    @Column(name = "RebateAmount")
    private String rebateAmount;

    @Column(name = "RebateCcy")
    private String rebateCcy;

    @Column(name = "RefEntity")
    private String refEntity;

    @Column(name = "ReferenceEntity")
    private String referenceEntity;

    @Column(name = "RevalFwdRate")
    private BigDecimal revalFwdRate;

    @Column(name = "RevalSpotRate")
    private BigDecimal revalSpotRate;

    @Column(name = "SecondaryCCY")
    private String secondaryCcy;

    @Column(name = "SecondaryMTM")
    private BigDecimal secondaryMtm;

    @Column(name = "SettlementDate")
    private LocalDateTime settlementDate;

    @Column(name = "SourcePosition")
    private String sourcePosition;

    @Column(name = "SpotPrice")
    private BigDecimal spotPrice;

    @Column(name = "SpotQuote")
    private String spotQuote;

    @Column(name = "SpreadAtMaturity")
    private String spreadAtMaturity;

    @Column(name = "StartDate")
    private LocalDateTime startDate;

    @Column(name = "StrikePrice")
    private BigDecimal strikePrice;

    @Column(name = "STRUCTUREDTRADE_ID")
    private String structuredTradeId;

    @Column(name = "SwapPoint")
    private BigDecimal swapPoint;

    @Column(name = "Swapswire_ID")
    private String swapswireId;

    @Column(name = "TotalValue")
    private String totalValue;

    @Column(name = "TradeDate")
    private LocalDateTime tradeDate;

    @Column(name = "Trade_ID")
    private String tradeId;

    @Column(name = "TradeType")
    private String tradeType;

    @Column(name = "TV_CHF")
    private String tvChf;

    @Column(name = "UnderlyingTicker")
    private String underlyingTicker;

    @Column(name = "Unit")
    private String unit;

    @Column(name = "ValuationDate")
    private LocalDateTime valuationDate;

    @Column(name = "ValueDate")
    private LocalDateTime valueDate;

    @Version
    @Column(name = "Version")
    private Long version;

}
