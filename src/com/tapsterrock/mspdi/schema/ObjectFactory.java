//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vBeta 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.02.21 at 09:54:12 GMT 
//


package com.tapsterrock.mspdi.schema;

public class ObjectFactory
    extends com.sun.xml.bind.DefaultJAXBContextImpl
{


    static {
        com.sun.xml.bind.ImplementationRegistry ir = com.sun.xml.bind.ImplementationRegistry.getInstance();
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType.RateType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.RatesTypeImpl.RateTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.BaselineType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.BaselineTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.WBSMasksType.WBSMaskType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.WBSMasksTypeImpl.WBSMaskTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl.ExtendedAttributeTypeImpl.ValueListTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.RatesTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.PredecessorLinkType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.PredecessorLinkTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType.WorkingTimeType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl.WorkingTimesTypeImpl.WorkingTimeTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.ValueType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.ValuesTypeImpl.ValueTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.BaselineType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl.AssignmentTypeImpl.BaselineTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.WBSMasksType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.WBSMasksTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.OutlineCodeType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.OutlineCodeTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.MasksTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType.AvailabilityPeriodType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.AvailabilityPeriodsTypeImpl.AvailabilityPeriodTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl.AssignmentTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType.MaskType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.MasksTypeImpl.MaskTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl.WorkingTimesTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.TasksType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.TimePeriodType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl.TimePeriodTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.Project.class), (com.tapsterrock.mspdi.schema.impl.ProjectImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.ExtendedAttributeType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.ExtendedAttributeTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.Value.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.ValuesTypeImpl.ValueImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.BaselineType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.BaselineTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl.ExtendedAttributeTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.ExtendedAttributeType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.AssignmentsTypeImpl.AssignmentTypeImpl.ExtendedAttributeTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.TimephasedDataType.class), (com.tapsterrock.mspdi.schema.impl.TimephasedDataTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.OutlineCodeType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.TasksTypeImpl.TaskTypeImpl.OutlineCodeTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.ExtendedAttributeType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.ExtendedAttributeTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.OutlineCodeTypeImpl.ValuesTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType.ValueType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ExtendedAttributesTypeImpl.ExtendedAttributeTypeImpl.ValueListTypeImpl.ValueTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.AvailabilityPeriodsTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.CalendarsTypeImpl.CalendarTypeImpl.WeekDaysTypeImpl.WeekDayTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.OutlineCodesTypeImpl.class));
        ir.setDefaultImpl((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.class), (com.tapsterrock.mspdi.schema.impl.ProjectTypeImpl.ResourcesTypeImpl.ResourceTypeImpl.class));
    }

    public ObjectFactory() {
        super(new com.tapsterrock.mspdi.schema.ObjectFactory.GrammarInfoImpl());
    }

    /**
     * Create an instance of the specified Java content interface.
     * If the Java content interface has been replaced via the 
     * setImplementation method, than an instance of the client 
     * specified implementation class will be instantiated instead.
     * 
     * @param javaContentInterface the Class object of the javacontent interface to instantiate
     * @return a new instance
     * @throws JAXBException if an error occurs
     */
    public static Object newInstance(Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return com.sun.xml.bind.DefaultJAXBContextImpl.newInstance(javaContentInterface);
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType.RateType createProjectTypeResourcesTypeResourceTypeRatesTypeRateType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType.RateType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType.RateType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.BaselineType createProjectTypeResourcesTypeResourceTypeBaselineType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.BaselineType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.BaselineType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.WBSMasksType.WBSMaskType createProjectTypeWBSMasksTypeWBSMaskType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.WBSMasksType.WBSMaskType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.WBSMasksType.WBSMaskType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType createProjectTypeExtendedAttributesTypeExtendedAttributeTypeValueListType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType createProjectType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType createProjectTypeResourcesTypeResourceTypeRatesType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.RatesType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.CalendarsType createProjectTypeCalendarsType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.PredecessorLinkType createProjectTypeTasksTypeTaskTypePredecessorLinkType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.PredecessorLinkType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.PredecessorLinkType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType createProjectTypeCalendarsTypeCalendarTypeWeekDaysType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType.WorkingTimeType createProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayTypeWorkingTimesTypeWorkingTimeType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType.WorkingTimeType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType.WorkingTimeType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.ValueType createProjectTypeOutlineCodesTypeOutlineCodeTypeValuesTypeValueType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.ValueType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.ValueType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.BaselineType createProjectTypeAssignmentsTypeAssignmentTypeBaselineType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.BaselineType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.BaselineType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.WBSMasksType createProjectTypeWBSMasksType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.WBSMasksType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.WBSMasksType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.OutlineCodeType createProjectTypeResourcesTypeResourceTypeOutlineCodeType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.OutlineCodeType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.OutlineCodeType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType createProjectTypeOutlineCodesTypeOutlineCodeTypeMasksType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType.AvailabilityPeriodType createProjectTypeResourcesTypeResourceTypeAvailabilityPeriodsTypeAvailabilityPeriodType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType.AvailabilityPeriodType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType.AvailabilityPeriodType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType createProjectTypeAssignmentsTypeAssignmentType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType.MaskType createProjectTypeOutlineCodesTypeOutlineCodeTypeMasksTypeMaskType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType.MaskType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.MasksType.MaskType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType createProjectTypeExtendedAttributesType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType createProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayTypeWorkingTimesType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.WorkingTimesType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.TasksType createProjectTypeTasksType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.TasksType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.TasksType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.TimePeriodType createProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayTypeTimePeriodType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.TimePeriodType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.TimePeriodType.class)));
    }

    public static com.tapsterrock.mspdi.schema.Project createProject()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.Project) newInstance((com.tapsterrock.mspdi.schema.Project.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType createProjectTypeAssignmentsType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.ExtendedAttributeType createProjectTypeTasksTypeTaskTypeExtendedAttributeType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.ExtendedAttributeType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.ExtendedAttributeType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.Value createProjectTypeOutlineCodesTypeOutlineCodeTypeValuesTypeValue()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.Value) newInstance((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.Value.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType createProjectTypeOutlineCodesTypeOutlineCodeType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.BaselineType createProjectTypeTasksTypeTaskTypeBaselineType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.BaselineType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.BaselineType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType createProjectTypeExtendedAttributesTypeExtendedAttributeType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType createProjectTypeTasksTypeTaskType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.ExtendedAttributeType createProjectTypeAssignmentsTypeAssignmentTypeExtendedAttributeType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.ExtendedAttributeType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.AssignmentsType.AssignmentType.ExtendedAttributeType.class)));
    }

    public static com.tapsterrock.mspdi.schema.TimephasedDataType createTimephasedDataType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.TimephasedDataType) newInstance((com.tapsterrock.mspdi.schema.TimephasedDataType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.OutlineCodeType createProjectTypeTasksTypeTaskTypeOutlineCodeType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.OutlineCodeType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.TasksType.TaskType.OutlineCodeType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType createProjectTypeCalendarsTypeCalendarType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.ExtendedAttributeType createProjectTypeResourcesTypeResourceTypeExtendedAttributeType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.ExtendedAttributeType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.ExtendedAttributeType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType createProjectTypeOutlineCodesTypeOutlineCodeTypeValuesType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.OutlineCodeType.ValuesType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType.ValueType createProjectTypeExtendedAttributesTypeExtendedAttributeTypeValueListTypeValueType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType.ValueType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ExtendedAttributesType.ExtendedAttributeType.ValueListType.ValueType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType createProjectTypeResourcesTypeResourceTypeAvailabilityPeriodsType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.AvailabilityPeriodsType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType createProjectTypeCalendarsTypeCalendarTypeWeekDaysTypeWeekDayType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.CalendarsType.CalendarType.WeekDaysType.WeekDayType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ResourcesType createProjectTypeResourcesType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType createProjectTypeOutlineCodesType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.OutlineCodesType.class)));
    }

    public static com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType createProjectTypeResourcesTypeResourceType()
        throws javax.xml.bind.JAXBException
    {
        return ((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType) newInstance((com.tapsterrock.mspdi.schema.ProjectType.ResourcesType.ResourceType.class)));
    }

    private static class GrammarInfoImpl
        extends com.sun.xml.bind.GrammarInfo
    {


        public Class getRootElement(String uri, String local) {
            if ("http://schemas.microsoft.com/project".equals(uri)&&"Project".equals(local)) {
                return (com.tapsterrock.mspdi.schema.impl.ProjectImpl.class);
            }
            return null;
        }

        public String[] getProbePoints() {
            return new java.lang.String[] {"http://schemas.microsoft.com/project", "Project"};
        }

    }

}