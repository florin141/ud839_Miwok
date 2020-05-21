package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
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
}
