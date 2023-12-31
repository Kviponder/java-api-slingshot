package com.campusedu.devexercise.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "course_info")

public class Course_Info {
    // Primary key for the Course_Info entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    // Unique constraint on advisingRequisiteCode
    @Column(name = "advising_requisite_code", unique = true) // Unique constraint on advisingRequisiteCode
    String advisingRequisiteCode;

    // Core literature requirement associated with the course
    @Column(name = "core_literature_requirement")
    String coreLiteratureRequirement;

    // Full course catalog description (can be long)
    @Column(name = "course_catalog_text", columnDefinition = "TEXT")
    String courseCatalogText;

    // Course code (e.g., CS101)
    @Column(name = "course_code")
    String courseCode;

    // Course code number (e.g., 101)
    @Column(name = "course_code_number")
    String courseCodeNumber;

    // Course code prefix (e.g., CS)
    @Column(name = "course_code_prefix")
    String courseCodePrefix;

    // Sanitized version of the course code
    @Column(name = "course_code_sanitized")
    String courseCodeSanitized;

    // Course fees in no particular unit
    @Column(name = "course_fees")
    int courseFees;

    // Title of the course
    @Column(name = "course_title")
    String courseTitle;

    // Default credit hours for the course
    @Column(name = "default_credit_hours")
    int defaultCreditHours;

    // Division code associated with the course
    @Column(name = "division_code")
    String divisionCode;

    // Type of fee associated with the course
    @Column(name = "fee_type")
    String feeType;

    // Fixed or variable credit hours for the course
    @Column(name = "fixed_variable_credit")
    String fixedVariableCredit;

    // Maximum credit hours allowed
    @Column(name = "max_credit_hours")
    int maxCreditHours;

    // Minimum credit hours required
    @Column(name = "min_credit_hours")
    private int minCreditHours;

    // Constructors
    //  Default constructor
    public Course_Info() {
        this.advisingRequisiteCode = "";
        this.coreLiteratureRequirement = "";
        this.courseCatalogText = "";
        this.courseCode = "";
        this.courseCodeNumber = "";
        this.courseCodePrefix = "";
        this.courseCodeSanitized = "";
        this.courseFees = 0;
        this.courseTitle = "";
        this.defaultCreditHours = 0;
        this.divisionCode = "";
        this.feeType = "";
        this.fixedVariableCredit = "";
        this.maxCreditHours = 0;
        this.minCreditHours = 0;
    }

    //  Parameterized constructor
    public Course_Info(Integer id, String advisingRequisiteCode, String coreLiteratureRequirement, String courseCatalogText, String courseCode, String courseCodeNumber, String courseCodePrefix, String courseCodeSanitized, int courseFees, String courseTitle, int defaultCreditHours, String divisionCode, String feeType, String fixedVariableCredit, int maxCreditHours, int minCreditHours) {
        this.id = id;
        this.advisingRequisiteCode = advisingRequisiteCode;
        this.coreLiteratureRequirement = coreLiteratureRequirement;
        this.courseCatalogText = courseCatalogText;
        this.courseCode = courseCode;
        this.courseCodeNumber = courseCodeNumber;
        this.courseCodePrefix = courseCodePrefix;
        this.courseCodeSanitized = courseCodeSanitized;
        this.courseFees = courseFees;
        this.courseTitle = courseTitle;
        this.defaultCreditHours = defaultCreditHours;
        this.divisionCode = divisionCode;
        this.feeType = feeType;
        this.fixedVariableCredit = fixedVariableCredit;
        this.maxCreditHours = maxCreditHours;
        this.minCreditHours = minCreditHours;
    }

    //getters, setters...


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdvisingRequisiteCode() {
        return advisingRequisiteCode;
    }

    public void setAdvisingRequisiteCode(String advisingRequisiteCode) {
        this.advisingRequisiteCode = advisingRequisiteCode;
    }

    public String getCoreLiteratureRequirement() {
        return coreLiteratureRequirement;
    }

    public void setCoreLiteratureRequirement(String coreLiteratureRequirement) {
        this.coreLiteratureRequirement = coreLiteratureRequirement;
    }

    public String getCourseCatalogText() {
        return courseCatalogText;
    }

    public void setCourseCatalogText(String courseCatalogText) {
        this.courseCatalogText = courseCatalogText;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCodeNumber() {
        return courseCodeNumber;
    }

    public void setCourseCodeNumber(String courseCodeNumber) {
        this.courseCodeNumber = courseCodeNumber;
    }

    public String getCourseCodePrefix() {
        return courseCodePrefix;
    }

    public void setCourseCodePrefix(String courseCodePrefix) {
        this.courseCodePrefix = courseCodePrefix;
    }

    public String getCourseCodeSanitized() {
        return courseCodeSanitized;
    }

    public void setCourseCodeSanitized(String courseCodeSanitized) {
        this.courseCodeSanitized = courseCodeSanitized;
    }

    public int getCourseFees() {
        return courseFees;
    }

    public void setCourseFees(int courseFees) {
        this.courseFees = courseFees;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getDefaultCreditHours() {
        return defaultCreditHours;
    }

    public void setDefaultCreditHours(int defaultCreditHours) {
        this.defaultCreditHours = defaultCreditHours;
    }

    public String getDivisionCode() {
        return divisionCode;
    }

    public void setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getFixedVariableCredit() {
        return fixedVariableCredit;
    }

    public void setFixedVariableCredit(String fixedVariableCredit) {
        this.fixedVariableCredit = fixedVariableCredit;
    }

    public int getMaxCreditHours() {
        return maxCreditHours;
    }

    public void setMaxCreditHours(int maxCreditHours) {
        this.maxCreditHours = maxCreditHours;
    }

    public int getMinCreditHours() {
        return minCreditHours;
    }

    public void setMinCreditHours(int minCreditHours) {
        this.minCreditHours = minCreditHours;
    }
}



