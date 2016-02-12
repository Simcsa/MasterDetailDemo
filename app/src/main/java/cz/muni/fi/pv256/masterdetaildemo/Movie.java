package cz.muni.fi.pv256.masterdetaildemo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by expres on 2/3/2016.
 */
public class Movie implements Parcelable {

    private int mCoverId;
    private long mReleaseDate;
    private String mCoverPath;
    private String mTitle;

    public Movie(int coverId, long releaseDate, String coverPath, String title) {
        mCoverId = coverId;
        mReleaseDate = releaseDate;
        mCoverPath = coverPath;
        mTitle = title;
    }

    public int getCoverId() {
        return mCoverId;
    }

    public void setCoverId(int coverId) {
        mCoverId = coverId;
    }

    public long getReleaseDate() {
        return mReleaseDate;
    }

    public void setReleaseDate(long releaseDate) {
        mReleaseDate = releaseDate;
    }

    public String getCoverPath() {
        return mCoverPath;
    }

    public void setCoverPath(String coverPath) {
        mCoverPath = coverPath;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public Movie(Parcel in) {
        mCoverId = in.readInt();
        mReleaseDate = in.readLong();
        mCoverPath = in.readString();
        mTitle = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mCoverId);
        dest.writeLong(mReleaseDate);
        dest.writeString(mCoverPath);
        dest.writeString(mTitle);
    }

    public static final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
        @Override
        public Movie createFromParcel(Parcel source) {
            return new Movie(source);
        }

        @Override
        public Movie[] newArray(int size) {
            return new Movie[size];
        }
    };
}
