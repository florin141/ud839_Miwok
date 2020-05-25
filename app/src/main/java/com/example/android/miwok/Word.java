package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        this(defaultTranslation, miwokTranslation);
        this.mImageResourceId = imageResourceId;
    }

    /**
     * @return Miwok translations for the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return Default translations for the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImageId() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
