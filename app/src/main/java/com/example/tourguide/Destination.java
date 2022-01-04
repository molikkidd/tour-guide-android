package com.example.tourguide;

public class Destination {
    /** Default translation for the word */
    private int mCompanyName;
    /** Miwok translation for the word */
    private int mCost;
    private int mPhoneNumber;
    private int mImageResourceId;
    private int minfo;

    public Destination(int companyName, int cost, int phoneNumber, int imageResourceId) {
        mCompanyName = companyName;
        mCost = cost;
        mPhoneNumber = phoneNumber;
        mImageResourceId = imageResourceId;

    }
    public Destination(int companyName, int cost, int phoneNumber, int imageResourceId, int info) {
        mCompanyName = companyName;
        mCost = cost;
        mPhoneNumber = phoneNumber;
        mImageResourceId = imageResourceId;
        minfo = info;
    }
    /**
     * Get the default translation of the word.
     */
    public int getCompanyName() {
        return mCompanyName;
    }
    public int getCost() {
        return mCost;
    }
    public int getPhoneNumber() { return mPhoneNumber; }
    public Integer getImageResourceId() { return mImageResourceId; }
    public int getInfo() { return  minfo; }

}
