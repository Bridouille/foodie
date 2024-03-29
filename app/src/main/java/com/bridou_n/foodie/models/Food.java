package com.bridou_n.foodie.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Food extends RealmObject {

    @SerializedName("fiber")
    @Expose
    private Double fiber;
    @SerializedName("protein")
    @Expose
    private Double protein;
    @SerializedName("pcsingram")
    @Expose
    private Double pcsingram;
    @SerializedName("verified")
    @Expose
    private Boolean verified;
    @SerializedName("fat")
    @Expose
    private Double fat;
    @SerializedName("gramsperserving")
    @Expose
    private Double gramsperserving;
    @SerializedName("showonlysametype")
    @Expose
    private Integer showonlysametype;
    @SerializedName("pcstext")
    @Expose
    private String pcstext;
    @SerializedName("carbohydrates")
    @Expose
    private Double carbohydrates;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("mlingram")
    @Expose
    private Double mlingram;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("categoryid")
    @Expose
    private Integer categoryid;
    @SerializedName("cholesterol")
    @Expose
    private Double cholesterol;
    @SerializedName("measurementid")
    @Expose
    private Integer measurementid;
    @SerializedName("unsaturatedfat")
    @Expose
    private Double unsaturatedfat;
    @SerializedName("showmeasurement")
    @Expose
    private Integer showmeasurement;
    @SerializedName("saturatedfat")
    @Expose
    private Double saturatedfat;
    @SerializedName("typeofmeasurement")
    @Expose
    private Integer typeofmeasurement;
    @SerializedName("source")
    @Expose
    private Integer source;
    @SerializedName("id")
    @Expose
    @PrimaryKey
    private Integer id;
    @SerializedName("sodium")
    @Expose
    private Double sodium;
    @SerializedName("headcategoryid")
    @Expose
    private Integer headcategoryid;
    @SerializedName("sugar")
    @Expose
    private Double sugar;
    @SerializedName("potassium")
    @Expose
    private Double potassium;
    @SerializedName("calories")
    @Expose
    private Double calories;
    @SerializedName("servingcategory")
    @Expose
    private Integer servingcategory;
    @SerializedName("defaultserving")
    @Expose
    private Integer defaultserving;

    /**
     * 
     * @return
     *     The fiber
     */
    public Double getFiber() {
        return fiber;
    }

    /**
     * 
     * @param fiber
     *     The fiber
     */
    public void setFiber(Double fiber) {
        this.fiber = fiber;
    }

    /**
     * 
     * @return
     *     The protein
     */
    public Double getProtein() {
        return protein;
    }

    /**
     * 
     * @param protein
     *     The protein
     */
    public void setProtein(Double protein) {
        this.protein = protein;
    }

    /**
     * 
     * @return
     *     The pcsingram
     */
    public Double getPcsingram() {
        return pcsingram;
    }

    /**
     * 
     * @param pcsingram
     *     The pcsingram
     */
    public void setPcsingram(Double pcsingram) {
        this.pcsingram = pcsingram;
    }

    /**
     * 
     * @return
     *     The verified
     */
    public Boolean getVerified() {
        return verified;
    }

    /**
     * 
     * @param verified
     *     The verified
     */
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * 
     * @return
     *     The fat
     */
    public Double getFat() {
        return fat;
    }

    /**
     * 
     * @param fat
     *     The fat
     */
    public void setFat(Double fat) {
        this.fat = fat;
    }

    /**
     * 
     * @return
     *     The gramsperserving
     */
    public Double getGramsperserving() {
        return gramsperserving;
    }

    /**
     * 
     * @param gramsperserving
     *     The gramsperserving
     */
    public void setGramsperserving(Double gramsperserving) {
        this.gramsperserving = gramsperserving;
    }

    /**
     * 
     * @return
     *     The showonlysametype
     */
    public Integer getShowonlysametype() {
        return showonlysametype;
    }

    /**
     * 
     * @param showonlysametype
     *     The showonlysametype
     */
    public void setShowonlysametype(Integer showonlysametype) {
        this.showonlysametype = showonlysametype;
    }

    /**
     * 
     * @return
     *     The pcstext
     */
    public String getPcstext() {
        return pcstext;
    }

    /**
     * 
     * @param pcstext
     *     The pcstext
     */
    public void setPcstext(String pcstext) {
        this.pcstext = pcstext;
    }

    /**
     * 
     * @return
     *     The carbohydrates
     */
    public Double getCarbohydrates() {
        return carbohydrates;
    }

    /**
     * 
     * @param carbohydrates
     *     The carbohydrates
     */
    public void setCarbohydrates(Double carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    /**
     * 
     * @return
     *     The category
     */
    public String getCategory() {
        return category;
    }

    /**
     * 
     * @param category
     *     The category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The mlingram
     */
    public Double getMlingram() {
        return mlingram;
    }

    /**
     * 
     * @param mlingram
     *     The mlingram
     */
    public void setMlingram(Double mlingram) {
        this.mlingram = mlingram;
    }

    /**
     * 
     * @return
     *     The brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 
     * @param brand
     *     The brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return
     *     The categoryid
     */
    public Integer getCategoryid() {
        return categoryid;
    }

    /**
     * 
     * @param categoryid
     *     The categoryid
     */
    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    /**
     * 
     * @return
     *     The cholesterol
     */
    public Double getCholesterol() {
        return cholesterol;
    }

    /**
     * 
     * @param cholesterol
     *     The cholesterol
     */
    public void setCholesterol(Double cholesterol) {
        this.cholesterol = cholesterol;
    }

    /**
     * 
     * @return
     *     The measurementid
     */
    public Integer getMeasurementid() {
        return measurementid;
    }

    /**
     * 
     * @param measurementid
     *     The measurementid
     */
    public void setMeasurementid(Integer measurementid) {
        this.measurementid = measurementid;
    }

    /**
     * 
     * @return
     *     The unsaturatedfat
     */
    public Double getUnsaturatedfat() {
        return unsaturatedfat;
    }

    /**
     * 
     * @param unsaturatedfat
     *     The unsaturatedfat
     */
    public void setUnsaturatedfat(Double unsaturatedfat) {
        this.unsaturatedfat = unsaturatedfat;
    }

    /**
     * 
     * @return
     *     The showmeasurement
     */
    public Integer getShowmeasurement() {
        return showmeasurement;
    }

    /**
     * 
     * @param showmeasurement
     *     The showmeasurement
     */
    public void setShowmeasurement(Integer showmeasurement) {
        this.showmeasurement = showmeasurement;
    }

    /**
     * 
     * @return
     *     The saturatedfat
     */
    public Double getSaturatedfat() {
        return saturatedfat;
    }

    /**
     * 
     * @param saturatedfat
     *     The saturatedfat
     */
    public void setSaturatedfat(Double saturatedfat) {
        this.saturatedfat = saturatedfat;
    }

    /**
     * 
     * @return
     *     The typeofmeasurement
     */
    public Integer getTypeofmeasurement() {
        return typeofmeasurement;
    }

    /**
     * 
     * @param typeofmeasurement
     *     The typeofmeasurement
     */
    public void setTypeofmeasurement(Integer typeofmeasurement) {
        this.typeofmeasurement = typeofmeasurement;
    }

    /**
     * 
     * @return
     *     The source
     */
    public Integer getSource() {
        return source;
    }

    /**
     * 
     * @param source
     *     The source
     */
    public void setSource(Integer source) {
        this.source = source;
    }

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The sodium
     */
    public Double getSodium() {
        return sodium;
    }

    /**
     * 
     * @param sodium
     *     The sodium
     */
    public void setSodium(Double sodium) {
        this.sodium = sodium;
    }

    /**
     * 
     * @return
     *     The headcategoryid
     */
    public Integer getHeadcategoryid() {
        return headcategoryid;
    }

    /**
     * 
     * @param headcategoryid
     *     The headcategoryid
     */
    public void setHeadcategoryid(Integer headcategoryid) {
        this.headcategoryid = headcategoryid;
    }

    /**
     * 
     * @return
     *     The sugar
     */
    public Double getSugar() {
        return sugar;
    }

    /**
     * 
     * @param sugar
     *     The sugar
     */
    public void setSugar(Double sugar) {
        this.sugar = sugar;
    }

    /**
     * 
     * @return
     *     The potassium
     */
    public Double getPotassium() {
        return potassium;
    }

    /**
     * 
     * @param potassium
     *     The potassium
     */
    public void setPotassium(Double potassium) {
        this.potassium = potassium;
    }

    /**
     * 
     * @return
     *     The calories
     */
    public Double getCalories() {
        return calories;
    }

    /**
     * 
     * @param calories
     *     The calories
     */
    public void setCalories(Double calories) {
        this.calories = calories;
    }

    /**
     * 
     * @return
     *     The servingcategory
     */
    public Integer getServingcategory() {
        return servingcategory;
    }

    /**
     * 
     * @param servingcategory
     *     The servingcategory
     */
    public void setServingcategory(Integer servingcategory) {
        this.servingcategory = servingcategory;
    }

    /**
     * 
     * @return
     *     The defaultserving
     */
    public Integer getDefaultserving() {
        return defaultserving;
    }

    /**
     * 
     * @param defaultserving
     *     The defaultserving
     */
    public void setDefaultserving(Integer defaultserving) {
        this.defaultserving = defaultserving;
    }

}
